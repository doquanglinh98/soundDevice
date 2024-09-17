package com.vn.sound.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vn.sound.model.Microphone;

@Repository
public interface MicrophoneRepository extends JpaRepository<Microphone, String> {

}
