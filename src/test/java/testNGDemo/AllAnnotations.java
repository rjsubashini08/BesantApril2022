package testNGDemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllAnnotations {
  @Test
  public void TestMethod() {
	  System.out.println("I am inside Test");
  }
  
  @Test
  public void TestMethod2() {
	  System.out.println("I am inside Test 2");
  }
  
  @BeforeTest
  public void beforeTestMethod() {
	  System.out.println("I am inside Before Test");
  }
  
  @AfterTest
  public void afterTestMethod() {
	  System.out.println("I am inside after Test");
  }
  
  @BeforeClass
  public void beforeClassMethod() {
	  System.out.println("I am inside Before Class Test");
  }
  
  @AfterClass
  public void afterClassMethod() {
	  System.out.println("I am inside After Class");
	  
  }
	  
	  @BeforeMethod
	  public void beforeTestMethodDemo() {
		  System.out.println("I am inside Before method Test");
	  }
	  
	  @AfterMethod
	  public void afterTestMethodDemo() {
		  System.out.println("I am inside After Method Test");
	  }
		  @BeforeSuite
		  public void beforeSuiteMethod() {
			  System.out.println("I am inside Before Suite Test");
		  }
		  
		  @AfterSuite
		  public void afterSuiteMethod() {
			  System.out.println("I am inside After Suite Test");
}
		  
}
