package com.ishoptest.core;

import org.testng.annotations.BeforeClass;

import com.ishoptest.pageobjects.NavigationBar;

/**
 * This is the super class of all test classes. 
 * 
 * @author Jerry
 *
 */
public class TestClassBase extends Base {
	
	public NavigationBar navi;
	
	@BeforeClass(alwaysRun = true)
	public void Initialize() {
		this.navi = test.get().page.navi;
	}

}
