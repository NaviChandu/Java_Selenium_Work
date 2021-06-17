package SeleniumClass1t04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyElementWithFindElements {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.facebook.com");

		List<WebElement> signUpBtnList = driver.findElements(By.xpath("//*[@name='websubmit']"));
		System.out.println(signUpBtnList.size());

		if (signUpBtnList.size() > 0) {
			System.out.println("Sign up button is present on the page");
		} else {
			System.out.println("sign up button not present");
		}

		boolean flag = driver.findElement(By.name("websubmit")).isDisplayed();
		if (flag) {
			System.out.println("Sign up button is present on the page");

		} else {
			System.out.println("sign up button not present");

		}

	}

}
