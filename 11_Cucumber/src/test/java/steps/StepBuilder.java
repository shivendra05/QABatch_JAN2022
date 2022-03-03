package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepBuilder {

	WebDriver driver;

	@Given("^Launch url$")
	public void Launch_url() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shive\\Desktop\\QA\\Browser_Exe\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://stackoverflow.com/questions/47814783/cucumber-runtime-cucumberexception-there-are-undefined-steps");
		System.out.println("Title"+driver.getTitle());
	}

	@Then("^print data$")
	public void print_data() {

		System.out.println("url:: "+driver.getCurrentUrl());
	}

	@And("^close browser$")
	public void close_browser() {
		driver.close();
		System.out.println("Close browser");
	}
}