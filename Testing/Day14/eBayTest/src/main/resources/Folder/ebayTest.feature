@tag
Feature: verify the products

  @tag1
  Scenario: ebay search product
    Given user in the chrome page
    When user goes to ebay page
    When user enters the product in the search box
    And shows the category of the product
    And click on search
    Then user redirects to homepage
