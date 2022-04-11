package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Kitesample_SequenceExecution
{
  @Test
  public void validateUserID()
  {
	  Reporter.log("userID validated TC is passed", true);
	//System.out.println("userID validated TC is passed");  
  }
  
  @BeforeMethod
  public void beforeMethod()
  {
	  Reporter.log("logging in to kite app", true);
	  //System.out.println("logging in to kite app");
  }
  
  @AfterMethod
  public void afterMethod()
  {
	  Reporter.log("Logout from application", true);
	 // System.out.println("Logout from application");
  }
  
  @BeforeClass
  public void beforeClass()
  {
	  Reporter.log("launching the browser", true);
	  //System.out.println("launching the browser");
  }
  
  @AfterClass
  public void afterClass()
  {
	  Reporter.log("closing the browser", true);
	  //System.out.println("closing the browser");
  }
  
  
  
}
