package KloiaWeb.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
            "html:target/default-html-reports"
        },
        glue = "KloiaWeb/step_def",
        features = "src/test/resources/features",
        tags = "@regression",
        dryRun = false
)
public class KloiaWebRunner {
}
