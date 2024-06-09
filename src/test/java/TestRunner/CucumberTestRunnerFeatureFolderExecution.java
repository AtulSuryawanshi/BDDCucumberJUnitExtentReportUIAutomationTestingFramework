package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features", glue = { "StepDefinition" })

public class CucumberTestRunnerFeatureFolderExecution {

}

//Cucumber complete feature folder execution
/*
 * classpath:features = Executes all the features from the feature folder
 */