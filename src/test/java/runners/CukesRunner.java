package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",
                "html:target/report.html",
                "json:target/cucumber-report/cucumber.json",
        "rerun:target/rerun.txt"},
        features = "src/test/resources/features",
        glue = {"step_definitions"},
        stepNotifications = true,
        dryRun = true,
        tags = "@ADVSYS-10-a"

)
public class CukesRunner {

}
