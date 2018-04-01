package com.ishoptest.testsuite.sanity;

import org.testng.annotations.Test;

import com.ishoptest.core.TestClassBase;

public class SignIn extends TestClassBase {
	
	/*
	 * A very simple test to validate framework structure. To be removed.
	 */
	@Test
	public void doTest() {
		navi.clickOnSignInLink();
		signin.enterUsername("uitest01");
		signin.enterPassword("testme");
		signin.clickSignInBtn();
	}

}
