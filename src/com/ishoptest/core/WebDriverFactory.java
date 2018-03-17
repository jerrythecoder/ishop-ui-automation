package com.ishoptest.core;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 * Provides WebDriver instances based on testing browser.
 * 
 * @author Jerry
 *
 */
public class WebDriverFactory {
	
	public static RemoteWebDriver getDriver(String remoteServerUrl, String browser) {
		
		URL url = null;
		
		try {
			url = new URL(remoteServerUrl);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
		DesiredCapabilities capabilities = null;
		
		if (browser.equalsIgnoreCase(Browser.FIREFOX)) {
			capabilities = DesiredCapabilities.firefox();
		} else if (browser.equalsIgnoreCase(Browser.CHROME)) {
			capabilities = DesiredCapabilities.chrome();
		} else {
			throw new IllegalArgumentException(
					"Fail to instantiate WebDriver due to invalid browser name: " + browser);
		}
		
		return new RemoteWebDriver(url, capabilities);
	}

}
