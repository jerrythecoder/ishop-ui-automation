package com.ishoptest.pageobjects;

import org.openqa.selenium.WebDriver;

import com.ishoptest.pageobjects.utils.WebElementHelper;

/**
 * Models the website's Home page.
 * 
 * @author Jerry
 *
 */
public class NavigationBar {
	
	protected WebDriver driver;
	protected WebElementHelper helper;
	
	public NavigationBar(WebDriver driver) {
		this.driver = driver;
		this.helper = new WebElementHelper(driver);
	}
	
	
	/*---------------------------- Locator Keys -------------------------*/
	
	protected static final String signInLink = "x-navi-sign-in-link";
	protected static final String signUpLink = "x-navi-sign-up-link";
	
	
	
	/*-------------------------- Page Object APIs ----------------------*/
	
	public void clickOnSignInLink() {
		helper.get(signInLink).click();
	}
	
	public void clickOnSignUpLink() {
		helper.get(signUpLink).click();
	}

}
