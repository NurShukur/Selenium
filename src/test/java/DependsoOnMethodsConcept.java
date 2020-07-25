import org.testng.annotations.Test;

public class DependsoOnMethodsConcept {
	



	@Test
	
	public void loginTest() {
		
		
		System.out.println("login test");
		
	}
	
	
	@Test (dependsOnMethods="loginTest")
	
	public void homeTest () {
		
		
		System.out.println("hom e test");
		
	}
	
	@Test (dependsOnMethods="loginTest")
	
	public void dealsTest() {
		
		System.out.println("deal test");
		
	}
}
