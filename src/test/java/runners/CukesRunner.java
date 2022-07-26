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
        tags = "@SmokeForTicketNineteen"
=======
        tags = "@ADVSYS-12"
>>>>>>> ea484b809e8f465d19e9377d9b2fdbdd53d1efc4
)
public class CukesRunner {

}

