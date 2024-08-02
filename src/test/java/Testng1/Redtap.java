package Testng1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redtap {

	

		
		public void redtap() throws InterruptedException {	
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://evergreen.com/bin-listings/redtap-com/");
			Thread.sleep(1000);
			driver.close();
			
		
	}

}
