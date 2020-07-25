package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRM {
	
	static WebDriver driver; 

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver (); // launch browser
		
		doNurimize();
		driver.navigate().to("https://www.orangehrm.com/orangehrm-30-day-trial/"); 
		

		
			
			By domain = By.id("Form_submitForm_subdomain"); 
			By firstName= By.name("FirstName");
			By lastName=By.name("LastName");
			By email =By.id("Form_submitForm_Email");
			By jobTitle = By.name("JobTitle");
			By noEmployees=By.className("NoOfEmployees"); 
			By company=By.name("CompanyName");
			By industry=By.cssSelector("#Form_submitForm_Industry");
			By phoneNumber=By.cssSelector("#Form_submitForm_Contact");
			By country= By.id("Form_submitForm_Country");
			By dummydata=By.id("Form_submitForm_SetDummyData");
			By submit =By.xpath("//*[@id=\'Form_submitForm_action_request\']");
			
			
			doSendKeys(domain, "nurlannn");
			doSendKeys(firstName, "Nurlan");
			doSendKeys(lastName, "Shukurlu");
			doSendKeys(email, "Shukurlunurlan@gmail.com");
			doSendKeys(jobTitle, "SDET");
			doSendKeys(company, "NAveen Automation Lab");
			doSendKeys(phoneNumber, "7221213");
			driver.findElement(By.id("Form_submitForm_SetDummyData")).click();
			doClick(submit);
			
			
			
			
			
			
			
			
			
			
			
			
			Thread.sleep(2000);
			
			driver.quit();
			
	}
	

	/**
	 * This is used to get element by locator
	 * @return element
	 * @param locator
	 */

public static WebElement getElement(By locator){
	WebElement element = driver.findElement(locator);
	return element;
}

/**
 * This is used to type value on element
 * @return void
 * @param locator,value
 */
public static void doSendKeys(By locator, String value){
	getElement(locator).sendKeys(value);
}


public static void doNurimize() {
	
	driver.manage().window().maximize();
	
}

public static void doClick(By locator) {
	
	getElement(locator).click();
}
	
		
}
