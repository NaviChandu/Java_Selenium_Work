package com.dataProvider;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _2B_DataProviderTest {

	@DataProvider(name = "addProvider")
	public Object[][] getDataForAdd() {
		Object[][] data = new Object[2][3];
		data[0][0] = 1;
		data[0][1] = 2;
		data[0][2] = 4;

		data[1][0] = 11;
		data[1][1] = 22;
		data[1][2] = 33;

		return data;
	}

	@DataProvider(name = "subProvider")
	public Object[][] getDataForSub() {
		Object[][] data = new Object[2][3];
		data[0][0] = 1;
		data[0][1] = 2;
		data[0][2] = -1;

		data[1][0] = 11;
		data[1][1] = 22;
		data[1][2] = -11;

		return data;
	}

	@Test(dataProvider = "addProvider")
	public void testAdd(int num1, int num2, int result) {
		int actualResult = MathClass.add(num1, num2);
		Assert.assertEquals(actualResult, result);
	}
	
	@Test(dataProvider = "subProvider")
	public void testSub(int num1, int num2, int result) {
		int actualResult = MathClass.sub(num1, num2);
		Assert.assertEquals(actualResult, result);
	}

}
