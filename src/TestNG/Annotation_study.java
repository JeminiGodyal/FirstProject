package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation_study
{
  @Test
  public void T1()
  {
  Reporter.log("Test case is running");
  System.out.println("Test case is running");
  }
  
  @AfterMethod
  public void M2()
  {
	  Reporter.log("running after method");
	  System.out.println("running after method");
  }
  
  @BeforeMethod
  public void M1()
  {
	  Reporter.log("running before method");
	  System.out.println("running before method");
  }
  
  @AfterClass
  public void Class1()
  {
	  Reporter.log("running after class");
	  System.out.println("running after class");
  }
  
  
  @BeforeClass
  public void beforeClass()
  {
	  Reporter.log("running before class");
	  System.out.println("running before class");
  }
  
 
}
