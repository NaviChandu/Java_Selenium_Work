package EncapsulationConcept;

import javax.print.Doc;

public class SeleniumTool {
	
	
	private void intractWithWebElement() {
		System.out.println("Intract with web element");
	}
	
	
	private void doClickOnElement() {
		intractWithWebElement();
		System.out.println("Clicking on element");
	}

	private void doSendKeysToElemnt(String value) {
		intractWithWebElement();
		System.out.println("Sending a value to element: "+ value);
	}
	
	private void browserIntraction(String browserName) {
		System.out.println("Intracting with Browser "+ browserName);
	}
	
	public void click() {
		doClickOnElement();		
	}
	
	public void sendKeys(String value) {
		doSendKeysToElemnt(value);
	}
	
	public void launchProwser(String browserName) {
		browserIntraction(browserName);
	}
	
}
