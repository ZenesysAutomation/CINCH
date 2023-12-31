package runner;
import org.junit.runner.RunWith;
import TestData.UpdateTestDataProperties;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/features",tags="@TestInvalid ", publish = true, monochrome = true, dryRun = false,
plugin= {"pretty","html:target/TestReport/test.html","json:target/cucumber-report/cucumber.json"},glue= {"stepDefinition","base"})

public class RunnerFileTest {
	
	public static void main(String[] args) {
        UpdateTestDataProperties.updateTestDataProperties();
    }
}


/*Run the all Features file through Tags*/

/*package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/features",tags="@Test or @TestInvalid or @Reg or @Reg2 or @Reg4 or @Reg5 or @smoke or @Reg6 "
		+ "or @Abc or @abc2 or @abc3 or @abc4 or @abc5 or @abc6 or @Reg7 or @xyz or @xyz1 or @xyz2 or @Reg8 or @sanity or @sanity1"
		+ "or @Regression or @Regression1 or @Regression2 or @Regression3 or @Regression4 or @HourlyVisit",
publish = true, monochrome = true, dryRun = false,
plugin= {"pretty","html:target/TestReport/test.html","json:target/cucumber-report/cucumber.json"},glue= {"stepDefinition","base"})

public class RunnerFileTest {
	

}*/


/*Run the All features File*/

/*package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( features={"src/test/java/features/1_Login.feature","src/test/java/features/2_AddClient.feature",
"src/test/java/features/4_AddCommunityNote.feature","src/test/java/features/5_EditCommunityNote.feature",
"src/test/java/features/6_Assessments & Care Plans.feature","src/test/java/features/7_VisitPlanSingle.feature","src/test/java/features/8_VisitPlansEveryday.feature",
"src/test/java/features/9_AddPastVisit.feature","src/test/java/features/HourlyVisit.feature","src/test/java/features/CaregiverAssignments.feature","src/test/java/features/3_EditClient.feature"},
plugin= {"pretty","html:target/TestReport/test.html","json:target/cucumber-report/cucumber.json"},glue= {"stepDefinition","base"})

public class RunnerFileTest {
	

}*/

















