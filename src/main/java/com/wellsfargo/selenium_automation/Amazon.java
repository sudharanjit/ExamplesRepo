package com.wellsfargo.selenium_automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class Amazon {

	WebDriver driver;

	@BeforeMethod
	public void SetUp(){
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/sanju/Software_Downloads/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.amazon.com");
	}
	
	
	
	
}
