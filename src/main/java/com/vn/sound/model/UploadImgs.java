package com.vn.sound.model;

import com.fasterxml.jackson.annotation.JsonInclude;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "UploadImgs")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UploadImgs {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "srcImg", length = 180)
	private String srcImg;

	public String getSrcImg() {
		return srcImg;
	}

	public void setSrcImg(String srcImg) {
		this.srcImg = srcImg;
	}

	public Long getId() {
		return id;
	}

	
}
