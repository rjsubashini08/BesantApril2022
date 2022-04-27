package testNGDemo;

import org.testng.annotations.Test;

public class PriortyEnableTest {
  @Test(priority=3)
  public void testGoogle() {
	  System.out.println("Hello Im in Google Method");
  }
  
  @Test(priority=1,enabled=false)
  public void testTwitter() {
	  System.out.println("Hello Im in Twitter Method");
  }
  
  @Test(priority=2)
  public void testFacebook() {
	  
	  System.out.println("Hello Im in Facebook Method");
  }
  
}
