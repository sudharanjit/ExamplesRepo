package com.wellsfargo.selenium_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExtractingWebElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://test1.absofttrainings.com/product/samsung-phone/");
		
		WebElement cart = driver.findElement(By.id("cart"));
		
		cart.findElement(By.name("quantity")).sendKeys("3");
		
		driver.findElement(By.xpath("//form[@id='cart']/div/input[2]")).sendKeys("8");
		

	}

}
