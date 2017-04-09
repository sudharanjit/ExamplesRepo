package com.wellsfargo.selenium_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://test1.absofttrainings.com/shop/");
		
		System.out.println("Link URL: " + 
		driver.findElement(By.partialLinkText("Samsung Phone")).getAttribute("href"));
		
		System.out.println("Link Text: " + 
				driver.findElement(By.partialLinkText("Samsung Phone")).getText());
		
		driver.findElement(By.partialLinkText("Samsung Phone")).click();
	}

}
