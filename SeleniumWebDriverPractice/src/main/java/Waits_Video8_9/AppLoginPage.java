package Waits_Video8_9;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AppLoginPage {
	
	static WebDriver driver;


	public static void main(String[] args) {

		driver = LaunchUtil.launchHubSplot();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		AppLoginPage ap = new AppLoginPage();
		ap.doLogin();
		
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//home page elements:
		driver.findElement(By.className("private-page__title")).isDisplayed();
		
		
	}
	
	
	public void doLogin(){
		driver.findElement(By.id("username")).sendKeys("naveenanimation20@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Test@1234");
		driver.findElement(By.id("loginBtn")).click();

	}
	
	

}
