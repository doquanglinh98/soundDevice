package com.vn.sound.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.vn.sound.common.Utility;
import com.vn.sound.model.N9SpeakerSeries;
import com.vn.sound.repository.N9SpeakerSeriesRepository;

@Service
public class N9SpeakerSeriesService {

	@Autowired
	private N9SpeakerSeriesRepository n9SpeakerSeriesRepository;

//	public Page<N9SpeakerSeries> findAllN9SpeakerSeries(int page, int size) throws Exception {
//		return n9SpeakerSeriesRepository.findAll(PageRequest.of(page, size));
//	}

	public List<N9SpeakerSeries> findAllN9SpeakerSeries() throws Exception {
		return n9SpeakerSeriesRepository.findAll();
	}

	public String createN9SpeakerSeries(N9SpeakerSeries n9SpeakerSeries) throws Exception {
		if (!n9SpeakerSeriesRepository.existsById(n9SpeakerSeries.getId())) {
			n9SpeakerSeriesRepository.save(n9SpeakerSeries);
			return Utility.successMsg(n9SpeakerSeries.getId());
		} else {
			return Utility.errMsgCreate(n9SpeakerSeries.getId());
		}
	}

	public String editN9SpeakerSeries(N9SpeakerSeries n9SpeakerSeries) throws Exception {
		if (n9SpeakerSeriesRepository.existsById(n9SpeakerSeries.getId())) {
			n9SpeakerSeriesRepository.save(n9SpeakerSeries);
			return Utility.editMsg(n9SpeakerSeries.getId());
		} else {
			return Utility.errMsg(n9SpeakerSeries.getId());
		}
	}

	public String deleteN9SpeakerSeries(Long Id) throws Exception {
		if (n9SpeakerSeriesRepository.existsById(Id)) {
			n9SpeakerSeriesRepository.deleteById(Id);
			return Utility.deleteMsg(Id);
		} else {
			return Utility.errMsg(Id);
		}
	}
}
