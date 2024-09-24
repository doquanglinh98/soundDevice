package com.vn.sound.common;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j {
	private static final Logger infoLogger = LogManager.getLogger("com.vn.sound.info");
	private static final Logger errorLogger = LogManager.getLogger("com.vn.sound.error");

	public static void tranx(Object message, Throwable exception) {
		infoLogger.info(message, exception);
	}

	public static void error(Object message, Throwable exception) {
		errorLogger.error(message, exception);
	}

}
