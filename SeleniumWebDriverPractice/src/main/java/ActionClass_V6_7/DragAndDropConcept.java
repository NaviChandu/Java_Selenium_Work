package ActionClass_V6_7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcept {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("http://jqueryui.com/resources/demos/droppable/default.html");

		WebElement sourceElement = driver.findElement(By.id("draggable"));
		WebElement targetElement = driver.findElement(By.id("droppable"));
		performDragAndDrop(sourceElement, targetElement, driver);

		//Actions action = new Actions(driver);

		// action.
		// clickAndHold(sourceElement).
		// moveToElement(targetElement).
		// release().
		// build().
		// perform();

		//action.dragAndDrop(sourceElement, targetElement).build().perform();

	}
	
	public static void performDragAndDrop(WebElement source, WebElement target, WebDriver driver){
		Actions action = new Actions(driver);
		 action.
		 clickAndHold(source).
		 moveToElement(target).
		 release().
		 build().
		 perform();
	}
	
	

}
