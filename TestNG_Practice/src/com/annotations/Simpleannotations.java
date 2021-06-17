package com.annotations;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simpleannotations {

	@Test(description = "This is a login test case12",enabled = true,timeOut = 3000)
	public void testOne() {
		System.out.println("@Test1");
		Assert.assertTrue(true);
	}
	@Test
	public void logIn() {
		System.out.println("@Test2");
		Assert.assertTrue(false);
	}
	
	@Test(dependsOnMethods = { "testOne","logIn" }, alwaysRun = false)
	public void testTwo() {
		System.out.println("@Test3");
		Assert.assertTrue(true);
	}
	
	//@BeforeMethod: Method with this annotation will run before each test method
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("@BeforeMethod");
	}
	
	//@AfterMethod: Method with this annotation will run after each test method
	@AfterMethod
	public void afterMethod() {
		System.out.println("@AfterMethod");
	}
	
	//@BeforeClass: Method with this annotation will run before first test method in current class
	@BeforeClass
	public void beforeClass() {
		System.out.println("@BeforeClass");
	}

	//@AfterClass: Method with this annotation will run after last test method in currentclass
	@AfterClass
	public void afterClass() {
		System.out.println("@AfterClass");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("@BeforeTest");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("@AfterTest");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("@BeforeSuite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("@AfterSuite");
	}

}
