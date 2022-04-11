package Listeners_study;

import org.testng.annotations.Test;

public class NewTest2 {

	  @Test(priority=-1)
	  public void gm()
	  {
		  System.out.println("this is method gm");
	  }
	  @Test(timeOut = 500)
	  public void em() throws InterruptedException
	  {	Thread.sleep(1000);
		  System.out.println("this is method em");
	  }
	  
	  @Test(dependsOnMethods = "h")
	  public void cm()
	  {
		  System.out.println("this is method cm");
	  }
	  
	  
	  
}
