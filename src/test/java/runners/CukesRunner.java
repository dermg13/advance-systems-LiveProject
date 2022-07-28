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
        tags = "@ADVSYS-10a"

=======
        tags = "@ADVSYS-5"
>>>>>>> c0ec43cccd808962143a4832fa68e1e703d24907
)
public class CukesRunner {

}

