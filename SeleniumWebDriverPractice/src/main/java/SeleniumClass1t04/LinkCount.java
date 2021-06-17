package SeleniumClass1t04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkCount {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.amazon.com");
		
		//1. get total links count:
		List<WebElement> linksList = driver.findElements(By.tagName("a"));
		
		int linksCount = linksList.size();
		
		System.out.println("total links on the page: "+ linksCount);
		
		//2. get the text of each link:
		for(int i=0; i<linksCount; i++){
			String linkText = linksList.get(i).getText();
			System.out.println(i+"--->"+linkText);
		}
		//web scrapping 
		
		//3. find out the broken links
		
		
	}

}
