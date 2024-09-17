package com.vn.sound.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vn.sound.model.LightingEquipment;

@Repository
public interface LightingEquipmentRepository extends JpaRepository<LightingEquipment, String> {
	// find
	LightingEquipment findByLightingEquipmentByID(Long lightingEquipmentId);
	List<LightingEquipment> findByLightingEquipmentByName(String lightingEquipmentName);
	
	// delete
	void deleteById(Long Id);
	
	// check exits
	Boolean exitsById(Long Id);
}
