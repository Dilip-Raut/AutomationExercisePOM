package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"pretty", "json:target/cucumber/Cucumber.json","html:target/HTMLReport/cucumber.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
				 //tags= "@valid",
				 features = "src/test/resources/features/AutomationExerciseLoginPOM.feature", 
				 glue ="steps"
				 )

public class CucumberRunnerPOMTests extends AbstractTestNGCucumberTests {
}
