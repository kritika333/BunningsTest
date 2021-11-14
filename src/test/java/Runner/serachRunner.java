package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin ={"pretty", "html:target/cucumber-report.html"},
        features={"src/test/resources"},
        glue={"test/java/stepDefinition"})
public class serachRunner {


}
