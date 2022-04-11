package VerificationUsingTestNG_Assert;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEquals_NotEqualStudy
{
  @Test
  public void f()
  {
	  String a="pune";
	  String b=" ";
	  String c="pune2";
	  
	  
	 // Assert.assertEquals(a, b,"a is not equal to b");
	  
	  Assert.assertNotEquals(a, b,"a is equal to b");
	  
  }
}
