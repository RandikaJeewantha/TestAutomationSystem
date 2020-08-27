package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "classpath:Features",
		glue = {"classpath:scenarios"},
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		monochrome = true,
		dryRun = false
)

public class CucumberRunner extends AbstractTestNGCucumberTests {
	
}