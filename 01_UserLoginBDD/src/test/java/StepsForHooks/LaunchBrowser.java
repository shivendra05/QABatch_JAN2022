package StepsForHooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LaunchBrowser {
	WebDriver driver=null;

	@Given("^enter url$")
	public void enter_url() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shive\\Desktop\\QA\\Browser_Exe\\chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("I from URL");
		driver.get("https://www.instagram.com/");
	}

	@Then("^get title$")
	public void get_title() throws Throwable {
		System.out.println("Title "+driver.getTitle());
		System.out.println("URL "+driver.getCurrentUrl());
	}

	@And("^close browser$")
	public void close_browser() throws Throwable {
		driver.quit();
		System.out.println("BROWSER CLOSED ");
	}
}
