# BDD Cucumber Hooks - With and Without tags
@FeatureTestTag2
Feature: Opencart Application Login

  @MobileTest
  Scenario: Opencart Login
      User should be able to login Opencart web application using the valid username and password

    Given User navigate to Opencart website
    When User click on MyAccount dropdown
    Then User should see Login and Register buttons
    When User click on Login button
    Then User should navigate to Opencart Login page
    When User enters "Atul" and "1234"
    And User click on Login button
    Then User should navigate to Login success page
