Feature: Login functionality

  Scenario: Successfully login with valid credentials
    Given the user is on the login page
    When the user enters the valid credentials
    And the user click on the login button
    Then the user should be displayed with the dashboard Page
