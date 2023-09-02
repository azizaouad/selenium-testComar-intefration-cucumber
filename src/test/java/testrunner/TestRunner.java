
package testrunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = "stepdefinitions", plugin = {
        "pretty", "html:target/reports/report.json", "json:target/reports/report.html" }

)
public class TestRunner {
}
