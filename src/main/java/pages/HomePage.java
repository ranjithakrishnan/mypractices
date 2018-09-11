package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;
import wdMethods.ProjectMethods;

public class HomePage extends ProjectMethods{
	public HomePage() {
		PageFactory.initElements(driver, this);
		}

	@FindBy(linkText="CRM/SFA")
	WebElement eleCRMSFA;
	@Then("the page moves to homepage")
	public MyHomePage clickCRMSFA() {
		//WebElement eleCRMSFA = locateElement("linktext", "CRM/SFA");
		click(eleCRMSFA);
		return new MyHomePage();
	}
	
}









