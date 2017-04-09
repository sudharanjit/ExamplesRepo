package com.wellsfargo.selenium_automation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbTest_Nav {

	public static void main(String[] args) {

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:/Users/sanju/Software_Downloads/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();

		driver.navigate().to("http://www.test1.absofttrainings.com/");
		driver.manage().window().maximize();

		List<WebElement> list = driver.findElements(By.xpath("//nav[@id='top-menu-nav']/ul/li/a"));
		System.out.println("Length of list: "+ list.size());
		
		for(WebElement menu:list)
		{
			System.out.println(menu.getText() + ": " + menu.getAttribute("href"));
		}
		
		
		driver.close();
			
		}
	}
