package FailedTestNG.xml;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FailedTesting 
{
	  @Test
	  public void TC1() 
	  {
		  Reporter.log("Running TC1", true);
	  }
	  
	  @Test
	  public void TC2() 
	  {
		  Reporter.log("Running TC2 ", true);
		  
	  }
	  
	  @Test
	  public void TC3() 
	  {
		  Reporter.log("running TC3",true);
	  }
	  
	  @Test
	  public void TC4() 
	  {	
		  Assert.fail();
		  Reporter.log("running TC4",true);
	  }
	  
	  @Test(timeOut = 1000)
	  public void TC5() throws InterruptedException 
	  {
		 // Thread.sleep(1111);
		  Reporter.log("running TC5",true);
	  }
	}


