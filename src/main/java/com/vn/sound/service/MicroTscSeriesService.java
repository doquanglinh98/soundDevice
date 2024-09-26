package com.vn.sound.service;

import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.vn.sound.common.CustomException;
import com.vn.sound.common.Utility;
import com.vn.sound.model.MicroTscSeries;
import com.vn.sound.repository.MicroTscSeriesRepository;

@Service
public class MicroTscSeriesService {
	@Autowired
	private MicroTscSeriesRepository miroTscSeriesRepository;

	public Page<MicroTscSeries> findAllMicroTscSeries(int page, int size) throws Exception {
		return miroTscSeriesRepository.findAll(PageRequest.of(page, size));
	}

	public MicroTscSeries findMicroSeriesById(Long Id) throws Exception {
		Optional<MicroTscSeries> microSeriesOptional = miroTscSeriesRepository.findById(Id);

		if (microSeriesOptional.isEmpty()) {
			System.out.println("Not found with id: " + Id);
			throw new NoSuchElementException("Not found with id: " + Id);
		}
		MicroTscSeries microTscSeriesTmp = microSeriesOptional.get();
		MicroTscSeries microTscSeries = new MicroTscSeries(microTscSeriesTmp.getId(), microTscSeriesTmp.getSeriesName(),
				microTscSeriesTmp.getImgId());
		return microTscSeries;
	}

	public String createMicroTscSeries(MicroTscSeries miroTscSeries) throws Exception {
		if (!miroTscSeriesRepository.existsById(miroTscSeries.getId())) {
			if (miroTscSeriesRepository.existsBySeriesName(miroTscSeries.getSeriesName())) {
				// return Utility.errMsgCreateFieldNameExits(miroTscSeries.getSeriesName());
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
