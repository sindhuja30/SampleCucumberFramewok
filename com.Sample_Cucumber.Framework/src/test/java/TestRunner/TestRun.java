package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {".//Features/Register.feature"},
		glue = "StepDefinations",
		dryRun = false,
		monochrome = true,
				plugin = {
			        "pretty:target/prettyReport.txt", 
			        "html:target/cucumber", 
			        "json:target/cucumber.json", 
			        "rerun:target/rerun.txt",
				    "junit:target/junit-report.xml", 
					    "testng:target/testng-output.xml","com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:target/html/ExtentReport.html"}
		
		)
public class TestRun {
	

}
