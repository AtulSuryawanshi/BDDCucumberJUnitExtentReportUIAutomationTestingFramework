# BDD Cucumber Keywords - Feature, Given, When, Then, And, But
# Scenario & Scenario Outline - Examples
# Single & Multiple tags
@FeatureTestTag
Feature: Opencart Application Login

  Background: 
    Given User navigate to Opencart website

  @RegressionTest @SmokeTest @SanityTest
  Scenario: Opencart Login
      User should be able to login Opencart web application using the valid username and password

    When User click on MyAccount dropdown
    Then User should see Login and Register buttons
    When User click on Login button
    Then User should navigate to Opencart Login page
    When User enters "Atul" and "1234"
    And User click on Login button
    Then User should navigate to Login success page

 @SmokeTest
  Scenario: Opencart Signup
    User should be able to login Opencart web application using the valid username and password

    When User click on MyAccount dropdown
    Then User should see Login and Register buttons
    When User click on Login button
    Then User should navigate to Opencart Login page
    When User enters "Atul" and "1234"
    And User click on Login button
    Then User should navigate to Login success page

   @RegressionTest @WebAppTest @MobileAppTest
  Scenario Outline: Opencart RegistrationTest
    User should be able to login Opencart web application using the valid username and password

    When User enters <Username> and <Password>

    @MobileAppTest
    Examples: 
      | Username               | Password               |
      | MobileAppTestUsername1 | MobileAppTestPassword1 |
      | MobileAppTestUsername2 | MobileAppTestPassword2 |
      | MobileAppTestUsername3 | MobileAppTestPassword3 |
