package com.groups;

import org.testng.annotations.Test;

public class GroupsTestA {

	@Test(groups = { "regression"})
	public void testOne() {
		System.out.println("GroupsTestA-testOne");
	}

	@Test(groups = { "GroupsTestA-functional" })
	public void testTwo() {
		System.out.println("GroupsTestA-testTwo");
	}
	
	@Test
	public void testTwodefault() {
		System.out.println("GroupsTestA-testTwo");
	}
}
