package seleniumdemonstration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OpenGoogleApplicationFirefox {
	
	static WebDriver driver;
	
	@BeforeTest
	public void configureBrowser()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\eclipse-workspace\\SeleniumMarchBatchProj\\Drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
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
