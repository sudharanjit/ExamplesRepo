package com.wellsfargo.selenium_automation;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class IndeedTestDo1 {
	WebDriver driver;

	@BeforeClass
	public void SetUp() {
		System.setProperty("webdriver.chrome.driver", 
				"C:/Users/sanju/Software_Downloads/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.indeed.com/jobs");
		driver.manage().window().maximize();
	}


	@DataProvider
	public Object[][] getInputData(){
		return new Object[][]
				{
			{"Selenium", "San Francisco,CA"},
			{"Developer", "Glasgow"},
			{"Data Analyst", "San Jose,CA"}
				};
	}


	@Test(dataProvider="getInputData")
	public void JobSearchTest(String job, String location) {
		driver.findElement(By.xpath("//input[@id='what']")).clear();
		driver.findElement(By.xpath("//input[@id='where']")).clear();
		driver.findElement(By.xpath("//input[@id='what']")).sendKeys(job);
		driver.findElement(By.xpath("//input[@id='where']")).sendKeys(location);
		driver.findElement(By.xpath("//input[@id='fj']")).click();
		try {
			Thread.sleep(40000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		driver.findElement(By.xpath("//input[@id='what']")).clear();
		driver.findElement(By.xpath("//input[@id='where']")).clear();
		driver.findElement(By.xpath("//input[@id='what']")).sendKeys(job);
		driver.findElement(By.xpath("//input[@id='where']")).sendKeys(location);
		driver.findElement(By.xpath("//input[@id='fj']")).click();
		driver.manage().timeouts().implicitlyWait(40000, TimeUnit.SECONDS);
	
		driver.findElement(By.xpath("//input[@id='what']")).clear();
		driver.findElement(By.xpath("//input[@id='where']")).clear();
		driver.findElement(By.xpath("//input[@id='what']")).sendKeys(job);
		driver.findElement(By.xpath("//input[@id='where']")).sendKeys(location);	
		driver.findElement(By.xpath("//input[@id='fj']")).click();
		driver.manage().timeouts().implicitlyWait(40000, TimeUnit.SECONDS);
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

}
