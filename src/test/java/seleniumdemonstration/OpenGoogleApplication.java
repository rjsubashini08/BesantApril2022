package seleniumdemonstration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OpenGoogleApplication {
	
 WebDriver driver;
	
	@BeforeTest
	public void configureBrowser()
	{
		driver=DriverUtility.GetDrivers("chrome");
		driver.manage().window().maximize();
	}
	
	@Test
	public void OpenGoogleAppChromeBrowser() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.get("http://google.com");
		Thread.sleep(3000);
	}
	
	@AfterTest
	public void closeApll()
	{
		driver.close();
	}

}
