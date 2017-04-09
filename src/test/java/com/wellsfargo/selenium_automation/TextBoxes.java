package com.wellsfargo.selenium_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TextBoxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:/Users/sanju/Software_Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://test1.absofttrainings.com/my-account/");
		
		System.out.println("Default text: " + 
		driver.findElement(By.id("username")).getAttribute("value"));
		
		driver.findElement(By.id("username")).sendKeys("bakshu");
		
		System.out.println("Value after typing: " + 
				driver.findElement(By.id("username")).getAttribute("value"));
		
		driver.findElement(By.id("username")).clear();
		System.out.println("Value after clear: " + 
				driver.findElement(By.id("username")).getAttribute("value"));

	}

}
