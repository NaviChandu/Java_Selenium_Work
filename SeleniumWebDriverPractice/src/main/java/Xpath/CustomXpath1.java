package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath1 {

	public static void main(String[] args) throws InterruptedException {

		//xpath: XML HTML PATH in the PAGE DOM
		//1. Abs Xpath: html/body/div/div[3]/div[4]/div/ul/li/span/a
		//2. Dynamic/Custom Xpath: //a[@id='test']
		
		//input[@id='username']
		System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("test@gmail.com");
		//input[@id='username'] -- 1 attr
		//input[@id='username' and @type='email'] -- 2 attr
		//button[@id='loginBtn' and @type='submit']
		//button[@data-test-id='password-login-button']
		
		//i18n-string[text()='Forgot my password']
		//a//i18n-string[text()='Forgot my password']
		
		
		//clasic CRMPRO (classic.crmpro.com
		//a[text()='Forgot Password?']
		//a[@href]
		//a[@href='https://classic.crmpro.com/login.cfm?pr=1']
		
		//----
		//contains():
		//a[contains(text(),'Forgot Password?')]
		//a[contains(text(),'Forgot Password?')]
		//a[contains(text(),'Forgot')]
		//a[contains(text(),'Password')]
		//a[contains(text(),'Password?')]
		
		//input[contains(@name,'username')]
		//input[@name='username']
		//input[contains(@name,'username') and @type='text']
		//input[contains(@name,'username') and contains(@type,'text')]
		
		//h1[text()='Sales Dashboard']
		//h1[text()='Sales Dashboard' and @class='private-page__title']
		//h1[contains(text(),'Sales Dashboard')]
		
		//a[@class='btn-primary'] -- 10
		//a[text()='Configure'] -- 10
		
		//(//a[text()='Configure'])[1]
		//(//a[text()='Configure'])[10]
		
	//	(//ul[@role='none']/li/a[@id='nav-secondary-contacts' and contains(text(),'Contacts')])[1]
	}

}
