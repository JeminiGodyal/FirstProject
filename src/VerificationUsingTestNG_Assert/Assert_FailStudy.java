package VerificationUsingTestNG_Assert;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_FailStudy {
  @Test
  public void f() 
  {
	  String a="pune";
	  String b="pune ";
	  String c="pune2";
	  
	  
	  Assert.assertEquals(a, b,"a is not equal to b");
	  Assert.fail();
	  
	  Assert.assertNotEquals(a, b,"a is equal to b");
	  
	  
	  
	  
	  
  }
}
