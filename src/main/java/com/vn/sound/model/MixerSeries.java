package com.vn.sound.model;

import com.fasterxml.jackson.annotation.JsonInclude;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "MixerSeries")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MixerSeries {
	@Id
	private Long id;

	@Column(name = "imgId")
	private String imgId;

	@Column(name = "seriesName")
	private String seriesName;

	public String getImgId() {
		return imgId;
	}

	public void setImgId(String imgId) {
		this.imgId = imgId;
	}

	public String getSeriesName() {
		return seriesName;
	}

	public void setSeriesName(String seriesName) {
		this.seriesName = seriesName;
	}

	public Long getId() {
		return id;
	}

	public MixerSeries() {

	}

	public MixerSeries(Long id, String imgId, String seriesName) {
		this.id = id;
		this.imgId = imgId;
		this.seriesName = seriesName;
	}
}
