package com.vn.sound.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Amplifier")
public class Amplifier {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;

	@Column(name = "SystemAmplifier", nullable = false)
	private String SystemAmplifier;

	@Column(name = "FrequencyResponse")
	private String FrequencyResponse;

	@Column(name = "Capacity")
	private String Capacity;

	@Column(name = "NominalImpedance")
	private String NominalImpedance;

	@Column(name = "Sensitivity")
	private String Sensitivity;

	@Column(name = "MaximumSoundPressure")
	private String MaximumSoundPressure;

	@Column(name = "CoverageAngle")
	private String CoverageAngle;

	@Column(name = "Tweeter")
	private String Tweeter;

	@Column(name = "Connector")
	private String Connector;

	@Column(name = "Bracket")
	private String Bracket;

	@Column(name = "Handle")
	private String Handle;

	@Column(name = "BoxMaterial")
	private String BoxMaterial;

	@Column(name = "PaintTreatment")
	private String PaintTreatment;

	@Column(name = "Weight")
	private String Weight;

	@Column(name = "Size")
	private String Size;

}
