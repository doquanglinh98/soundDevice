package com.vn.sound.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vn.sound.common.Utility;
import com.vn.sound.model.MicroTsc;
import com.vn.sound.model.PowerAmplifier;
import com.vn.sound.repository.PowerAmplifierRepository;

@Service
public class PowerAmplifierService {
	@Autowired
	private PowerAmplifierRepository powerAmplifierRepository;

	public PowerAmplifier findAmpliById(Long Id) throws Exception {
		Optional<PowerAmplifier> powerAmplifierOptional = powerAmplifierRepository.findById(Id);

		if (powerAmplifierOptional.isEmpty()) {
			System.out.println("Not found with id: " + Id);
			throw new NoSuchElementException("Not found with id: " + Id);
		}
		PowerAmplifier powerAmplifierTmp = powerAmplifierOptional.get();
		PowerAmplifier powerAmplifier = new PowerAmplifier(powerAmplifierTmp.getId(), powerAmplifierTmp.getImgId(),
				powerAmplifierTmp.getMode(), powerAmplifierTmp.getStereoPower8OHM(),
				powerAmplifierTmp.getStereoPower4OHM(), powerAmplifierTmp.getStereoPower2OHM(),
				powerAmplifierTmp.getBtl8OHM(), powerAmplifierTmp.getBtl4OHM(),
				powerAmplifierTmp.getFrequencyResponse(), powerAmplifierTmp.getThdPlus(),
				powerAmplifierTmp.getsSourceNRatio(), powerAmplifierTmp.getSlewRatio(),
				powerAmplifierTmp.getDampingFactor(), powerAmplifierTmp.getOutputCircuitry(),
				powerAmplifierTmp.getCrossTalk(), powerAmplifierTmp.getInputImpedance(),
				powerAmplifierTmp.getInputSensitivity(), powerAmplifierTmp.getProtect(), powerAmplifierTmp.getgWeight(),
				powerAmplifierTmp.getDimension(), powerAmplifierTmp.getPackingSize());

		return powerAmplifier;
	}

	public List<PowerAmplifier> findAllAmpli() throws Exception {
		return powerAmplifierRepository.findAll();
	}

	public String createAmpli(PowerAmplifier powerAmplifier) throws Exception {
		if (!powerAmplifierRepository.existsById(powerAmplifier.getId())) {
			powerAmplifierRepository.save(powerAmplifier);
			return Utility.successMsg(powerAmplifier.getId());
		} else {
			return Utility.errMsgCreate(powerAmplifier.getId());
		}
	}
}
