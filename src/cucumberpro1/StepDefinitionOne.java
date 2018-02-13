package cucumberpro1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitionOne {
	public WebDriver driver;
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.gecko.driver","E:\\Java WS\\cucumberpro\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://demoqa.com/registration/");
	}

	@When("^User Navigate to Register Page$")
	public void user_Navigate_to_Register_Page() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String arg1, String arg2) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys(arg1);
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys(arg2);

	}

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Register");
	}


	
	
}
