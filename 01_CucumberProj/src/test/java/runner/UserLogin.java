package runner;

import cucumber.api.java.en.Given;

public class UserLogin {

	@Given("^launch url$")
	public void launch_url() {
		System.out.println("Launch URL");
	}
}
