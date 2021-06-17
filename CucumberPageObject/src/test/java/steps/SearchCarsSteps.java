package steps;

import java.util.List;

import org.testng.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page_actions.CarSearchPageActions;
import page_actions.CarsGuideHomePageActions;
import utilities.SeleniumDriver;

public class SearchCarsSteps {
	
	CarsGuideHomePageActions carsGuideHomePageActions = new CarsGuideHomePageActions();
	CarSearchPageActions carSearchPageActions = new CarSearchPageActions();
	
	@Given("^I am on the Home Page \"([^\"]*)\" of CarsGuide Website$")
	public void i_am_on_the_home_page_something_of_carsguide_website(String WebsiteURL) {
		SeleniumDriver.openPage(WebsiteURL);
	}

	@When("^I move to Car For Sale Menu$")
	public void i_move_to_Car_For_Sale_Menu(List<String> list) {
		String menu=list.get(1);
		System.out.println("Menu-->"+menu);
		carsGuideHomePageActions.moveToCarsForSaleMenu();
	}

    @And("^click on Search Cars link$")
    public void click_on_search_cars_link() {
		carsGuideHomePageActions.clickOnSearchCarsMenu();
	}
	

	@And("^select carbrand as \"([^\"]*)\" from AnyMake dropdown$")
	public void select_carbrand_as_something_from_anymake_dropdown(String carBrand) {
		carSearchPageActions.selectCarMaker(carBrand);
	}

	@And("^select \"([^\"]*)\" as car model$")
	public void select_something_as_car_model(String carModel) throws InterruptedException {
		Thread.sleep(2000);
		carSearchPageActions.selectCarModel(carModel);
	}

	@And("^select location as \"([^\"]*)\" from SelectLocation dropdown$")
	public void select_location_as_something_from_selectlocation_dropdown(String location) {
		carSearchPageActions.selectLocation(location);
	}

	 @And("^select price as \"([^\"]*)\" from the price dropdown$")
	    public void select_price_as_something_from_the_price_dropdown(String price)  {
		carSearchPageActions.selectPrice(price);
	}

	@And("^click on Find_My_Next_Car button$")
	public void click_on_findmynextcar_button() {
		carSearchPageActions.clickOnFindMyNextCarButton();
	}
	
	@Then("^I should see list of searched cars$")
	public void i_should_see_list_of_searched_cars() {
		System.out.println("Car List Found");
	}

	@And("^the page title should be \"([^\"]*)\"$")
	public void the_page_title_should_be_something(String expectedPageTitle) {
		String ActualPageTitle= SeleniumDriver.getDriver().getTitle();
	    System.out.println("Actual page title-->"+ActualPageTitle);
	    System.out.println("Expected page title-->"+expectedPageTitle);
	    Assert.assertEquals(expectedPageTitle, ActualPageTitle);
	}

}
