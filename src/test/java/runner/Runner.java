package runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",
                "html:target/report.hmtl"},
        features = "src/test/resources/features",
        glue = "stepdef",
        tags = "@Amazon",
        dryRun = false
)
public class Runner {
}
