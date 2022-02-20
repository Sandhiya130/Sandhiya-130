package com.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class TestCase1 {
	//driver initialization
	private static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//set path of the web driver
		System.setProperty("webdriver.chrome.driver","D:/Sandhiya 130/Testing/chromedriver.exe");
		driver=new ChromeDriver();
		//open the web page
		driver.get("http://www.google.com");
		//select the text box and pass the input
		driver.findElement(By.name("q")).sendKeys("selenium");
		driver.findElement(By.name("btnK")).submit();
		//close the browser
		driver.close();
		

	}

}
