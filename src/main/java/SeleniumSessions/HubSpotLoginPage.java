package SeleniumSessions;

import java.sql.Driver;

import org.openqa.selenium.By;

public class HubSpotLoginPage {

	public static  void main(String[] args) throws InterruptedException {

		String browser = "chrome";
		String url = "https://app.hubspot.com/login";
		By accountName=(By.className("user-info-email"));

		WebDriverFactory wf = new WebDriverFactory();

		wf.launchBrowser(browser);
		wf.launchUrl(url);

		Thread.sleep(5000);

		String title = wf.getPageTitle();
		System.out.println("page title is: " + title);

		if (title.equals("HubSpot Login")) {
			System.out.println("correct title");
		} else {
			System.out.println("in-correct title");
		}
		
		By emailId =By.id("username");
		By password =By.id("password");
		By loginbtn =By.id("loginBtn");
		
		wf.driver.findElement(emailId).sendKeys("shukurlunurlan@gmail.com");
		wf.driver.findElement(password).sendKeys("Test@7221213");
		wf.driver.findElement(loginbtn).click();
		
		Thread.sleep(4000);
		
		wf.driver.findElement(By.xpath("//a[@id=\"account-menu\"]")).click();
			
			if (wf.driver.findElement(accountName).isDisplayed())
			
			wf.driver.findElement(accountName).getText();
			
		
			
			
		
	
		
		Thread.sleep(3000);

		wf.closeBrowser();

	}

}