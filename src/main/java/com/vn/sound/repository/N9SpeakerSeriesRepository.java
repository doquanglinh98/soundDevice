package com.vn.sound.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vn.sound.model.N9SpeakerSeries;

@Repository
public interface N9SpeakerSeriesRepository extends JpaRepository<N9SpeakerSeries, Long> {
	boolean existsBySeriesName(String seriesName);
}
