package com.wellsfargo.selenium_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicCommands {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/sanju/Software_Downloads/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://test1.absofttrainings.com/my-account/");
				
		System.out.println("Login button displayed: " + 
				driver.findElement(By.name("login")).isDisplayed());
		
		System.out.println("Login button enabled: " + 
				driver.findElement(By.name("login")).isEnabled());
		
		System.out.println("Login button text: " + 
				driver.findElement(By.name("login")).getAttribute("value"));
			
		System.out.println("Login button width: " +
				driver.findElement(By.name("login")).getSize().width);
		
		System.out.println("Login button height: " +
				driver.findElement(By.name("login")).getSize().height);
		
		driver.findElement(By.name("login")).click();
		
		System.out.println(isElementPresent(By.name("login")));
		System.out.println(isElementPresent(By.name("login11")));
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

