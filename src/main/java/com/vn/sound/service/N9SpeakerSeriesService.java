package com.vn.sound.service;

import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.vn.sound.common.CustomException;
import com.vn.sound.common.Utility;
import com.vn.sound.model.N9SpeakerSeries;
import com.vn.sound.repository.N9SpeakerSeriesRepository;

@Service
public class N9SpeakerSeriesService {

	@Autowired
	private N9SpeakerSeriesRepository n9SpeakerSeriesRepository;

	public Page<N9SpeakerSeries> findAllN9SpeakerSeries(int page, int size) throws Exception {
		return n9SpeakerSeriesRepository.findAll(PageRequest.of(page, size));
	}

	public N9SpeakerSeries findSpeakerSeriesById(Long Id) throws Exception {
		Optional<N9SpeakerSeries> n9SpeakerSeriesOptional = n9SpeakerSeriesRepository.findById(Id);

		if (n9SpeakerSeriesOptional.isEmpty()) {
			System.out.println("Not found with id: " + Id);
			throw new NoSuchElementException("Not found with id: " + Id);
		}
		N9SpeakerSeries n9SpeakerSeriesTmp = n9SpeakerSeriesOptional.get();
		N9SpeakerSeries n9SpeakerSeries = new N9SpeakerSeries(n9SpeakerSeriesTmp.getId(), n9SpeakerSeriesTmp.getImgId(),
				n9SpeakerSeriesTmp.getSeriesName());
		return n9SpeakerSeries;
	}

	public String createN9SpeakerSeries(N9SpeakerSeries n9SpeakerSeries) throws Exception {
		if (!n9SpeakerSeriesRepository.existsById(n9SpeakerSeries.getId())) {
			if (n9SpeakerSeriesRepository.existsBySeriesName(n9SpeakerSeries.getSeriesName())) {
				// return Utility.errMsgCreateFieldNameExits(n9SpeakerSeries.getSeriesName());
				throw new CustomException("Record name has existed");
			} else {
				n9SpeakerSeriesRepository.save(n9SpeakerSeries);
				return Utility.successMsg(n9SpeakerSeries.getId());
			}
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
