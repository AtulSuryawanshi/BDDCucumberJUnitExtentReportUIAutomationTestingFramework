package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features/OpencartLoginTest.feature", glue = { "StepDefinition" }, plugin = {
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

public class CucumberTestRunnerExtentReports {

}

/*
 * Extent report prerequisites - ExtentReport dependency, extent
 * properties/config file, extent plugin added in test runner file
 */
