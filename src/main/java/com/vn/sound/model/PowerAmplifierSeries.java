package com.vn.sound.model;

import com.fasterxml.jackson.annotation.JsonInclude;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "PowerAmplifierSeries")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PowerAmplifierSeries {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "imgId", length = 150)
	private String imgId;

	@Column(name = "seriesName", length = 150)
	private String seriesName;

	public String getSeriesName() {
		return seriesName;
	}

	public void setSeriesName(String seriesName) {
		this.seriesName = seriesName;
	}

	public Long getId() {
		return id;
	}

	public String getImgId() {
		return imgId;
	}

	public void setImgId(String imgId) {
		this.imgId = imgId;
	}

	public PowerAmplifierSeries() {

	}

	public PowerAmplifierSeries(Long id, String seriesName, String imgId) {
		this.id = id;
		this.seriesName = seriesName;
		this.imgId = imgId;
	}
}
