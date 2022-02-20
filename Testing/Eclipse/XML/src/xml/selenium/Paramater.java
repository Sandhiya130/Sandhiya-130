package xml.selenium;

//package com.selenium;

import org.testng.annotations.Test;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class Paramater {
	private static WebDriver driver;
	
  
	
	
	@Test
	@Parameters({"user","pwd"})
	
  public void Testcase1(String user,String pwd) {
		// launch the web site
				driver.get("https://demo.guru99.com/test/newtours/");
				
				driver.findElement(By.name("userName")).sendKeys(user);
				driver.findElement(By.name("password")).sendKeys(pwd);
				driver.findElement(By.name("submit")).submit();
				
		  }
  
  
	
	
	@BeforeTest
  public void beforeTest() {
		//System.setProperty("webdriver.chrome.driver", "/Users/nadarrobert/Downloads/chromedriver");
		//System.setProperty("webdriver.edge.driver","D:\\Sandhiya 130\\Testing\\msedgedriver.exe");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sandhiyaj\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe\"");
		driver = new ChromeDriver();
 
  }

  
	
	@AfterTest
  public void afterTest() {
		//driver.close();
  }

}

