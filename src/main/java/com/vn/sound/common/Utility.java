package com.vn.sound.common;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.gson.Gson;
import com.vn.sound.model.MicroTsc;
import com.vn.sound.model.MicroTscSeries;
import com.vn.sound.model.Mixer;
import com.vn.sound.model.N9SpeakerSeries;
import com.vn.sound.model.N9SpeakerSeriesAllProducts;
import com.vn.sound.model.PowerAmplifier;
import com.vn.sound.model.PowerAmplifierSeries;

public class Utility {

//	public static void logging(Long referenceId, String className, String functionName, String message) {
//		final Logger logger = LoggerFactory.getLogger(className);
//		logger.info("[" + referenceId + "] [" + functionName + "] " + message);
//	}
//
//	public static void loggError(Long referenceId, String className, String functionName, String message) {
//		final Logger logger = LoggerFactory.getLogger(className);
//		logger.error("[" + referenceId + "] [" + functionName + "] " + message);
//	}
//	
	public static void logMessage(long txnRef, String message) {
		Log4j.tranx("REF=" + txnRef + ", MSG=" + Utility.maskSensitiveData(message), null);
	}

	public static void logError(long txnRef, String message, Throwable exception) {
		Log4j.tranx("REF=" + txnRef + ", ERR=" + message, exception);
	}

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

	public static String errMsgCreateFieldNameExits(String name) {
		String errMsg = "{\"error\":\"invalid_request\",\"error_description\":\"Record_Name = " + name
				+ " has existed\"}";
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

	public static String jsonStringConverterRemoveNullField(List<Object> list)
			throws JsonProcessingException, IllegalArgumentException, IllegalAccessException {
		Gson gson = new Gson();
		list.removeAll(Collections.singleton(null));
		return gson.toJson(list);
	}

	public static String jsonStringConverterRemoveNullSpeakerSeries(N9SpeakerSeriesAllProducts obj)
			throws JsonProcessingException {
		Gson gson = new Gson();
		return gson.toJson(removeNullFields(obj));
	}

	public static Map<String, Object> removeNullFields(Object obj) {
		Map<String, Object> nonNullFields = new HashMap<>();
		Field[] fields = obj.getClass().getDeclaredFields();

		for (Field field : fields) {
			field.setAccessible(true);
			try {
				Object value = field.get(obj);
				if (value != null && !value.toString().trim().equals("") && !value.toString().trim().equals("null")) {
					nonNullFields.put(field.getName(), value);
				}
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		}
		return nonNullFields;
	}

	public static MicroTsc convertStringToJson(String msg) {
		MicroTsc convertedObject = new Gson().fromJson(msg, MicroTsc.class);
		return convertedObject;
	}

	public static MicroTscSeries convertStringToJsonMicroSeries(String msg) {
		MicroTscSeries convertedObject = new Gson().fromJson(msg, MicroTscSeries.class);
		return convertedObject;
	}

	public static PowerAmplifier convertStringToJsonAmpli(String msg) {
		PowerAmplifier convertedObject = new Gson().fromJson(msg, PowerAmplifier.class);
		return convertedObject;
	}

	public static PowerAmplifierSeries convertStringToJsonAmpliSeries(String msg) {
		PowerAmplifierSeries convertedObject = new Gson().fromJson(msg, PowerAmplifierSeries.class);
		return convertedObject;
	}

	public static Mixer convertStringToJsonMixer(String msg) {
		Mixer convertedObject = new Gson().fromJson(msg, Mixer.class);
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

	public static String maskSensitiveField(String sensitiveData) {
		if (isNull(sensitiveData)) {
			return null;
		}
		String masked;
		int length = sensitiveData.length();
		if (length > 19) {
			masked = "xxxxxxxxxxxxxxxx";
		} else if (length > 10) {
			String firstSix = sensitiveData.substring(0, 6);
			String lastFour = sensitiveData.substring(length - 4, length);
			String middleMasked = "";
			for (int i = 0; i < length - 10; i++) {
				middleMasked += "x";
			}
			masked = firstSix + middleMasked + lastFour;
		} else if (length > 6) {
			String firstSix = sensitiveData.substring(0, 4);
			String lastFour = sensitiveData.substring(length - 2, length);
			String middleMasked = "";
			for (int i = 0; i < length - 6; i++) {
				middleMasked += "x";
			}
			masked = firstSix + middleMasked + lastFour;
		} else {
			masked = sensitiveData;
		}
		System.out.println(masked);
		return masked;
	}

	public static String maskSensitiveData(String input) {
		String output = input;
		if (!isNull(output)) {
			String maskedPwd = maskSensitiveField(getJsonFieldValue("password", input));

			if (isNotNull(maskedPwd)) {
				output = replacePatternInJsonString(output, "password", maskedPwd);
			}
		}
		return output;
	}

	public static String replacePatternInJsonString(String input, String pattern, String replacement) {
		String jsonFieldName = "\"" + pattern + "\"";
		int startStr = 0;
		int endStr = input.length();
		int index = input.indexOf(jsonFieldName);
		int startValueIndex = input.indexOf("\"", index + jsonFieldName.length());
		int endValueIndex = input.indexOf("\"", startValueIndex + 1);
		String prefix = input.substring(startStr, startValueIndex + 1);
		String suffix = input.substring(endValueIndex, endStr);
		return prefix + replacement + suffix;
	}

	public static String getJsonFieldValue(String jsonFieldName, String resp) {
		jsonFieldName = "\"" + jsonFieldName + "\"";
		String jsonFieldValue = null;
		int index = resp.indexOf(jsonFieldName);
		if (index != -1) {
			int startIndex = resp.indexOf("\"", index + jsonFieldName.length());
			int endIndex = resp.indexOf("\"", startIndex + 1);
			jsonFieldValue = resp.substring(startIndex + 1, endIndex);
		}
		return jsonFieldValue;
	}

}
