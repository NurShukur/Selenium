package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InternetHerookup {

	
	
	WebDriver driver; 
	
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver (); 
		
		
		
		  // Add Elements : driver.get("https://the-internet.herokuapp.com/");
		  
//		  driver.findElement(By.linkText("Add/Remove Elements")).click();;
//		  
//		  driver.findElement(By.xpath("//*[@id=\"content\"]/div/button")).click();
//		  
//		  driver.findElement(By.className("added-manually")).click();;
		
		// Basic Auth: 
		
//		driver.get("https://the-internet.herokuapp.com/");
//		
//		driver.findElement(By.linkText("Basic Auth")).click();
//		
//		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		//Challenging DOM
		
//		driver.get("https://the-internet.herokuapp.com/challenging_dom");
//		
//		driver.findElement(By.className("button")).click();
//		driver.findElement(By.className("alert")).click();
//		driver.findElement(By.className("success")).click();
		
		
		
		Thread.sleep(3000);
		
		
	
		
		
		
		
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		

	}
	
	public static void doSendkeys(WebElement locator,String value) {
		
		locator.sendKeys(value);
		
	}

}
