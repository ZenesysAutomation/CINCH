package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/features",tags="@smoke",
plugin= {"pretty","html:target/TestReport/test.html","json:target/cucumber-report/cucumber.json"},glue= {"stepDefinition","base"})

public class RunnerFileTest {

}





























