package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class LogInPage extends ProjectMethods{
	public LogInPage() {
		PageFactory.initElements(driver, this);
		}
	
	
	
	
	@FindBy(id="username")
	 WebElement eleUserName;
	@When("I enter the username as(.*)")
	public LogInPage typeUserName(String data) {
		//WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, data);
		return this;
	}
	@FindBy(id="password")
	 WebElement elePassword;
	@And("enter the password as(.*)")
	public LogInPage typePassword(String data) {
		//WebElement elePassword = locateElement("id", "password");
		type(elePassword, data);
		return this;
	}
	/*@FindBy(className="decorativeSubmit")
	 WebElement eleLogin;*/
	@And("clicked the loginbutton")
	public HomePage clickLogin() {
		WebElement eleLogin = locateElement("class", "decorativeSubmit");
		click(eleLogin);
		return new HomePage();
	}
	
}









