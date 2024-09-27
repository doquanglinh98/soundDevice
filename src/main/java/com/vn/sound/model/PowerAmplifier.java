package com.vn.sound.model;

import com.fasterxml.jackson.annotation.JsonInclude;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "PowerAmplifier")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PowerAmplifier {
	@Id
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "imgId", length = 150)
	private String imgId;

	@Column(name = "model", length = 150)
	private String model;

	@Column(name = "description", columnDefinition = "LONGTEXT")
	private String description;

	@Column(name = "mode", length = 150)
	private String mode;

	@Column(name = "stereoPower8OHM", length = 150)
	private String stereoPower8OHM;

	@Column(name = "stereoPower4OHM", length = 150)
	private String stereoPower4OHM;

	@Column(name = "stereoPower2OHM", length = 150)
	private String stereoPower2OHM;

	@Column(name = "btl8OHM", length = 150)
	private String btl8OHM;

	@Column(name = "btl4OHM", length = 150)
	private String btl4OHM;

	@Column(name = "frequencyResponse", length = 150)
	private String frequencyResponse;

	@Column(name = "thdPlus", length = 150)
	private String thdPlus;

	@Column(name = "sSourceNRatio", length = 150)
	private String sSourceNRatio;

	@Column(name = "slewRatio", length = 150)
	private String slewRatio;

	@Column(name = "dampingFactor", length = 150)
	private String dampingFactor;

	@Column(name = "outputCircuitry", length = 150)
	private String outputCircuitry;

	@Column(name = "crossTalk", length = 150)
	private String crossTalk;

	@Column(name = "inputImpedance", length = 150)
	private String inputImpedance;

	@Column(name = "inputSensitivity", length = 150)
	private String inputSensitivity;

	@Column(name = "protectPowerAmplifier", length = 150)
	private String protectPowerAmplifier;

	@Column(name = "gWeight", length = 150)
	private String gWeight;

	@Column(name = "dimension", length = 150)
	private String dimension;

	@Column(name = "packingSize", length = 150)
	private String packingSize;

	@Column(name = "gain", length = 150)
	private String gain;

	@Column(name = "optionalGian", length = 150)
	private String optionalGian;

	@Column(name = "degreeOfSeparation", length = 150)
	private String degreeOfSeparation;

	@Column(name = "dissipateHeat", length = 150)
	private String dissipateHeat;

	@Column(name = "appearanceVolume", length = 150)
	private String appearanceVolume;

	public String getImgId() {
		return imgId;
	}

	public void setImgId(String imgId) {
		this.imgId = imgId;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getStereoPower8OHM() {
		return stereoPower8OHM;
	}

	public void setStereoPower8OHM(String stereoPower8OHM) {
		this.stereoPower8OHM = stereoPower8OHM;
	}

	public String getStereoPower4OHM() {
		return stereoPower4OHM;
	}

	public void setStereoPower4OHM(String stereoPower4OHM) {
		this.stereoPower4OHM = stereoPower4OHM;
	}

	public String getStereoPower2OHM() {
		return stereoPower2OHM;
	}

	public void setStereoPower2OHM(String stereoPower2OHM) {
		this.stereoPower2OHM = stereoPower2OHM;
	}

	public String getBtl8OHM() {
		return btl8OHM;
	}

	public void setBtl8OHM(String btl8ohm) {
		btl8OHM = btl8ohm;
	}

	public String getBtl4OHM() {
		return btl4OHM;
	}

	public void setBtl4OHM(String btl4ohm) {
		btl4OHM = btl4ohm;
	}

	public String getFrequencyResponse() {
		return frequencyResponse;
	}

	public void setFrequencyResponse(String frequencyResponse) {
		this.frequencyResponse = frequencyResponse;
	}

	public String getThdPlus() {
		return thdPlus;
	}

	public void setThdPlus(String thdPlus) {
		this.thdPlus = thdPlus;
	}

	public String getsSourceNRatio() {
		return sSourceNRatio;
	}

	public void setsSourceNRatio(String sSourceNRatio) {
		this.sSourceNRatio = sSourceNRatio;
	}

	public String getSlewRatio() {
		return slewRatio;
	}

	public void setSlewRatio(String slewRatio) {
		this.slewRatio = slewRatio;
	}

	public String getDampingFactor() {
		return dampingFactor;
	}

	public void setDampingFactor(String dampingFactor) {
		this.dampingFactor = dampingFactor;
	}

	public String getOutputCircuitry() {
		return outputCircuitry;
	}

	public void setOutputCircuitry(String outputCircuitry) {
		this.outputCircuitry = outputCircuitry;
	}

	public String getCrossTalk() {
		return crossTalk;
	}

	public void setCrossTalk(String crossTalk) {
		this.crossTalk = crossTalk;
	}

	public String getInputImpedance() {
		return inputImpedance;
	}

	public void setInputImpedance(String inputImpedance) {
		this.inputImpedance = inputImpedance;
	}

	public String getInputSensitivity() {
		return inputSensitivity;
	}

	public void setInputSensitivity(String inputSensitivity) {
		this.inputSensitivity = inputSensitivity;
	}

	public String getProtectPowerAmplifier() {
		return protectPowerAmplifier;
	}

	public void setProtectPowerAmplifier(String protectPowerAmplifier) {
		this.protectPowerAmplifier = protectPowerAmplifier;
	}

	public String getgWeight() {
		return gWeight;
	}

	public void setgWeight(String gWeight) {
		this.gWeight = gWeight;
	}

	public String getDimension() {
		return dimension;
	}

	public void setDimension(String dimension) {
		this.dimension = dimension;
	}

	public String getPackingSize() {
		return packingSize;
	}

	public void setPackingSize(String packingSize) {
		this.packingSize = packingSize;
	}

	public Long getId() {
		return id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getGain() {
		return gain;
	}

	public void setGain(String gain) {
		this.gain = gain;
	}

	public String getOptionalGian() {
		return optionalGian;
	}

	public void setOptionalGian(String optionalGian) {
		this.optionalGian = optionalGian;
	}

	public String getDegreeOfSeparation() {
		return degreeOfSeparation;
	}

	public void setDegreeOfSeparation(String degreeOfSeparation) {
		this.degreeOfSeparation = degreeOfSeparation;
	}

	public String getDissipateHeat() {
		return dissipateHeat;
	}

	public void setDissipateHeat(String dissipateHeat) {
		this.dissipateHeat = dissipateHeat;
	}

	public String getAppearanceVolume() {
		return appearanceVolume;
	}

	public void setAppearanceVolume(String appearanceVolume) {
		this.appearanceVolume = appearanceVolume;
	}

	public PowerAmplifier() {

	}

	public PowerAmplifier(Long Id, String imgId, String model, String description, String mode, String stereoPower8OHM,
			String stereoPower4OHM, String stereoPower2OHM, String btl8OHM, String btl4OHM, String frequencyResponse,
			String thdPlus, String sSourceNRatio, String slewRatio, String dampingFactor, String outputCircuitry,
			String crossTalk, String inputImpedance, String inputSensitivity, String protectPowerAmplifier, String gWeight,
			String dimension, String packingSize, String gain, String optionalGian, String degreeOfSeparation,
			String dissipateHeat, String appearanceVolume) {
		this.id = Id;
		this.imgId = imgId;
		this.model = model;
		this.description = description;
		this.mode = mode;
		this.stereoPower8OHM = stereoPower8OHM;
		this.stereoPower4OHM = stereoPower4OHM;
		this.stereoPower2OHM = stereoPower2OHM;
		this.btl8OHM = btl8OHM;
		this.btl4OHM = btl4OHM;
		this.frequencyResponse = frequencyResponse;
		this.thdPlus = thdPlus;
		this.sSourceNRatio = sSourceNRatio;
		this.slewRatio = slewRatio;
		this.dampingFactor = dampingFactor;
		this.outputCircuitry = outputCircuitry;
		this.crossTalk = crossTalk;
		this.inputImpedance = inputImpedance;
		this.inputSensitivity = inputSensitivity;
		this.protectPowerAmplifier = protectPowerAmplifier;
		this.gWeight = gWeight;
		this.dimension = dimension;
		this.packingSize = packingSize;
		this.gain = gain;
		this.optionalGian = optionalGian;
		this.degreeOfSeparation = degreeOfSeparation;
		this.dissipateHeat = dissipateHeat;
		this.appearanceVolume = appearanceVolume;
	}

}
