package com.wellsfargo.selenium_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamicList {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException 
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://test1.absofttrainings.com/shop/");
		
		Select sortOrder = new Select(driver.findElement(By.name("orderby")));
		
		String optionVisibleText="Sort by newness22";
		String optionTextXPath = "//select[@name='orderby']/option[contains(.,'Sort by newness22')]";
		
		//String optionValue="date";
		//String optionValueXPath = "//select[@name='orderby']/option[@value='date']";
		
		if(isElementPresent(By.xpath(optionTextXPath)))
		{
			System.out.println(optionVisibleText + " - is available");
			Thread.sleep(3000);
			sortOrder.selectByVisibleText(optionVisibleText);
		}
		else
		{
			System.out.println("ERROR: " + optionVisibleText + " - is not available");
		}
	}
	
	private static boolean isElementPresent(By by)
	{
	    try {
	      driver.findElement(by);
	      return true;
	    } catch (NoSuchElementException e) {
	      return false;
	    }
	  }

}
