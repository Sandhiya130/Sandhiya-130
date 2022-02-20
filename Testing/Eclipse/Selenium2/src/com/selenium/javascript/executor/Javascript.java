package com.selenium.javascript.executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript {
	
private static WebDriver driver;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:/Sandhiya 130/Testing/chromedriver.exe");
		driver = new ChromeDriver();
		
//driver = new ChromeDriver();
		
		// create javascript executor interface
		JavascriptExecutor js =(JavascriptExecutor)driver;
		
		// launch the site
		driver.get("https://demo.guru99.com/test/newtours/");
		
		
		// save the submit button as a web element
		WebElement button = driver.findElement(By.name("submit"));
		
		driver.findElement(By.name("userName")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		
		// click on submit button using java script executor
		js.executeScript("arguments[0].click();", button);
		
		
		// display alert message using java script executor
		js.executeScript("alert('Login Successful');");

	
}
}