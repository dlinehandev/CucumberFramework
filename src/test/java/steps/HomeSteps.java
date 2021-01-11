package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeSteps {

    @Given("I am on the Expedia homepage")
    public void navigateToExpedia() {
        System.out.println("Navigate to Expedia");
    }

    @When("I choose hotel booking tab")
    public void iChooseHotelBookingTab() {
        System.out.println("I choose hotel booking tab");

    }

    @And("I provide hotel booking information and click search")
    public void iProvideHotelBookingInformationAndClickSearch() {
        System.out.println("I provide hotel booking information and click search");

    }

}
