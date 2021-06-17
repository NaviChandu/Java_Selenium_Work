package SeleniumClass1t04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConecpt {
	public static void main(String[] args) throws InterruptedException {

		//Priority
		//1. if ID is availabe - ID is always a unique locator
		//2 Name is not a unique property. But few cases have duplicates. check if Name is duplicates
		//3 xpath and CSS selector if ID and anme are not available
		// how complex the HTML DOM is: CSS cannot solve all the problems but Xpat can
		// we will use xpath.
		// class name is the least priority.
		
		
		// 1. Launch the browser
		System.setProperty("webdriver.chrome.driver", "D:/Selenium_Drivers/chromedriver_win32/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://app.hubspot.com/login");

		Thread.sleep(6000);

		// 8 Types of Locators

		// Id
		// input - HTML tag or div, button
		// differ properties of the element - id, type
		// id, type is element or attrivute properties

		WebElement email = driver.findElement(By.id("username"));
		email.sendKeys("naveen@gmail.com");
		
		// we can also write in the below approach
		//but the avove approach "email reference can be used any time.
		//	driver.findElement(By.id("username")).sendKeys("naveen");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("test123");

		WebElement loginbtn = driver.findElement(By.id("loginBtn"));
		loginbtn.click();
		// html tag is "button"
		
		//Name
		//https://www.crmpro.com/index.html
		driver.findElement(By.name("username")).sendKeys("test");
		
		//Class Name
		//HTML+CSS classes - will give graphics
		//CSS - Cascaded Style sheet class gives look : form-control private-form__control login-email
		//we have 3 classes - Selenium says use unique class
		driver.findElement(By.className("login-email")).sendKeys("test");
		//classes are least priority locater and need to use unique class name
	
		//4 Xpath: address of web element
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("test123");
		
		//5. CSS selector
		// right click on the property and copy CSS selectior
		driver.findElement(By.cssSelector("#username")).sendKeys("test");
		
		//6 LinkText: Only for links
		// all the links are referenced by "a" tag or onchor tag
		driver.findElement(By.linkText("Sign up")).click();
		
		//7: Partial LinkText: only for links
		// but recomended
		//only mention the partial text
		
		driver.findElement(By.partialLinkText("Sign")).click();
		
		//8. tagName
		// will be cobered: with list of WebElement
		
	
	}
	

}
