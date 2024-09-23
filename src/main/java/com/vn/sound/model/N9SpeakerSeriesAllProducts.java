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

	@Column(name = "description")
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

	public N9SpeakerSeriesAllProducts() {

	}

	public N9SpeakerSeriesAllProducts(Long id, String imgId, String description, String n9SpeakerSeriesName,
			String systemDescription, String tweeter, String woofer, String power, String maximumSoundPressure,
			String coverAngle, String hangingPoint, String hand, String paintTreatment, String LFUnit, String MFUnit,
			String HFUnit, String unit, String frequencyResponse, String inputSensitivity, String maxSPL,
			String nominalImpedence, String coverRange, String hangingHardware, String handle, String bracketFixedSeat,
			String connector, String boxMaterial, String netWeight, String size, String categorg, String outputPower,
			String DSPAccuracy, String dividerPartFIRFilter, String digitalInput, String panel,
			String maximumHangerNumber, String crossover, String overlay, String sprayPaintProcessing,
			String overlayAngle, String altoUnit, String transformerConstantPressurePower, String DCImpedance,
			String qualityControlRange, String anti_magneticEffectTest, String earthquakeDropTest, String dimensions,
			String category, String maximumOutputPower, String totalHarmonicDistortion,
			String intermodulationDistortion, String coolingMethod, String DSPPart, String inputAndOutputPart,
			String caseMaterial) {
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
	}
}
