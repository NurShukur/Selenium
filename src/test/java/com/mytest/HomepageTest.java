package com.mytest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomepageTest extends BaseTest {


	@Test 
	
	public void getGoogleTitleTest ()  {
	
		Assert.assertEquals(driver.getTitle(), "CRMPRO");
		
	}
	
	
}

