@tag
Feature: verify the login feature

  @tag1
  Scenario: verify with correct user name and password
    Given user in Demo auth login page
    When user enter correct username
    And user enter correct password
    And user click on login
    Then user redirect to homepage
