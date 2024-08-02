package Testng2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BikeRoyalEnfield {
	@Test(groups="smoke")
	public void enfield() throws InterruptedException {	
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.royalenfield.com/");
		Thread.sleep(1000);
		driver.close();
		}

}
