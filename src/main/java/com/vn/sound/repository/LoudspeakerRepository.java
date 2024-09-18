package com.vn.sound.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vn.sound.model.LightingEquipment;
import com.vn.sound.model.Loudspeaker;

import jakarta.persistence.Id;

@Repository
public interface LoudspeakerRepository extends JpaRepository<Loudspeaker, Id> {
	// find
	Loudspeaker findById(Long Id);
}
