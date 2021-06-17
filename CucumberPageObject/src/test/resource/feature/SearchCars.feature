@Search-Cars
Feature: Acceptance testing to validate search cars page is working
  in order to validate  that
  the search cars page is working
  we will be doing acceptance testing

  @Search-Cars-Positive
  Scenario: Validate Search Cars Page
    Given I am on the Home Page "https://www.carsguide.com.au" of CarsGuide Website
    When I move to Car For Sale Menu
      | Menu          |
      | buy+sell      |
    And click on Search Cars link
    And select carbrand as "BMW" from AnyMake dropdown
    And select location as "NSW - All" from SelectLocation dropdown
    And select price as "$20,000" from the price dropdown
  #	And select "118D" as car model
    And click on Find_My_Next_Car button
    Then I should see list of searched cars
    And the page title should be "Bmw Under 20000 for Sale NSW | carsguide"
