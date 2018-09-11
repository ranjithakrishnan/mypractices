package testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC006_BankBazar {
	
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.bankbazaar.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();                                                        //(//a[text()='Sep 1999'][1])
		WebElement invesment = driver.findElementByXPath("//a[@title='Investments']");
		Actions bb=new Actions(driver);
		bb.moveToElement(invesment).build().perform();
		Thread.sleep(3000);
		driver.findElementByXPath("(//a[text()='Mutual Funds'])[1]").click();
		Thread.sleep(3000);
		driver.findElementByXPath("(//a[text()='Search for Mutual Funds'])[1]").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//div[@class='rangeslider__handle']").click();
		Thread.sleep(3000);
		driver.findElementByXPath("(//a[text()='Sep 1999'])[1]").click();
		Thread.sleep(3000);
		driver.findElementByXPath("(//div[text()='23'])[1]").click();
		WebElement eleverify = driver.findElementByXPath("(//span[text()='23 Sep 1999'])[1]");
		String text = eleverify.getText();
		if(text.contains("1999")) {
			System.out.println("eleverify is  matched");
		}
			 else {
				 System.out.println("eleverify is not matched");
			}
		Thread.sleep(3000);
		driver.findElementByLinkText("Continue").click();
		Thread.sleep(3000);
			driver.findElementByXPath("//input[@name='netAnnualIncome']").sendKeys("10000");
			Thread.sleep(3000);
			driver.findElementByLinkText("Continue").click();
			Thread.sleep(3000);
			driver.findElementByXPath("//span[@class='PrimaryAccount_iconStateBankOfIndia_34Z6M']").click();
			Thread.sleep(3000);
			driver.findElementByXPath("//input[@name='firstName']").sendKeys("ranjitha");
			Thread.sleep(3000);
			driver.findElementByLinkText("View Mutual Funds").click();
			
			List<WebElement> allschemes = driver.findElementsByClassName("js-offer-name");
			System.out.println(allschemes.size());
			for (WebElement eachscheme : allschemes) {
				System.out.println(eachscheme.getText());
				
				}
			
			WebElement listamount = driver.findElementByXPath("//span[@class='js-title']/*[1]");
		
			for (WebElement webElement : allschemes) {
				System.out.println(webElement.toString().replaceAll("\\D", ""));
			}
			
			}
			
				
			}
			
			
			
	
	
	



