#Author: suryawanshiatul21@gmail.com
@GreenkartExecutableFeature
Feature: GreenKart product order

  Scenario: Title of your scenario
    Given User navigates to greenkart home page
    When User add product in kart
    And Click on product basket button
    Then User should able to list of the products added in kart
    When User perform click on proceed to checkout button
    Then User should navigates to product summary page
    When User perform click on place order button
    Then User should navigate to address selection page
    When User select the country
    And Check the terms and conditions checkbox
    And Click on proceed button
    Then User should see order placed successfull text displayed
