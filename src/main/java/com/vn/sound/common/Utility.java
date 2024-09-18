package com.vn.sound.common;

public class Utility {

	public static Boolean isAccess(String uName, String pwd, String authenCode) {
		if (authenCode.contains(Constant.authenCode)) {
			return true;
		}
		return false;
	}
}
