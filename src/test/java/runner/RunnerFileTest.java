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
@CucumberOptions( features={"src/test/java/features/1_Login.feature","src/test/java/features/2_AddClient.feature",
"src/test/java/features/3_EditClient.feature","src/test/java/features/4_AddCommunityNote.feature","src/test/java/features/5_EditCommunityNote.feature",
"src/test/java/features/6_Assessments & Care Plans.feature","src/test/java/features/7_VisitPlanSingal.feature","src/test/java/features/8_VisitPlansEveryday.feature","src/test/java/features/9_CaregiverAssignments.feature"},
plugin= {"pretty","html:target/TestReport/test.html","json:target/cucumber-report/cucumber.json"},glue= {"stepDefinition","base"})

public class RunnerFileTest {

}*/















