package com.ishoptest.pageobjects;

import org.openqa.selenium.WebDriver;

import com.ishoptest.pageobjects.utils.WebElementHelper;

/**
 * Base class of all page object classes. 
 * - Sets WebDriver and WebElementHelper instances.
 * - Holds common properties that are shared by all page objects.
 * 
 * @author Jerry
 *
 */
public class PageObjectBase {
	
	protected WebDriver driver;
	protected WebElementHelper helper;
	
	// Sets WebDriver instance and web element helper.
	public void setDriver(WebDriver driver) {
		this.driver = driver;
		this.helper = new WebElementHelper(driver);
	}

}
