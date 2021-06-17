package Waits_Video8_9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = LaunchUtil.launchHubSplot();
		
		// Exp wait -- for a specific element -- not a global wait but dynamic in nature
		By emailId = By.id("username");
		By pwd = By.id("password");
		By loginButton = By.id("loginBtn");

		getElement(emailId, 20).sendKeys("naveen@gmail.com");
		getElement(pwd, 5).sendKeys("test@123");
		getElement(loginButton, 0).click();

	}
	
	public static WebElement getElement(By selector, int timeOut){
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.presenceOfElementLocated(selector));
		
		WebElement element = driver.findElement(selector);
		//JavaScriptUtil.flash(element, driver);
		return element;
		
	}

}
