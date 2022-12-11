package com.Mahakaal.Base;

import java.io.File;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;

import com.Mahakaal.extentReport.Extent;
import com.Mahakaal.extentReport.ExtentManager;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;


public class ConectionSetUp {
	
	            //concetion create
	public void create_PostgreDataBaseConection() {
		
	}
	
	
	
	//conection close
	
	public void closeConection() {
		
	}
	
	
	     //report
	@BeforeMethod
	public  void setUpReport(Method method)
	{

			ExtentReports reports=ExtentManager.getExtentReportsInstance();
			ExtentTest extentTest=reports.createTest(method.getName());	
		    Extent.setTest(extentTest);
	}

//	public static String getScreenhot(WebDriver driver, String screenshotName) throws Exception {
//			String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
//			TakesScreenshot ts = (TakesScreenshot) driver;
//			File source = ts.getScreenshotAs(OutputType.FILE);
//	             //after execution, you could see a folder "FailedTestsScreenshots" under src folder
//			String destination = System.getProperty("user.dir") + "/reports/"+screenshotName+dateName+".png";
//			File finalDestination = new File(destination);
//			FileUtils.copyFile(source, finalDestination);
//			return destination;
//		}

	@AfterMethod
	protected void afterMethod(ITestResult result,Method method)
	{
		
		
		if(result.getStatus()==ITestResult.FAILURE)
		{
			try {
				 
				 
				//String screenshotPath = JavaBase.getScreenhot( result.getName());
				//To add it in the extent report 
				

		        Extent.getTest().log(Status.FAIL,"Test Case Failed is "+result.getName());
		      //  Extent.getTest().fail("Captured Screenshot is below:"+Extent.getTest().addScreenCaptureFromPath(screenshotPath));
		            		 
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		 
		}
		
		else if(result.getStatus()==ITestResult.SKIP)
		{
			Extent.getTest().log(Status.SKIP,"Test Skipped "+result.getThrowable());
			Extent.getTest().log(Status.SKIP, "Test Case Skipped is "+result.getName());
			
		}
		else
		{
			Extent.getTest().log(Status.PASS, result.getName()+  " ->Test Case Passed ");		
		}
	  }


	@AfterSuite
	public  void setUpFlushed()
	{
			ExtentManager.getExtentReportsInstance().flush();
		
	}
		
	
	
	
	
}

