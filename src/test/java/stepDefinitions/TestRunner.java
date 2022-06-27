package stepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/test.feature",
		glue = {"stepDefinitions"},
		plugin = {"json:target/cucumber.json"}
		//tags = "@smoke"
		)

public class TestRunner {
 
}
