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
        dryRun = false,
<<<<<<< HEAD
        tags = "@navigationScenarios"
=======
        tags = "@ADVSYS-11"

>>>>>>> a0186be7f7a8eebabf2c8a676d1606296c5ff4a8
)
public class CukesRunner {

}
