package locatorsDemonstration;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActingOnTheForm {
static WebDriver driver;
//https://www.tutorialrepublic.com/html-tutorial/html-forms.php	
public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\SeleniumMarchBatchProj\\Drivers\\chromedriver.exe");
//Launching the browser
driver=new ChromeDriver();
//Maximize the Browser
driver.manage().window().maximize();
//open the Application
driver.get("file:///C:/Users/HP/Downloads/test.html");

Thread.sleep(1000);
//ID ->find locate act
WebElement usernameBox=driver.findElement(By.id("username"));
usernameBox.sendKeys("Rajasubashini R");
Thread.sleep(1000);

WebElement passwordBox=driver.findElement(By.name("userpass"));
passwordBox.sendKeys("Password@123");
Thread.sleep(1000);

//WebElement additionalBox=driver.findElement(By.name("add"));
//additionalBox.sendKeys("HelloAdditional");
//Thread.sleep(5000);

//Id and Class Locators
WebElement additionalClassBox=driver.findElement(By.className("classname"));
additionalClassBox.sendKeys("HelloAdditional Class Locators");
Thread.sleep(1000);
//
//WebElement additionalIdBox=driver.findElement(By.id("id_xyz"));
//additionalIdBox.sendKeys("HelloAdditional Id Locators");
//Thread.sleep(5000);

//Link Text
WebElement linkTextWE=driver.findElement(By.linkText("User Login"));
linkTextWE.click();
Thread.sleep(1000);
driver.navigate().back();

//PartialLink Text
WebElement plinkTextWE=driver.findElement(By.partialLinkText("Inbox"));
plinkTextWE.click();
Thread.sleep(1000);
driver.navigate().back();


WebElement submitBtn=driver.findElement(By.xpath("//input[@value='Submit']"));
submitBtn.click();
Thread.sleep(1000);

//Tag Name


List<WebElement> allRowsImg=driver.findElements(By.tagName("img"));
int noOfRowsImg=allRowsImg.size();
System.out.println(noOfRowsImg);
for(int i=0;i<noOfRowsImg;i++)
{
	System.out.println(allRowsImg.get(i));
}

List<WebElement> allRows=driver.findElements(By.tagName("tr"));
int noOfRows=allRows.size();
System.out.println(noOfRows);

driver.close();
	}

}
