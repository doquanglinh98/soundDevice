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

	@Column(name = "imgId", length = 150)
	private String imgId;

	@Column(name = "microName", length = 150)
	private String microName;

	@Column(name = "model", length = 150)
	private String model;

	@Column(name = "channels", length = 150)
	private String channels;

	@Column(name = "description", columnDefinition = "LONGTEXT")
	private String description;

	@Column(name = "frequencyRangeCha", length = 150)
	private String frequencyRangeCha;

	@Column(name = "frequencyQuantity", length = 150)
	private String frequencyQuantity;

	@Column(name = "frequencyRangeChb", length = 150)
	private String frequencyRangeChb;

	@Column(name = "sSourceNRatio", length = 150)
	private String sSourceNRatio;

	@Column(name = "signalToNoiseRatio", length = 150)
	private String signalToNoiseRatio;

	@Column(name = "totalHarmonicDistortion", length = 150)
	private String totalHarmonicDistortion;

	@Column(name = "modulationMode", length = 150)
	private String modulationMode;

	@Column(name = "workingDistance", length = 150)
	private String workingDistance;

	@Column(name = "frequencyBandwidth", length = 150)
	private String frequencyBandwidth;

	@Column(name = "channelInterval", length = 150)
	private String channelInterval;

	@Column(name = "maxDeviation", length = 150)
	private String maxDeviation;

	@Column(name = "frequencyStability", length = 150)
	private String frequencyStability;

	@Column(name = "oscillationModeReceiverParam", length = 150)
	private String oscillationModeReceiverParam;

	@Column(name = "modulation", length = 150)
	private String modulation;

	@Column(name = "oscillationMode", length = 150)
	private String oscillationMode;

	@Column(name = "sensitivity", length = 150)
	private String sensitivity;

	@Column(name = "sensitivityAdjustment", length = 150)
	private String sensitivityAdjustment;

	@Column(name = "powerSupplyMode", length = 150)
	private String powerSupplyMode;

	@Column(name = "antennaAccess", length = 150)
	private String antennaAccess;

	@Column(name = "midFrequence", length = 150)
	private String midFrequence;

	@Column(name = "spuriousSuppression", length = 150)
	private String spuriousSuppression;

	@Column(name = "maxOutputElectricalLevel", length = 150)
	private String maxOutputElectricalLevel;

	@Column(name = "outputPower", length = 150)
	private String outputPower;

	@Column(name = "directivity", length = 150)
	private String directivity;

	@Column(name = "frequencyResponse", length = 150)
	private String frequencyResponse;

	@Column(name = "powerSupply", length = 150)
	private String powerSupply;

	@Column(name = "oscillationModeTransmitterParam", length = 150)
	private String oscillationModeTransmitterParam;

	@Column(name = "transmitterType", length = 150)
	private String transmitterType;

	@Column(name = "pipeBodyMaterial", length = 150)
	private String pipeBodyMaterial;

	@Column(name = "batteryLifeTime", length = 150)
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

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getChannels() {
		return channels;
	}

	public void setChannels(String channels) {
		this.channels = channels;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getsSourceNRatio() {
		return sSourceNRatio;
	}

	public void setsSourceNRatio(String sSourceNRatio) {
		this.sSourceNRatio = sSourceNRatio;
	}

	public String getOscillationMode() {
		return oscillationMode;
	}

	public void setOscillationMode(String oscillationMode) {
		this.oscillationMode = oscillationMode;
	}

	public MicroTsc() {

	}

	public MicroTsc(Long Id, String imgId, String model, String description, String microName, String frequencyQuantity,
			String sSourceNRatio, String frequencyRangeCha, String frequencyRangeChb, String signalToNoiseRatio,
			String totalHarmonicDistortion, String modulationMode, String workingDistance, String frequencyBandwidth,
			String channelInterval, String maxDeviation, String frequencyStability, String oscillationMode,
			String oscillationModeReceiverParam, String modulation, String sensitivity, String sensitivityAdjustment,
			String powerSupplyMode, String antennaAccess, String midFrequence, String spuriousSuppression,
			String maxOutputElectricalLevel, String outputPower, String directivity, String frequencyResponse,
			String powerSupply, String oscillationModeTransmitterParam, String transmitterType, String pipeBodyMaterial,
			String channels, String batteryLifeTime) {
		this.id = Id;
		this.imgId = imgId;
		this.model = model;
		this.description = description;
		this.microName = microName;
		this.frequencyQuantity = frequencyQuantity;
		this.sSourceNRatio = sSourceNRatio;
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
		this.oscillationMode = oscillationMode;
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
		this.channels = channels;
		this.batteryLifeTime = batteryLifeTime;
	}

}
