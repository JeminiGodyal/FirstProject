package TestNG_Keywords;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DependsOnMethods
{
  @Test(dependsOnMethods = {"rock"})
  public void f() 
  {
	  
	  Reporter.log("Test case running", true);
  }
  
  @Test(timeOut = 1000)
  public void rock() throws InterruptedException
  {	Thread.sleep(4000);
	  Reporter.log("its rocking", true);
  }
  
  @AfterClass
  public void star()
  {
	  Reporter.log("look in to the sky", true);
  }
  
  @Test(invocationCount = 3)
  public void group()
  {
	  Reporter.log("team work", true);
  }
}
