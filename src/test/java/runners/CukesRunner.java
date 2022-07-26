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
        tags = "@ADVSYS-19"
=======
        tags = "@ADVSYS-12"
>>>>>>> 226486901bc77b3eaf7d367cc076fc742f455016
)
public class CukesRunner {

}
