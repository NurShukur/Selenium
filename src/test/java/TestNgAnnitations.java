import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAnnitations {

	
	// BS - before Suite
	// BT  - before Test
	// BC before class
	
	
	// BM - before Method 

	
	@BeforeSuite
	
	
	public void beforeSuite () {
		
		System.out.println(" beforeSUite - create user in DateBase");
		
	
	}
	@BeforeTest
	
	 public void uploadUserDetails() {
		
	System.out.println("beforeTest - uploadUserDetails");	
		
	}
	
	@BeforeClass 
	
	public void beforeclass () {
		
		System.out.println("beforeClass - launch broweser and url");
	}
	
	@BeforeMethod
	
public void beforeMethod () {
		
		System.out.println("beforeMethod - login");
	}
	
	
	@Test (priority = 1)
	
	public void verifyUserNameTest () {
			
			System.out.println("verifyUserNameTest");
			int i=9/0; 
		}
	
	
	@Test (priority = 2)
	
	public void verifyUserAccountNameTest () {
			
			System.out.println("verifyUserAccountNameTest");
		}
	
	@AfterMethod
	
	public void logout () {
		
		System.out.println("afterMethod-- logout");
	}
	
	
	@AfterClass 
	
	public void afterClass () {
		
		System.out.println("afterClass -- close the browser");
	}
	
	
	
	@AfterTest
	
	public void afterTest () {
		
		System.out.println("afterClass -- delete user from DB");
	}
	
//	beforeSUite - create user in DateBase
//	beforeTest - uploadUserDetails
//	beforeClass - launch broweser and url
	
	
//	beforeMethod - login
//	verifyUserNameTest
//	afterMethod-- logout
	
//	beforeMethod - login
//	verifyUserAccountNameTest
//	afterMethod-- logout
	
//	afterClass -- close the browser
//	afterClass -- delete user from DB
//	PASSED: verifyUserNameTest
//	PASSED: verifyUserAccountNameTest
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
