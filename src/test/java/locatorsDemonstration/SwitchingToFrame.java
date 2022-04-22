package locatorsDemonstration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SwitchingToFrame {
static WebDriver driver;
	
	@BeforeTest
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\SeleniumMarchBatchProj\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		
	}
	
	@Test
	public void validateForms() throws InterruptedException
	{
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.switchTo().frame("frm1");
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//select[@id='course']")));
		Thread.sleep(5000);
		driver.findElement(By.xpath("//select[@id='course']")).click();
		Thread.sleep(2000);
		}
	
	
	@AfterTest
	public void closeApplication()
	{
		
		driver.close();
	}


}