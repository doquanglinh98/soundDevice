package com.vn.sound.model;

import com.fasterxml.jackson.annotation.JsonInclude;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "MicroTsc")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MicroTsc {

	@Id
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "imgId")
	private String imgId;

	@Column(name = "microName")
	private String microName;

	@Column(name = "frequencyRangeCha")
	private String frequencyRangeCha;

	@Column(name = "frequencyQuantity")
	private String frequencyQuantity;

	@Column(name = "frequencyRangeChb")
	private String frequencyRangeChb;

	@Column(name = "signalToNoiseRatio")
	private String signalToNoiseRatio;

	@Column(name = "totalHarmonicDistortion")
	private String totalHarmonicDistortion;

	@Column(name = "modulationMode")
	private String modulationMode;

	@Column(name = "workingDistance")
	private String workingDistance;

	@Column(name = "frequencyBandwidth")
	private String frequencyBandwidth;

	@Column(name = "channelInterval")
	private String channelInterval;

	@Column(name = "maxDeviation")
	private String maxDeviation;

	@Column(name = "frequencyStability")
	private String frequencyStability;

	@Column(name = "oscillationModeReceiverParam")
	private String oscillationModeReceiverParam;

	@Column(name = "modulation")
	private String modulation;

	@Column(name = "sensitivity")
	private String sensitivity;

	@Column(name = "sensitivityAdjustment")
	private String sensitivityAdjustment;

	@Column(name = "powerSupplyMode")
	private String powerSupplyMode;

	@Column(name = "antennaAccess")
	private String antennaAccess;

	@Column(name = "midFrequence")
	private String midFrequence;

	@Column(name = "spuriousSuppression")
	private String spuriousSuppression;

	@Column(name = "maxOutputElectricalLevel")
	private String maxOutputElectricalLevel;

	@Column(name = "outputPower")
	private String outputPower;

	@Column(name = "directivity")
	private String directivity;

	@Column(name = "frequencyResponse")
	private String frequencyResponse;

	@Column(name = "powerSupply")
	private String powerSupply;

	@Column(name = "oscillationModeTransmitterParam")
	private String oscillationModeTransmitterParam;

	@Column(name = "transmitterType")
	private String transmitterType;

	@Column(name = "pipeBodyMaterial")
	private String pipeBodyMaterial;

	@Column(name = "batteryLifeTime")
	private String batteryLifeTime;

	public Long getId() {
		return id;
	}

//	public void setId(Long id) {
//		this.id = id;
//	}

	public String getFrequencyRangeCha() {
		return frequencyRangeCha;
	}

	public void setFrequencyRangeCha(String frequencyRangeCha) {
		this.frequencyRangeCha = frequencyRangeCha;
	}

	public String getFrequencyRangeChb() {
		return frequencyRangeChb;
	}

	public void setFrequencyRangeChb(String frequencyRangeChb) {
		this.frequencyRangeChb = frequencyRangeChb;
	}

	public String getSignalToNoiseRatio() {
		return signalToNoiseRatio;
	}

	public void setSignalToNoiseRatio(String signalToNoiseRatio) {
		this.signalToNoiseRatio = signalToNoiseRatio;
	}

	public String getTotalHarmonicDistortion() {
		return totalHarmonicDistortion;
	}

	public void setTotalHarmonicDistortion(String totalHarmonicDistortion) {
		this.totalHarmonicDistortion = totalHarmonicDistortion;
	}

	public String getModulationMode() {
		return modulationMode;
	}

	public void setModulationMode(String modulationMode) {
		this.modulationMode = modulationMode;
	}

	public String getWorkingDistance() {
		return workingDistance;
	}

	public void setWorkingDistance(String workingDistance) {
		this.workingDistance = workingDistance;
	}

	public String getFrequencyBandwidth() {
		return frequencyBandwidth;
	}

	public void setFrequencyBandwidth(String frequencyBandwidth) {
		this.frequencyBandwidth = frequencyBandwidth;
	}

	public String getChannelInterval() {
		return channelInterval;
	}

	public void setChannelInterval(String channelInterval) {
		this.channelInterval = channelInterval;
	}

	public String getMaxDeviation() {
		return maxDeviation;
	}

	public void setMaxDeviation(String maxDeviation) {
		this.maxDeviation = maxDeviation;
	}

	public String getFrequencyStability() {
		return frequencyStability;
	}

	public void setFrequencyStability(String frequencyStability) {
		this.frequencyStability = frequencyStability;
	}

	public String getOscillationModeReceiverParam() {
		return oscillationModeReceiverParam;
	}

	public void setOscillationModeReceiverParam(String oscillationModeReceiverParam) {
		this.oscillationModeReceiverParam = oscillationModeReceiverParam;
	}

	public String getModulation() {
		return modulation;
	}

	public void setModulation(String modulation) {
		this.modulation = modulation;
	}

	public String getSensitivity() {
		return sensitivity;
	}

	public void setSensitivity(String sensitivity) {
		this.sensitivity = sensitivity;
	}

	public String getSensitivityAdjustment() {
		return sensitivityAdjustment;
	}

	public void setSensitivityAdjustment(String sensitivityAdjustment) {
		this.sensitivityAdjustment = sensitivityAdjustment;
	}

	public String getPowerSupplyMode() {
		return powerSupplyMode;
	}

	public void setPowerSupplyMode(String powerSupplyMode) {
		this.powerSupplyMode = powerSupplyMode;
	}

	public String getAntennaAccess() {
		return antennaAccess;
	}

	public void setAntennaAccess(String antennaAccess) {
		this.antennaAccess = antennaAccess;
	}

	public String getMidFrequence() {
		return midFrequence;
	}

	public void setMidFrequence(String midFrequence) {
		this.midFrequence = midFrequence;
	}

	public String getSpuriousSuppression() {
		return spuriousSuppression;
	}

	public void setSpuriousSuppression(String spuriousSuppression) {
		this.spuriousSuppression = spuriousSuppression;
	}

	public String getMaxOutputElectricalLevel() {
		return maxOutputElectricalLevel;
	}

	public void setMaxOutputElectricalLevel(String maxOutputElectricalLevel) {
		this.maxOutputElectricalLevel = maxOutputElectricalLevel;
	}

	public String getOutputPower() {
		return outputPower;
	}

	public void setOutputPower(String outputPower) {
		this.outputPower = outputPower;
	}

	public String getDirectivity() {
		return directivity;
	}

	public void setDirectivity(String directivity) {
		this.directivity = directivity;
	}

	public String getFrequencyResponse() {
		return frequencyResponse;
	}

	public void setFrequencyResponse(String frequencyResponse) {
		this.frequencyResponse = frequencyResponse;
	}

	public String getPowerSupply() {
		return powerSupply;
	}

	public void setPowerSupply(String powerSupply) {
		this.powerSupply = powerSupply;
	}

	public String getOscillationModeTransmitterParam() {
		return oscillationModeTransmitterParam;
	}

	public void setOscillationModeTransmitterParam(String oscillationModeTransmitterParam) {
		this.oscillationModeTransmitterParam = oscillationModeTransmitterParam;
	}

	public String getTransmitterType() {
		return transmitterType;
	}

	public void setTransmitterType(String transmitterType) {
		this.transmitterType = transmitterType;
	}

	public String getPipeBodyMaterial() {
		return pipeBodyMaterial;
	}

	public void setPipeBodyMaterial(String pipeBodyMaterial) {
		this.pipeBodyMaterial = pipeBodyMaterial;
	}

	public String getBatteryLifeTime() {
		return batteryLifeTime;
	}

	public void setBatteryLifeTime(String batteryLifeTime) {
		this.batteryLifeTime = batteryLifeTime;
	}

	public String getImgId() {
		return imgId;
	}

	public void setImgID(String imgId) {
		this.imgId = imgId;
	}

	public String getMicroName() {
		return microName;
	}

	public void setMicroName(String microName) {
		this.microName = microName;
	}

	public void setImgId(String imgId) {
		this.imgId = imgId;
	}

	public String getFrequencyQuantity() {
		return frequencyQuantity;
	}

	public void setFrequencyQuantity(String frequencyQuantity) {
		this.frequencyQuantity = frequencyQuantity;
	}

	public MicroTsc() {

	}

	public MicroTsc(Long Id, String imgId, String microName, String frequencyQuantity, String frequencyRangeCha,
			String frequencyRangeChb, String signalToNoiseRatio, String totalHarmonicDistortion, String modulationMode,
			String workingDistance, String frequencyBandwidth, String channelInterval, String maxDeviation,
			String frequencyStability, String oscillationModeReceiverParam, String modulation, String sensitivity,
			String sensitivityAdjustment, String powerSupplyMode, String antennaAccess, String midFrequence,
			String spuriousSuppression, String maxOutputElectricalLevel, String outputPower, String directivity,
			String frequencyResponse, String powerSupply, String oscillationModeTransmitterParam,
			String transmitterType, String pipeBodyMaterial, String batteryLifeTime) {
		this.id = Id;
		this.imgId = imgId;
		this.microName = microName;
		this.frequencyQuantity = frequencyQuantity;
		this.frequencyRangeCha = frequencyRangeCha;
		this.frequencyRangeChb = frequencyRangeChb;
		this.signalToNoiseRatio = signalToNoiseRatio;
		this.totalHarmonicDistortion = totalHarmonicDistortion;
		this.modulationMode = modulationMode;
		this.workingDistance = workingDistance;
		this.frequencyBandwidth = frequencyBandwidth;
		this.channelInterval = channelInterval;
		this.maxDeviation = maxDeviation;
		this.frequencyStability = frequencyStability;
		this.oscillationModeReceiverParam = oscillationModeReceiverParam;
		this.modulation = modulation;
		this.sensitivity = sensitivity;
		this.sensitivityAdjustment = sensitivityAdjustment;
		this.powerSupplyMode = powerSupplyMode;
		this.antennaAccess = antennaAccess;
		this.midFrequence = midFrequence;
		this.spuriousSuppression = spuriousSuppression;
		this.maxOutputElectricalLevel = maxOutputElectricalLevel;
		this.outputPower = outputPower;
		this.directivity = directivity;
		this.frequencyResponse = frequencyResponse;
		this.powerSupply = powerSupply;
		this.oscillationModeTransmitterParam = oscillationModeTransmitterParam;
		this.transmitterType = transmitterType;
		this.pipeBodyMaterial = pipeBodyMaterial;
		this.batteryLifeTime = batteryLifeTime;
	}

}
