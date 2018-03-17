package com.ishoptest.testsuite.sanity;

import org.testng.annotations.Test;

import com.ishoptest.core.Base;

public class GoToLoginPageFromHome extends Base {
	
	/*
	 * A very simple test to validate framework structure. To be removed.
	 */
	@Test
	public void doTest() {
		page.get().navi.clickOnSignInLink();
	}

}
