package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class HomeSteps extends BaseStep {

    public HomeSteps()  {
    }

    @Given("I am on the Expedia homepage")
    public void navigateToExpedia() {
        getHomepage().launchExpedia();
        System.out.println("Navigated to Expedia");
    }

    @When("I provide hotel booking information and click search")
    public void iProvideHotelBookingInformationAndClickSearch() throws InterruptedException {
        getHomepage().enterOneWayFlightDetails("Dublin", "London", "02/05/2021");
        System.out.println("I provide hotel booking information and click search");

    }

}
