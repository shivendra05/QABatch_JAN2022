package hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class CucumberHooks {

	@Before(order = 1)
	public void beforeLaunch1() {
		System.out.println("Before Scenario 1");
	}
	
	@Before(order = 2)
	public void beforeLaunch2() {
		System.out.println("Before Scenario 2");
	}
	
	@Before(order = 3)
	public void beforeLaunch3() {
		System.out.println("Before Scenario 3");
	}
	
	@After(order = 1)
	public void afterLaunch1() {
		System.out.println("After Scenario 1");
	}
	
	@After(order = 2)
	public void afterLaunch2() {
		System.out.println("After Scenario 2");
	}
}