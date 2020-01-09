package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = "C:\\Users\\User\\Desktop\\eclipse\\CucumberBDD\\src\\main\\java\\features\\deals.feature", // location of feature file
		plugin = {"pretty", "html:target/cucumber-html-report", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, // plugin=formate - formate of report & location
		monochrome = true, // to make output more readable, if false - output comes out to be not so readable
		glue="step_definations", // path of step definition
		tags = {},
		strict= true, // will fail execution if any step definition is not defined
		dryRun= false // when true - checks mapping between feature file and step definition/ when false - will run the test
		)

public class test_runner {

}
