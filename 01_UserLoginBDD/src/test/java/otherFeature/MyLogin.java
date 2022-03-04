package otherFeature;

import org.junit.Test;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class MyLogin {

	@Before
	@Given("^enter url$")
	public void enter_url() throws Throwable {
		System.out.println("I from URL");
	}

	@And("^Enter UserName and Password$")
	public void enter_UserName_and_Password() throws Throwable {
		System.out.println("I from UserName and Password");

	}

	@Then("^click on submit button$")
	public void click_on_submit_button() throws Throwable {
		System.out.println("I from Submit");
	}

	/*
	 * @Then("^print title$") public void title() throws InterruptedException {
	 * System.out.println("I from Title"); }
	 */
	@After
	@And ("^close browser$")
	public void close_browser() throws InterruptedException {
		System.out.println("I from close");
	}
}
