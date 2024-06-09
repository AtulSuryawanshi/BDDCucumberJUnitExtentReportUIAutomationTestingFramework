package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features/GreenKartBasicTest.feature", glue = { "StepDefinition" })

public class CucumberTestRunnerSingleFeatureFileExecution {

}

//Cucumber single feature file execution
/*
 * classpath:features/GreenKartBasicTest.feature = Executes only the specified
 * feature from the feature folder
 */