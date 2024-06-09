package pageObjectPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OpencartHomePage {

	// WebDriver initialization
	WebDriver driver;

	// Constructor
	public OpencartHomePage(WebDriver driver) {

		this.driver = driver;
	}

	By Username = By.xpath("");
	By Password = By.xpath("");
	By Login_Button = By.xpath("//a[@class='btn btn-link navbar-btn']");

	public WebElement Username() {

		return driver.findElement(Username);
	}

	public WebElement Password() {

		return driver.findElement(Password);
	}

	public WebElement Login_Button() {

		return driver.findElement(Login_Button);
	}
}
