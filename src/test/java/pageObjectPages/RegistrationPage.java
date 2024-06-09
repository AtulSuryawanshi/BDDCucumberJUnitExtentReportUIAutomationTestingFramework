package pageObjectPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage {

	WebDriver driver;

	public RegistrationPage(WebDriver driver) {

		this.driver = driver;
	}

	// Section statement
	By Register_button = By.xpath("");
	By SuccessMessage_Text = By.xpath("");
	By SuccessMessage_Link = By.xpath("");

	public WebElement Register_button() {

		return driver.findElement(Register_button);
	}

	// Section footer
	By Demo_button = By.xpath("");

	public WebElement Demo_button() {
		
		return driver.findElement(Demo_button);
	}
}
