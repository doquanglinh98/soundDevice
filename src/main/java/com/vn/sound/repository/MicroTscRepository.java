package com.vn.sound.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.vn.sound.model.MicroTsc;

@Repository
public interface MicroTscRepository extends JpaRepository<MicroTsc, Long> {
	@Query("SELECT u FROM MicroTsc u WHERE u.microName LIKE %:microName%")
	List<MicroTsc> findMicroTscByName(@Param("microName") String microName);
}
