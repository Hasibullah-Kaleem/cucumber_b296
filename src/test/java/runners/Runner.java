package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {

                "pretty", //generates reports in the console…
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "rerun:target/failedRerun.txt",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        },

        monochrome = true, //makes the console reports more readable.
        features = "src/test/resources/features",
        glue = {"stepdefinitions","hooks"},// glue is working for stepdefinitions, path of stepdefinitions
        dryRun = false,
        tags = "@parametrizing"



)
public class Runner {


}
// Runner class is used to run FEATURE file, and also we are adding some report plug for our test cases...
// Runner class is providing a feature file (Non-technical) to connect Java Codes(STEP DEFINITIONS)...
// @RunWith (Cucumber.class) is used for making the class runable
//@CucumberOptions is used for connection features and step-definitions it is also provide connection between gherkin and java codes....
//features is used for a path of the feature files
//glue is used to get the path of step-definition
//tags is used to run specific scenarios