package com.groups;
import org.testng.annotations.Test;

@Test(groups = { "regression" })
public class GroupsTestB {
	
	public void testTwo() {
		System.out.println("GroupsTestB - testTwo");
	}
}
