package locatorsDemonstration;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActingOnTheForm {
static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sony\\eclipse-workspace\\BesantArtifactFeb\\Drivers\\chromedriver.exe");
driver=new ChromeDriver();

driver.manage().window().maximize();

driver.get("file:///C:/Users/Sony/Downloads/FormsTest.html");

Thread.sleep(5000);
/*
WebElement usernameBox=driver.findElement(By.name("username"));
usernameBox.sendKeys("Rajasubashini R");
Thread.sleep(5000);

WebElement passwordBox=driver.findElement(By.name("userpass"));
passwordBox.sendKeys("Password@123");
Thread.sleep(5000);

WebElement additionalBox=driver.findElement(By.name("add"));
additionalBox.sendKeys("HelloAdditional");
Thread.sleep(5000);

//Id and Class Locators
WebElement additionalClassBox=driver.findElement(By.className("xyz_gi"));
additionalClassBox.sendKeys("HelloAdditional Class Locators");
Thread.sleep(5000);

WebElement additionalIdBox=driver.findElement(By.id("id_xyz"));
additionalIdBox.sendKeys("HelloAdditional Id Locators");
Thread.sleep(5000);

//Link Text
WebElement linkTextWE=driver.findElement(By.linkText("User Login"));
linkTextWE.click();
Thread.sleep(2000);
driver.navigate().back();

//PartialLink Text
WebElement plinkTextWE=driver.findElement(By.partialLinkText("Partial"));
plinkTextWE.click();
Thread.sleep(3000);
driver.navigate().back();


WebElement submitBtn=driver.findElement(By.xpath("//input[@value='Submit']"));
submitBtn.click();
Thread.sleep(3000);*/

//Tag Name

List<WebElement> allRows=driver.findElements(By.tagName("tr"));
int noOfRows=allRows.size();
System.out.println(noOfRows);

List<WebElement> allRowsImg=driver.findElements(By.tagName("img"));
int noOfRowsImg=allRowsImg.size();
System.out.println(noOfRowsImg);

driver.close();
	}

}
