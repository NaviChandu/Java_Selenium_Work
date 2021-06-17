package SeleniumClass1t04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownHandleUsingListElements {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.facebook.com");

		List<WebElement> dayOptionsList = driver.findElements(By.xpath("//select[@id='day']/option"));
		List<WebElement> monthOptionsList = driver.findElements(By.xpath("//select[@id='month']/option"));
		List<WebElement> yearOptionsList = driver.findElements(By.xpath("//select[@id='year']/option"));

		selectValueFromDropDown(dayOptionsList, "23");
		selectValueFromDropDown(monthOptionsList, "Jun");
		selectValueFromDropDown(yearOptionsList, "1992");
	}

	public static void selectValueFromDropDown(List<WebElement> OptionsList, String value) {
		int dayCount = OptionsList.size();
		System.out.println(dayCount);
		for (int i = 0; i < dayCount; i++) {
			String optionVal = OptionsList.get(i).getText();
			System.out.println(optionVal);
			if (optionVal.equals(value)) {
				OptionsList.get(i).click();
				break;
			}
		}
	}

}
