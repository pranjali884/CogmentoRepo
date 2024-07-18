Feature: Test the cogmento application

  Scenario: validate login functionality
    Given user is on login page
    When user enter valid username and valid password
    Then click on login button

  Scenario: Validate Homepage Functionality
    Given user is on Homepage and validate logo
    Then User validtae hompage title and url

  Scenario: Valiadate Contact Page Functionality
    When User clicks Contact Link and click new contact
    Then USer enter firstName and LastName
    And User click on save button
