package com.wellsfargo.selenium_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Checkboxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://test1.absofttrainings.com/my-account/");
				
		System.out.println("Default state: " + 
				driver.findElement(By.id("rememberme")).isSelected());
				
		CheckBox cb = new CheckBox(driver.findElement(By.id("rememberme")));
		cb.check();
		
		System.out.println("State after check: " + 
				driver.findElement(By.id("rememberme")).isSelected());
		
		Thread.sleep(1000);
		
		cb.uncheck();
		System.out.println("State after uncheck: " + 
				driver.findElement(By.id("rememberme")).isSelected());

	}

}
