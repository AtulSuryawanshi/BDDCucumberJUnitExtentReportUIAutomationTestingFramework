# BDD Cucumber Keywords - Feature, Given, When, Then, And, But
# BDD Cucumber background
Feature: GreenKart Product Order Test

  Background: 
    Given User navigate to GreenKart website

  Scenario: Add product to cart and place the order
      User should be able to add the products in kart and place the order

    When User select the product by clicking on addToCart button
    Then User click on cart image
    When User click on proceed to checkout button
    Then User should navigate to GreenKart order details page
    When User enters promo code "Test" in promo code text box
    And User click on apply button
    Then User should see invalid code error message on screen
    When User click on place order button
    Then User should navigate to country selection page
