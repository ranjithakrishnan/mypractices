package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class FindLeadsPage extends ProjectMethods {

	
	public FindLeadsPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//span[text()='Phone']")
	private WebElement phonenu;
	public FindLeadsPage clickPhone() {
		
		click(phonenu);
		return this;
		
		
	}
	
	@FindBy(name="phoneNumber")
	private WebElement elephno;
	public FindLeadsPage typephonenum(String data) {
	
		type(elephno, data);
		return this;
		
	}
	@FindBy(xpath="//button[text()='Find Leads']")
	 WebElement elefindlds1;
	public FindLeadsPage clickfindleads() {
		//WebElement elefindlds = locateElement("xpath", "//button[text()='Find Leads']");
		click(elefindlds1);
		return this;
	}
	
	
	
	
	@FindBy(xpath="//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
	 WebElement elefirstlead1;
	public ViewLeadPage clickfirstlead() throws InterruptedException {	
		Thread.sleep(3000);
		//WebElement elefirstlead = locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		click(elefirstlead1);
		
		
		return new ViewLeadPage();
		
	}
	
	@FindBy(xpath="//span[text()='Email']")
	 WebElement eleemail;
  public FindLeadsPage cliclemail() {
	//  WebElement eleemail = locateElement("xpath", "//span[text()='Email']");
	  click(eleemail);
	  return this;
  }
  @FindBy(className="emailAddress")
	 WebElement emailaddress;
 public FindLeadsPage typeaddress(String data) {
	 //WebElement emailaddress = locateElement("name", "emailAddress");
	 type(emailaddress, data);
	 return this;
 }
 @FindBy(xpath="//button[text()='Find Leads']")
 WebElement elefindleads1;
public FindLeadsPage clickfindleads1() throws InterruptedException {
	Thread.sleep(3000);
	//WebElement elefindleads1 = locateElement("xpath", "//button[text()='Find Leads']");
	click(elefindleads1);
	return this;
}
@FindBy(xpath="//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
WebElement elefirstlead;
 public ViewLeadPage clickfirstlead1() throws InterruptedException {
	 Thread.sleep(3000);
	 //WebElement elefirstlead = locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
    click(elefirstlead);
    
    return new ViewLeadPage();
 }
 
 @FindBy(className="id")
 WebElement eleleadid2;
 public FindLeadsPage typeleadid(String data) {
	 WebElement eleleadid = locateElement("name", "id");
	 type(eleleadid2, data);
	 return this;
 }
 @FindBy(xpath="/button[text()='Find Leads']")
 WebElement elefindleads;
 public FindLeadsPage clickfleads() {
	 WebElement elefindleads = locateElement("xpath", "//button[text()='Find Leads']");
	 click(elefindleads);
	 return this;
 }
 
 
 
 
 
 
 @FindBy(className="firstName")
 WebElement elefirstname;
    public FindLeadsPage typefirstname(String data) throws InterruptedException {
    	
    	Thread.sleep(3000);
    	//WebElement elefirstname = locateElement("name", "firstName");
    	type(elefirstname, data);
    	return this;
    }
    @FindBy(xpath="xpath\", \"//button[text()='Find Leads']")
	 WebElement elefindlds;
    public FindLeadsPage clickfindlead() {
    	//WebElement elefindlds = locateElement("xpath", "//button[text()='Find Leads']");
		click(elefindlds);
		return this;
    }
    
    @FindBy(xpath="//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a\\\"")
	 WebElement elemergefirstlead;
    public MergeLeadPage clickmergefirstlead() {
    	switchToWindow(0);
    	WebElement elemergefirstlead = locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a\"");
    	clickWithNoSnap(elemergefirstlead);
    	return new MergeLeadPage();
    	
    } 
    // 2img  
   /* public FindLeadsPage typefirstname1(String data) {
    	WebElement elefirstname = locateElement("name", "firstName");
    	type(elefirstname, data);
    	return this;
    }*/
 
 
    @FindBy(xpath="//input[@name='id']")
	 WebElement eleleadid;
   public FindLeadsPage leadid(String data) {
	   //WebElement eleleadid = locateElement("xpath", "//input[@name='id']");
	   type(eleleadid, data);
	   return this;
   }
   @FindBy(xpath="//button[text()='Find Leads']")
	 WebElement elelastfindlead;
   public FindLeadsPage clicklastfindleads() {
	  //WebElement elelastfindlead = locateElement("xpath", "//button[text()='Find Leads']");
	   click(elelastfindlead);
	   return this;
   }
 
}
