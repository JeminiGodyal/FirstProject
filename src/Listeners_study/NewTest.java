package Listeners_study;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listeners_study.Listner_1.class)
public class NewTest
{
  @Test(priority=-1)
  public void f()
  {
	  System.out.println("this is method f");
  }
  @Test(timeOut = 500)
  public void h() throws InterruptedException
  {	Thread.sleep(1000);
	  System.out.println("this is method g");
  }
  
  @Test(dependsOnMethods = "h")
  public void g()
  {
	  System.out.println("this is method h");
  }
  
  
  
  
  
}
