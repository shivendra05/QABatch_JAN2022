package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "E:\\GitHub\\TL WorkSpace\\01_UserLoginBDD\\src\\test\\java\\Featurefile\\HookesExample.Feature",
		glue = {"StepsForHooks", "hooks"},
		monochrome = true,
		dryRun = false,
		strict = true
		)
public class TestRunner {

}
