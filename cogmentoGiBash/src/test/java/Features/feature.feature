Feature: Test the cogmento application

  Scenario: validate login functionality
    Given user is on login page
    When user enter valid username and valid password
    Then click on login button
