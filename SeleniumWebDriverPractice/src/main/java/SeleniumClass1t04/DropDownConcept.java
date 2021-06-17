package SeleniumClass1t04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownConcept {

	public static void main(String[] args) {

		// 1. Launch the browser
		System.setProperty("webdriver.chrome.driver", "D:/Selenium_Drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com");

		// Drop down its Select class in Selenium
		// with select tag we will have Option value tag

		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));

		// Select select = new Select(day);
		// select.selectByVisibleText("28");
		//
		// Select select1 = new Select(month);
		// select1.selectByVisibleText("Jan");
		//
		// Select select2 = new Select(year);
		// select2.selectByVisibleText("1984");

		// Generic static method,

		// DropDownConcept.selectValueFromDropDown(day, "28");
		// DropDownConcept.selectValueFromDropDown(month, "Jan");
		// DropDownConcept.selectValueFromDropDown(year, "1984");

		// Select by Index, in Month we can use by Index. Randomly we want to select any
		// random value
		// Select select = new Select(month);
		// select.selectByIndex(11);

		// deselect

		// Select select = new Select(day);
		// select.deselectByValue("28");
		// select.deselectAll();
		//
		// //multi select boolean check
		// System.out.println(select.isMultiple());
		//
		// // similar to Select by Visible text. but old one
		// //do not use: since some times it does not select
		// //select.selectByValue("28");
		//
		// //give me the list of all options
		//
		// List<WebElement> dayoptions = select.getOptions();
		//
		// //number of element
		// System.out.println(dayoptions.size());
		//
		// for(int i=0;i<dayoptions.size();i++) {
		// String value= dayoptions.get(i).getText();
		// System.out.println(value);
		// }
		//
		// Select select1 = new Select(month);
		// List<WebElement> monthOptions = select1.getOptions();
		//
		// //number of element
		// System.out.println(monthOptions.size());
		//
		// for(int i=0;i<monthOptions.size();i++) {
		// String value= monthOptions.get(i).getText();
		// System.out.println(value);

		// DropDownConcept.selectValueFromDropDown(day);
		// DropDownConcept.selectValueFromDropDown(month);
		// DropDownConcept.selectValueFromDropDown(year);

		DropDownConcept.selectValueFromDropDownWithOption(day, "10");

	}

	/**
	 * This method will select the value from the drop down
	 * 
	 * @param element
	 * @param value
	 */
	public static void selectValueFromDropDown(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByVisibleText(value);
	}

	public static void selectValueFromDropDown(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}

	public static void selectValueFromDropDown(WebElement element) {
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
		System.out.println(options.size());

		for (int i = 0; i < options.size(); i++) {
			String value = options.get(i).getText();
			System.out.println(value);
		}
	}

	/**
	 * This method will select the value programatically without any default select
	 * menthod
	 * 
	 * @param element
	 * @param selectValue
	 */
	public static void selectValueFromDropDownWithOption(WebElement element, String selectValue) {
		Select select = new Select(element);
		// select.getAllSelectedOptions();
		// select.getFirstSelectedOption();

		List<WebElement> options = select.getOptions();

		for (int i = 0; i < options.size(); i++) {
			String value = options.get(i).getText();
			System.out.println(value);

			if (value.equals(selectValue)) {
				options.get(i).click();
				break;
			}
		}

	}

}
