package com.ishoptest.testsuite.sanity;

import org.testng.annotations.Test;

import com.ishoptest.core.Base;

public class GoToSignInPageFromHome extends Base {
	
	/*
	 * A very simple test to validate framework structure. To be removed.
	 */
	@Test
	public void doTest() {
		page.get().navi.clickOnSignInLink();
	}

}
