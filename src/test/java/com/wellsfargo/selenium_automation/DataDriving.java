package com.wellsfargo.selenium_automation;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataDriving {
	
  @Test(dataProvider = "getIndeedJobSearchParams")
  public void f(String keyword, String location) 
  {
	  
  }

  @DataProvider
  public Object[][] getIndeedJobSearchParams() 
  {
    return new Object[][] 
    		{
		      new Object[] { "Selenium", "London" },
		      new Object[] { "Cucumber", "Glasgow" },
		      new Object[] { "Testing", "Manchester" },
    		};
  }
  
}
