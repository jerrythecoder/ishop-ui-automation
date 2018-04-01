package com.ishoptest.pageobjects;

import org.springframework.stereotype.Component;

/**
 * Models the website's Home page.
 * 
 * @author Jerry
 *
 */
@Component
public class NavigationBar extends PageObjectBase {	
	
	/*---------------------------- Locator Keys -------------------------*/
	
	protected static final String SIGN_IN_LINK = "x-navi-sign-in-link";
	protected static final String SIGN_UP_LINK = "x-navi-sign-up-link";
	
	
	
	/*-------------------------- Page Object APIs ----------------------*/
	
	public void clickOnSignInLink() {
		helper.get(SIGN_IN_LINK).click();
	}
	
	public void clickOnSignUpLink() {
		helper.get(SIGN_UP_LINK).click();
	}

}
