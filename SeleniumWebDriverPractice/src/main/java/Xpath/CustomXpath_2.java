package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomXpath_2 {
	
	WebDriver driver;

	public static void main(String[] args) {

		
		//(//input[contains(@class,'form-control')])[position()=1]
		//(//input[contains(@class,'form-control')])[1]
		
		//contains() -- is used to handle dynamic values -- dynamic Ids
		
		//Ext JS 
		//<input "id=test_123"> id=selenium test_123 automation
		//<input "id=test_221">
		//<input "id=test_233">
		//<input "id=test_129">
		//id=selenium test_123 automation

		//input[@id='test_123'] -- X
		//input[contains(@id,'test_')]
		
		//input[starts-with(@id,'test_')]
		//input[ends-with(@id,'automation')]
		
		//div[@class='private-form__input-wrapper']/input[@id='username']
		//div[@class='private-form__input-wrapper']//following::input[@id='password']
		
		//div[@id='SIvCob']/child::a[text()='Hindi']
		//div[@id='SIvCob']/a
		
		//a[text()='हिन्दी']//ancestor::div
		//div--div--div--div--div--a hindi
		//a[text()='हिन्दी']//ancestor::div[@id='SIvCob']
		
		//span[text()='Tom Steve']//ancestor::td//preceding-sibling::td//child::input[@type='checkbox']
		//span[text()='Naveen AutomationLabs']//ancestor::td//preceding-sibling::td//child::input[@type='checkbox']
		//a[contains(text(),'ada ada')]//parent::td//following-sibling::td/a[@context='company']
		//driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"));
		
		//form[@id='vContactsForm']//tr[12]//td[1]//input[1]
		//span[text()='ada ada']//ancestor::td//preceding-sibling::td//child::input[@type='checkbox']

	}
	
	public void selectContact(String contactName){
		driver.findElement(By.xpath("//span[text()='"+contactName+"']//"
				+ "ancestor::td//preceding-sibling::td//child::input[@type='checkbox']"));
	}

}
