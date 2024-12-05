package testrunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/java/feature",
        glue={"stepdefinition","hooks"},
        plugin={"pretty"})


public class TestRunner
{
}