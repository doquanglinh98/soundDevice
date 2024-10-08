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
import com.vn.sound.model.MixerSeries;
import com.vn.sound.model.UploadImgs;
import com.vn.sound.repository.MixerSeriesRepository;
import com.vn.sound.repository.UploadImgsRepository;

@Service
public class MixerSeriesService {
	
	@Autowired
	private MixerSeriesRepository mixerSeriesRepository;
	
	@Autowired
	private UploadImgsRepository uploadImgsRepository;

	public Page<MixerSeries> findAllMixerSeries(int page, int size) throws Exception {
		return mixerSeriesRepository.findAll(PageRequest.of(page, size));
	}

	public MixerSeries findMixerSeriesById(Long Id) throws Exception {
		Optional<MixerSeries> mixerSeriesOptional = mixerSeriesRepository.findById(Id);

		if (mixerSeriesOptional.isEmpty()) {
			// System.out.println("Not found with id: " + Id);
			throw new NoSuchElementException("Not found with id: " + Id);
		}
		MixerSeries mixerSeriesTmp = mixerSeriesOptional.get();
		MixerSeries mixerSeries = new MixerSeries(mixerSeriesTmp.getId(), mixerSeriesTmp.getImgId(),
				mixerSeriesTmp.getSeriesName());
		return mixerSeries;
	}

	public String createMixerSeries(MixerSeries mixerSeries) throws Exception {
		if (mixerSeriesRepository.existsBySeriesName(mixerSeries.getSeriesName())) {
			// return Utility.errMsgCreateFieldNameExits(miroTscSeries.getSeriesName());
			throw new CustomException("Record name has existed");
		} else {
			UploadImgs uploadImgs = uploadImgsRepository.findUploadImgsBySrcImg(mixerSeries.getSeriesName());
			String filename = "";
			if (Utility.isNotNull(uploadImgs)) {
				if (uploadImgs.getSrcImg().contains(".png")) {
					filename = mixerSeries.getSeriesName() + ".png";
				} else {
					filename = mixerSeries.getSeriesName() + ".jpg";
				}
				mixerSeries.setImgId(Constant.host + "imgs/MixersSeries/" + filename);
			}
			mixerSeriesRepository.save(mixerSeries);
			return Utility.successMsg(mixerSeries.getId());
		}
	}

	public String editMixerSeries(MixerSeries mixerSeries) throws Exception {
		if (mixerSeriesRepository.existsById(mixerSeries.getId())) {
			mixerSeriesRepository.save(mixerSeries);
			return Utility.editMsg(mixerSeries.getId());
		} else {
			return Utility.errMsg(mixerSeries.getId());
		}
	}

	public String deleteMixerSeries(Long Id) throws Exception {
		if (mixerSeriesRepository.existsById(Id)) {
			mixerSeriesRepository.deleteById(Id);
			return Utility.deleteMsg(Id);
		} else {
			return Utility.errMsg(Id);
		}
	}

}
