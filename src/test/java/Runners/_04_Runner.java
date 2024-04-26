package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/FeatureFiles/TC_704_TABMenu.feature"},
        glue = {"StepDefinitions"}
)

public class _04_Runner extends AbstractTestNGCucumberTests {
}
