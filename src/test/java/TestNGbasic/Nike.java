package TestNGbasic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Nike {
	@Test(groups="smoke")
	public void nike() throws InterruptedException {	
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.nike.com/in/");
		Thread.sleep(1000);
		driver.close();
		}

}
