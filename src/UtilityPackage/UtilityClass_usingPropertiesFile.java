package UtilityPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class UtilityClass_usingPropertiesFile 
{		
	
	public static String readDataFromPropertiesFile(String key) throws IOException
	{
	Properties prop=new Properties();
	FileInputStream Myfile=new FileInputStream("C:\\Users\\Win\\eclipse-workspace\\Mock_group\\DDFusingproperties_file.properties");
	prop.load(Myfile);
	return prop.getProperty(key);
	
	
	}
	
	public void CaptureScreenshot(WebDriver driver,int TCID) throws IOException
	{
		RandomString str=new RandomString();
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination=new File("F:\\JEMINI AUTOMATION NOTES\\screenshotSaved\\jemini"+TCID+str+".png");
		FileHandler.copy(source, destination);
		
	}
	
	
}
