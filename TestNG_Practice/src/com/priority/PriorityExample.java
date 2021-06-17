package com.priority;

import org.testng.annotations.Test;

public class PriorityExample {
	@Test(priority = 3)
	public void registerAccount() {
		System.out.println("First register your account");
	}

	@Test(priority = 2)
	public void composeEmail() {
		System.out.println("Composing email");
	}

	@Test(priority = 1)
	public void sendEmail() {
		System.out.println("Send email after login");
	}

}
