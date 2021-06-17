package Waits_Video8_9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchUtil {
	
	public static WebDriver launchHubSplot() {
		
		// 1. Launch the browser
		System.setProperty("webdriver.chrome.driver", "D:/Selenium_Drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		
		return driver;
		
	}

}
