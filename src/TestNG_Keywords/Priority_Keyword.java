package TestNG_Keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority_Keyword
{
	@Test(timeOut = 1000)
	  public void f() throws InterruptedException 
	  {	  Thread.sleep(2000);
		  Reporter.log("Running a method1",true);
		  
	  }
	  
	  @Test(enabled = false)
	  public void j() 
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
