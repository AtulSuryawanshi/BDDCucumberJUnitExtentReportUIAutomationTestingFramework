package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GreenKartBasicStepDefiFile {

	@Given("User navigate to GreenKart website")
	public void user_navigate_to_green_kart_website() {

		System.out.println("User navigate to GreenKart website");
	}

	@When("User select the product by clicking on addToCart button")
	public void user_select_the_product_by_clicking_on_add_to_cart_button() {

		System.out.println("User select the product by clicking on addToCart button");

	}

	@Then("User click on cart image")
	public void user_click_on_cart_image() {
		System.out.println("User click on cart image");
	}

	@When("User click on proceed to checkout button")
	public void user_click_on_proceed_to_checkout_button() {
		System.out.println("User click on proceed to checkout button");
	}

	@Then("User should navigate to GreenKart order details page")
	public void user_should_navigate_to_green_kart_order_details_page() {
		System.out.println("User should navigate to GreenKart order details page");
	}

	@When("User enters promo code {string} in promo code text box")
	public void user_enters_promo_code_in_promo_code_text_box(String string) {
		System.out.println("User enters promo code {string} in promo code text box");
	}

	@When("User click on apply button")
	public void user_click_on_apply_button() {
		System.out.println("User click on apply button");
	}

	@Then("User should see invalid code error message on screen")
	public void user_should_see_invalid_code_error_message_on_screen() {
		System.out.println("User should see invalid code error message on screen");
	}

	@When("User click on place order button")
	public void user_click_on_place_order_button() {
		System.out.println("User click on place order button");
	}

	@Then("User should navigate to country selection page")
	public void user_should_navigate_to_country_selection_page() {
		System.out.println("User should navigate to country selection page");
	}

}
