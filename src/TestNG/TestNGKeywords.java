package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGKeywords
{
  @Test(timeOut = 1000)
  public void a() throws InterruptedException 
  {    Thread.sleep(3000);
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
  @Test(dependsOnMethods = {"a"})
  public void methodg() 
  {
	Reporter.log("Running d method4",true);
  }
}
