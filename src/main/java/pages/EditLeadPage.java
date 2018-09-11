package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class EditLeadPage extends ProjectMethods{
	public EditLeadPage() {
		PageFactory.initElements(driver, this);
		}
	
    @FindBy(id="updateLeadForm_companyName")
    WebElement elecomname;
	public EditLeadPage typecompanyname(String data) {
		//WebElement elecomname = locateElement("id", "updateLeadForm_companyName");
		type(elecomname, data);
		return this;
	}
	@FindBy(className="smallSubmit")
    WebElement elesubmit;
	public void clickupdate() {
		//WebElement elesubmit = locateElement("class", "smallSubmit");
		click(elesubmit);
	}
}
