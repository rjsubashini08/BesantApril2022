package locatorsDemonstration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTitlePage {
	static WebDriver driver;
	@Test
	public void Validate() throws InterruptedException
	{
		// TODO Auto-generated method stub
		//find locate act(sendKeys,Click,getText)
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\SeleniumMarchBatchProj\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://example.testproject.io/web/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='name']")).sendKeys("Raghav");
		driver.findElement(By.id("password")).sendKeys("12345");
		driver.findElement(By.id("login")).click();
		Thread.sleep(3000);
		
		String titleVal=driver.getTitle();
		System.out.println(titleVal);
		Assert.assertEquals(titleVal, "TestProject Demo");
		driver.close();
	}
	

}
