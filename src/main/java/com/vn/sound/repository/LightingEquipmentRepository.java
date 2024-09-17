package com.vn.sound.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vn.sound.model.LightingEquipment;

@Repository
public interface LightingEquipmentRepository extends JpaRepository<LightingEquipment, String> {

}
