package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class ViewLeadPage extends ProjectMethods {
	public ViewLeadPage() {
		PageFactory.initElements(driver, this);
		}
	@FindBy(linkText="Edit")
	private WebElement eleedit;
	public EditLeadPage clickedit() {
		WebElement eleedit = locateElement("linktext", "Edit");
		click(eleedit);
		
		return new EditLeadPage();
	}
	
	@FindBy(linkText="Delete")
	private WebElement eledelete;
	public MyLeadsPage clickdelete() {
		//WebElement eledelete = locateElement("linktext", "Delete");
		click(eledelete);
		return new MyLeadsPage();
		
	}
	@FindBy(linkText="Duplicate Lead")
	private WebElement eleduplicate;
	public DuplicateLeadPages clickduplicatelead() {
		//WebElement eleduplicate = locateElement("linktext", "Duplicate Lead");
		click(eleduplicate);
		return new DuplicateLeadPages();
	}
}
