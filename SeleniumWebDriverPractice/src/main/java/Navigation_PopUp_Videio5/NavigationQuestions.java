package Navigation_PopUp_Videio5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationQuestions {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement fn = driver.findElement(By.id("u_0_j"));
		fn.sendKeys("Naveen");
		
		driver.navigate().refresh();
		//StaleElementReferenceException: 
		//stale element reference: element is not attached to the page document
		fn = driver.findElement(By.id("u_0_j"));
		
		fn.sendKeys("Naveen");

		
	}

}
