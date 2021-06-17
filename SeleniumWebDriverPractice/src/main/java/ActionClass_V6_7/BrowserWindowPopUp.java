package ActionClass_V6_7;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowPopUp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.popuptest.com/goodpopups.html");
		
		driver.getWindowHandle();

		driver.findElement(By.linkText("Good PopUp #3")).click();

		Set<String> handles = driver.getWindowHandles();

		Iterator<String> it = handles.iterator();
		
		String mainWindowId = it.next();
		System.out.println("main window id is: "+ mainWindowId);
		
		String childWindowId = it.next();
		System.out.println("child pop up window id is: "+ childWindowId);
		
		driver.switchTo().window(childWindowId);
		
		System.out.println("title of the child window is: "+ driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(mainWindowId);
		
		System.out.println("title of the main window is: "+ driver.getTitle());

		//driver.quit();
		
		
		

	}

}
