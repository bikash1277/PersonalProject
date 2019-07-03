package runner;

import cucumber.api.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
		glue = {"stepDefinition" },
		tags = {"@TestingOTM" },
		plugin = { "pretty", "html:target/cucumber-reports","rerun:rerun/failed_scenarios.txt"},
		monochrome = true
		)

public class Runner {
	}
