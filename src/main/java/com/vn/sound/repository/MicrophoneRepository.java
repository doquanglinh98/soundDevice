package com.vn.sound.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vn.sound.model.Microphone;

@Repository
public interface MicrophoneRepository extends JpaRepository<Microphone, String> {
	// find
	Microphone findByMicrophoneByID(Long microphoneId);
	List<Microphone> findByMicrophoneByName(String microphoneName);
	
	// delete
	void deleteById(Long Id);
	
	// check exits
	Boolean exitsById(Long Id);
}
