package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_Practise {
	
	static  WebDriver driver; 

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromiumdriver().setup();
		
		driver = new ChromeDriver () ; 
		
		driver.get("https://app.hubspot.com/login/");
		Thread.sleep(6000);
		
		// Creating elements
		By username=By.id("username");
		By password =By.id("password");
		By login =By.id("loginBtn");
		By contacts= By.xpath("//a[@id='nav-primary-contacts-branch' and @data-tracking='click hover']");
		By createAccount =By.xpath("//button[@data-button-use='primary']");
		By create=By.xpath("//span[contains(text(),'Create contact')]");
		
		
//		
//		element.doSendKeys(username, "nurlanstest@gmail.com");
//		element.doSendKeys(password, "Portnov@123");
//		element.doClick(login);
//		
		
		
		Thread.sleep(5000);
		driver.navigate().to("https://app.hubspot.com/contacts/7971239/contacts/list/view/all/");
		
		
//		element.doClick(createAccount);
//		element.doClick(create);
		
		
		Thread.sleep(2000);
		driver.quit();

	}

	

}
