package testclasses;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import appcode.sumNumbers;

public class TestNG_SoftAsserts {

	@Test
	public void testSum() {
		SoftAssert sa = new SoftAssert();
		System.out.println("\n Running Test -> testSum");
		sumNumbers obj = new sumNumbers();
		int result = obj.sumNumbers(1, 2);
		sa.assertEquals(result, 2);
		System.out.println("\nLine after assert 1");
		sa.assertEquals(result, 3);
		System.out.println("\nLine after assert 2");
		sa.assertAll(); // this will fail the test case if any asset fails - interview
	}
}
