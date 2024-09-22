package com.vn.sound.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vn.sound.model.PowerAmplifierSeries;

@Repository
public interface PowerAmplifierSeriesRepository extends JpaRepository<PowerAmplifierSeries, Long> {
	boolean existsBySeriesName(String seriesName);
}
