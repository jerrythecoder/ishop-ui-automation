package com.ishoptest.pageobjects;

import org.openqa.selenium.WebElement;
import org.springframework.stereotype.Component;

/**
 * Models the website's login page.
 * 
 * @author Jerry
 *
 */
@Component
public class SignInPage extends PageObjectBase {
	
	protected static final String USERNAME_INPUT = "x-username-input";
	protected static final String PASSWORD_INPUT = "x-password-input";
	protected static final String SIGN_IN_BTN = "x-sign-in-btn";
	
	
	public void enterUsername(String username) {
		WebElement input = helper.get(USERNAME_INPUT);
		input.clear();
		input.sendKeys(username);
	}
	
	public void enterPassword(String password) {
		WebElement input = helper.get(PASSWORD_INPUT);
		input.clear();
		input.sendKeys(password);
	}
	
	public void clickSignInBtn() {
		helper.get(SIGN_IN_BTN).click();
	}

}
