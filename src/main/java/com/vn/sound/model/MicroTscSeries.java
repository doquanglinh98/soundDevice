package com.vn.sound.model;

import com.fasterxml.jackson.annotation.JsonInclude;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "MicroTscSeries")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MicroTscSeries {
	@Id
	private Long id;

	@Column(name = "seriesName", length = 60)
	private String seriesName;

	@Column(name = "imgId", length = 60)
	private String imgId;

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

	public MicroTscSeries() {

	}

	public MicroTscSeries(Long id, String seriesName, String imgId) {
		this.id = id;
		this.seriesName = seriesName;
		this.imgId = imgId;
	}
}
