# BDD Cucumber Parameterization - Scenario Outline, Examples & Data table
@FeatureTestTag3
Feature: Opencart Application Login

  Scenario: Opencart SignUp
    User should be able to login Opencart web application using the valid username and password

    Given User navigate to Opencart website
    When User enters below details
      #|FName|LName|Mob Number|Address|
      | Atul | Suryawanshi | +91 123456789 | My Address |
      | Sujay | Thakur | +91 123456789 | My Address |
