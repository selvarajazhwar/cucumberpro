package cucumberpro1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef {
	public WebDriver driver;
	@Given("^I am in demoq website$")
	public void i_am_in_demoq_website() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.gecko.driver","E:\\Java WS\\cucumberpro\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://demoqa.com/registration/");
	}

	@When("^I enter firstname and lastname$")
	public void i_enter_firstname_and_lastname() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("selva");
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("raj");

	}

	@Then("^I validate the firstname and lastname$")
	public void i_validate_the_firstname_and_lastname() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	}



}
