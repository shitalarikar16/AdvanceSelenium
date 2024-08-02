package ExtentReport;



import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class SampleReport {
	
	@Test
	public void BasicReport() {
		
		ExtentSparkReporter spark=new ExtentSparkReporter("./Reports/sampleReport.html");
		spark.config().setDocumentTitle("SampleReport");
		spark.config().setReportName("Shital");
		spark.config().setTheme(Theme.DARK);
		ExtentReports report=new ExtentReports();
		report.setSystemInfo("Os","Windows-11");
		report.setSystemInfo("Browser","Chrome-100");
		report.attachReporter(spark);
		ExtentTest test=report.createTest("BasicReport");
		test.log(Status.INFO,"report is successfully created");
		report.flush();
	}

}
