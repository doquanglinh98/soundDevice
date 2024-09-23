package com.vn.sound.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.vn.sound.common.CustomException;
import com.vn.sound.common.Utility;
import com.vn.sound.model.MicroTsc;
import com.vn.sound.model.PowerAmplifier;
import com.vn.sound.repository.MicroTscRepository;

@org.springframework.stereotype.Service
public class MicroTscService {

	@Autowired
	private MicroTscRepository microTscRepository;

	public MicroTsc findMicroTscById(Long ref, Long Id) throws Exception {
		Optional<MicroTsc> microTscOptional = microTscRepository.findById(Id);

		if (microTscOptional.isEmpty()) {
			Utility.logging(ref, this.getClass().getSimpleName(), "findMicroTscById", "Not found with id: " + Id);
			throw new NoSuchElementException("Not found with id: " + Id);
		}
		MicroTsc microTscTmp = microTscOptional.get();
		MicroTsc microTsc = new MicroTsc(microTscTmp.getId(), microTscTmp.getImgId(), microTscTmp.getMicroName(),
				microTscTmp.getFrequencyQuantity(), microTscTmp.getFrequencyRangeCha(),
				microTscTmp.getFrequencyRangeChb(), microTscTmp.getSignalToNoiseRatio(),
				microTscTmp.getTotalHarmonicDistortion(), microTscTmp.getModulationMode(),
				microTscTmp.getWorkingDistance(), microTscTmp.getFrequencyBandwidth(), microTscTmp.getChannelInterval(),
				microTscTmp.getMaxDeviation(), microTscTmp.getFrequencyStability(),
				microTscTmp.getOscillationModeReceiverParam(), microTscTmp.getModulation(),
				microTscTmp.getSensitivity(), microTscTmp.getSensitivityAdjustment(), microTscTmp.getPowerSupplyMode(),
				microTscTmp.getAntennaAccess(), microTscTmp.getMidFrequence(), microTscTmp.getSpuriousSuppression(),
				microTscTmp.getMaxOutputElectricalLevel(), microTscTmp.getOutputPower(), microTscTmp.getDirectivity(),
				microTscTmp.getFrequencyResponse(), microTscTmp.getPowerSupply(),
				microTscTmp.getOscillationModeTransmitterParam(), microTscTmp.getTransmitterType(),
				microTscTmp.getPipeBodyMaterial(), microTscTmp.getBatteryLifeTime());
		Utility.logging(ref, this.getClass().getSimpleName(), "findMicroTscById",
				"Detail of micro : " + Utility.jsonStringConverter(microTsc));
		return microTsc;
	}

	public Page<MicroTsc> findAllMicroTsc(int page, int size) throws Exception {
		return microTscRepository.findAll(PageRequest.of(page, size));
	}

	public List<MicroTsc> findMicroTscByName(String name) throws Exception {
		return microTscRepository.findMicroTscByName(name);
	}

	public String createMicTsc(MicroTsc microTsc) throws Exception {
		if (!microTscRepository.existsById(microTsc.getId())) {
			if (microTscRepository.existsByMicroName(microTsc.getMicroName())) {
				// return Utility.errMsgCreateFieldNameExits(microTsc.getMicroName());
				throw new CustomException("Record name has existed");
			} else {
				microTscRepository.save(microTsc);
				return Utility.successMsg(microTsc.getId());
			}
		} else {
			return Utility.errMsgCreate(microTsc.getId());
		}
	}

	public String editMicTsc(MicroTsc microTsc) throws Exception {
		if (microTscRepository.existsById(microTsc.getId())) {
			microTscRepository.save(microTsc);
			return Utility.editMsg(microTsc.getId());
		} else {
			return Utility.errMsg(microTsc.getId());
		}
	}

	public String deleteMicTsc(Long Id) throws Exception {
		if (microTscRepository.existsById(Id)) {
			microTscRepository.deleteById(Id);
			return Utility.deleteMsg(Id);
		} else {
			return Utility.errMsg(Id);
		}
	}

	public String deleteMultiMicTsc(List<String> records) throws Exception {
		int count = 0;
		for (int i = 0; i < records.size(); i++) {
			if (microTscRepository.existsById(Long.parseLong(records.get(i)))) {
				microTscRepository.deleteById(Long.parseLong(records.get(i)));
				count++;
			}
		}
		return Utility.deleteMultiMsg(count);
	}
}
