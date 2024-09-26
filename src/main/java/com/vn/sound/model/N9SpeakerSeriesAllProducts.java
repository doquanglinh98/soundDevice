package com.vn.sound.model;

import com.fasterxml.jackson.annotation.JsonInclude;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "N9SpeakerSeriesAllProducts")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class N9SpeakerSeriesAllProducts {

	@Id
	private Long id;

	@Column(name = "imgId")
	private String imgId;

	@Column(name = "description", columnDefinition = "LONGTEXT")
	private String description;

	@Column(name = "n9SpeakerSeriesName")
	private String n9SpeakerSeriesName;

	@Column(name = "systemDescription")
	private String systemDescription;

	@Column(name = "tweeter")
	private String tweeter;

	@Column(name = "woofer")
	private String woofer;

	@Column(name = "power")
	private String power;

	@Column(name = "maximumSoundPressure")
	private String maximumSoundPressure;

	@Column(name = "coverAngle")
	private String coverAngle;

	@Column(name = "hangingPoint")
	private String hangingPoint;

	@Column(name = "hand")
	private String hand;

	@Column(name = "paintTreatment")
	private String paintTreatment;

	@Column(name = "LFUnit")
	private String LFUnit;

	@Column(name = "MFUnit")
	private String MFUnit;

	@Column(name = "HFUnit")
	private String HFUnit;

	@Column(name = "unit")
	private String unit;

	@Column(name = "frequencyResponse")
	private String frequencyResponse;

	@Column(name = "sensitivity")
	private String sensitivity;

	@Column(name = "ratedPower")
	private String ratedPower;

	@Column(name = "nominalImpedance")
	private String nominalImpedance;

	@Column(name = "inputSensitivity")
	private String inputSensitivity;

	@Column(name = "maxSPL")
	private String maxSPL;

	@Column(name = "nominalImpedence")
	private String nominalImpedence;

	@Column(name = "coverRange")
	private String coverRange;

	@Column(name = "hangingHardware")
	private String hangingHardware;

	@Column(name = "handle")
	private String handle;

	@Column(name = "bracketFixedSeat")
	private String bracketFixedSeat;

	@Column(name = "connector")
	private String connector;

	@Column(name = "boxMaterial")
	private String boxMaterial;

	@Column(name = "netWeight")
	private String netWeight;

	@Column(name = "size")
	private String size;

	@Column(name = "categorg")
	private String categorg;

	@Column(name = "outputPower")
	private String outputPower;

	@Column(name = "DSPAccuracy")
	private String DSPAccuracy;

	@Column(name = "dividerPartFIRFilter")
	private String dividerPartFIRFilter;

	@Column(name = "digitalInput")
	private String digitalInput;

	@Column(name = "panel")
	private String panel;

	@Column(name = "maximumHangerNumber")
	private String maximumHangerNumber;

	@Column(name = "crossover")
	private String crossover;

	@Column(name = "overlay")
	private String overlay;

	@Column(name = "sprayPaintProcessing")
	private String sprayPaintProcessing;

	@Column(name = "overlayAngle")
	private String overlayAngle;

	@Column(name = "altoUnit")
	private String altoUnit;

	@Column(name = "transformerConstantPressurePower")
	private String transformerConstantPressurePower;

	@Column(name = "DCImpedance")
	private String DCImpedance;

	@Column(name = "qualityControlRange")
	private String qualityControlRange;

	@Column(name = "anti_magneticEffectTest")
	private String anti_magneticEffectTest;

	@Column(name = "earthquakeDropTest")
	private String earthquakeDropTest;

	@Column(name = "dimensions")
	private String dimensions;

	@Column(name = "category")
	private String category;

	@Column(name = "maximumOutputPower")
	private String maximumOutputPower;

	@Column(name = "totalHarmonicDistortion")
	private String totalHarmonicDistortion;

	@Column(name = "intermodulationDistortion ")
	private String intermodulationDistortion;

	@Column(name = "coolingMethod")
	private String coolingMethod;

	@Column(name = "DSPPart")
	private String DSPPart;

	@Column(name = "inputAndOutputPart")
	private String inputAndOutputPart;

	@Column(name = "caseMaterial")
	private String caseMaterial;

	// add
	@Column(name = "model")
	private String model;

	@Column(name = "normalImpedance")
	private String normalImpedance;

	@Column(name = "sprayPaintingTreatment")
	private String sprayPaintingTreatment;

	@Column(name = "weight")
	private String weight;

	@Column(name = "output4ohm")
	private String output4ohm;

	@Column(name = "output8ohm")
	private String output8ohm;

	@Column(name = "digitalOutput")
	private String digitalOutput;

	@Column(name = "channelNumber")
	private String channelNumber;

	@Column(name = "THD")
	private String THD;

	@Column(name = "sSourceNRatio")
	private String sSourceNRatio;

	@Column(name = "dampingFactor")
	private String dampingFactor;

	@Column(name = "cperatingRange")
	private String cperatingRange;

	@Column(name = "powerCurrent")
	private String powerCurrent;

	@Column(name = "angleIncrements")
	private String angleIncrements;

	@Column(name = "horizontal")
	private String horizontal;

	@Column(name = "fullFrequencyUnit")
	private String fullFrequencyUnit;

	@Column(name = "conversionEfficiency")
	private String conversionEfficiency;

	@Column(name = "inputImpedance")
	private String inputImpedance;

	@Column(name = "outputImpedance")
	private String outputImpedance;

	@Column(name = "mainPowerSupply")
	private String mainPowerSupply;

	@Column(name = "frequencyResponseRange")
	private String frequencyResponseRange;

	@Column(name = "powerFR")
	private String powerFR;

	@Column(name = "AMPFrequencyLoad")
	private String AMPFrequencyLoad;

	@Column(name = "stereo8ohm")
	private String stereo8ohm;

	@Column(name = "stereo4ohm")
	private String stereo4ohm;

	@Column(name = "slewRate")
	private String slewRate;

	@Column(name = "dynamicRange")
	private String dynamicRange;

	@Column(name = "voltageGain")
	private String voltageGain;

	@Column(name = "outputCircuitDesign")
	private String outputCircuitDesign;

	@Column(name = "powerSelection")
	private String powerSelection;

	@Column(name = "inputVoltage")
	private String inputVoltage;

	@Column(name = "speakerSpecifications")
	private String speakerSpecifications;

	@Column(name = "color")
	private String color;

	@Column(name = "waterproof")
	private String waterproof;

	@Column(name = "unitConfigure")
	private String unitConfigure;

	@Column(name = "installationOpeningSize")
	private String installationOpeningSize;

	@Column(name = "maximumOuterDiameter")
	private String maximumOuterDiameter;

	@Column(name = "withstandPower")
	private String withstandPower;

	@Column(name = "paintingTreatment")
	private String paintingTreatment;

	@Column(name = "suspensionPoint")
	private String suspensionPoint;

	@Column(name = "gain")
	private String gain;

// setter getter

	public String getImgId() {
		return imgId;
	}

	public void setImgId(String imgId) {
		this.imgId = imgId;
	}

	public String getN9SpeakerSeriesName() {
		return n9SpeakerSeriesName;
	}

	public void setN9SpeakerSeriesName(String n9SpeakerSeriesName) {
		this.n9SpeakerSeriesName = n9SpeakerSeriesName;
	}

	public String getSystemDescription() {
		return systemDescription;
	}

	public void setSystemDescription(String systemDescription) {
		this.systemDescription = systemDescription;
	}

	public String getTweeter() {
		return tweeter;
	}

	public void setTweeter(String tweeter) {
		this.tweeter = tweeter;
	}

	public String getWoofer() {
		return woofer;
	}

	public void setWoofer(String woofer) {
		this.woofer = woofer;
	}

	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}

	public String getMaximumSoundPressure() {
		return maximumSoundPressure;
	}

	public void setMaximumSoundPressure(String maximumSoundPressure) {
		this.maximumSoundPressure = maximumSoundPressure;
	}

	public String getCoverAngle() {
		return coverAngle;
	}

	public void setCoverAngle(String coverAngle) {
		this.coverAngle = coverAngle;
	}

	public String getHangingPoint() {
		return hangingPoint;
	}

	public void setHangingPoint(String hangingPoint) {
		this.hangingPoint = hangingPoint;
	}

	public String getHand() {
		return hand;
	}

	public void setHand(String hand) {
		this.hand = hand;
	}

	public String getPaintTreatment() {
		return paintTreatment;
	}

	public void setPaintTreatment(String paintTreatment) {
		this.paintTreatment = paintTreatment;
	}

	public String getLFUnit() {
		return LFUnit;
	}

	public void setLFUnit(String lFUnit) {
		LFUnit = lFUnit;
	}

	public String getMFUnit() {
		return MFUnit;
	}

	public void setMFUnit(String mFUnit) {
		MFUnit = mFUnit;
	}

	public String getHFUnit() {
		return HFUnit;
	}

	public void setHFUnit(String hFUnit) {
		HFUnit = hFUnit;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getFrequencyResponse() {
		return frequencyResponse;
	}

	public void setFrequencyResponse(String frequencyResponse) {
		this.frequencyResponse = frequencyResponse;
	}

	public String getInputSensitivity() {
		return inputSensitivity;
	}

	public void setInputSensitivity(String inputSensitivity) {
		this.inputSensitivity = inputSensitivity;
	}

	public String getMaxSPL() {
		return maxSPL;
	}

	public void setMaxSPL(String maxSPL) {
		this.maxSPL = maxSPL;
	}

	public String getNominalImpedence() {
		return nominalImpedence;
	}

	public void setNominalImpedence(String nominalImpedence) {
		this.nominalImpedence = nominalImpedence;
	}

	public String getCoverRange() {
		return coverRange;
	}

	public void setCoverRange(String coverRange) {
		this.coverRange = coverRange;
	}

	public String getHangingHardware() {
		return hangingHardware;
	}

	public void setHangingHardware(String hangingHardware) {
		this.hangingHardware = hangingHardware;
	}

	public String getHandle() {
		return handle;
	}

	public void setHandle(String handle) {
		this.handle = handle;
	}

	public String getBracketFixedSeat() {
		return bracketFixedSeat;
	}

	public void setBracketFixedSeat(String bracketFixedSeat) {
		this.bracketFixedSeat = bracketFixedSeat;
	}

	public String getConnector() {
		return connector;
	}

	public void setConnector(String connector) {
		this.connector = connector;
	}

	public String getBoxMaterial() {
		return boxMaterial;
	}

	public void setBoxMaterial(String boxMaterial) {
		this.boxMaterial = boxMaterial;
	}

	public String getNetWeight() {
		return netWeight;
	}

	public void setNetWeight(String netWeight) {
		this.netWeight = netWeight;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getCategorg() {
		return categorg;
	}

	public void setCategorg(String categorg) {
		this.categorg = categorg;
	}

	public String getOutputPower() {
		return outputPower;
	}

	public void setOutputPower(String outputPower) {
		this.outputPower = outputPower;
	}

	public String getDSPAccuracy() {
		return DSPAccuracy;
	}

	public void setDSPAccuracy(String dSPAccuracy) {
		DSPAccuracy = dSPAccuracy;
	}

	public String getDividerPartFIRFilter() {
		return dividerPartFIRFilter;
	}

	public void setDividerPartFIRFilter(String dividerPartFIRFilter) {
		this.dividerPartFIRFilter = dividerPartFIRFilter;
	}

	public String getDigitalInput() {
		return digitalInput;
	}

	public void setDigitalInput(String digitalInput) {
		this.digitalInput = digitalInput;
	}

	public String getPanel() {
		return panel;
	}

	public void setPanel(String panel) {
		this.panel = panel;
	}

	public String getMaximumHangerNumber() {
		return maximumHangerNumber;
	}

	public void setMaximumHangerNumber(String maximumHangerNumber) {
		this.maximumHangerNumber = maximumHangerNumber;
	}

	public String getCrossover() {
		return crossover;
	}

	public void setCrossover(String crossover) {
		this.crossover = crossover;
	}

	public String getOverlay() {
		return overlay;
	}

	public void setOverlay(String overlay) {
		this.overlay = overlay;
	}

	public String getSprayPaintProcessing() {
		return sprayPaintProcessing;
	}

	public void setSprayPaintProcessing(String sprayPaintProcessing) {
		this.sprayPaintProcessing = sprayPaintProcessing;
	}

	public String getOverlayAngle() {
		return overlayAngle;
	}

	public void setOverlayAngle(String overlayAngle) {
		this.overlayAngle = overlayAngle;
	}

	public String getAltoUnit() {
		return altoUnit;
	}

	public void setAltoUnit(String altoUnit) {
		this.altoUnit = altoUnit;
	}

	public String getTransformerConstantPressurePower() {
		return transformerConstantPressurePower;
	}

	public void setTransformerConstantPressurePower(String transformerConstantPressurePower) {
		this.transformerConstantPressurePower = transformerConstantPressurePower;
	}

	public String getDCImpedance() {
		return DCImpedance;
	}

	public void setDCImpedance(String dCImpedance) {
		DCImpedance = dCImpedance;
	}

	public String getQualityControlRange() {
		return qualityControlRange;
	}

	public void setQualityControlRange(String qualityControlRange) {
		this.qualityControlRange = qualityControlRange;
	}

	public String getAnti_magneticEffectTest() {
		return anti_magneticEffectTest;
	}

	public void setAnti_magneticEffectTest(String anti_magneticEffectTest) {
		this.anti_magneticEffectTest = anti_magneticEffectTest;
	}

	public String getEarthquakeDropTest() {
		return earthquakeDropTest;
	}

	public void setEarthquakeDropTest(String earthquakeDropTest) {
		this.earthquakeDropTest = earthquakeDropTest;
	}

	public String getDimensions() {
		return dimensions;
	}

	public void setDimensions(String dimensions) {
		this.dimensions = dimensions;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getMaximumOutputPower() {
		return maximumOutputPower;
	}

	public void setMaximumOutputPower(String maximumOutputPower) {
		this.maximumOutputPower = maximumOutputPower;
	}

	public String getTotalHarmonicDistortion() {
		return totalHarmonicDistortion;
	}

	public void setTotalHarmonicDistortion(String totalHarmonicDistortion) {
		this.totalHarmonicDistortion = totalHarmonicDistortion;
	}

	public String getIntermodulationDistortion() {
		return intermodulationDistortion;
	}

	public void setIntermodulationDistortion(String intermodulationDistortion) {
		this.intermodulationDistortion = intermodulationDistortion;
	}

	public String getCoolingMethod() {
		return coolingMethod;
	}

	public void setCoolingMethod(String coolingMethod) {
		this.coolingMethod = coolingMethod;
	}

	public String getDSPPart() {
		return DSPPart;
	}

	public void setDSPPart(String dSPPart) {
		DSPPart = dSPPart;
	}

	public String getInputAndOutputPart() {
		return inputAndOutputPart;
	}

	public void setInputAndOutputPart(String inputAndOutputPart) {
		this.inputAndOutputPart = inputAndOutputPart;
	}

	public String getCaseMaterial() {
		return caseMaterial;
	}

	public void setCaseMaterial(String caseMaterial) {
		this.caseMaterial = caseMaterial;
	}

	public Long getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSensitivity() {
		return sensitivity;
	}

	public void setSensitivity(String sensitivity) {
		this.sensitivity = sensitivity;
	}

	public String getRatedPower() {
		return ratedPower;
	}

	public void setRatedPower(String ratedPower) {
		this.ratedPower = ratedPower;
	}

	public String getNominalImpedance() {
		return nominalImpedance;
	}

	public void setNominalImpedance(String nominalImpedance) {
		this.nominalImpedance = nominalImpedance;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getNormalImpedance() {
		return normalImpedance;
	}

	public void setNormalImpedance(String normalImpedance) {
		this.normalImpedance = normalImpedance;
	}

	public String getSprayPaintingTreatment() {
		return sprayPaintingTreatment;
	}

	public void setSprayPaintingTreatment(String sprayPaintingTreatment) {
		this.sprayPaintingTreatment = sprayPaintingTreatment;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getOutput4ohm() {
		return output4ohm;
	}

	public void setOutput4ohm(String output4ohm) {
		this.output4ohm = output4ohm;
	}

	public String getOutput8ohm() {
		return output8ohm;
	}

	public void setOutput8ohm(String output8ohm) {
		this.output8ohm = output8ohm;
	}

	public String getDigitalOutput() {
		return digitalOutput;
	}

	public void setDigitalOutput(String digitalOutput) {
		this.digitalOutput = digitalOutput;
	}

	public String getChannelNumber() {
		return channelNumber;
	}

	public void setChannelNumber(String channelNumber) {
		this.channelNumber = channelNumber;
	}

	public String getTHD() {
		return THD;
	}

	public void setTHD(String tHD) {
		THD = tHD;
	}

	public String getsSourceNRatio() {
		return sSourceNRatio;
	}

	public void setsSourceNRatio(String sSourceNRatio) {
		this.sSourceNRatio = sSourceNRatio;
	}

	public String getDampingFactor() {
		return dampingFactor;
	}

	public void setDampingFactor(String dampingFactor) {
		this.dampingFactor = dampingFactor;
	}

	public String getCperatingRange() {
		return cperatingRange;
	}

	public void setCperatingRange(String cperatingRange) {
		this.cperatingRange = cperatingRange;
	}

	public String getPowerCurrent() {
		return powerCurrent;
	}

	public void setPowerCurrent(String powerCurrent) {
		this.powerCurrent = powerCurrent;
	}

	public String getAngleIncrements() {
		return angleIncrements;
	}

	public void setAngleIncrements(String angleIncrements) {
		this.angleIncrements = angleIncrements;
	}

	public String getHorizontal() {
		return horizontal;
	}

	public void setHorizontal(String horizontal) {
		this.horizontal = horizontal;
	}

	public String getFullFrequencyUnit() {
		return fullFrequencyUnit;
	}

	public void setFullFrequencyUnit(String fullFrequencyUnit) {
		this.fullFrequencyUnit = fullFrequencyUnit;
	}

	public String getConversionEfficiency() {
		return conversionEfficiency;
	}

	public void setConversionEfficiency(String conversionEfficiency) {
		this.conversionEfficiency = conversionEfficiency;
	}

	public String getInputImpedance() {
		return inputImpedance;
	}

	public void setInputImpedance(String inputImpedance) {
		this.inputImpedance = inputImpedance;
	}

	public String getOutputImpedance() {
		return outputImpedance;
	}

	public void setOutputImpedance(String outputImpedance) {
		this.outputImpedance = outputImpedance;
	}

	public String getMainPowerSupply() {
		return mainPowerSupply;
	}

	public void setMainPowerSupply(String mainPowerSupply) {
		this.mainPowerSupply = mainPowerSupply;
	}

	public String getFrequencyResponseRange() {
		return frequencyResponseRange;
	}

	public void setFrequencyResponseRange(String frequencyResponseRange) {
		this.frequencyResponseRange = frequencyResponseRange;
	}

	public String getPowerFR() {
		return powerFR;
	}

	public void setPowerFR(String powerFR) {
		this.powerFR = powerFR;
	}

	public String getAMPFrequencyLoad() {
		return AMPFrequencyLoad;
	}

	public void setAMPFrequencyLoad(String aMPFrequencyLoad) {
		AMPFrequencyLoad = aMPFrequencyLoad;
	}

	public String getStereo8ohm() {
		return stereo8ohm;
	}

	public void setStereo8ohm(String stereo8ohm) {
		this.stereo8ohm = stereo8ohm;
	}

	public String getStereo4ohm() {
		return stereo4ohm;
	}

	public void setStereo4ohm(String stereo4ohm) {
		this.stereo4ohm = stereo4ohm;
	}

	public String getSlewRate() {
		return slewRate;
	}

	public void setSlewRate(String slewRate) {
		this.slewRate = slewRate;
	}

	public String getDynamicRange() {
		return dynamicRange;
	}

	public void setDynamicRange(String dynamicRange) {
		this.dynamicRange = dynamicRange;
	}

	public String getVoltageGain() {
		return voltageGain;
	}

	public void setVoltageGain(String voltageGain) {
		this.voltageGain = voltageGain;
	}

	public String getOutputCircuitDesign() {
		return outputCircuitDesign;
	}

	public void setOutputCircuitDesign(String outputCircuitDesign) {
		this.outputCircuitDesign = outputCircuitDesign;
	}

	public String getPowerSelection() {
		return powerSelection;
	}

	public void setPowerSelection(String powerSelection) {
		this.powerSelection = powerSelection;
	}

	public String getInputVoltage() {
		return inputVoltage;
	}

	public void setInputVoltage(String inputVoltage) {
		this.inputVoltage = inputVoltage;
	}

	public String getSpeakerSpecifications() {
		return speakerSpecifications;
	}

	public void setSpeakerSpecifications(String speakerSpecifications) {
		this.speakerSpecifications = speakerSpecifications;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getWaterproof() {
		return waterproof;
	}

	public void setWaterproof(String waterproof) {
		this.waterproof = waterproof;
	}

	public String getUnitConfigure() {
		return unitConfigure;
	}

	public void setUnitConfigure(String unitConfigure) {
		this.unitConfigure = unitConfigure;
	}

	public String getInstallationOpeningSize() {
		return installationOpeningSize;
	}

	public void setInstallationOpeningSize(String installationOpeningSize) {
		this.installationOpeningSize = installationOpeningSize;
	}

	public String getMaximumOuterDiameter() {
		return maximumOuterDiameter;
	}

	public void setMaximumOuterDiameter(String maximumOuterDiameter) {
		this.maximumOuterDiameter = maximumOuterDiameter;
	}

	public String getWithstandPower() {
		return withstandPower;
	}

	public void setWithstandPower(String withstandPower) {
		this.withstandPower = withstandPower;
	}

	public String getPaintingTreatment() {
		return paintingTreatment;
	}

	public void setPaintingTreatment(String paintingTreatment) {
		this.paintingTreatment = paintingTreatment;
	}

	public String getSuspensionPoint() {
		return suspensionPoint;
	}

	public void setSuspensionPoint(String suspensionPoint) {
		this.suspensionPoint = suspensionPoint;
	}

	public String getGain() {
		return gain;
	}

	public void setGain(String gain) {
		this.gain = gain;
	}

	public N9SpeakerSeriesAllProducts() {

	}

	public N9SpeakerSeriesAllProducts(Long id, String imgId, String description, String n9SpeakerSeriesName,
			String systemDescription, String tweeter, String woofer, String power, String maximumSoundPressure,
			String coverAngle, String hangingPoint, String hand, String paintTreatment, String LFUnit, String MFUnit,
			String HFUnit, String unit, String frequencyResponse, String sensitivity, String ratedPower,
			String nominalImpedance, String inputSensitivity, String maxSPL, String nominalImpedence, String coverRange,
			String hangingHardware, String handle, String bracketFixedSeat, String connector, String boxMaterial,
			String netWeight, String size, String categorg, String outputPower, String DSPAccuracy,
			String dividerPartFIRFilter, String digitalInput, String panel, String maximumHangerNumber,
			String crossover, String overlay, String sprayPaintProcessing, String overlayAngle, String altoUnit,
			String transformerConstantPressurePower, String DCImpedance, String qualityControlRange,
			String anti_magneticEffectTest, String earthquakeDropTest, String dimensions, String category,
			String maximumOutputPower, String totalHarmonicDistortion, String intermodulationDistortion,
			String coolingMethod, String DSPPart, String inputAndOutputPart, String caseMaterial, String model,
			String normalImpedance, String sprayPaintingTreatment, String weight, String output4ohm, String output8ohm,
			String digitalOutput, String channelNumber, String THD, String sSourceNRatio, String dampingFactor,
			String cperatingRange, String powerCurrent, String angleIncrements, String horizontal,
			String fullFrequencyUnit, String conversionEfficiency, String inputImpedance, String outputImpedance,
			String mainPowerSupply, String frequencyResponseRange, String powerFR, String AMPFrequencyLoad,
			String stereo8ohm, String stereo4ohm, String slewRate, String dynamicRange, String voltageGain,
			String outputCircuitDesign, String powerSelection, String inputVoltage, String speakerSpecifications,
			String color, String waterproof, String unitConfigure, String installationOpeningSize,
			String maximumOuterDiameter, String withstandPower, String paintingTreatment, String suspensionPoint,
			String gain) {
		this.id = id;
		this.imgId = imgId;
		this.description = description;
		this.n9SpeakerSeriesName = n9SpeakerSeriesName;
		this.systemDescription = systemDescription;
		this.tweeter = tweeter;
		this.woofer = woofer;
		this.power = power;
		this.maximumSoundPressure = maximumSoundPressure;
		this.coverAngle = coverAngle;
		this.hangingPoint = hangingPoint;
		this.hand = hand;
		this.paintTreatment = paintTreatment;
		this.LFUnit = LFUnit;
		this.MFUnit = MFUnit;
		this.HFUnit = HFUnit;
		this.unit = unit;
		this.frequencyResponse = frequencyResponse;
		this.sensitivity = sensitivity;
		this.ratedPower = ratedPower;
		this.nominalImpedance = nominalImpedance;
		this.inputSensitivity = inputSensitivity;
		this.maxSPL = maxSPL;
		this.nominalImpedence = nominalImpedence;
		this.coverRange = coverRange;
		this.hangingHardware = hangingHardware;
		this.handle = handle;
		this.bracketFixedSeat = bracketFixedSeat;
		this.connector = connector;
		this.boxMaterial = boxMaterial;
		this.netWeight = netWeight;
		this.size = size;
		this.categorg = categorg;
		this.outputPower = outputPower;
		this.DSPAccuracy = DSPAccuracy;
		this.dividerPartFIRFilter = dividerPartFIRFilter;
		this.digitalInput = digitalInput;
		this.panel = panel;
		this.maximumHangerNumber = maximumHangerNumber;
		this.crossover = crossover;
		this.overlay = overlay;
		this.sprayPaintProcessing = sprayPaintProcessing;
		this.overlayAngle = overlayAngle;
		this.altoUnit = altoUnit;
		this.transformerConstantPressurePower = transformerConstantPressurePower;
		this.DCImpedance = DCImpedance;
		this.qualityControlRange = qualityControlRange;
		this.anti_magneticEffectTest = anti_magneticEffectTest;
		this.earthquakeDropTest = earthquakeDropTest;
		this.dimensions = dimensions;
		this.category = category;
		this.maximumOutputPower = maximumOutputPower;
		this.totalHarmonicDistortion = totalHarmonicDistortion;
		this.intermodulationDistortion = intermodulationDistortion;
		this.coolingMethod = coolingMethod;
		this.DSPPart = DSPPart;
		this.inputAndOutputPart = inputAndOutputPart;
		this.caseMaterial = caseMaterial;
		this.model = model;
		this.normalImpedance = normalImpedance;
		this.sprayPaintingTreatment = sprayPaintingTreatment;
		this.weight = weight;
		this.output4ohm = output4ohm;
		this.output8ohm = output8ohm;
		this.digitalOutput = digitalOutput;
		this.channelNumber = channelNumber;
		this.THD = THD;
		this.sSourceNRatio = sSourceNRatio;
		this.dampingFactor = dampingFactor;
		this.cperatingRange = cperatingRange;
		this.powerCurrent = powerCurrent;
		this.angleIncrements = angleIncrements;
		this.horizontal = horizontal;
		this.fullFrequencyUnit = fullFrequencyUnit;
		this.conversionEfficiency = conversionEfficiency;
		this.inputImpedance = inputImpedance;
		this.outputImpedance = outputImpedance;
		this.mainPowerSupply = mainPowerSupply;
		this.frequencyResponseRange = frequencyResponseRange;
		this.powerFR = powerFR;
		this.AMPFrequencyLoad = AMPFrequencyLoad;
		this.stereo8ohm = stereo8ohm;
		this.stereo4ohm = stereo4ohm;
		this.slewRate = slewRate;
		this.dynamicRange = dynamicRange;
		this.voltageGain = voltageGain;
		this.outputCircuitDesign = outputCircuitDesign;
		this.powerSelection = powerSelection;
		this.inputVoltage = inputVoltage;
		this.speakerSpecifications = speakerSpecifications;
		this.color = color;
		this.waterproof = waterproof;
		this.unitConfigure = unitConfigure;
		this.installationOpeningSize = installationOpeningSize;
		this.maximumOuterDiameter = maximumOuterDiameter;
		this.withstandPower = withstandPower;
		this.paintingTreatment = paintingTreatment;
		this.suspensionPoint = suspensionPoint;
		this.gain = gain;
	}
}
