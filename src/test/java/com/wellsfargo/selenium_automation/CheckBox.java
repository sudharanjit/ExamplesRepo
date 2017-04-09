package com.wellsfargo.selenium_automation;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckBox {
	
 private WebElement _checkbox;
  
 public CheckBox(WebElement checkbox)
 {
	 _checkbox=checkbox;
 }
 
 public WebElement getCheckBox()
 {
	 return _checkbox;
 }
 
 public void check()
 {
	 if(!(_checkbox.isSelected()))
	 {
		 _checkbox.click();
	 }
 }
 
 public void uncheck()
 {
	 if((_checkbox.isSelected()))
	 {
		 _checkbox.click();
	 }
 }
  
}