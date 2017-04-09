package com.wellsfargo.selenium_automation;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNGTestCase {
	
// @Test – is used to specify a test method

// Test Method level annotations
// @BeforeMethod – is used to specify setup actions before each test
// @AfterMethod – is used to specify tear down actions after each test

// Test Class level annotations
// @BeforeClass – is used to specify setup actions before all tests in a class
// @AfterClass – is used to specify tear down actions after all tests in a class

// Test Class group level annotations
// @BeforeTest – is used to specify setup actions before all tests from a group of classes
// @AfterTest – is used to specify tear down actions after all tests from a group of classes

// Test Suite level annotations
// @BeforeSuite – is used to specify setup actions before the test suite begins 
// @AfterSuite –  is used to specify tear down actions after the test suite ends

	
	@BeforeClass 
	public void testClassStartSelenium()
	{
		System.out.println("In testClassStartSelenium() method");
	}
	@AfterClass 
	public void testClassStopSelenium()
	{
		System.out.println("In testClassStopSelenium() method");
	}

	@BeforeTest 
	public void testClassGroupSetUpDB()
	{
		System.out.println("In testClassGroupSetUpDB() method");
	}
	@AfterTest 
	public void testClassGroupCleanDB()
	{
		System.out.println("In testClassGroupCleanDB() method");
	}

	@BeforeSuite 
	public void testSuiteSetUpSite()
	{
		System.out.println("In testSuiteSetUpSite() method");
	}
	
	@AfterSuite 
	public void testSuiteCleanSite()
	{
		System.out.println("In testSuiteCleanSite() method");
	}
	
	@BeforeMethod
	public void testMethodSetUp()
	{
		System.out.println("In testMethodSetUp() method");
	}
	
	@Test
	public void testHomePage()
	{
		System.out.println("In testHomePage() method");
		
		//Assert.assertEquals("My Site Title22", "My Site Title", 
		//		"ERROR: Home page title is wrong");
		//Assert.assertTrue("My Site Title".equals("My Site Title22"), 
		//		"ERROR: Home page title is wrong");
			
		if(!("My Site Title".equals("My Site Title22")))
		{
		Assert.fail("ERROR: Home page title is wrong");
		
		}
	}
	
	//@Test
	public void testLoginPage()
	{
		System.out.println("In testLoginPage() method");
	}

	@Test
	public void testMyAcctPage()
	{
		System.out.println("In testMyAcctPage() method");
	}

	@AfterMethod
	public void testMethodTearDown()
	{
		System.out.println("In testMethodTearDown() method");
	}
	
	@AfterMethod
	public void testMethodTearDown22()
	{
		System.out.println("In testMethodTearDown22() method");
	}
}
