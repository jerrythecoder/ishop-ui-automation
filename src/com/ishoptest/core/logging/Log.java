package com.ishoptest.core.logging;

import com.ishoptest.core.Base;

/**
 * A temporary implementation for framework logging just for debugging purpose. 
 * To be re-designed later.
 * 
 * @author Jerry
 *
 */
public class Log {

	public static void info(String log) {
		String driverID;
		
		try {
			String fullInfo = Base.test.get().driver.toString();
			int beginIndex = fullInfo.indexOf("(");
			int endIndex = fullInfo.indexOf(")");
			driverID = fullInfo.substring(beginIndex + 1, endIndex);
		} catch (NullPointerException e) {
			driverID = "NULL";
		}
		
		System.out.println("[Thread: " + Thread.currentThread().getId() + "] [" 
					+ driverID + "] " + log);
	}
}
