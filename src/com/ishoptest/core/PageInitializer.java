package com.ishoptest.core;

import org.openqa.selenium.WebDriver;

import com.ishoptest.pageobjects.NavigationBar;

/**
 * Initializes page objects using specific WebDriver instance.
 * 
 * @author Jerry
 *
 */
public class PageInitializer {
	
	public NavigationBar navi;
	
	public PageInitializer(WebDriver driver) {
		navi = new NavigationBar(driver);
	}

}
