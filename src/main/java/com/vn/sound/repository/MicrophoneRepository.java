package com.vn.sound.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vn.sound.model.Loudspeaker;
import com.vn.sound.model.Microphone;

import jakarta.persistence.Id;

@Repository
public interface MicrophoneRepository extends JpaRepository<Microphone, Id> {
	// find
	Microphone findById(Long Id);
}
