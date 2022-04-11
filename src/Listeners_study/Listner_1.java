package Listeners_study;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;


public class Listner_1 implements ITestListener
{
@Override
public void onTestStart(ITestResult result)
{
	ITestListener.super.onTestStart(result);
	Reporter.log("test case started successfully",true);;
}

@Override
	public void onTestSuccess(ITestResult result)
{
		ITestListener.super.onTestSuccess(result);
		Reporter.log("test case is running successfully", true);
	}	

@Override
	public void onTestFailedWithTimeout(ITestResult result) 
{
		ITestListener.super.onTestFailedWithTimeout(result);
		Reporter.log("test failed successfully",true);
}
	
@Override
	public void onTestSkipped(ITestResult result) 
{
		ITestListener.super.onTestSkipped(result);
		Reporter.log("test was skipped",true);
}





	
	
}
