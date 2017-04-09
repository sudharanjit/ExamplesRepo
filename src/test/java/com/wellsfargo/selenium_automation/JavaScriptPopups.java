package com.wellsfargo.selenium_automation;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptPopups {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/sanju/Software_Downloads/chromedriver_win32/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		
		Alert alert = driver.switchTo().alert();
		
		Thread.sleep(3000);
		System.out.println("Alert Text: " + alert.getText());
		
		alert.accept();
		
		driver.switchTo().defaultContent();
		
		
		System.out.println("Go button text: " + 
				driver.findElement(By.name("proceed")).getAttribute("value"));

	}

}
