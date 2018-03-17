package com.ishoptest.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.ishoptest.pageobjects.NavigationBar;

/**
 * Initializes page objects using specific WebDriver instance and Selenium 
 * PageFactory.
 * 
 * @author Jerry
 *
 */
public class PageInitializer {
	
	public NavigationBar navi;
	
	public PageInitializer(WebDriver driver) {
		navi = PageFactory.initElements(driver, NavigationBar.class);
	}

}
