package com.vn.sound.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.vn.sound.model.PowerAmplifier;

@Repository
public interface PowerAmplifierRepository extends JpaRepository<PowerAmplifier, Long> {
	@Query("SELECT u FROM PowerAmplifier u WHERE u.mode LIKE %:mode%")
	List<PowerAmplifier> findPowerAmplifierByMode(@Param("mode") String mode);
}
