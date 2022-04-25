package screenshotDemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoScreenShot {
static WebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\SeleniumMarchBatchProj\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();//Launch the Chrome Browser
		//Implicit Wait
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Browser launched");
	driver.manage().window().maximize();//Maximize the chrome browser
	//Open the application
	driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
Thread.sleep(3000);
TakesScreenshot ts=(TakesScreenshot)driver;
File file=ts.getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(file, new File("./Screenshots/screens1HYR.png"));
driver.close();
	}

}