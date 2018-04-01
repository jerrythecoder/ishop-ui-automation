package com.ishoptest.core;

import org.testng.annotations.BeforeClass;

import com.ishoptest.pageobjects.NavigationBar;
import com.ishoptest.pageobjects.SignInPage;

/**
 * This is the super class of all test classes. 
 * 
 * @author Jerry
 *
 */
public class TestClassBase extends Base {
	
	public NavigationBar navi;
	public SignInPage signin;
	
	@BeforeClass(alwaysRun = true)
	public void Initialize() {
		this.navi = test.get().page.navi;
		this.signin = test.get().page.signin;
	}

}
