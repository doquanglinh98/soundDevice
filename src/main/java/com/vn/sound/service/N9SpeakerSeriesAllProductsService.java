package com.vn.sound.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.vn.sound.common.CustomException;
import com.vn.sound.common.Utility;
import com.vn.sound.model.N9SpeakerSeriesAllProducts;
import com.vn.sound.repository.N9SpeakerSeriesAllProductsRepository;

@Service
public class N9SpeakerSeriesAllProductsService {

	@Autowired
	private N9SpeakerSeriesAllProductsRepository n9SpeakerSeriesAllProductsRepository;

	public N9SpeakerSeriesAllProducts findN9SpeakerSeriesAllProductsById(Long Id) throws Exception {
		Optional<N9SpeakerSeriesAllProducts> n9SpeakerSeriesAllProductsOptional = n9SpeakerSeriesAllProductsRepository
				.findById(Id);

		if (n9SpeakerSeriesAllProductsOptional.isEmpty()) {
			System.out.println("Not found with id: " + Id);
			throw new NoSuchElementException("Not found with id: " + Id);
		}
		N9SpeakerSeriesAllProducts n9SpeakerSeriesAllProductsTmp = n9SpeakerSeriesAllProductsOptional.get();
		N9SpeakerSeriesAllProducts n9SpeakerSeriesAllProducts = new N9SpeakerSeriesAllProducts(
				n9SpeakerSeriesAllProductsTmp.getId(), n9SpeakerSeriesAllProductsTmp.getImgId(),
				n9SpeakerSeriesAllProductsTmp.getDescription(), n9SpeakerSeriesAllProductsTmp.getN9SpeakerSeriesName(),
				n9SpeakerSeriesAllProductsTmp.getSystemDescription(), n9SpeakerSeriesAllProductsTmp.getTweeter(),
				n9SpeakerSeriesAllProductsTmp.getWoofer(), n9SpeakerSeriesAllProductsTmp.getPower(),
				n9SpeakerSeriesAllProductsTmp.getMaximumSoundPressure(), n9SpeakerSeriesAllProductsTmp.getCoverAngle(),
				n9SpeakerSeriesAllProductsTmp.getHangingPoint(), n9SpeakerSeriesAllProductsTmp.getHand(),
				n9SpeakerSeriesAllProductsTmp.getPaintTreatment(), n9SpeakerSeriesAllProductsTmp.getLFUnit(),
				n9SpeakerSeriesAllProductsTmp.getMFUnit(), n9SpeakerSeriesAllProductsTmp.getHFUnit(),
				n9SpeakerSeriesAllProductsTmp.getFrequencyResponse(),
				n9SpeakerSeriesAllProductsTmp.getInputSensitivity(), n9SpeakerSeriesAllProductsTmp.getMaxSPL(),
				n9SpeakerSeriesAllProductsTmp.getNominalImpedence(), n9SpeakerSeriesAllProductsTmp.getCoverRange(),
				n9SpeakerSeriesAllProductsTmp.getHangingHardware(), n9SpeakerSeriesAllProductsTmp.getHandle(),
				n9SpeakerSeriesAllProductsTmp.getBracketFixedSeat(), n9SpeakerSeriesAllProductsTmp.getConnector(),
				n9SpeakerSeriesAllProductsTmp.getBoxMaterial(), n9SpeakerSeriesAllProductsTmp.getNetWeight(),
				n9SpeakerSeriesAllProductsTmp.getSize(), n9SpeakerSeriesAllProductsTmp.getCategorg(),
				n9SpeakerSeriesAllProductsTmp.getOutputPower(), n9SpeakerSeriesAllProductsTmp.getDSPAccuracy(),
				n9SpeakerSeriesAllProductsTmp.getDividerPartFIRFilter(),
				n9SpeakerSeriesAllProductsTmp.getDigitalInput(), n9SpeakerSeriesAllProductsTmp.getPanel(),
				n9SpeakerSeriesAllProductsTmp.getMaximumHangerNumber(), n9SpeakerSeriesAllProductsTmp.getCrossover(),
				n9SpeakerSeriesAllProductsTmp.getOverlay(), n9SpeakerSeriesAllProductsTmp.getSprayPaintProcessing(),
				n9SpeakerSeriesAllProductsTmp.getOverlayAngle(), n9SpeakerSeriesAllProductsTmp.getAltoUnit(),
				n9SpeakerSeriesAllProductsTmp.getTransformerConstantPressurePower(),
				n9SpeakerSeriesAllProductsTmp.getDCImpedance(), n9SpeakerSeriesAllProductsTmp.getQualityControlRange(),
				n9SpeakerSeriesAllProductsTmp.getAnti_magneticEffectTest(),
				n9SpeakerSeriesAllProductsTmp.getEarthquakeDropTest(), n9SpeakerSeriesAllProductsTmp.getDimensions(),
				n9SpeakerSeriesAllProductsTmp.getCategory(), n9SpeakerSeriesAllProductsTmp.getMaximumOutputPower(),
				n9SpeakerSeriesAllProductsTmp.getTotalHarmonicDistortion(),
				n9SpeakerSeriesAllProductsTmp.getIntermodulationDistortion(),
				n9SpeakerSeriesAllProductsTmp.getCoolingMethod(), n9SpeakerSeriesAllProductsTmp.getDSPPart(),
				n9SpeakerSeriesAllProductsTmp.getInputAndOutputPart(), n9SpeakerSeriesAllProductsTmp.getCaseMaterial());

		return n9SpeakerSeriesAllProducts;
	}

	public String createN9SpeakerSeries(N9SpeakerSeriesAllProducts n9SpeakerSeriesAllProducts) throws Exception {
		if (!n9SpeakerSeriesAllProductsRepository.existsById(n9SpeakerSeriesAllProducts.getId())) {
			if (n9SpeakerSeriesAllProductsRepository
					.existsByN9SpeakerSeriesName(n9SpeakerSeriesAllProducts.getN9SpeakerSeriesName())) {
				//return Utility.errMsgCreateFieldNameExits(n9SpeakerSeriesAllProducts.getN9SpeakerSeriesName());
				throw new CustomException("Record name has existed");
			} else {
				n9SpeakerSeriesAllProductsRepository.save(n9SpeakerSeriesAllProducts);
				return Utility.successMsg(n9SpeakerSeriesAllProducts.getId());
			}
		} else {
			return Utility.errMsgCreate(n9SpeakerSeriesAllProducts.getId());
		}
	}

	public String editN9SpeakerSeries(N9SpeakerSeriesAllProducts n9SpeakerSeriesAllProducts) throws Exception {
		if (n9SpeakerSeriesAllProductsRepository.existsById(n9SpeakerSeriesAllProducts.getId())) {
			n9SpeakerSeriesAllProductsRepository.save(n9SpeakerSeriesAllProducts);
			return Utility.editMsg(n9SpeakerSeriesAllProducts.getId());
		} else {
			return Utility.errMsg(n9SpeakerSeriesAllProducts.getId());
		}
	}

	public String deleteN9SpeakerSeries(Long Id) throws Exception {
		if (n9SpeakerSeriesAllProductsRepository.existsById(Id)) {
			n9SpeakerSeriesAllProductsRepository.deleteById(Id);
			return Utility.deleteMsg(Id);
		} else {
			return Utility.errMsg(Id);
		}
	}

	public List<N9SpeakerSeriesAllProducts> findAllN9SpeakerSeriesByName(String name) throws Exception {
		return n9SpeakerSeriesAllProductsRepository.findN9SpeakerSeriesAllProductsByN9SpeakerSeriesName(name);
	}

	public Page<N9SpeakerSeriesAllProducts> findAllProductOfSpeakerSeries(int page, int size) throws Exception {
		return n9SpeakerSeriesAllProductsRepository.findAll(PageRequest.of(page, size));
	}
}
