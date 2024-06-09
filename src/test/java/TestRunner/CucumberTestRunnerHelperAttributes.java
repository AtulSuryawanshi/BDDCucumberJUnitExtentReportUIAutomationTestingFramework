package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features", glue = { "StepDefinition" }, monochrome = true)

public class CucumberTestRunnerHelperAttributes {

}

//Cucumber helper attributes - monochrome, dryRun=checks for feature and step definition mapping, strict