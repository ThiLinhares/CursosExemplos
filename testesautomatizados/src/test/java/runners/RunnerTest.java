package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)	
@CucumberOptions(
	features = "classpath:features",
	glue = {"stepDefinitions"},
	tags = {"@RealizarLogin"},
	dryRun = true
	)

public class RunnerTest {

	
}
