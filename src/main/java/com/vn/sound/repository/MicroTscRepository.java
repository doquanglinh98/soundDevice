package com.vn.sound.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vn.sound.model.MicroTsc;

@Repository
public interface MicroTscRepository extends JpaRepository<MicroTsc, Long> {

}
