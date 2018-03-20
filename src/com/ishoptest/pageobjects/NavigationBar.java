package com.ishoptest.pageobjects;

import org.openqa.selenium.WebDriver;

import com.ishoptest.core.Log;
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
		Log.info(this.getClass().getSimpleName() + ": click on Sign In link");
		helper.get(signInLink).click();
	}
	
	public void clickOnSignUpLink() {
		Log.info(this.getClass().getSimpleName() + ": click on Sign Up link");
		helper.get(signUpLink).click();
	}

}
