package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/features",tags="@Test", monochrome = true, dryRun = false,
plugin= {"pretty","html:target/TestReport/test.html","json:target/cucumber-report/cucumber.json"},glue= {"stepDefinition","base"})

public class RunnerFileTest {

}


































/*package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( features={"src/test/java/features/Login.feature","src/test/java/features/AddClient.feature",
"src/test/java/features/EditClient.feature","src/test/java/features/AddCommunityNote.feature","src/test/java/features/EditCommunityNote.feature",
"src/test/java/features/Assessments & Care Plans.feature"},
plugin= {"pretty","html:target/TestReport/test.html","json:target/cucumber-report/cucumber.json"},glue= {"stepDefinition","base"})

public class RunnerFileTest {

}*/















