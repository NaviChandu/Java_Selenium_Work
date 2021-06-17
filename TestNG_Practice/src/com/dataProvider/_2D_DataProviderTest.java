package com.dataProvider;

import org.testng.annotations.Test;

public class _2D_DataProviderTest {

	@Test(dataProvider = "data-provider", dataProviderClass = DataProviderClass.class)
	public void testMethod(String data) {
		System.out.println("Data is " + data);
	}
	
	
	
}
