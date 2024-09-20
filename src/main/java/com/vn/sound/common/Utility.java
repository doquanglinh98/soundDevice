package com.vn.sound.common;

import com.google.gson.Gson;
import com.vn.sound.model.MicroTsc;
import com.vn.sound.model.N9SpeakerSeries;
import com.vn.sound.model.N9SpeakerSeriesAllProducts;
import com.vn.sound.model.PowerAmplifier;

public class Utility {

	public static boolean isNull(Object obj) {
		return obj == null || obj.toString().trim().equals("");
	}

	public static boolean isNotNull(Object obj) {
		return !isNull(obj);
	}

	public static String errMsg(Long Id) {
		String errMsg = "{\"error\":\"invalid_request\",\"error_description\":\"Not found data with ID = " + Id + "\"}";
		return errMsg;
	}

	public static String errMsgCreate(Long Id) {
		String errMsg = "{\"error\":\"invalid_request\",\"error_description\":\"Record_ID = " + Id + " has existed\"}";
		return errMsg;
	}

	public static String errMsgInvalid() {
		String errMsg = "{\"error\":\"invalid_request\"}";
		return errMsg;
	}

	public static String errMsgAll() {
		String errMsg = "{\"error\":\"invalid_request\",\"error_description\":\"Micro table is empty\"}";
		return errMsg;
	}

	public static String errMsgUnAuthorize() {
		String errMsg = "{\"error\":\"invalid_request\",\"error_description\":\"Unauthorized\"}";
		return errMsg;
	}

	public static String successMsg(Long Id) {
		String errMsg = "{\"result\":\"SUCCESS\",\"message\":\"Create record with ID = " + Id + " successfully\"}";
		return errMsg;
	}

	public static String editMsg(Long Id) {
		String errMsg = "{\"result\":\"SUCCESS\",\"message\":\"Edit record with ID = " + Id + " successfully\"}";
		return errMsg;
	}

	public static String deleteMsg(Long Id) {
		String errMsg = "{\"result\":\"SUCCESS\",\"message\":\"Delete record with ID = " + Id + " successfully\"}";
		return errMsg;
	}

	public static String deleteMultiMsg(int count) {
		String errMsg = "{\"result\":\"SUCCESS\",\"message\":\"" + count + " records deleted successfully\"}";
		return errMsg;
	}

	public static String jsonStringConverter(Object obj) {
		Gson gson = new Gson();
		return gson.toJson(obj);
	}

	public static MicroTsc convertStringToJson(String msg) {
		MicroTsc convertedObject = new Gson().fromJson(msg, MicroTsc.class);
		return convertedObject;
	}

	public static PowerAmplifier convertStringToJsonAmpli(String msg) {
		PowerAmplifier convertedObject = new Gson().fromJson(msg, PowerAmplifier.class);
		return convertedObject;
	}

	public static N9SpeakerSeries convertStringToJsonN9SpeakerSeries(String msg) {
		N9SpeakerSeries convertedObject = new Gson().fromJson(msg, N9SpeakerSeries.class);
		return convertedObject;
	}
	
	public static N9SpeakerSeriesAllProducts convertStringToJsonN9SpeakerSeriesAllProducts(String msg) {
		N9SpeakerSeriesAllProducts convertedObject = new Gson().fromJson(msg, N9SpeakerSeriesAllProducts.class);
		return convertedObject;
	}
}
