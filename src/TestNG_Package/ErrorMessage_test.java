package TestNG_Package;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.Base_class;
import POMpackage.Home_Page;
import POMpackage.Kite_LoginPage;
import POMpackage.Kite_PinPage;
import UtilityPackage.Utilityclass;

public class ErrorMessage_test extends Base_class
{
	
	Kite_LoginPage login;
	Kite_PinPage pin;
	Home_Page home;
	String pwdErrorMessage;
	String userid;
	
  @BeforeClass
  public void launchingBrowser() 
  {
	 LaunchBrowser("https://kite.zerodha.com");
	 Reporter.log("browser is launching", true);
	 login=new Kite_LoginPage(driver);
	 pin=new Kite_PinPage(driver);
	 home=new Home_Page(driver);
	 
  }
  
  @BeforeMethod
  public void enterUserDetails() throws EncryptedDocumentException, IOException
  {
	  
	  
	  userid = Utilityclass.ReadDataFromExcel("F:\\JEMINI AUTOMATION NOTES\\Excel sheet\\Book1.xlsx","Sheet4", 0, 0);
	  String password = Utilityclass.ReadDataFromExcel("F:\\JEMINI AUTOMATION NOTES\\Excel sheet\\Book1.xlsx","Sheet4", 0, 1);
	  String realPin = Utilityclass.ReadDataFromExcel("F:\\JEMINI AUTOMATION NOTES\\Excel sheet\\Book1.xlsx","Sheet4", 0, 2);
	   pwdErrorMessage = Utilityclass.ReadDataFromExcel("F:\\JEMINI AUTOMATION NOTES\\Excel sheet\\Book1.xlsx","Sheet4", 0, 3);
	  
	  
	  
	  Reporter.log("getting userid",true);
	  login.enterUID(userid);
	  
	  Reporter.log("got userid",true);
	 // login.enterpwd(password);
	  
	  
	  login.clickOnLogin();
//	  pin.enterPin(realPin);
//	  pin.clickOnContinue();
 
  }
  
  @Test
  	public void  ValidateErrorMessagePWD()
  	{
	Assert.assertEquals(login.passwordError(),pwdErrorMessage,"error messages not matching");
	  Reporter.log("Error:"+login.passwordError(), true);
  	}
  	
  
  	@AfterClass
  	public void exitapp()
  	{
  		CloseBrowser();
  	}
  	
  	
  	

}
