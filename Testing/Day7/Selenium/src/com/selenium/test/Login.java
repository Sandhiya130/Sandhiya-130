package com.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Login {
	private static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:/Sandhiya 130/Testing/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		// driver.manage().window().minimize();
		// login
		Thread.sleep(1000);
		WebElement txt1 = driver.findElement(By.name("userName"));
		txt1.sendKeys("admin");
		WebElement txt2 = driver.findElement(By.name("password"));
		txt2.sendKeys("admin");
		WebElement btnclick = driver.findElement(By.name("submit"));
		btnclick.click();

		// Flight click
		WebElement click1 = driver.findElement(By.xpath("//a[contains(text(),'Flights')]"));
		click1.click();

		// radio button
		WebElement radiobtn = driver.findElement(By.xpath("//tbody/tr[2]/td[2]/b[1]/font[1]/input[2]"));
		radiobtn.click();

		WebElement passcount1 = driver.findElement(By.name("passCount"));

		// for selecting the dropdown value
		Select dropdown = new Select(passcount1);
		dropdown.selectByValue("2");

		WebElement Port = driver.findElement(By.name("fromPort"));

		// for selecting the dropdown value
		Select dropdown1 = new Select(Port);
		dropdown1.selectByIndex(3);

		WebElement down = driver.findElement(By.name("fromMonth"));

		// for selecting the dropdown value
		Select dropdown2 = new Select(down);
		dropdown2.selectByVisibleText("February");

		WebElement down1 = driver.findElement(By.name("fromDay"));
		// for selecting the dropdown value
		Select dropdown3 = new Select(down1);
		dropdown3.selectByVisibleText("22");

		WebElement port1 = driver.findElement(By.name("toPort"));

		// for selecting the dropdown value
		Select dropdown4 = new Select(port1);
		dropdown4.selectByValue("Paris");

		WebElement down2 = driver.findElement(By.name("toMonth"));

		// for selecting the dropdown value
		Select dropdown5 = new Select(Port);
		dropdown5.selectByIndex(8);

		WebElement down3 = driver.findElement(By.name("toDay"));

		// for selecting the dropdown value
		Select dropdown6 = new Select(down3);
		dropdown6.selectByIndex(3);

		
		WebElement radiobtn1 = driver.findElement(By.xpath("//tbody/tr[9]/td[2]/font[1]/font[1]/input[1]"));
		radiobtn1.click();		
		WebElement btnclick1 = driver.findElement(By.name("findFlights"));
		
		btnclick1.click();
		 driver.get("https://demo.guru99.com/test/newtours/index.php");
	      // getTitle() to obtain page title
	      System.out.println("Page title is " + driver.getTitle());
		//btnclick1.click();
	}

}
