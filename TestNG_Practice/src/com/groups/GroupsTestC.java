package com.groups;
import org.testng.annotations.Test;

public class GroupsTestC {

	@Test(groups = { "regression" })
	public void testOne() {
		System.out.println("GroupsTestC-testOne");
	}

	@Test(groups = { "functional" })
	public void testTwo() {
		System.out.println("GroupsTestC-testTwo");
	}

	@Test(groups = { "sanity" })
	public void testThree() {
		System.out.println("GroupsTestC-testOne");
	}

	@Test(groups = { "integration" })
	public void testFour() {
		System.out.println("GroupsTestC-testTwo");
	}

}
