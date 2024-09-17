package com.vn.sound.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vn.sound.model.Loudspeaker;

@Repository
public interface LoudspeakerRepository extends JpaRepository<Loudspeaker, String> {

}
