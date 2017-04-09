package com.wellsfargo.selenium_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserNavigation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:/Users/sanju/Software_Downloads/chromedriver_win32/chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("http://test1.absofttrainings.com/product/apple-iphone/");
	    driver.findElement(By.id("addtocart")).click();
	    driver.findElement(By.linkText("View Cart")).click();
	    
	    Thread.sleep(2000);
	    driver.navigate().refresh();
	    //VerifyCartPage();
	    
	    driver.findElement(By.linkText("Shop")).click();
	    Thread.sleep(2000);
	    driver.navigate().back();
	    //VerifyCartPage();
	    
	    driver.navigate().forward();
	    Thread.sleep(2000);
	    driver.navigate().back();
	    //VerifyCartPage();
	    
	    System.out.println("Page Title: " + driver.getTitle() );
	    System.out.println("Page URL: " + driver.getCurrentUrl());
	    System.out.println("Page HTML Source Code: " +driver.getPageSource());

	}

}
