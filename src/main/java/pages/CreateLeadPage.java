package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods{
	public CreateLeadPage() {
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="createLeadForm_companyName")
	private WebElement eleCompanyName;
	@And("I entered the companyname as(.*)")
	public CreateLeadPage typeCompanyName(String data) {
		
		type(eleCompanyName, data);
		return this;
	}
	
	
     /* public CreateLeadPage getCompanyName(String data) {
		
		getText(eleCompanyName);
		return this;
	}*/
	
	
	
	
	@FindBy(id="createLeadForm_firstName")
	WebElement eleFirstName;
	@And("I entered the firstnam as(.*)")
	public CreateLeadPage typeFirstName	(String data) {
		//WebElement eleFirstName = locateElement("id", "createLeadForm_firstName");
		type(eleFirstName, data);
		return this;
	}
	
	@FindBy(id="createLeadForm_lastName")
	WebElement eleLastName;
	
	@And("I entered the lastname as(.*)")
	public CreateLeadPage typeLastName	(String data) {
		//WebElement eleLastName = locateElement("id", "createLeadForm_lastName");
		type(eleLastName, data);
		return this;
	}
	//@FindBy(xpath="//input[@class='decorativeSubmit']")
	@FindBy(className="smallSubmit")
	WebElement eleCreateLead;
	
	@Then("I clicked on Saveicon")
	public CreateLeadPage clickCreateLead() {
		//WebElement eleCreateLead= locateElement("class", "smallSubmit");
		click(eleCreateLead);
		return this; 
	}
	
}









