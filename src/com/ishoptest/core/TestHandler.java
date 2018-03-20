package com.ishoptest.core;

import org.openqa.selenium.WebDriver;

/**
 * Initializes all thread local objects for a single test in parallel testing.
 * 
 * @author Jerry
 *
 */
public class TestHandler {
	
	public String remoteServerUrl;
	public String browser;
	public String testUrl;
	
	public PageInitializer page;
	public WebDriver driver;
	
	public TestHandler(String remoteServerUrl, String browser, String testUrl) {
		this.remoteServerUrl = remoteServerUrl;
		this.browser = browser;
		this.testUrl = testUrl;
	}
	
	/**
	 * Does general test initialization works.
	 */
	public void initializeTest() {
		Log.info("TestHandler: initializing test");
		
		// Gets driver instance for the test.
		driver = WebDriverFactory.getDriver(remoteServerUrl, browser);
		
		// Initializes page objects.
		page = new PageInitializer(this.driver);
		
		driver.manage().window().maximize();
		driver.get(testUrl);
	}
	
	/**
	 * Does general works to finalize a test.
	 */
	public void finalizeTest() {
		Log.info("TestHandler: finalizing test");
		driver.quit();
	}

}
