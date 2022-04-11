package Soft_Assert;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAssert_study {
  
	SoftAssert soft=new SoftAssert();  //created object of soft assert class
	@Test
  public void f() 
  {
	  String s="dehuroad";
	  String t="lonavala";
	  
	  soft.assertEquals(s, t,"s and t are not equal");
	  soft.assertAll();
	  
	  
	  
  }
}
