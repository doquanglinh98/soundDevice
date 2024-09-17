package com.vn.sound.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vn.sound.model.Amplifier;
import com.vn.sound.model.LightingEquipment;

import jakarta.persistence.Id;

@Repository
public interface LightingEquipmentRepository extends JpaRepository<LightingEquipment, Id> {
	// find
	LightingEquipment findById(Long Id);
}
