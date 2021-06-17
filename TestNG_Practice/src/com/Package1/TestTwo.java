package com.Package1;

import org.testng.annotations.Test;

public class TestTwo {
	@Test
	public void testTwoA() {
		System.out.println("TestTwo-testTwoA");
	}

	@Test()
	public void testTwoB() {
		System.out.println("TestTwo-testTwoB");
	}

	@Test
	public void testTwoC() {
		System.out.println("TestTwo-testTwoC");
	}
}
