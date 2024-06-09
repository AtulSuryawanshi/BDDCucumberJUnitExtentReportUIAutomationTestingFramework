package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features", glue = { "StepDefinition" }, tags = "@MobileTest")

public class CucumberTestRunnerHooks {

}

//Cucumber Hooks - Common Before & After Hooks, Before & After Hooks with tags