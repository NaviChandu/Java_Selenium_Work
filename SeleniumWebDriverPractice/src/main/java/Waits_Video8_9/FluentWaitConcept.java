package Waits_Video8_9;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWaitConcept {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://app.hubspot.com/login");

			
		//Wait is the Interface
		
		// Wait<WebDriver> wait = new
		// FluentWait<WebDriver>(driver).withTimeout(20, TimeUnit.SECONDS)
		// .pollingEvery(2,
		// TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
		
		// funciton pass 2 things webDriver and WekElement
		
		// WebElement username = wait.until(new Function<WebDriver,
		// WebElement>() {
		// public WebElement apply(WebDriver driver) {
		// return driver.findElement(By.id("username"));
		// }
		// });

		By emailId = By.id("username");
		By pwd = By.id("password");
		By loginButton = By.id("loginBtn");

		getElement(driver, 20, 2, emailId).sendKeys("test@gmail.com");
		getElement(driver, 20, 2, pwd).sendKeys("test@gmail.com");
		getElement(driver, 20, 2, loginButton).sendKeys("test@gmail.com");
	}

	public static WebElement getElement(WebDriver driver, int timeOut, int pollingTime, final By selector) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(timeOut, TimeUnit.SECONDS)
				.pollingEvery(pollingTime, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);

		WebElement element = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(selector);
			}
		});

		return element;
	}

	public static WebElement getElement(WebDriver driver, By selector, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.presenceOfElementLocated(selector));

		WebElement element = driver.findElement(selector);
		return element;

	}

	public static WebElement getElement(WebDriver driver, By selector) {
		CommonUtil.mediumWait();
		WebElement element = driver.findElement(selector);
		return element;
	}

}
