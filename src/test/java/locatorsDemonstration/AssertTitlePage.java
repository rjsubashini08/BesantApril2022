package seleniumDemonstration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTitlePage {
	static WebDriver driver;
	@Test
	public void Validate()
	{
		// TODO Auto-generated method stub
		//find locate act(sendKeys,Click,getText)
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sony\\eclipse-workspace\\SeleniumDemo\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://example.testproject.io/web/");
		driver.findElement(By.xpath("//*[@id='name']")).sendKeys("Raghav");
		driver.findElement(By.id("password")).sendKeys("12345");
		driver.findElement(By.id("login")).click();
		
		String titleVal=driver.getTitle();
		System.out.println(titleVal);
		Assert.assertEquals(titleVal, "TestProject Demo");
		driver.close();
	}
	

}
