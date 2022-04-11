package GroupingTestNGxml;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Grouping2 {
 
 @Test(groups = "regression")
  public void TC6() 
  {
	  Reporter.log("Running TC6", true);
  }
  
  @Test(groups = "regression")
  public void TC7() 
  {
	  Reporter.log("Running TC7 ", true);
	  
  }
  
  @Test(groups = "sanity")
  public void TC8() 
  {
	  Reporter.log("running TC8",true);
  }
  
  @Test(groups = "sanity")
  public void TC4() 
  {
	  Reporter.log("running TC4",true);
  }
  
  @Test
  public void TC10() 
  {
	  Reporter.log("running TC10",true);
  }
}
