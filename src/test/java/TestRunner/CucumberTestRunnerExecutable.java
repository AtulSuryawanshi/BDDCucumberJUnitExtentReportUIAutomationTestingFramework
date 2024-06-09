package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features/OpencartBasics_Executable.feature", glue = { "StepDefinition" })

public class CucumberTestRunnerExecutable {

}

//Cucumber tags - Include tags, Multiple tags, Exclude tags

/*
* Executing single group = tags = {"@RegressionTest"} Excluding the group =
* tags = {"not @RegressionTest"} Executing multiple groups = tags =
* {"@RegressionTest and @SanityTest"} Executing multiple groups = tags =
* {"@RegressionTest or @SanityTest"}
*/