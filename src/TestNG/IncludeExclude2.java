package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class IncludeExclude2 {
  @Test
  public void f1()
  {
	  Reporter.log("TC f1 is running",true);
  }
  @Test
  public void method5()
  {
	  Reporter.log("method5 is running",true);
  }
  @Test
  public void method6()
  {
	  Reporter.log("method6 is running",true);
  }
  
  
  
}
