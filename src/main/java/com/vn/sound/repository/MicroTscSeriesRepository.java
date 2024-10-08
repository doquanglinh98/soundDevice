package com.vn.sound.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vn.sound.model.MicroTscSeries;

@Repository
public interface MicroTscSeriesRepository extends JpaRepository<MicroTscSeries, Long> {
//	@Query("SELECT u FROM MicroTscSeries u WHERE u.seriesName LIKE %:seriesName%")
//	List<MicroTscSeries> findMicroTscSeriesBySeriesName(@Param("seriesName") String seriesName);
	boolean existsBySeriesName(String seriesName);
}
