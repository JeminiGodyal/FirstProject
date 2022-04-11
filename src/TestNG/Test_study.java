package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test_study 
{
  @Test
  public void method1()
  {
	  System.out.println("Hi iam testNG");
  }
  
  @Test
  public void method2() 
  {
	  Reporter.log("Hi iam method2");//used to print on the console and shows the running result also;
	 // System.out.println("Hi iam testNG"); hides the content in the console
  }
  
}
