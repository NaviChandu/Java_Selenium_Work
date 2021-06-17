package page_actions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import page_locator.CarsGuideHomePageLocators;
import utilities.SeleniumDriver;

public class CarsGuideHomePageActions {

	CarsGuideHomePageLocators carsGuideHomePageLocators=null;
	
	public CarsGuideHomePageActions() {
		this.carsGuideHomePageLocators = new CarsGuideHomePageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), carsGuideHomePageLocators);
	}
	
	public void moveToCarsForSaleMenu()
	{
		Actions action= new Actions(SeleniumDriver.getDriver());
		action.moveToElement(carsGuideHomePageLocators.carsForSaleLink).perform();
	}
	public void clickOnSearchCarsMenu()
	{
		//first call the below method
		//moveToCarsForSaleMenu();
		carsGuideHomePageLocators.searchCarsLink.click();
		
	}
	public void clickOnUsedSearchCarsMenu()
	{	
		//first call the below method
		//moveToCarsForSaleMenu();
		carsGuideHomePageLocators.usedSearchCarsLink.click();
		
	}
	
	public void clickOnSellSearchCarsMenu()
	{	
		//first call the below method
		//moveToCarsForSaleMenu();
		carsGuideHomePageLocators.sellMyCarLink.click();
		
	}
	
}
