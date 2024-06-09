package StepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GreenKartProductOrderExecutableSteps {

	ChromeDriver driver;
	int countOfProductsAddedinKartByUser;

	@Given("User navigates to greenkart home page")
	public void user_navigates_to_greenkart_home_page() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\ATUL\\Preplaced\\Preplaced Testing Workplace\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		// WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver(options);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		Thread.sleep(1000);

	}

	@When("User add product in kart")
	public void user_add_product_in_kart() throws InterruptedException {

		countOfProductsAddedinKartByUser = 1;

		driver.findElement(By.xpath("//*[contains(text(),'Brocolli')]/parent::div/div[3]/button")).click();
		Thread.sleep(1000);
	}

	@When("Click on product basket button")
	public void click_on_product_basket_button() {

		driver.findElement(By.xpath("//*[@class='cart-icon']/img")).click();
	}

	@Then("User should able to list of the products added in kart")
	public void user_should_able_to_list_of_the_products_added_in_kart() {

		List<WebElement> listOfProductsAddedInKart = driver.findElements(By.xpath("(//*[@class='cart-items'])[1]/li"));
		int countOfProductsAddedInKart = listOfProductsAddedInKart.size();

		if (countOfProductsAddedinKartByUser == countOfProductsAddedInKart) {

			System.out.println("All products are added in kart successfully!");
		} else {

			System.out.println("Issue with product count added in kart!");
		}
	}

	@When("User perform click on proceed to checkout button")
	public void user_perform_click_on_proceed_to_checkout_button() throws InterruptedException {

		driver.findElement(By.xpath("//*[text()='PROCEED TO CHECKOUT']")).click();
		Thread.sleep(2000);
	}

	@Then("User should navigates to product summary page")
	public void user_should_navigates_to_product_summary_page() {

	}

	@When("User perform click on place order button")
	public void user_perform_click_on_place_order_button() {

		driver.findElement(By.xpath("//*[text()='Place Order']")).click();
	}

	@Then("User should navigate to address selection page")
	public void user_should_navigate_to_address_selection_page() {

	}

	@When("User select the country")
	public void user_select_the_country() throws InterruptedException {

		Select select = new Select(driver.findElement(By.xpath("//*[@class='wrapperTwo']/div/select")));

		select.selectByIndex(2);
		Thread.sleep(1000);

	}

	@When("Check the terms and conditions checkbox")
	public void check_the_terms_and_conditions_checkbox() {

		driver.findElement(By.xpath("//*[@type='checkbox']")).click();
	}

	@When("Click on proceed button")
	public void click_on_proceed_button() throws InterruptedException {

		driver.findElement(By.xpath("//*[text()='Proceed']")).click();
		Thread.sleep(1000);
	}

	@Then("User should see order placed successfull text displayed")
	public void user_should_see_order_placed_successfull_text_displayed() throws InterruptedException {

		String orderSuccessMessage = driver
				.findElement(By.xpath("//span[contains(text(),'Thank you, your order has been placed successfully')]"))
				.getText();

		System.out.println("Order placed successfully!");
		System.out.println(orderSuccessMessage);
		Thread.sleep(2000);

		driver.close();
	}
}
