package com.ishop.demotest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest01 {
	
	@Test
	public void testUserCreated() {
		System.out.println("This is a passed test.");
		Assert.assertTrue(true);
	}

}
