package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class MyLogin {

	WebDriver driver=null;
	
	@Given("^enter url$")
	public void enter_url() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shive\\Desktop\\QA\\Browser_Exe\\chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("I from URL");
		driver.get("https://www.instagram.com/");
	}

	@And("^Enter (.*) and (.*)$")
	public void enter_UserName_and_Password(String userName,String passsword) throws Throwable {
		Thread.sleep(3000);
		System.out.println("I from UserName and Password");
		driver.findElement(By.name("username")).sendKeys(userName);
		driver.findElement(By.name("password")).sendKeys(passsword);

	}

	@Then("^click on submit button$")
	public void click_on_submit_button() throws Throwable {
		Thread.sleep(3000);
		System.out.println("I from Submit");
		driver.findElement(By.xpath("//*[text()='Log In']")).click();
	}

	@Then("^print title$")
	public void title() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("I from Title");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	}

	@And ("^close browser$")
	public void close_browser() throws InterruptedException {
		System.out.println("I from close");
		Thread.sleep(5000);
		driver.close();
	}
}
