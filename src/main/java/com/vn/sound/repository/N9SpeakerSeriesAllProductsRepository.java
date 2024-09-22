package com.vn.sound.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.vn.sound.model.N9SpeakerSeriesAllProducts;

@Repository
public interface N9SpeakerSeriesAllProductsRepository extends JpaRepository<N9SpeakerSeriesAllProducts, Long> {
	@Query("SELECT u FROM N9SpeakerSeriesAllProducts u WHERE u.n9SpeakerSeriesName LIKE %:n9SpeakerSeriesName%")
	List<N9SpeakerSeriesAllProducts> findN9SpeakerSeriesAllProductsByN9SpeakerSeriesName(
			@Param("n9SpeakerSeriesName") String n9SpeakerSeriesName);
	boolean existsByN9SpeakerSeriesName(String n9SpeakerSeriesName);
}
