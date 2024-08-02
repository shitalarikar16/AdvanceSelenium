package Listener1;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ReportWithMultipleTestCase implements ITestListener {
	ExtentReports report;
	ExtentSparkReporter spark;
	ExtentTest test;
	public void onTestStart(ITestResult result) {
		String t_name=result.getMethod().getMethodName();
		Reporter.log(t_name+" is excuted");
		test=report.createTest(t_name);
	}

	public void onTestSuccess(ITestResult result) {
		String t_name=result.getMethod().getMethodName();
		test.log(Status.PASS,t_name+"is success");
	}

	public void onTestFailure(ITestResult result) {
		String t_name=result.getMethod().getMethodName();
		test.log(Status.FAIL,t_name+"is FAILURE");
	}

	public void onTestSkipped(ITestResult result) {
		String t_name=result.getMethod().getMethodName();
		test.log(Status.SKIP,t_name+"is skipped");
	}

	public void onStart(ITestContext context) {
		spark.config().setDocumentTitle("SampleReport");
		spark.config().setReportName("Shital");
		spark.config().setTheme(Theme.DARK);
		ExtentReports report=new ExtentReports();
		report.setSystemInfo("Os","Windows-11");
		report.setSystemInfo("Browser","Chrome-100");
		report.attachReporter(spark);
		
	}

	public void onFinish(ITestContext context) {
		report.flush();
	}

}
