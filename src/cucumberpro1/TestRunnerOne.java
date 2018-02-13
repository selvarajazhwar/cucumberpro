package cucumberpro1;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\featuro.features",
glue = {"cucumberpro1"},tags={"@tag"}, plugin = {"pretty","html:target/cucumber-html-report"})
public class TestRunnerOne {

}
