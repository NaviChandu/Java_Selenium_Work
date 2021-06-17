package readDataFromPropertiesFiles_Vedio10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ReadProp {
	static WebDriver driver;

	public static void main(String[] args) throws IOException {

		FileInputStream ip = new FileInputStream("D:/Naveen/Documents/Automation labs/workspace/SeleniumWebDriverPractice/src/main/java/readDataFromPropertiesFiles_Vedio10/config.properties");
		Properties prop = new Properties();
		prop.load(ip);	
		
		System.out.println(prop.getProperty("browser"));
		
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "D:/Selenium_Drivers/chromedriver_win32/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.equals("firefox")){
			System.setProperty("webdriver.gecko.driver", "");
			driver = new FirefoxDriver();
		}
		else if(browserName.equals("IE")){
			System.setProperty("webdriver.ie.driver", "");
			driver = new InternetExplorerDriver();
		}
		else{
			System.out.println(browserName+ " : browser is not defined or it is null");
		}

		driver.manage().window().fullscreen();
		
		driver.manage().timeouts().pageLoadTimeout(Integer.parseInt(prop.getProperty("pageloadtimeout")), TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(prop.getProperty("implicitwait")), TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		
	}

}
