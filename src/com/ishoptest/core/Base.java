package com.ishoptest.core;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.ishoptest.pageobjects.utils.LocatorPropertyHelper;

/**
 * This is the entry point of testing for the framework. Core functionalities including:
 * - Executes test suite and test class level set-up / tear-down works.
 * - Initializing test specific objects including: WebDriver, Page Objects etc.
 * 
 * @author Jerry
 *
 */
public class Base {
	
	/**
	 * The static thread local TestHandler handles test specific objects per thread in 
	 * parallel tests. Ensures each test thread accessing separated object instances.
	 */
	public static ThreadLocal<TestHandler> test = new ThreadLocal<>();
	
	
	// Static locator properties helper. To be initialized before test suite starting.
	public static LocatorPropertyHelper locatorHelper;

	/**
	 * Executes Set-up works to be done before executing the entire test suite.
	 */
	@BeforeSuite(alwaysRun = true)
	public void executeBeforeSuite() {
		Log.info("@BeforeSuite");
		// Instantiates locator properties helper.
		locatorHelper = new LocatorPropertyHelper();
	}
	
	/**
	 * Executes set-up works to be done before execution of each test case.
	 */
	@BeforeClass(alwaysRun = true)
	@Parameters({"remoteServerUrl", "browser", "testUrl"})
	public void executeBeforeClass(String remoteServerUrl, String browser, String testUrl) {
		Log.info("@BeforeClass, " + "server: " + remoteServerUrl 
				+ ", browser: " + browser);
		
		test.set(new TestHandler(remoteServerUrl, browser, testUrl));
		test.get().initializeTest();
	}
	
	/**
	 * Executes tear-down works to be done before execution of each test case.
	 */
	@AfterClass(alwaysRun = true)
	public void executeAfterClass() {
		test.get().finalizeTest();
		Log.info("@AfterClass");
	}
	
}
