package com.vn.sound.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vn.sound.model.Amplifier;

@Repository
public interface AmplifierRepository extends JpaRepository<Amplifier, String> {
	// find
	Amplifier findByAmplifiersByID(Long amplifiersId);
	List<Amplifier> findByAmplifiersByName(String amplifiersName);
	
	// delete
	void deleteById(Long Id);
	
	// check exits
	Boolean exitsById(Long Id);
	
}
