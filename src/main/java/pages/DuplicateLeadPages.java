package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class DuplicateLeadPages extends ProjectMethods{
	
	
	
	public DuplicateLeadPages() {
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(className="smallSubmit")
	//@FindBy(how=How.CLASS_NAME,using="smallSubmit")
	WebElement elesubmit;
    public DuplicateLeadPages clickcreatelead(String data) {
        verifyTitle(data); 
    	//WebElement elesubmit = locateElement("class", "smallSubmit");
    	click(elesubmit);
    	return this;
    }
}
