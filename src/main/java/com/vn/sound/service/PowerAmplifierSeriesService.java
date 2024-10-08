package com.vn.sound.service;

import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.vn.sound.common.Constant;
import com.vn.sound.common.CustomException;
import com.vn.sound.common.Utility;
import com.vn.sound.model.PowerAmplifierSeries;
import com.vn.sound.model.UploadImgs;
import com.vn.sound.repository.PowerAmplifierSeriesRepository;
import com.vn.sound.repository.UploadImgsRepository;

@Service
public class PowerAmplifierSeriesService {

	@Autowired
	private UploadImgsRepository uploadImgsRepository;

	@Autowired
	private PowerAmplifierSeriesRepository powerAmplifierSeriesRepository;

	public Page<PowerAmplifierSeries> findAllPowerAmplifierSeries(int page, int size) throws Exception {
		return powerAmplifierSeriesRepository.findAll(PageRequest.of(page, size));
	}

	public PowerAmplifierSeries findAmpliSeriesById(Long Id) throws Exception {
		Optional<PowerAmplifierSeries> powerAmplifierSeriesOptional = powerAmplifierSeriesRepository.findById(Id);

		if (powerAmplifierSeriesOptional.isEmpty()) {
			// System.out.println("Not found with id: " + Id);
			throw new NoSuchElementException("Not found with id: " + Id);
		}
		PowerAmplifierSeries powerAmplifierSeriesTmp = powerAmplifierSeriesOptional.get();
		PowerAmplifierSeries powerAmplifierSeries = new PowerAmplifierSeries(powerAmplifierSeriesTmp.getId(),
				powerAmplifierSeriesTmp.getSeriesName(), powerAmplifierSeriesTmp.getImgId());
		return powerAmplifierSeries;
	}

	public String createPowerAmplifierSeries(PowerAmplifierSeries powerAmplifierSeries) throws Exception {
		if (powerAmplifierSeriesRepository.existsBySeriesName(powerAmplifierSeries.getSeriesName())) {
			// return
			// Utility.errMsgCreateFieldNameExits(powerAmplifierSeries.getSeriesName());
			throw new CustomException("Record name has existed");
		} else {
			UploadImgs uploadImgs = uploadImgsRepository.findUploadImgsBySrcImg(powerAmplifierSeries.getSeriesName());
			String filename = "";
			if (Utility.isNotNull(uploadImgs)) {
				if (uploadImgs.getSrcImg().contains(".png")) {
					filename = powerAmplifierSeries.getSeriesName() + ".png";
				} else {
					filename = powerAmplifierSeries.getSeriesName() + ".jpg";
				}
				powerAmplifierSeries.setImgId(Constant.host + "imgs/AmplifiersSeries/" + filename);
			}
			powerAmplifierSeriesRepository.save(powerAmplifierSeries);
			return Utility.successMsg(powerAmplifierSeries.getId());
		}
	}

	public String editPowerAmplifierSeries(PowerAmplifierSeries powerAmplifierSeries) throws Exception {
		if (powerAmplifierSeriesRepository.existsById(powerAmplifierSeries.getId())) {
			powerAmplifierSeriesRepository.save(powerAmplifierSeries);
			return Utility.editMsg(powerAmplifierSeries.getId());
		} else {
			return Utility.errMsg(powerAmplifierSeries.getId());
		}
	}

	public String deletePowerAmplifierSeries(Long Id) throws Exception {
		if (powerAmplifierSeriesRepository.existsById(Id)) {
			powerAmplifierSeriesRepository.deleteById(Id);
			return Utility.deleteMsg(Id);
		} else {
			return Utility.errMsg(Id);
		}
	}
}
