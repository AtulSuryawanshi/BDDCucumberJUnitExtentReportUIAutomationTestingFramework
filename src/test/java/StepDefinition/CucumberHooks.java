package StepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CucumberHooks {

	@Before
	public void cucumberBeforeHook() {
		System.out.println("Cucumber before hook is executed");
	}

	@After
	public void cucumberAfterHook() {
		System.out.println("Cucumber after hook is executed");
	}

	@Before("@MobileTest")
	public void cucumberBeforeMobileTestHook() {
		System.out.println("Cucumber before - MobileTest hook is executed");
	}

	@After("@MobileTest")
	public void cucumberAfterMobileTestHook() {
		System.out.println("Cucumber after - MobileTest hook is executed");
	}

}
