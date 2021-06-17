package com.dataProvider;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _2C_DataProviderTest {

	@DataProvider(name="simpleDataProvider")
	public Object[][] getData(Method method) {
		Object[][] data = new Object[2][3];
		if (method.getName().equals("testAdd")) {
			data[0][0] = 1;
			data[0][1] = 2;
			data[0][2] = 3;

			data[1][0] = 11;
			data[1][1] = 22;
			data[1][2] = 33;
		} else {
			data[0][0] = 1;
			data[0][1] = 2;
			data[0][2] = -1;

			data[1][0] = 11;
			data[1][1] = 22;
			data[1][2] = -11;
		}
		return data;
	}

	@Test(dataProvider = "simpleDataProvider")
	public void testAdd(int num1, int num2, int result) {
		int actualResult = MathClass.add(num1, num2);
		Assert.assertEquals(actualResult, result);
	}
	
	@Test(dataProvider = "simpleDataProvider")
	public void testSub(int num1, int num2, int result) {
		int actualResult = MathClass.sub(num1, num2);
		Assert.assertEquals(actualResult, result);
	}
}
