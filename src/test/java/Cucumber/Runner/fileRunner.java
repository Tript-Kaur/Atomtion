package Cucumber.Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Cucumber/Feature",
glue="Cucumber.Steps",
dryRun = false)
public class fileRunner {

}
