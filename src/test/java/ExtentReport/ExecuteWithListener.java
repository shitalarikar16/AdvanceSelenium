package ExtentReport;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Listener1.ReportWithMultipleTestCase.class)
public class ExecuteWithListener {

	@Test
	public void domins()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://pizzaonline.dominos.co.in/");
		Reporter.log("My stomtch is hungry.......",true);
	}
	@Test(timeOut = 1000)
	public void rcb() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.royalchallengers.com/");
		Thread.sleep(20000);
		Reporter.log("rcb hurry for cup.......",true);
	}
	
	@Test(dependsOnMethods = "rcb")
	public void csk()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.chennaisuperkings.com/");
		Reporter.log("csk ........",true);
	}


}
