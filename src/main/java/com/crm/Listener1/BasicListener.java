package com.crm.Listener1;
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import Baseclass.DwsBaseListener;

public class BasicListener extends DwsBaseListener implements ITestListener{
	
	
		ExtentReports report;
		ExtentSparkReporter spark;
		ExtentTest test;
	public void onTestStart(ITestResult result) {
		String name = result.getMethod().getMethodName();
		Reporter.log(name, true);
	}

	public void onTestSuccess(ITestResult result) {
		Reporter.log("onTestSuccess", true);
	}

	public void onTestFailure(ITestResult result) {
       LocalDateTime Date=LocalDateTime.now();
       String time= Date.toString().replace(":", "-");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File From  = ts.getScreenshotAs(OutputType.FILE);
		File to = new File("./ScreenShot/DwsPage"+time+".png");
		try {
		FileHandler.copy(From,to);
		}catch (IOException e) {
			e.printStackTrace();
		}		
	}
	public void onTestSkipped(ITestResult result) {
		Reporter.log("onTestSkipped", true);
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		Reporter.log("onStart", true);
	}

	public void onFinish(ITestContext context) {
		Reporter.log("onFinish", true);
	}
}