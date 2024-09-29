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
import com.vn.sound.model.Mixer;
import com.vn.sound.model.UploadImgs;
import com.vn.sound.repository.MixerRepository;
import com.vn.sound.repository.UploadImgsRepository;

@Service
public class MixerService {

	@Autowired
	private UploadImgsRepository uploadImgsRepository;

	@Autowired
	private MixerRepository mixerRepository;

	public Page<Mixer> findAllMixer(int page, int size) throws Exception {
		return mixerRepository.findAll(PageRequest.of(page, size));
	}

	public Mixer findMixerById(Long Id) throws Exception {
		Optional<Mixer> mixerOptional = mixerRepository.findById(Id);

		if (mixerOptional.isEmpty()) {
			// System.out.println("Not found with id: " + Id);
			throw new NoSuchElementException("Not found with id: " + Id);
		}
		Mixer mixerTmp = mixerOptional.get();
		Mixer mixer = new Mixer(mixerTmp.getId(), mixerTmp.getImgId(), mixerTmp.getModelMixer(),
				mixerTmp.getDescription(), mixerTmp.getChannel(), mixerTmp.getChannelEQ(), mixerTmp.getAUX(),
				mixerTmp.getReturnMixer(), mixerTmp.getEffects(), mixerTmp.getMainOut(), mixerTmp.getGroupsMixer(),
				mixerTmp.getPhantomPower(), mixerTmp.getUsbPlayer());
		return mixer;
	}

	public List<Mixer> findMixerByModel(String model) throws Exception {
		return mixerRepository.findMixerByModelMixer(model);
	}

	public String createMixer(Mixer mixer) throws Exception {
		if (mixerRepository.existsByModelMixer(mixer.getModelMixer())) {
			// return Utility.errMsgCreateFieldNameExits(miroTscSeries.getSeriesName());
			throw new CustomException("Record name has existed");
		} else {
			UploadImgs uploadImgs = uploadImgsRepository.findUploadImgsBySrcImg(mixer.getModelMixer());
			String filename = "";
			if (Utility.isNotNull(uploadImgs)) {
				if (uploadImgs.getSrcImg().contains(".png")) {
					filename = mixer.getModelMixer() + ".png";
				} else {
					filename = mixer.getModelMixer() + ".jpg";
				}
				mixer.setImgId(Constant.host + "imgs/Mixers/" + filename);
			}
			mixerRepository.save(mixer);
			return Utility.successMsg(mixer.getId());
		}
	}

	public String editMixer(Mixer mixer) throws Exception {
		if (mixerRepository.existsById(mixer.getId())) {
			mixerRepository.save(mixer);
			return Utility.editMsg(mixer.getId());
		} else {
			return Utility.errMsg(mixer.getId());
		}
	}

	public String deleteMixer(Long Id) throws Exception {
		if (mixerRepository.existsById(Id)) {
			mixerRepository.deleteById(Id);
			return Utility.deleteMsg(Id);
		} else {
			return Utility.errMsg(Id);
		}
	}
}
