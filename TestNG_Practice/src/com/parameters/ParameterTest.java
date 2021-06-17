package com.parameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
	@Test
	@Parameters({ "browserType", "os" })
	public void testMethodTwo(String browserType, int os) {
		System.out.println(browserType);
		System.out.println(os);
	}

}
