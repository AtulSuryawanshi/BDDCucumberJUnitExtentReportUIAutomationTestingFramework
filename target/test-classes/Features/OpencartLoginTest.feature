# BDD Cucumber Login Test Page Object Model
Feature: Opencart Application Login

  Scenario: Opencart Login with Valid Username and Password
      User should be able to login Opencart web application using the valid username and password

    Given User navigate to Opencart website
    When User click on MyAccount dropdown
    Then User should see Login and Register buttons
    When User click on Login button
    Then User should navigate to Opencart Login page
    When User enters "Atul" and "1234"
    And User click on Login button
    Then User should navigate to Login success page

  Scenario: Opencart Login with Invalid Username and Password
    User should be able to login Opencart web application using the valid username and password

    Given User navigate to Opencart website
    When User click on MyAccount dropdown
    Then User should see Login and Register buttons
    When User click on Login button
    Then User should navigate to Opencart Login page
    When User enters "Atul" and "1234"
    And User click on Login button
    Then User should navigate to Login success page