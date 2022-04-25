package simpleAutomateScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidatePages {
 static WebDriver driver;
 @Test
	public  void validate() {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sony\\eclipse-workspace\\SeleniumDemo\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		String msg=driver.findElement(By.xpath("//table[1]/tbody/tr/td/strong ")).getText();
		Assert.assertEquals(msg,"Sorry, access to NetBanking has been disabled.");
		driver.get("http://google.com");
		WebElement loginBtn=driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
		Assert.assertTrue(loginBtn.isDisplayed());
		
		WebElement SubmitBtn=driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
		Assert.assertFalse(SubmitBtn.isDisplayed());
		
	}

}
