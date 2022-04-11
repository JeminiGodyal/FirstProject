package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class IncludeExclude_Test 
{
	
	//If i have 100 test cases and i want only 30 should run
	//Like that from a,b,c,d i want only a and d so i will include them
	@Test
	  public void a() 
	  {
		Reporter.log("Running a method1",true);
	  }
	  
	  @Test(priority =-4)
	  public void b() 
	  {
		Reporter.log("Running b method2",true);
	  }
	 
	  @Test(priority =-1)
	  public void c() 
	  {
		Reporter.log("Running c method3",true);
	  }
	 
	  @Test(priority =2,invocationCount = 2)
	  public void d() 
	  {
		Reporter.log("Running d method4",true);
	  }



}
