package VerificationUsingTestNG_Assert;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NullStudy_NotNullStudy {
  @Test
  public void f()
  {
	  String f=null;
	  String h="sun";
	  
	 Assert.assertNull(h,"h is not null value");
	 //Assert.assertNotNull(f, "f has null value");
	  
	  
	  
	  
	  
  }
}
