package com.ishoptest.testsuite.sanity;

import org.testng.annotations.Test;

import com.ishoptest.core.TestClassBase;

public class GoToSignUpPageFromHome extends TestClassBase {
	
	/*
	 * A very simple test to validate framework structure. To be removed.
	 */
	@Test
	public void doTest() {
		navi.clickOnSignUpLink();
	}

}
