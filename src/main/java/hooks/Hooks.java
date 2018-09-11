package hooks;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import wdMethods.SeMethods;

public class Hooks extends SeMethods{
	@Before
	public void beforeCucumber(Scenario sc) {
		startResult();
		testCaseName = sc.getName();
		testCaseDescription =sc.getId();
		category = "Smoke";
		author= "Babu";
		startTestCase();
		startApp("chrome", "http://leaftaps.com/opentaps/");
		}
	@After
	public void afterScenario(Scenario sc) {
		closeAllBrowsers();
		stopResult();
		
	}








}


