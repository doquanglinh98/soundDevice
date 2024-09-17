package com.vn.sound.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vn.sound.model.Amplifier;

@Repository
public interface AmplifierRepository extends JpaRepository<Amplifier, Long> {

}
