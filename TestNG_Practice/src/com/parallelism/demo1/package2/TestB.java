package com.parallelism.demo1.package2;
import org.testng.annotations.Test;

public class TestB {
	@Test
	public void testAOne() {
		System.out.println("TestB-testBOne\t" + Thread.currentThread().getId());
	}

	@Test
	public void testATwo() {
		System.out.println("TestB-testBTwo\t" + Thread.currentThread().getId());
	}
}
