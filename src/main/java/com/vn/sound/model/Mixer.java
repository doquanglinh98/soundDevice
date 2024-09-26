package com.vn.sound.model;

import com.fasterxml.jackson.annotation.JsonInclude;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Mixer")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Mixer {
	@Id
	private Long id;

	@Column(name = "imgId", length = 60)
	private String imgId;

	@Column(name = "modelMixer", length = 60)
	private String modelMixer;

	@Column(name = "description", columnDefinition = "LONGTEXT")
	private String description;

	@Column(name = "channel", length = 60)
	private String channel;

	@Column(name = "channelEQ", length = 60)
	private String channelEQ;

	@Column(name = "AUX", length = 60)
	private String AUX;

	@Column(name = "returnMixer", length = 60)
	private String returnMixer;

	@Column(name = "effects", length = 60)
	private String effects;

	@Column(name = "mainOut", length = 60)
	private String mainOut;

	@Column(name = "groupsMixer", length = 60)
	private String groupsMixer;

	@Column(name = "phantomPower", length = 60)
	private String phantomPower;

	@Column(name = "usbPlayer", length = 60)
	private String usbPlayer;

	public String getImgId() {
		return imgId;
	}

	public void setImgId(String imgId) {
		this.imgId = imgId;
	}

	public String getModelMixer() {
		return modelMixer;
	}

	public void setModelMixer(String modelMixer) {
		this.modelMixer = modelMixer;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getChannelEQ() {
		return channelEQ;
	}

	public void setChannelEQ(String channelEQ) {
		this.channelEQ = channelEQ;
	}

	public String getAUX() {
		return AUX;
	}

	public void setAUX(String aUX) {
		AUX = aUX;
	}

	public String getReturnMixer() {
		return returnMixer;
	}

	public void setReturnMixer(String returnMixer) {
		this.returnMixer = returnMixer;
	}

	public String getEffects() {
		return effects;
	}

	public void setEffects(String effects) {
		this.effects = effects;
	}

	public String getMainOut() {
		return mainOut;
	}

	public void setMainOut(String mainOut) {
		this.mainOut = mainOut;
	}

	public String getGroupsMixer() {
		return groupsMixer;
	}

	public void setGroupsMixer(String groupsMixer) {
		this.groupsMixer = groupsMixer;
	}

	public String getPhantomPower() {
		return phantomPower;
	}

	public void setPhantomPower(String phantomPower) {
		this.phantomPower = phantomPower;
	}

	public String getUsbPlayer() {
		return usbPlayer;
	}

	public void setUsbPlayer(String usbPlayer) {
		this.usbPlayer = usbPlayer;
	}

	public Long getId() {
		return id;
	}

	public Mixer() {

	}

	public Mixer(Long id, String imgId, String modelMixer, String description, String channel, String channelEQ,
			String AUX, String returnMixer, String effects, String mainOut, String groupsMixer, String phantomPower,
			String usbPlayer) {
		this.id = id;
		this.imgId = imgId;
		this.modelMixer = modelMixer;
		this.description = description;
		this.channel = channel;
		this.channelEQ = channelEQ;
		this.AUX = AUX;
		this.returnMixer = returnMixer;
		this.effects = effects;
		this.mainOut = mainOut;
		this.groupsMixer = groupsMixer;
		this.phantomPower = phantomPower;
		this.usbPlayer = usbPlayer;
	}

}
