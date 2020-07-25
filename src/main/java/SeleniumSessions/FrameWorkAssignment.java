package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class FrameWorkAssignment {

	static WebDriver driver; 
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverFactory wf=new WebDriverFactory() ; 
		
		
		wf.launchBrowser("chrome");
		
		wf.launchUrl("https://classic.freecrm.com/");
		
		
		By login=By.xpath("//input[@value='Login']");
		
		
		Thread.sleep(3000);
		
		driver.switchTo().frame("mainpanel");
	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		
		
	}

}
