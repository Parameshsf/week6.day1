package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

/*@CucumberOptions(features="src/test/java/features/CreateLead.feature",
							glue="steps",monochrome=true,publish=true)*/
@CucumberOptions(features="src/test/java/features",glue = "steps", monochrome = true, publish = true)
public class ExecuteLoginLeafTap extends AbstractTestNGCucumberTests {

}
