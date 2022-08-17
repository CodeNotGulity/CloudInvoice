package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"rerun:target/rerun.txt"},
        features = "src/test/java/resources/features", // path for feature files
        glue = "steps",
        tags = "@regression"

)

public class Runner {

}
