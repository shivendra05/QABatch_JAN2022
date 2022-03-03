package hooks;

import cucumber.api.java.After;
import cucumber.api.java.AfterStep;
import cucumber.api.java.Before;
import cucumber.api.java.BeforeStep;

public class HooksDefination {

	@Before(order = 1)
	public void Launch_url() {
		System.out.println("Before Scenario launch 1");
	}

	@Before(order = 2)
	public void Launch_url2() {
		System.out.println("Before Scenario launch 2");
	}
	
	@BeforeStep
	public void Launch_url1() {
		System.out.println("Before Step");
	}
	
	@AfterStep
	public void Launch_url3() {
		System.out.println("After Step");
	}
	
	@After
	public void Launch_url4() {
		System.out.println("After Scenario");
	}
}