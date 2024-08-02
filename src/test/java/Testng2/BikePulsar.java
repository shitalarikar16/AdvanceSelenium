package Testng2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BikePulsar {
	@Test(groups="smoke")
	public void pulsar() throws InterruptedException {	
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bajajauto.com/bikes/pulsar");
		Thread.sleep(1000);
		driver.close();
		}

}
