package stepDefintions;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty"},
		features = {"E:\\eclipse\\erp\\src\\test\\resources\\features\\login.feature"},
		tags= {"@tc-2"}
)
public class RunCukeTest {
	
}
