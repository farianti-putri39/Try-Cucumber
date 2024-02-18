@login
Feature: Login

  @valid-login
  Scenario: Valid Login
    Given User is on login page
    When User input valid username "standard_user"
    And User input valid password "secret_sauce"
    And User click login button
    Then User is logged in

  @invalid-login
  Scenario: Invalid Login
    Given User is on login page
    When User input invalid username "standard_user"
    And User input invalid password "invalid"
    And User click login button
    Then Error message is displayed "Epic sadface: Username and password do not match any user in this service"
