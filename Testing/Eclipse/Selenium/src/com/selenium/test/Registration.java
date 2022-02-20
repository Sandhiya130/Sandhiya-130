package com.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Registration {
	private static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//set path of the web driver
		System.setProperty("webdriver.chrome.driver","D:/Sandhiya 130/Testing/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().minimize();
		Thread.sleep(3000);
		driver.findElement(By.name("firstName")).sendKeys("Sandhiya J");
		driver.findElement(By.name("lastName")).sendKeys("Jagadeesan");
		driver.findElement(By.name("phone")).sendKeys("8807864765");
		driver.findElement(By.id("userName")).sendKeys("Sandhiyasandi4@gmail.com");
		
		
		
		driver.findElement(By.name("address1")).sendKeys("EVP Street");
		driver.findElement(By.name("city")).sendKeys("chennai");
		driver.findElement(By.name("state")).sendKeys("TamilNadu");
		driver.findElement(By.name("postalCode")).sendKeys("600018");
		WebElement countrydropdown = driver.findElement(By.name("country"));
		
		//for selecting the dropdown value
		Select dropdown = new Select(countrydropdown);
		dropdown.selectByValue("INDIA");
		//dropdown.selectByIndex(6);


		
		
		driver.findElement(By.id("email")).sendKeys("Sandhiyasandi4@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Sandhiy1");
		driver.findElement(By.name("confirmPassword")).sendKeys("Sandhiy1");
		driver.findElement(By.name("submit")).submit();
		//driver.findElement(By.name("firstName")).sendKeys("Sandhiya J");
		//driver.close();
	}


}
