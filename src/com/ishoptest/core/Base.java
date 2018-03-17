package com.ishoptest.core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

/**
 * Entrance point of testing for the framework. Core functionalities including:
 * - Initiate WebDriver.
 * - Define test suite level set-up/tear-down works.
 * - Define test class level set-up/tear-down works.
 * 
 * @author Jerry
 *
 */
public class Base {
	
	public static ThreadLocal<PageInitializer> page = new ThreadLocal<>();
	public static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

	/**
	 * Executes Set-up works to be done before executing the entire test suite.
	 */
	@BeforeSuite(alwaysRun = true)
	public void executeBeforeSuite() {
		// TODO Prepare test data for entire test suite.
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
