package com.groups;
import org.testng.annotations.Test;

public class GroupsOfGroups {

	@Test(groups = { "green-test" })
	public void testOne() {
		System.out.println("testOne-green-test");
	}

	@Test(groups = { "yellow" })
	public void testTwo() {
		System.out.println("testTwo-yellow");
	}

	@Test(groups = { "red" })
	public void testThree() {
		System.out.println("testThree-red");
	}

	@Test(groups = { "blue" })
	public void testFour() {
		System.out.println("testFour");
	}

	@Test(groups = { "black" })
	public void testFive() {
		System.out.println("testFive");
	}

	@Test(groups = { "green-test1" })
	public void testSix() {
		System.out.println("testsix-green-test1");
	}

}
