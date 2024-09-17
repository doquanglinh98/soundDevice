package com.vn.sound.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vn.sound.model.Loudspeaker;

@Repository
public interface LoudspeakerRepository extends JpaRepository<Loudspeaker, String> {
	// find
	Loudspeaker findByLoudspeakerByID(Long loudspeakerId);
	List<Loudspeaker> findByLoudspeakerByName(String loudspeakerName);
	
	// delete
	void deleteById(Long Id);
	
	// check exits
	Boolean exitsById(Long Id);
}
