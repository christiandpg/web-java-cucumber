import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/LoginScenarios.feature"
        , glue = {""}
        , plugin = {"pretty", "html:src/test/resources/cucumber-reports"})

public class LoginTests {
}
