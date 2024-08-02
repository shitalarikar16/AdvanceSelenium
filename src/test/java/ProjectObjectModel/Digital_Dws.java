package ProjectObjectModel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pom.DwsDigitalDownload;

public class Digital_Dws {

	@Test
	public void main()
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demowebshop.tricentis.com/");
	
	DwsDigitalDownload ref=new DwsDigitalDownload(driver);
	ref.digital_link();
	ref.sort();
	ref.display();
	ref.viewas();
	ref.album();
	ref.music1();
	ref.music2();
	driver.close();
}
}
