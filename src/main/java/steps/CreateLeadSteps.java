package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateLeadSteps {
	public static ChromeDriver driver;
	@Given("launch the browser")
	public void launchbrowser() {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	@And("maximize the browser")
	public void maximize() {
		driver.manage().window().maximize();
		
	}
	@And("set the timeout")
	public void timeout() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@And("enter the url")
	public void loadurl() {
		driver.get("http://leaftaps.com/opentaps/control/main");
	}
	@And("enter the username")
	public void username() {
		driver.findElementById("username").sendKeys("uName");
	}
	@And("enter the password")
	public void password() {
		driver.findElementById("password").sendKeys("pwd");
	}
	@When("clicks on the login button")
	public void login() {
		driver.findElementByClassName("decorativeSubmit").click();
	}
	
	@Then("verify login is success")
	public void verifylogin() {
		System.out.println("login is verified");
		System.out.println("login is failure");
	}
	
	
	
	@When("clicks on the crmsfa")
	public void crmsfa() {
		driver.findElementByLinkText("CRM/SFA").click();
	}
	@When("clicks on the createlad")
	public void createlead() {
		driver.findElementByLinkText("Create Lead").click();
	}
	@And("enter the companyname as(.*)")
	public void companyname(String tcs) {
		driver.findElementById("createLeadForm_companyName").sendKeys("tcs");
	}
	@And("enter the lastname as(.*)")
	public void lastname(String R) {
		driver.findElementById("createLeadForm_lastNameLocal").sendKeys("R");
	}
	@When("click on the createlead button")
	public void clickcreatelead() {
		driver.findElementByName("submitButton").click();
	}
	@Then("verify createlead is sucess")
	public void verifycreatelead() {
		System.out.println("create lead is verified");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
