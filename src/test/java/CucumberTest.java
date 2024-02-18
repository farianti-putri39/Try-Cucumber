import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"MyStepdefs.stepdefs.loginstepdef"},
        features = {"src/test/resources"},
        plugin = {"pretty"}
)
public class CucumberTest {

}
