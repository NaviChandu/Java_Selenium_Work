package com.qa.hubspot.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.hubspot.base.BasePage;
import com.qa.hubspot.utils.Constants;
import com.qa.hubspot.utils.ElementUtil;

public class AccountsPage extends BasePage {

	private WebDriver driver;
	private ElementUtil elementUtil;
	

	public AccountsPage(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtil(this.driver);
	}

	private By header = By.cssSelector("div#logo a");
	private By accountSectionHeaders = By.cssSelector("div#content h2");
	private By searchText = By.cssSelector("div#search input[name='search']");
	private By searchButton = By.cssSelector("div#search button[type='button']");
	private By searchItemsResult = By.cssSelector(".product-layout .product-thumb");
	private By resultItems = By.cssSelector(".product-thumb h4 a");

	public String getAccountPagePagetitle() {
		return elementUtil.waitForTitlePresent(Constants.ACCOUNTS_PAGE_TITLE, 10);
		//return driver.getTitle();
	}

	public String getHeaderValue() {
		//if (driver.findElement(header).isDisplayed()) {
		if (elementUtil.doIsDisplayed(header)) {
			return elementUtil.doGetText(header);
			//return driver.findElement(header).getText();
		}
		return null;
	}

	public int getAccountSectionsCount() {
		return elementUtil.getElements(accountSectionHeaders).size();
		//return driver.findElements(accountSectionHeaders).size();
	}

	public List<String> getAccountSectionsList() {
		List<String> accountsList = new ArrayList<>();
		//List<WebElement> accSectionList = driver.findElements(accountSectionHeaders);
		List<WebElement> accSectionList = elementUtil.getElements(accountSectionHeaders);
		
		for (WebElement e : accSectionList) {
			System.out.println(e.getText());
			accountsList.add(e.getText());
		}

		return accountsList;
	}

	public boolean doSearch(String productName) {
		//driver.findElement(searchText).sendKeys(productName);
		elementUtil.doSendKeys(searchText, productName);
		//driver.findElement(searchButton).click();
		elementUtil.doClick(searchButton);
		if (elementUtil.getElements(searchItemsResult).size() > 0) {
			return true;
		}
		return false;
	}
	
	public ProductInfoPage selectProductFromResults(String productName) {
		List<WebElement> resultItemList = elementUtil.getElements(resultItems);
		//List<WebElement> resultItemList = driver.findElements(resultItems);
		
		System.out.println("total number of items displayed: " + resultItemList.size());
		
		for (WebElement e : resultItemList) {
			if(e.getText().equals(productName)) {
				e.click();
				break;
			}
		}
		return new ProductInfoPage(driver);
		
		
	}
	

}
