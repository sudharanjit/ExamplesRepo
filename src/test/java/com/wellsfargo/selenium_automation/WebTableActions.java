package com.wellsfargo.selenium_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTableActions {

	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/sanju/Software_Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get("https://uk.finance.yahoo.com/gainers?e=l");
		WebTable table = new WebTable(driver.findElement(By.xpath("//div[@id='yfitp']/table")));
		
		System.out.println("getCellElement(2,2).getText(): " + table.getCellElement(2,2).getText());
		System.out.println("getCellElement(user5).getText():" + table.getCellElement("NEWMARK ").getText());
		System.out.println("getCellText(4,2): " + table.getCellText(4,2));
		System.out.println("getColumnCount(): " + table.getColumnCount());
		System.out.println("getRowCount(): " + table.getRowCount());
		
		//table.getCellElement(2,2).
		
		System.out.println("getRowElement(3).getText(): " + table.getRowElement(3).getText());
		System.out.println("getRowElement(pwd4).getText(): " + table.getRowElement("NEWMARK ").getText());

//		======================= Handling Dynamic Web Tables ======================= 
//		if(isElementPresent(By.xpath("//div[@id='yfitp']/table/tr[120]")))
//		{
//			table.getRowElement(120).click();
//		}
//		else
//		{
//			System.out.println("ERROR");
//		}
//		
//		if(isElementPresent(By.xpath("//div[@id='yfitp']/table/tr/td[contains(.,'NEWMARK ')]")))
//		{
//			table.getCellElement("NEWMARK ").sendKeys("Selenium");
//		}
//		else
//		{
//			System.out.println("ERROR");
//		}
		
		System.out.println("");
		System.out.println("==== getTextDisplayedInAllRows ====");
		String[][] tableText = table.getTextDisplayedInAllRows();
		for(String[] row:tableText)
		{
			for(String cell:row)
			{
				System.out.print(cell+"   ");
			}
			System.out.println("");
		}
		
		
		System.out.println("");
		System.out.println("==== getTextDisplayedInColumn(2) ====");
		String[] column2 = table.getTextDisplayedInColumn(2);
		for(String cell:column2)
		{
			System.out.println(cell);
		}
		
		
		System.out.println("");
		System.out.println("==== getTextDisplayedInRow(5) ====");
		String[] row5 = table.getTextDisplayedInRow(5);
		for(String cell:row5)
		{
			System.out.println(cell);
		}

	}

}
