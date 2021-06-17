package com.parallelism.demo1.package1;

import org.testng.annotations.Test;

public class TestOne {
	
	@Test
	public void testOneA() {
		System.out.println("TestOne-testOneA\t" + Thread.currentThread().getId());
	}

	@Test
	public void testOneB() {
		System.out.println("TestOne-testOneB\t" + Thread.currentThread().getId());
	}

	@Test
	public void testOneC() {
		System.out.println("TestOne-testOneC\t" + Thread.currentThread().getId());
	}
	
	
	
}
