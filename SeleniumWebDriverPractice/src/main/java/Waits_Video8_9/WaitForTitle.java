package Waits_Video8_9;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForTitle {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		//implict wait is only for elements and title is not an element
		//driver.gettitle() is not an element, we are getting the webpage
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://app.hubspot.com/login");
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.titleContains("HubSpot Login"));
		//if the title of the page is given incorrectly, tried for 20 second(s) with 500 milliseconds interval and exception will be thrown
		System.out.println(driver.getTitle());
		
		
	}

}
