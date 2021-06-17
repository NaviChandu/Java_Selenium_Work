package EncapsulationConcept;

public class SeleniumTest {
	public static void main(String[] args) {
		
		SeleniumTool driver = new SeleniumTool();
		// if all the methods are private we cannot access 
		
		driver.launchProwser("chrome");
		driver.sendKeys("naveen.gmail.com");
		driver.sendKeys("test@123");
		driver.click();
		
		
	}

}
