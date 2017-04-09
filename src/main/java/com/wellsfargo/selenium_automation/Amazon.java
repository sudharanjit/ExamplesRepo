package com.wellsfargo.selenium_automation;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Amazon {

	WebDriver driver;

	@BeforeClass
	public void SetUp(){
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/sanju/Software_Downloads/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.dice.com/");
	}

	@DataProvider
	public Object[][] InputData(){
		return new Object[][]{
			{"Selenium","Pleasanton, CA"},
			{"Business Analyst", "New York"},
			{"Java Developer","Texas"}
		};
	}

	@Test(dataProvider="InputData")
	public void TestMethod(String JobTitle, String location){
		driver.findElement(By.xpath("//input[@id='search-field-keyword']")).clear();
		driver.findElement(By.xpath("//input[@id='search-field-location']")).clear();
		driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='search-field-keyword']")).sendKeys(JobTitle);
		driver.findElement(By.xpath("//input[@id='search-field-location']")).sendKeys(location);
		driver.findElement(By.xpath("//button[contains(text(),'Find Tech Jobs')]")).click();

		driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@id='search-field-keyword']")).clear();
		driver.findElement(By.xpath("//input[@id='search-field-location']")).clear();
		driver.findElement(By.xpath("//input[@id='search-field-keyword']")).sendKeys(JobTitle);
		driver.findElement(By.xpath("//input[@id='search-field-location']")).sendKeys(location);
		driver.findElement(By.xpath("//button[contains(text(),'Find Tech Jobs')]")).click();;

		driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@id='search-field-keyword']")).clear();
		driver.findElement(By.xpath("//input[@id='search-field-location']")).clear();
		driver.findElement(By.xpath("//input[@id='search-field-keyword']")).sendKeys(JobTitle);
		driver.findElement(By.xpath("//input[@id='search-field-location']")).sendKeys(location);
		driver.findElement(By.xpath("//button[contains(text(),'Find Tech Jobs')]")).click();

		driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);
	}
	
	@AfterClass
	public void tearDown(){
		driver.close();
	}


}
