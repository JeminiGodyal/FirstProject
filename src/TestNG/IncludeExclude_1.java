package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class IncludeExclude_1 
{
  @Test
  public void f() 
  {
	  Reporter.log("TC case is running",true);
  }
  
  @Test
  public void method1()
  {
	  Reporter.log("method 1 is running", true);
  }
  @Test
  public void method2()
  {
	  Reporter.log("method 2 is running",true);
  }
  
  @Test
  public void method3()
  {
	  Reporter.log("method 3 is running",true);
  }
  @Test
  public void method4()
  {
	  Reporter.log("method 4 is running",true);
  }
}
