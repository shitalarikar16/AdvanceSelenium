package TestNGbasic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Redtap {
@Test(groups="regression")
		
		public void redtap() throws InterruptedException {	
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://evergreen.com/bin-listings/redtap-com/");
			Thread.sleep(1000);
			driver.close();
			
		
	}

}
