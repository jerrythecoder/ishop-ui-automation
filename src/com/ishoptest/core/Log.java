package com.ishoptest.core;

/**
 * A temporary implementation for framework logging just for debugging purpose. 
 * To be re-designed later.
 * 
 * @author Jerry
 *
 */
public class Log {

	public static void info(String log) {
		String driverInfo;
		
		try {
			driverInfo = Base.test.get().driver.toString();
		} catch (NullPointerException e) {
			driverInfo = "NULL";
		}
		
		System.out.println("[Thread: " + Thread.currentThread().getId() + "] [" 
					+ driverInfo + "] " + log);
	}
}
