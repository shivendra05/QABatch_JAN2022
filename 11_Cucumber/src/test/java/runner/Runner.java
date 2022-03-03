package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "E:\\GitHub\\TL WorkSpace\\11_Cucumber\\src\\test\\java\\feature\\login.Feature",
		glue = {"steps","hooks"},
		plugin = {"pretty", "html:target",
				"json:target/reportJson.json",
		"junit:target/reportXml.xml"},
		monochrome = true,
		strict = true,
		dryRun = true
		)
public class Runner {

}