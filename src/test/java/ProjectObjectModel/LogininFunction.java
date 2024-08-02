package ProjectObjectModel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pom.DwsLogin;

public class LogininFunction {

	@Test
	
	public void main() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		DwsLogin ref=new DwsLogin(driver);
		//
//		ref.login_link=driver.findElement(By.id(""));
//		Thread.sleep(2000);
//		ref.login_link.click();
//		ref.username.sendKeys("admin01@gmail.com");
//		ref.password.sendKeys("admin01");
//		Thread.sleep(2000);
//		ref.login_button.click();
		ref.login_link();
		ref.username("admin01@gmail.com");
		ref.password("admin01");
		ref.login_button();
		
		
	}
	
}
