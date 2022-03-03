package com.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\java\\feature\\login.Feature"
		,glue={"runner"}
		)

public class TestCaes {

}
