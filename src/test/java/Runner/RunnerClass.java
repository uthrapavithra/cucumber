package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/main/resources/sample1.feature"},glue="StepDef",
					plugin="json:target/jsonreport.json"
					)

public class RunnerClass {

}
