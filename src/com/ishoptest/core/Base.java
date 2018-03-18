package com.ishoptest.core;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.ishoptest.pageobjects.utils.LocatorPropertyHelper;

/**
 * Entrance point of testing for the framework. Core functionalities including:
 * - Initiates thread local WebDriver instances.
 * - Executes test suite and test class level set-up / tear-down works.
 * 
 * @author Jerry
 *
 */
public class Base {
	
	// Thread local page initializer.
	public static ThreadLocal<PageInitializer> page = new ThreadLocal<>();
	
	// Thread local WebDriver instance used by different test case.
	public static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
	
	// Static locator properties helper. To be initialized before test suite starting.
	public static LocatorPropertyHelper locatorHelper;

	/**
	 * Executes Set-up works to be done before executing the entire test suite.
	 */
	@BeforeSuite(alwaysRun = true)
	public void executeBeforeSuite() {
		// Instantiates locator properties helper.
		locatorHelper = new LocatorPropertyHelper();
	}
	
	/**
	 * Executes set-up works to be done before execution of each test case.
	 */
	@BeforeClass(alwaysRun = true)
	@Parameters({"remoteServerUrl", "browser", "testUrl"})
	public void executeBeforeClass(String remoteServerUrl, String browser, String testUrl) {
		
		System.out.println("@BeforeClass, " + "server: " + remoteServerUrl 
				+ ", browser: " + browser);
		
		// Initializes page objects specific to driver instance and thread.
		driver.set(WebDriverFactory.getDriver(remoteServerUrl, browser));
		page.set(new PageInitializer(driver.get()));
		
		// Preparation works before tests.
		driver.get().manage().window().maximize();
		driver.get().get(testUrl);
	}
	
	/**
	 * Executes tear-down works to be done before execution of each test case.
	 */
	@AfterClass(alwaysRun = true)
	public void executeAfterClass() {
		driver.get().quit();
	}
	
}
