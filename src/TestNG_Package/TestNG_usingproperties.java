package TestNG_Package;

import java.io.IOException;
import java.time.Duration;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.Base_class;
import KiteUsingPOMandDDF.Kite_HomePage;
import POMpackage.Home_Page;
import POMpackage.Kite_LoginPage;
import POMpackage.Kite_PinPage;
import UtilityPackage.UtilityClass_usingPropertiesFile;

public class TestNG_usingproperties extends Base_class
{
	Kite_LoginPage login;
	Kite_PinPage pin;
	Home_Page home;
	
  @BeforeClass
  public void BrowserLaunching() throws IOException 
  {
	  Reporter.log("launching browser", true);
	 LaunchBrowser();
	 Reporter.log("launched successfully", true);
	 login=new Kite_LoginPage(driver);
	 pin=new Kite_PinPage(driver);
	 home=new Home_Page(driver);
	  
  }
  
  @BeforeMethod
  public void enterLogin() throws IOException
  {
	  Reporter.log("entering UID", true);
	  login.enterUID(UtilityClass_usingPropertiesFile.readDataFromPropertiesFile("UN"));
	  Reporter.log("entered UID", true);
	  login.enterpwd(UtilityClass_usingPropertiesFile.readDataFromPropertiesFile("PWD"));
	  Reporter.log("entered PWD", true);
	  login.clickOnLogin();
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
	  pin.enterPin(UtilityClass_usingPropertiesFile.readDataFromPropertiesFile("PIN"));
	  
	  
	  pin.clickOnContinue();
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
  
  }
  
  @Test
  public void validateUserID() throws IOException
  {
	  Reporter.log("validating please wait");
	    home.ValidateUserID(UtilityClass_usingPropertiesFile.readDataFromPropertiesFile("UN"));
	    Reporter.log("succefully validated");
	    
	    
  }
  
  @AfterMethod
  public void enterLogoutbutton() throws InterruptedException
  {
	  home.ClickLogoutButton();
	  Reporter.log("successfully logged out", true);
  }
  
  @AfterClass
  public void closingBrowser()
  {
	 CloseBrowser(); 
	 Reporter.log("closing browser succefully", true);
	  
  }
  
  
  
}
