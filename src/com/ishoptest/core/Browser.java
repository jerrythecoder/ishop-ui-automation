package com.ishoptest.core;

/**
 * Defines browser name constants.
 * 
 * @author Jerry
 *
 */
public class Browser {
	
	public static final String FIREFOX = "firefox";
	public static final String CHROME = "chrome";
	
	public static String parseName(String browserName) {
		if (browserName.trim().equalsIgnoreCase(FIREFOX)) {
			return FIREFOX;
		} else if (browserName.trim().equalsIgnoreCase(CHROME)) {
			return CHROME;
		} else {
			throw new IllegalArgumentException("Fail to parse browser name with String: " + browserName);
		}
	}

}
