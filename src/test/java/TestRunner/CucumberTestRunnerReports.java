package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features", glue = {
		"StepDefinition" }, publish = true, monochrome = true, plugin = { "html:target/cucumber/report.html",
				"pretty:target/cucumber/report.json", "junit:target/junit-reports/",
				"junit:target/xml-reports/report.xml" })

public class CucumberTestRunnerReports {

}

//Cucumber reports - HTML, JSON, JUnit & xml
/*
 * Published the report on Web, We can check the published report using link
 * displayed after the execution publish = true
 */