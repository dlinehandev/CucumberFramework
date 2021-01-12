package steps;

import io.cucumber.java.en.Then;

public class SearchResultsSteps extends BaseStep {

    @Then("I should be able to view a list of hotel search results")
    public void iShouldBeAbleToViewAListOfHotelSearchResults() {
        getSearchResultPage().sortResults();
        System.out.println("I should be able to view a list of hotel search results");
    }
}
