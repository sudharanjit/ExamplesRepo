package com.wellsfargo.selenium_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtons {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:/Users/sanju/Software_Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://test1.absofttrainings.com/product/apple-iphone/");
	    driver.findElement(By.id("addtocart")).click();
	    driver.findElement(By.linkText("View Cart")).click();
	    driver.findElement(By.name("proceed")).click();
	    
	    System.out.println("Direct Bank Transfer: " +
	    		driver.findElement(By.id("payment_method_bacs")).isSelected());
	    System.out.println("Cheque Payment: " + 
	    		driver.findElement(By.id("payment_method_cheque")).isSelected());
	    System.out.println("PayPal : " + 
	    		driver.findElement(By.id("payment_method_paypal")).isSelected());
	    
	    Thread.sleep(5000);
	    driver.findElement(By.id("payment_method_paypal")).click();
	    System.out.println("========= Ater Click======");
	    
	    System.out.println("Direct Bank Transfer: " +
	    		driver.findElement(By.id("payment_method_bacs")).isSelected());
	    System.out.println("Cheque Payment: " + 
	    		driver.findElement(By.id("payment_method_cheque")).isSelected());
	    System.out.println("PayPal : " + 
	    		driver.findElement(By.id("payment_method_paypal")).isSelected());
	    
	}

}
