package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = ("C:\\Users\\Anubhav\\IdeaProjects\\SeleniumCucumber\\Features\\OrangeHRM.feature")
        //,=("C:\\Users\\Anubhav\\IdeaProjects\\SeleniumCucumber\\Features\\Whitebox.feature")
        ,glue = "stepDefinitions"
        //,extraGlue = "stepDefinitions"
)

public class TestRunner {
}
