package ActionClass_V6_7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickConcept {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");

		WebElement rightClickMeElement = driver.findElement(By.className("context-menu-one"));

		Actions action = new Actions(driver);
		//Performs a context-click at middle of the given element. First performs a mouseMove to the location of the element.
		action.contextClick(rightClickMeElement).build().perform();
		

		WebElement copy = driver.findElement(By.className("context-menu-icon-copy"));

		System.out.println(copy.getText());
		
		copy.click();
		
		//action.contextClick().build().perform();
		
	}

}
