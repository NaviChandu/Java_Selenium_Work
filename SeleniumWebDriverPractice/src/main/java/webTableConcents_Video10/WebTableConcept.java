package webTableConcents_Video10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableConcept {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");

		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		int rowCount = rows.size();

		System.out.println(rowCount);

		// *[@id="customers"]/tbody/tr[2]/td[1]
		// *[@id="customers"]/tbody/tr[3]/td[1]
		// *[@id="customers"]/tbody/tr[4]/td[1]
		// *[@id="customers"]/tbody/tr[7]/td[1]
		
		//*[@id="customers"]/tbody/tr[2]/td[2]
		//*[@id="customers"]/tbody/tr[3]/td[2]

		String beforeXpath = "//*[@id='customers']/tbody/tr[";
		String afterXapth_comp = "]/td[1]";

		WebTableConcept webtable = new WebTableConcept();
		//webtable.getWebTableData(beforeXapth, afterXapth_comp, driver);
		
//		String afterXapth_contact = "]/td[2]";
//		webtable.getWebTableData(beforeXapth, afterXapth_contact, driver);
//
//		String afterXapth_country = "]/td[3]";
//		webtable.getWebTableData(beforeXapth, afterXapth_country, driver);
		
		boolean b = webtable.verifyWebTableValue("Island Trading", beforeXpath, afterXapth_comp, driver);
		if(b){
			System.out.println("test case passed");
		}else{
			System.out.println("test case failed");
		}
	}

	public int getRowCount(WebDriver driver) {
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		int rowCount = rows.size();
		System.out.println(rowCount);
		return rowCount;
	}

	public void getWebTableData(String beforeXpath, String afterXpath, WebDriver driver) {
		int rowCount = getRowCount(driver);
		for (int rowNum = 2; rowNum <= rowCount; rowNum++) {
			String actualXpath = beforeXpath + rowNum + afterXpath;
			String cellValue = driver.findElement(By.xpath(actualXpath)).getText();
			System.out.println(cellValue);
		}
	}
	
	/**
	 * This method is used to verify a webtable cell value
	 * @param searchValue
	 * @param beforeXpath
	 * @param afterXpath
	 * @param driver
	 * @return
	 */
	public boolean verifyWebTableValue(String searchValue, String beforeXpath, String afterXpath, WebDriver driver) {
		boolean isValueExist = false;
		int rowCount = getRowCount(driver);
		for (int rowNum = 2; rowNum <= rowCount; rowNum++) {
			String actualXpath = beforeXpath + rowNum + afterXpath;
			String cellValue = driver.findElement(By.xpath(actualXpath)).getText();
			System.out.println(cellValue);
				if(cellValue.equals(searchValue)){
					isValueExist = true;
					break;
				}
		}
		return isValueExist;
	}

}
