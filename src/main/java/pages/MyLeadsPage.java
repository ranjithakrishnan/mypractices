package pages;



	import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

	public class MyLeadsPage extends ProjectMethods{
		public MyLeadsPage() {
			PageFactory.initElements(driver, this);
			}

		@FindBy(linkText="Create Lead")
        WebElement eleCreateLead;
		@When("am clicking on ctreatelead")
		public CreateLeadPage clickCreateLead() {
			//WebElement eleCreateLead = locateElement("linktext", "Create Lead");
			click(eleCreateLead);
			return new CreateLeadPage();
		}
		
		@FindBy(linkText="Find Leads")
		 WebElement eleFindLeads;
		public FindLeadsPage clickFindLeads() {
			//WebElement eleFindLeads = locateElement("linktext", "Find Leads");
			click(eleFindLeads);
			return new FindLeadsPage();
		}
		@FindBy(linkText="Merge Leads")
		 WebElement elemerge;
		public MergeLeadPage clickmergeleads() {
			//WebElement elemerge = locateElement("linktext", "Merge Leads");
			click(elemerge);
			return new MergeLeadPage();
		}
	}








	