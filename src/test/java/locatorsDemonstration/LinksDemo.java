package locatorsDemonstration;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LinksDemo {
	static WebDriver driver;
	@Test
	public void Validate()
	{
		// TODO Auto-generated method stub
		//find locate act(sendKeys,Click,getText)
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\SeleniumMarchBatchProj\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://example.testproject.io/web/");
		List<WebElement> listLinks=driver.findElements(By.tagName("a"));
		int listLinksSize=listLinks.size();
		System.out.println(listLinksSize);
		for(int i=0;i<listLinksSize;i++)
		{
		System.out.println(listLinks.get(i).toString());
		System.out.println(listLinks.get(i).getAttribute("href").toString());
		}
		
		driver.close();
	}
	

}
