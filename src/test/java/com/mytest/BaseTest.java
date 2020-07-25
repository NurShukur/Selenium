package com.mytest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	WebDriver driver; 
	@BeforeTest
	
	public void setup () {
		
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver () ; 
		
		driver.get("https://classic.freecrm.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
	}
	
	
	
	
	@AfterTest
	
	public void tearDown () {
		
		driver.quit();
	}
}


