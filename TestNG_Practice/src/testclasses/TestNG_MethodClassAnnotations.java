package testclasses;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_MethodClassAnnotations {

	// @BeforeMethod: Method with this annotation will run before each test method
	// @AfterMethod: Method with this annotation will run after each test method
	
	//@BeforeClass: Method with this annotation will run before first test method in current 	class
	//@AfterClass: Method with this annotation will run after last test method in current class
	
	@BeforeClass
	public void setUp() {
		System.out.println("\nThis runs once before class");
	}

	@AfterClass
	public void cleanUp() {
		System.out.println("\nThis runs once after class");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("\nThis runs before every method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("\nThis runs after every method");
	}

	@Test
	public void testMethod1() {
		System.out.println("\nRunning Test -> testMethod1");
	}

	@Test
	public void testMethod2() {
		System.out.println("\nRunning Test -> testMethod2");
	}
}
