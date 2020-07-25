package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Orange {
	
	static WebDriver  driver; 

	public static void main(String[] args) {
		
	
		
		
//		By employee=By.id("Form_submitForm_NoOfEmployees");
//		By country=By.id("month");
//		By industry=By.id("Form_submitForm_Industry");
//		
//		doSelectValuesByVisibleText(employee, "11-15");
//		doSelectValuesByVisibleText(country, "");
		
		driver.findElement(By.id("u_0_b")).click();
		

//		WebElement day=driver.findElement(By.id("day"));
//		Select select =new Select(day);  // create object
//	
//		select.selectByVisibleText("10");
//		select.selectByIndex(5);
//		select.selectByValue("17");
//		
//		WebElement month=driver.findElement(By.id("month"));
//		Select select1 =new Select(month); 
//		select1.selectByVisibleText("Nov");
		
		
	
		
	}

	
	
	public static void doSelectValuesByVisibleText(By locator, String value) {
		
		Select select= new Select (getElement(locator)); 
		
		select.selectByVisibleText(value);
	}
	
	
public static void doSelectValuesByIndex(By locator, int index) {
		
		Select select= new Select (getElement(locator)); 
		
		select.selectByIndex(index);
	}

public static void doSelectValuesByValue(By locator, String value) {
	
	Select select= new Select (getElement(locator)); 
	
	select.selectByValue(value);
}



	public static WebElement getElement (By locator) {
		
		WebElement element=driver.findElement(locator);
		
		return element; 
	}
}
