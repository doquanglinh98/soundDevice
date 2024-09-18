package com.vn.sound.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "loudSpeaker")
@Data
public class Loudspeaker {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "systemAmplifier", nullable = false)
	private String systemAmplifier;

	@Column(name = "frequencyResponse")
	private String frequencyResponse;

	@Column(name = "capacity")
	private String capacity;

	@Column(name = "nominalImpedance")
	private String nominalImpedance;

	@Column(name = "sensitivity")
	private String sensitivity;

	@Column(name = "maximumSoundPressure")
	private String maximumSoundPressure;

	@Column(name = "coverageAngle")
	private String coverageAngle;

	@Column(name = "tweeter")
	private String tweeter;

	@Column(name = "connector")
	private String connector;

	@Column(name = "bracket")
	private String bracket;

	@Column(name = "handle")
	private String handle;

	@Column(name = "boxMaterial")
	private String boxMaterial;

	@Column(name = "paintTreatment")
	private String paintTreatment;

	@Column(name = "weight")
	private String weight;

	@Column(name = "size")
	private String size;
}
