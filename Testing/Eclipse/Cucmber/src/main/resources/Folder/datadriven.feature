@tag
Feature: verify the login page

  Scenario Outline: verify the login page
    Given useer in login page
    When user enter username as <username> and password as <password>
    And user click on login
    Then user redirect to homepage

    Examples: 
      | username | password |
      | sandhiya | sandhiya |
      | admin    | admin    |
      | dikshee  | diskhii  |
