package Navigation_PopUp_Videio5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandle {

	public static void main(String[] args) throws InterruptedException {

		//Alert -- pop up -- JS pop up
		System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click();//go button
		
		Thread.sleep(5000);
		
		Alert alert = driver.switchTo().alert();
		
		String mesg = alert.getText();
		
		System.out.println(mesg);
		
		if(mesg.equals("Please enter a valid user name")){
			System.out.println("correct alert messg");
		}else{
			System.out.println("in correct alert messg");
		}
		
		//accept the alert:
		alert.accept();
		
		//dismiss the alert:
		//alert.dismiss();
		
		driver.findElement(By.id("login1")).sendKeys("test");//go button

		
		
	}

}
