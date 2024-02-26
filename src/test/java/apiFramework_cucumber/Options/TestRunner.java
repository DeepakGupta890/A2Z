package apiFramework_cucumber.Options;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;




@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/apiFramework_features"
,plugin ="json:target/jsonReports/cucumber-report.json",glue= {"apiFramework_stepDefinations"})
public class TestRunner {

	
	
}
 