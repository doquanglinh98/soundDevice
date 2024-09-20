package com.vn.sound.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vn.sound.model.PowerAmplifier;

@Repository
public interface PowerAmplifierRepository extends JpaRepository<PowerAmplifier, Long> {

}
