package ActionClass_V6_7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverAmazon {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:/Selenium_Drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

		String categoryId = "nav-link-shopall";
		String subMenuCss = "#nav-flyout-shopAll > div.nav-template.nav-flyout-content.nav-tpl-itemList > span:nth-child(2)";
		String SubElementCss = "#nav-flyout-shopAll > div.nav-subcats > div.nav-template.nav-subcat.nav-tpl-itemList.nav-colcount-2.nav-colcount-0 > a:nth-child(4) > span.nav-subtext";

		MouseOverAmazon.mouseOverMultiple(driver, categoryId, subMenuCss, SubElementCss);
	}

	public static void mouseOverMultiple(WebDriver driver, String categoryId, String subMenuCss, String SubElementCss)
			throws InterruptedException {

		WebElement category = driver.findElement(By.id(categoryId));
		Actions action = new Actions(driver);

		action.moveToElement(category).build().perform();

		Thread.sleep(3000);

		WebElement subMenu = driver.findElement(By.cssSelector(subMenuCss));
		action.moveToElement(subMenu).build().perform();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector(SubElementCss)).click();

	}

}
