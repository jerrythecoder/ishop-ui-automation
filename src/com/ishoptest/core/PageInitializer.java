package com.ishoptest.core;

import org.openqa.selenium.WebDriver;

import com.ishoptest.core.logging.LoggingContextHelper;
import com.ishoptest.pageobjects.NavigationBar;

/**
 * Initializes page objects using specific WebDriver instance.
 * 
 * @author Jerry
 *
 */
public class PageInitializer {
	
	public LoggingContextHelper loggingHelper;
	
	public NavigationBar navi;
	
	public PageInitializer(WebDriver driver) {
		//navi = new NavigationBar(driver);
		
		loggingHelper = new LoggingContextHelper();
		loggingHelper.initializeAOPContext();
		
		navi = loggingHelper.getLoggingDestinatinClass(NavigationBar.class);
		navi.setDriver(driver);
	}

}
