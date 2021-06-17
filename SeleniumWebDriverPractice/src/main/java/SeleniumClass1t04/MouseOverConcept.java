package SeleniumClass1t04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverConcept {
	public static void main(String[] args) throws InterruptedException {
		// 1. Launch the browser
		System.setProperty("webdriver.chrome.driver", "D:/Selenium_Drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://mrbool.com/");
		WebElement parentMenu= driver.findElement(By.className("menulink"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(parentMenu).build().perform();
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("COURSES")).click();
		
		
		
	}

}
