package com.ishoptest.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Models the website's Home page.
 * 
 * @author Jerry
 *
 */
public class NavigationBar {
	
	private WebDriver driver;
	
	public NavigationBar(WebDriver driver) {
		this.driver = driver;
	}
	
	/*
	 * Temporary String values to be moved to properties files.
	 */
	private static final String x_sign_in_link = "//div[@id='navbar']//a[text()='Sign In']";
	
	@FindBy(xpath = x_sign_in_link)
	private WebElement signInLink;
	
	public void clickOnSignInLink() {
		signInLink.click();
	}

}
