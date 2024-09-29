package com.vn.sound.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.vn.sound.common.Constant;
import com.vn.sound.common.CustomException;
import com.vn.sound.common.Utility;
import com.vn.sound.model.PowerAmplifier;
import com.vn.sound.model.UploadImgs;
import com.vn.sound.repository.PowerAmplifierRepository;
import com.vn.sound.repository.UploadImgsRepository;

@Service
public class PowerAmplifierService {

	@Autowired
	private UploadImgsRepository uploadImgsRepository;

	@Autowired
	private PowerAmplifierRepository powerAmplifierRepository;

	public PowerAmplifier findAmpliById(Long Id) throws Exception {
		Optional<PowerAmplifier> powerAmplifierOptional = powerAmplifierRepository.findById(Id);

		if (powerAmplifierOptional.isEmpty()) {
			// System.out.println("Not found with id: " + Id);
			throw new NoSuchElementException("Not found with id: " + Id);
		}
		PowerAmplifier powerAmplifierTmp = powerAmplifierOptional.get();
		PowerAmplifier powerAmplifier = new PowerAmplifier(powerAmplifierTmp.getId(), powerAmplifierTmp.getImgId(),
				powerAmplifierTmp.getModel(), powerAmplifierTmp.getDescription(), powerAmplifierTmp.getMode(),
				powerAmplifierTmp.getStereoPower8OHM(), powerAmplifierTmp.getStereoPower4OHM(),
				powerAmplifierTmp.getStereoPower2OHM(), powerAmplifierTmp.getBtl8OHM(), powerAmplifierTmp.getBtl4OHM(),
				powerAmplifierTmp.getFrequencyResponse(), powerAmplifierTmp.getThdPlus(),
				powerAmplifierTmp.getsSourceNRatio(), powerAmplifierTmp.getSlewRatio(),
				powerAmplifierTmp.getDampingFactor(), powerAmplifierTmp.getOutputCircuitry(),
				powerAmplifierTmp.getCrossTalk(), powerAmplifierTmp.getInputImpedance(),
				powerAmplifierTmp.getInputSensitivity(), powerAmplifierTmp.getProtectPowerAmplifier(),
				powerAmplifierTmp.getgWeight(), powerAmplifierTmp.getDimension(), powerAmplifierTmp.getPackingSize(),
				powerAmplifierTmp.getGain(), powerAmplifierTmp.getOptionalGian(),
				powerAmplifierTmp.getDegreeOfSeparation(), powerAmplifierTmp.getDissipateHeat(),
				powerAmplifierTmp.getAppearanceVolume());

		return powerAmplifier;
	}

	public Page<PowerAmplifier> findAllAmpli(int page, int size) throws Exception {
		return powerAmplifierRepository.findAll(PageRequest.of(page, size));
	}

	public String createAmpli(PowerAmplifier powerAmplifier) throws Exception {
		if (powerAmplifierRepository.existsByMode(powerAmplifier.getMode())) {
			// return Utility.errMsgCreateFieldNameExits(powerAmplifier.getMode());
			throw new CustomException("Record name has existed");
		} else {
			UploadImgs uploadImgs = uploadImgsRepository.findUploadImgsBySrcImg(powerAmplifier.getModel());
			String filename = "";
			if (Utility.isNotNull(uploadImgs)) {
				if (uploadImgs.getSrcImg().contains(".png")) {
					filename = powerAmplifier.getModel() + ".png";
				} else {
					filename = powerAmplifier.getModel() + ".jpg";
				}
				powerAmplifier.setImgId(Constant.host + "imgs/Amplifiers/" + filename);
			}
			powerAmplifierRepository.save(powerAmplifier);
			return Utility.successMsg(powerAmplifier.getId());
		}
	}

	public String editAmpliTsc(PowerAmplifier powerAmplifier) throws Exception {
		if (powerAmplifierRepository.existsById(powerAmplifier.getId())) {
			powerAmplifierRepository.save(powerAmplifier);
			return Utility.editMsg(powerAmplifier.getId());
		} else {
			return Utility.errMsg(powerAmplifier.getId());
		}
	}

	public String deleteAmpli(Long Id) throws Exception {
		if (powerAmplifierRepository.existsById(Id)) {
			powerAmplifierRepository.deleteById(Id);
			return Utility.deleteMsg(Id);
		} else {
			return Utility.errMsg(Id);
		}
	}

	public String deleteMultiAmpli(List<String> records) throws Exception {
		int count = 0;
		for (int i = 0; i < records.size(); i++) {
			if (powerAmplifierRepository.existsById(Long.parseLong(records.get(i)))) {
				powerAmplifierRepository.deleteById(Long.parseLong(records.get(i)));
				count++;
			}
		}
		return Utility.deleteMultiMsg(count);
	}

	public List<PowerAmplifier> findPowerAmplifierByMode(String mode) throws Exception {
		return powerAmplifierRepository.findPowerAmplifierByMode(mode);
	}
}
