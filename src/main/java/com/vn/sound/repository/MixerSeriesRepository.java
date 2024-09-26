package com.vn.sound.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vn.sound.model.MixerSeries;

@Repository
public interface MixerSeriesRepository extends JpaRepository<MixerSeries, Long> {
	boolean existsBySeriesName(String seriesName);
}
