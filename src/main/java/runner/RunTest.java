package runner;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/", glue = "stepDefs", tags = "@SmokeTest", plugin = { "pretty",
        "html:target/cucumber-reports/report.html" })

public class RunTest {

}
