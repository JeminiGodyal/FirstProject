package VerificationUsingTestNG_Assert;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTRUE_study {
  @Test
  public void f() 
  {
	 // boolean Result=true;
	  boolean Result=false;
	  
	  Assert.assertFalse(Result,"result is false");
	  
	  Assert.assertTrue(Result,"result is false");
	  
	  
  }
}
