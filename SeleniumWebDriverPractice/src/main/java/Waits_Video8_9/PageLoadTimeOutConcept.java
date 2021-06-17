package Waits_Video8_9;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoadTimeOutConcept {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:/Selenium_Drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://app.hubspot.com/login");
		
		//least Priority
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		System.out.println(driver.getTitle());
		
		
		
		
	}

}
