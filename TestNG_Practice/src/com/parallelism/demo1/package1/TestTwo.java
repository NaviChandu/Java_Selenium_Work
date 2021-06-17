package com.parallelism.demo1.package1;
import org.testng.annotations.Test;

public class TestTwo {
	@Test
	public void testTwoA() {
		System.out.println("TestTwo-testTwoA\t" + Thread.currentThread().getId());
	}

	@Test
	public void testTwoB() {
		System.out.println("TestTwo-testTwoB\t" + Thread.currentThread().getId());
	}

	@Test
	public void testTwoC() {
		System.out.println("TestTwo-testTwoC\t" + Thread.currentThread().getId());
	}
}
