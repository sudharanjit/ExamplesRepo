package com.wellsfargo.selenium_automation;

import static org.junit.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IndeedTestNGTests {
	public WebDriver driver;
	public String baseUrl;
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:/Users/sanju/Software_Downloads/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		baseUrl = "http://www.indeed.co.uk";
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
	
	@Test(dataProvider = "getIndeedJobSearchParams")
	public void testIndeedJobSearch(String keyword, String location)
	{
//		if(true)
//		{
//			throw new SkipException("Test is skipped in Excel file");
//		}
		driver.get(baseUrl);
		driver.findElement(By.id("what")).sendKeys(keyword);
		driver.findElement(By.id("where")).clear();
		driver.findElement(By.id("where")).sendKeys(location);
		driver.findElement(By.id("fj")).click();
		
		String expectedTitle = keyword + " Jobs, vacancies in "+ location + " | Indeed.co.uk";
		String actualTitle=driver.getTitle();
		
		//assertEquals("ERROR: Job search title is wrong", expectedTitle, actualTitle);
		Assert.assertEquals(actualTitle, expectedTitle, "ERROR: Job search title is wrong");
	}
	
	@Test
	public void testIndeedSiteHomePageLogo()
	{
		driver.get(baseUrl);		
		Assert.assertTrue(driver.findElement(By.xpath("//img[@alt='Indeed job search']")).isDisplayed(), 
				"ERROR: Home page logo is not displayed");
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
