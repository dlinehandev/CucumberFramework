Feature: Expedia Various Types of Booking

  Scenario: As a user I want to search hotels on Expedia
    Given I am on the Expedia homepage
    When I provide hotel booking information and click search
    Then I should be able to view a list of hotel search results