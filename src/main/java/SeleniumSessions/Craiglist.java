package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Craiglist {

	public static void main(String[] args) throws InterruptedException {
	
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver (); 
		
		
		driver.get("https://sfbay.craigslist.org/");
		driver.findElement(By.linkText("cars+trucks")).click();
		driver.findElement(By.className("postedToday")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("search_distance"));
		driver.findElement(By.name("min_price"));
		driver.findElement(By.name("max_price")).sendKeys("5000");
		Thread.sleep(2000);
		driver.findElement(By.name("auto_make_model"));
		driver.findElement(By.name("min_auto_year"));
		driver.findElement(By.name("max_auto_year"));
		driver.findElement(By.name(""));
		driver.findElement(By.name("max_auto_year"));
		driver.findElement(By.className("searchlink")).click();
		

		
		
		
		
		
		
	}

}
