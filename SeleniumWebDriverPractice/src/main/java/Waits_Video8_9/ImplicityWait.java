package Waits_Video8_9;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicityWait {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = LaunchUtil.launchHubSplot();

		// how to apply implicity wait:

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// it applied in all elements and its applied on driver
		// global wait - applied on all web elements
		// and it dynamic in nature
		//its not static wait.

		// if the element is found in 2 seconds, 10 seconds will be ignored.
		// max time it will wait for 20 seconds.

		// if element is not found for 20 seconds, it will throw an exception "no such
		// element"

		driver.findElement(By.id("username")).sendKeys("naveen");
		
		
		//cannot customize the implicitly wait
		//can change the implicitly wait time out
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//how to nu;;ify implicitly wait
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		
		driver.findElement(By.id("username")).sendKeys("naveen");
	}

}
