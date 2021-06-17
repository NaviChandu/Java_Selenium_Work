package page_actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import page_locator.CarSearchPageLocators;
import utilities.SeleniumDriver;

public class CarSearchPageActions {

	// WebDriver driver=null;

	CarSearchPageLocators carSearchPageLocators = null;

	public CarSearchPageActions() {
		// this.driver=driver;
		this.carSearchPageLocators = new CarSearchPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), carSearchPageLocators);
	}

	public void selectCarMaker(String carBrand) {

		Select selectCarMaker = new Select(carSearchPageLocators.carMakerDropDown);
		selectCarMaker.selectByVisibleText(carBrand);

	}

	public void selectCarModel(String carModel) {
		Select selectCarModel = new Select(carSearchPageLocators.selectModelDropDown);
		selectCarModel.selectByVisibleText(carModel);
	}

	public void selectLocation(String location) {
		Select selectLocation = new Select(carSearchPageLocators.selectLocation);
		selectLocation.selectByVisibleText(location);
	}

	public void selectPrice(String price) {
		Select selectPrice = new Select(carSearchPageLocators.priceList);
		selectPrice.selectByVisibleText(price);
	}

	public void clickOnFindMyNextCarButton() {

		carSearchPageLocators.findMyNextCarButton.click();

	}

}
