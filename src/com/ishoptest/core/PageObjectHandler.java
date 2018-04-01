package com.ishoptest.core;

import org.openqa.selenium.WebDriver;

import com.ishoptest.core.logging.LoggingContextHelper;
import com.ishoptest.pageobjects.NavigationBar;
import com.ishoptest.pageobjects.SignInPage;

/**
 * Initializes and finalizes page objects that using specific WebDriver instances.
 * 
 * @author Jerry
 *
 */
public class PageObjectHandler {
	
	public LoggingContextHelper loggingHelper;
	
	public NavigationBar navi;
	public SignInPage signin;
	
	public PageObjectHandler(WebDriver driver) {
		
		// Initializes Spring context for logging AOP.
		loggingHelper = new LoggingContextHelper();
		loggingHelper.initializeAOPContext();
		
		
		// Gets page objects instances from Spring context. Then initializes each 
		// page object one by one.
		
		navi = loggingHelper.getLoggingDestinatinClass(NavigationBar.class);
		navi.setDriver(driver);
		
		signin = loggingHelper.getLoggingDestinatinClass(SignInPage.class);
		signin.setDriver(driver);
		
	}
	
	
	public void finalizePages() {
		if (this.loggingHelper != null) {
			this.loggingHelper.finalizeAOPContext();
		}
	}

}
