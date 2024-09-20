package com.vn.sound.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "PowerAmplifier")
public class PowerAmplifier {
	@Id
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "imgId")
	private String imgId;

	@Column(name = "mode")
	private String mode;

	@Column(name = "stereoPower8OHM")
	private String stereoPower8OHM;

	@Column(name = "stereoPower4OHM")
	private String stereoPower4OHM;

	@Column(name = "stereoPower2OHM")
	private String stereoPower2OHM;

	@Column(name = "btl8OHM")
	private String btl8OHM;

	@Column(name = "btl4OHM")
	private String btl4OHM;

	@Column(name = "frequencyResponse")
	private String frequencyResponse;

	@Column(name = "thdPlus")
	private String thdPlus;

	@Column(name = "sSourceNRatio")
	private String sSourceNRatio;

	@Column(name = "slewRatio")
	private String slewRatio;

	@Column(name = "dampingFactor")
	private String dampingFactor;

	@Column(name = "outputCircuitry")
	private String outputCircuitry;

	@Column(name = "crossTalk")
	private String crossTalk;

	@Column(name = "inputImpedance")
	private String inputImpedance;

	@Column(name = "inputSensitivity")
	private String inputSensitivity;

	@Column(name = "protect")
	private String protect;

	@Column(name = "gWeight")
	private String gWeight;

	@Column(name = "dimension")
	private String dimension;

	@Column(name = "packingSize")
	private String packingSize;

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

	public String getProtect() {
		return protect;
	}

	public void setProtect(String protect) {
		this.protect = protect;
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

	public PowerAmplifier() {

	}

	public PowerAmplifier(Long Id, String imgId, String mode, String stereoPower8OHM, String stereoPower4OHM,
			String stereoPower2OHM, String btl8OHM, String btl4OHM, String frequencyResponse, String thdPlus,
			String sSourceNRatio, String slewRatio, String dampingFactor, String outputCircuitry, String crossTalk,
			String inputImpedance, String inputSensitivity, String protect, String gWeight, String dimension,
			String packingSize) {
		this.id = Id;
		this.imgId = imgId;
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
		this.protect = protect;
		this.gWeight = gWeight;
		this.dimension = dimension;
		this.packingSize = packingSize;
	}

}
