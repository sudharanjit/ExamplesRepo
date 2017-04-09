package com.wellsfargo.selenium_automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownList {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://test1.absofttrainings.com/shop/");
		
		Select sortOrder = new Select(driver.findElement(By.name("orderby")));
				
		System.out.println("Default option: " + 
				sortOrder.getFirstSelectedOption().getText());
		
		Thread.sleep(3000);
		sortOrder.selectByVisibleText("Sort by average rating");
		
		sortOrder = new Select(driver.findElement(By.name("orderby")));
		
		System.out.println("Current selected option: " + 
				sortOrder.getFirstSelectedOption().getText());
		
		Thread.sleep(3000);
		sortOrder.selectByValue("popularity");
		
		sortOrder = new Select(driver.findElement(By.name("orderby")));
		
		System.out.println("Current selected option: " + 
				sortOrder.getFirstSelectedOption().getText());
		
		List<WebElement> options= sortOrder.getOptions();
		
		
		System.out.println("All options count: " + options.size());
		for(WebElement option:options)
		{
			System.out.println(option.getText());
		}

	}

}
