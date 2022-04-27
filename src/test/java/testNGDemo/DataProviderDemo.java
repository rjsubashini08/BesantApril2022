package testNGDemo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
  @Test(dataProvider="loginData")
  public void testLogin(String userName,String password) {
	  System.out.println("UserName: "+userName+" Password: "+password);
  }
  
  @DataProvider
  public Object[][] loginData()
  {
	  Object[][] data=
		  {
				  {"aswani","aswani"},
				  {"Swetha","Swetha"},
				  {"Manish","Manish"}
		  };
	  return data;
  }
  
}
