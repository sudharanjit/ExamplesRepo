package com.wellsfargo.selenium_automation;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWebElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:/Users/sanju/Software_Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://test1.absofttrainings.com");
		
		List<WebElement> menus = driver.findElements(By.xpath("//nav[@id='top-menu-nav']/ul/li/a"));

		for(WebElement menu:menus)
		{
			System.out.println(menu.getText() + ": " + menu.getAttribute("href"));
		}
		
	}

}
