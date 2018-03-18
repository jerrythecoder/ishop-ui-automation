package com.ishoptest.pageobjects.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.ishoptest.core.Base;

/**
 * Provides convenient methods to return WebElements based on locator variables
 * 
 * @author Jerry
 *
 */
public class WebElementHelper {
	
	protected WebDriver driver;
	
	public WebElementHelper(WebDriver driver) {
		this.driver = driver;
	}
	
	/**
	 * Gets a WebElement by its locator name.
	 * @param locatorName
	 * @return WebElement object
	 */
	public WebElement get(String locatorName) {
		return this.driver.findElement(By.xpath(Base.locatorHelper.getLocatorValue(locatorName)));
	}
}
