package page_actions;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import page_locator.UsedCarSearchPageLocators;
import utilities.SeleniumDriver;

public class UsedCarsSearchPageActions {
	
	UsedCarSearchPageLocators usedCarSearchPageLocators=null;
	public  UsedCarsSearchPageActions()
	{
		//this.driver=driver;
		this.usedCarSearchPageLocators= new UsedCarSearchPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), usedCarSearchPageLocators);
	}

	public void selectCarMaker(String carBrand)	{
		
		Select selectCarMaker=new Select(usedCarSearchPageLocators.carMakerDropDown);
		selectCarMaker.selectByVisibleText(carBrand);
		
	}
	
	public void selectCarModel(String carModel)
	{

		Select selectCarModel=new Select(usedCarSearchPageLocators.selectModelDropDown);		
		selectCarModel.selectByVisibleText(carModel);
		
		
	}
	public void selectLocation(String location)
	{
		Select selectLocation=new Select(usedCarSearchPageLocators.selectLocation);
		selectLocation.selectByVisibleText(location);
	}
	public void selectPrice(String price)
	{

		Select selectPrice=new Select(usedCarSearchPageLocators.priceList);
		List<WebElement> list=selectPrice.getOptions();
		for(WebElement s:list)
		{
			System.out.println("--->"+s.getText());
		}
		selectPrice.selectByVisibleText(price);
	}
	
	public void clickOnFindMyNextCarButton()
	{
	
		usedCarSearchPageLocators.findMyNextCarButton.click();
		
	}

}
