package SeleniumSessions;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowser {
	
	static WebDriver driver;


	public static void main(String[] args) throws InterruptedException {

		String browser = "chrome";
		
		if(browser.equalsIgnoreCase("chrome")){
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		
		else if(browser.equalsIgnoreCase("firefox")){
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
		else if(browser.equalsIgnoreCase("safari")){
			driver = new SafariDriver();
		}
		
		else{
			System.out.println("Please pass the correct browser name... " + browser);
		}
		
		driver.get("https://www.youtube.com/watch?v=t5Tea_mXP6E&t=1s");
		System.out.println(driver.getTitle());
		
		
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}