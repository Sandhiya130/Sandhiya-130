@tag
Feature: collect the product feature

  @tag1
  Scenario: entering product in the search box
    Given user in chrome page
    Given user in ebay page
    When user enter the product in search box
    When user enter the product select the category of the product
    And user click on search button
    Then user redirect to homepage
