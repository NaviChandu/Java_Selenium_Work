package SeleniumClass1t04;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {

		// we have a web driver interface.
		// we can created method without body
		// we cannot create object of interface/
		// chrome browser responsibity to create the mentods by overridding

		// All browser are implementing web browser interface

		// 1. Launch the browser
		System.setProperty("webdriver.chrome.driver", "D:/Selenium_Drivers/chromedriver_win32/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// When the object is created, a default constructer will be called
		// but when we run we get "no such file or directory
		// we have to add chrome driver exe file as a property.

		// 2. Enter the URL:
		driver.get("https://www.google.com/");
		// write it with http// - we get Invalid url

		// 3. get the title of th epage
		String title = driver.getTitle();
		// tab name is the title of the webpage
		System.out.println("page title is: " + title);

		// 4. Validating the title: Validation point
		if (title.equals("Google")) {
			System.out.println("Correct title");
		} else {
			System.out.println("Incorect title");
		}

		//5.Quit the browser
		driver.quit();

	}

}
