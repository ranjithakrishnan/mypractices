package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@CucumberOptions(features ="src/main/java/features/CreateLead2.feature",glue = {"pages", "hooks"},monochrome =true)
@RunWith(Cucumber.class)
public class RunTest {

}
