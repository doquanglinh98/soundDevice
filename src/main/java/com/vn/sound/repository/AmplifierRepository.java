package com.vn.sound.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.vn.sound.model.Amplifier;

import jakarta.persistence.Id;

@Repository
public interface AmplifierRepository extends JpaRepository<Amplifier, Id> {
	// find
	Amplifier findById(Long Id);

	// exits
	boolean existsById(Long Id);

	boolean existsByIdImg(String IdImg);

	// delete
	void deleteById(Long Id);

	@Query(value = "SELECT * FROM amplifier m WHERE m.system_amplifier LIKE :systemAmplifier%", nativeQuery = true)
	List<Amplifier> findAmplifierBysystemAmplifier(@Param("systemAmplifier") String systemAmplifier);
}
