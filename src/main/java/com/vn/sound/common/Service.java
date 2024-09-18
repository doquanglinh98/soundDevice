package com.vn.sound.common;

import org.springframework.beans.factory.annotation.Autowired;

import com.vn.sound.model.Amplifier;
import com.vn.sound.model.LightingEquipment;
import com.vn.sound.model.Loudspeaker;
import com.vn.sound.model.Microphone;
import com.vn.sound.model.User;
import com.vn.sound.repository.AmplifierRepository;
import com.vn.sound.repository.LightingEquipmentRepository;
import com.vn.sound.repository.LoudspeakerRepository;
import com.vn.sound.repository.MicrophoneRepository;
import com.vn.sound.repository.UserMangerRepository;

@org.springframework.stereotype.Service
public class Service {

	@Autowired
	private UserMangerRepository userMangerRepo;

	@Autowired
	private AmplifierRepository amplifierRepository;

	@Autowired
	private LightingEquipmentRepository lightingEquipmentRepository;

	@Autowired
	private LoudspeakerRepository loudspeakerRepository;

	@Autowired
	private MicrophoneRepository microphoneRepository;

	public Boolean isAdmin(String uName, String pwd) {
		System.out.println("uName=" + uName + ", pwd=" + pwd);
		if (userMangerRepo.existsByUsernameAndPassword(uName, pwd)) {
			return true;
		} else {
			return false;
		}
	}

	// save
	public void saveUser(User user) {
		userMangerRepo.save(user);
	}

	public void saveAmplifier(Amplifier amplifier) {
		amplifierRepository.save(amplifier);
	}

	public void saveLightingEquipment(LightingEquipment lightingEquipment) {
		lightingEquipmentRepository.save(lightingEquipment);
	}

	public void saveLoudspeaker(Loudspeaker loudspeaker) {
		loudspeakerRepository.save(loudspeaker);
	}

	public void saveMicrophone(Microphone microphone) {
		microphoneRepository.save(microphone);
	}

	// check exits
	public boolean exitsAmplifier(String IdImg) {
		if (amplifierRepository.existsByIdImg(IdImg)) {
			return true;
		} else {
			return false;
		}
	}

	// delete
	public boolean delAmplifier(Long id) {
		amplifierRepository.deleteById(id);
		if (!amplifierRepository.existsById(id)) {
			return true;
		} else {
			return false;
		}
	}
}
