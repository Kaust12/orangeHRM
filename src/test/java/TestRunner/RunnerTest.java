package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		    features= {"C:\\Users\\samru\\eclipse-workspace\\OrangeHRMWithBDD\\AllFeaturesFiles\\login.feature"},
		    extraGlue= {"StepDefination"}
		)
public class RunnerTest {

}
