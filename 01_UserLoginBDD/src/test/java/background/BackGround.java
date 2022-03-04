package background;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class BackGround {

	WebDriver driver=null;

	@Given("^Launch Chome Browser$")
	public void enter_url() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shive\\Desktop\\QA\\Browser_Exe\\chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@And("^open url$")
	public void enter_UserName_and_Password() throws Throwable {
		Thread.sleep(3000);
		System.out.println("I from URL");
		driver.get("https://www.airindia.in/");
	}

	@Then("^get title$")
	public void title() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("I from Title");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	}

	@And ("^Close browser$")
	public void close_browser() throws InterruptedException {
		System.out.println("I from close");
		Thread.sleep(5000);
		driver.close();
	}
}
