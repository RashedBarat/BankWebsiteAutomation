package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

public class Cucumberrunner {

    @CucumberOptions(
            features = {
            "src/test/resources/Features"},
            glue = {"WebStepDefs"},
            tags ="@test1 or @test2 or @test3",
            monochrome = true,
            dryRun = false,
            plugin = {
                    "pretty",
                    "html:build/reports/feature.html"
            })
    @Test
    public class CucumberRunnerTests extends AbstractTestNGCucumberTests {
    }
}
