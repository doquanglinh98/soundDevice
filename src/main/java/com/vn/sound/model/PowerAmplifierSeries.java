package com.vn.sound.model;

import com.fasterxml.jackson.annotation.JsonInclude;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "PowerAmplifierSeries")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PowerAmplifierSeries {
	@Id
	private Long id;

	@Column(name = "seriesName")
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

	public PowerAmplifierSeries() {

	}

	public PowerAmplifierSeries(Long id, String seriesName) {
		this.id = id;
		this.seriesName = seriesName;
	}
}
