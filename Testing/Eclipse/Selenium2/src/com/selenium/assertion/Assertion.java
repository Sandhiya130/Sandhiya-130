package com.selenium.assertion;
import org.junit.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Assertion {
	private static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		System.setProperty("webdriver.chrome.driver","D:/Sandhiya 130/Testing/chromedriver.exe");
			driver = new ChromeDriver();
			
			// open the page
			driver.get("http://www.google.com");
			
			String expectedtitle ="Google";
			String actualtitle = driver.getTitle();
			
			//assert equals
			Assert.assertEquals(expectedtitle, actualtitle);
			
			//assertnotequals
			//Assert.assertNotEquals(expectedtitle, actualtitle);
			
//			// assert true
	        WebElement element = driver.findElement(By.name("btnK"));
//	        Assert.assertTrue(element.isDisplayed());
	        Assert.assertTrue(element.isEnabled());
	//        Assert.assertTrue(element.isSelected());


}
}