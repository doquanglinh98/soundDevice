package com.vn.sound.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.vn.sound.common.CustomException;
import com.vn.sound.common.Utility;
import com.vn.sound.model.MicroTscSeries;
import com.vn.sound.model.N9SpeakerSeriesAllProducts;
import com.vn.sound.repository.MicroTscSeriesRepository;

@Service
public class MicroTscSeriesService {
	@Autowired
	private MicroTscSeriesRepository miroTscSeriesRepository;

	public Page<MicroTscSeries> findAllMicroTscSeries(int page, int size) throws Exception {
		return miroTscSeriesRepository.findAll(PageRequest.of(page, size));
	}

//	public List<MicroTscSeries> findAllMicroTscSeries() throws Exception {
//		return miroTscSeriesRepository.findAll();
//	}

	public String createMicroTscSeries(MicroTscSeries miroTscSeries) throws Exception {
		if (!miroTscSeriesRepository.existsById(miroTscSeries.getId())) {
			if (miroTscSeriesRepository.existsBySeriesName(miroTscSeries.getSeriesName())) {
				//return Utility.errMsgCreateFieldNameExits(miroTscSeries.getSeriesName());
				throw new CustomException("Record name has existed");
			} else {
				miroTscSeriesRepository.save(miroTscSeries);
				return Utility.successMsg(miroTscSeries.getId());
			}
		} else {
			return Utility.errMsgCreate(miroTscSeries.getId());
		}
	}

	public String editMicroTscSeries(MicroTscSeries miroTscSeries) throws Exception {
		if (miroTscSeriesRepository.existsById(miroTscSeries.getId())) {
			miroTscSeriesRepository.save(miroTscSeries);
			return Utility.editMsg(miroTscSeries.getId());
		} else {
			return Utility.errMsg(miroTscSeries.getId());
		}
	}

	public String deleteMicroTscSeries(Long Id) throws Exception {
		if (miroTscSeriesRepository.existsById(Id)) {
			miroTscSeriesRepository.deleteById(Id);
			return Utility.deleteMsg(Id);
		} else {
			return Utility.errMsg(Id);
		}
	}

	/*
	 * public List<MicroTscSeries> findMicroSeriesByName(String name) throws
	 * Exception { return
	 * miroTscSeriesRepository.findMicroTscSeriesBySeriesName(name); }
	 */
}
