package com.parallelism.demo1.package2;

import org.testng.annotations.Test;

public class TestA {

	@Test
	public void testAOne() {
		System.out.println("TestA-testAOne\t" + Thread.currentThread().getId());
	}

	@Test
	public void testATwo() {
		System.out.println("TestA-testATwo\t" + Thread.currentThread().getId());
	}
}
