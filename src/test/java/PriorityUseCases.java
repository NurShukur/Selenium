import org.testng.annotations.Test;

public class PriorityUseCases {

	// zero and negative we can givce and will execute smaller first
	//non priority  test caseswill be picked first.  ( they will be alphabetical order) 
	
	@Test
	public void test1 () {
		
		System.out.println("test 1");
		
	}
	
	@Test (priority=2)
	public void test2 () {
		
		System.out.println("test 2");
	}
		@Test (priority=3)
		public void test3 () {
			
    System.out.println("test 3");
		}	
	@Test (priority=4)
	public void test4 () {
				
	System.out.println("test 4");
	}			
								
	@Test (priority=1)
public void test5 () {
					
	System.out.println("test 5");
					
	}			
	
}
