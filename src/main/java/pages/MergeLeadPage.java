package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MergeLeadPage extends ProjectMethods{
	public MergeLeadPage() {
		PageFactory.initElements(driver, this);
		}
	
	
	@FindBy(xpath="(//img[@alt='Lookup'])[1]\\\")")
	WebElement elefirstimg;
	public FindLeadsPage clickfirstimg() throws InterruptedException {
		//WebElement elefirstimg = locateElement("c", "(//img[@alt='Lookup'])[1]\")");
		click(elefirstimg);
		switchToWindow(1);
		return new FindLeadsPage();
	}
	
	@FindBy(id="(//img[@alt='Lookup'])[2]\\\")")
	 WebElement clicksecondimg;
    public FindLeadsPage clicksecondimg() {
    	
    	//WebElement elesecondimg = locateElement("xpath", "(//img[@alt='Lookup'])[2]\")");
    	clicksecondimg();
    	return new FindLeadsPage();
    }
    @FindBy(linkText="Merge")
	WebElement elemerge;
    public MergeLeadPage clickmerge() {
    	//WebElement elemerge = locateElement("linktext", "Merge");
    	clickWithNoSnap(elemerge);
    	acceptAlert();
    	return this;
    }
    public FindLeadsPage clickfndleads() {
    	WebElement elefleads = locateElement("linktext", "Find Leads");
    	click(elefleads);
    	return new FindLeadsPage();
    }
}
