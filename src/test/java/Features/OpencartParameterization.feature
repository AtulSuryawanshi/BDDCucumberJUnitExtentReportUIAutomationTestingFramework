# BDD Cucumber Parameterization - Scenario Outline, Examples & Data table
@FeatureTestTag3
Feature: Opencart Application Login

  Scenario Outline: Opencart SignUp
      User should be able to login Opencart web application using the valid username and password

    Given User navigate to Opencart website
    When User enters <Username> and <Password>

    Examples: 
      | Username  | Password  |
      | Username1 | Password1 |
      | Username2 | Password2 |
      | Username3 | Password3 |
