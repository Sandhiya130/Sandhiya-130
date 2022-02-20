/**
 * 
 */
package com.selenium.assertion;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * @author sandhiyaj
 *
 */
class UnitTest {

	
	private static WebDriver driver;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		System.setProperty("webdriver.chrome.driver","D:/Sandhiya 130/Testing/chromedriver.exe");
		driver = new ChromeDriver();
	}

	
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		
		
		driver.close();
	}

	@Test
	void testAssertionEquals() {
		//fail("Not yet implemented");
		
		driver.get("http://www.google.com");
		
		String expectedtitle ="Google";
		String actualtitle = driver.getTitle();
		
		//assert equals
		Assert.assertEquals(expectedtitle, actualtitle);
		
		driver.findElement(By.name("q")).sendKeys("Assertion testing");
	}	
	void testAssertionNotEquals() {
		//fail("Not yet implemented");
		
		driver.get("http://www.google.com");
		
		String expectedtitle ="sandy";
		String actualtitle = driver.getTitle();
		
		//assert not equals
		Assert.assertNotEquals(expectedtitle, actualtitle);
	}
	
	
}
