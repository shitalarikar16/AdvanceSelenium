package ProjectObjectModel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pom.DwsLogin1;

public class LoginFunction {

	@Test
	public void main() 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		
		DwsLogin1 ref=new DwsLogin1(driver);
		ref.login_link();
		ref.username("admin01@gmail.com");
		ref.password("admin01");
		ref.login_button();
		driver.close();
	}
}
