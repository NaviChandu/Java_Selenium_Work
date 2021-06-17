package base;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTestSuite {
	
	// @BeforeSuite: Method with this annotation will run before all tests in the test suite
	// @AfterSuite: Method with this annotation will run after all tests in the test suite
	
	//@BeforeTest: Method with this annotation will run before each and every test method with <test> tag in xml file
	// @AfterTest: Method with this annotation will run after each and every test method with <test> tag in xml file

	@BeforeClass
	public void beforeClass() {
		System.out.println("\nBaseTestSuite -> before class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("\nBaseTestSuite -> after class");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("\nBaseTestSuite -> before test");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("\nBaseTestSuite -> after test");
	}

	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("\nBaseTestSuite -> before suite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("\nBaseTestSuite -> after suite");
	}
}