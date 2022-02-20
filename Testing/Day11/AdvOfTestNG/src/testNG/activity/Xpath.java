package testNG.activity;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Xpath {
	private static WebDriver driver;
  @Test
  public void xpath() {
	//  System.setProperty("webdriver.chrome.driver", "D:/Sandhiya 130/Testing/chromedriver.exe");
		//driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		//basic xpath
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("sandhiya");
		//xpath using contains
		driver.findElement(By.xpath("//*[contains(@name,'pass')]")).sendKeys("sandhiya");
		//xpath using or
		//driver.findElement(By.xpath("//*[@type='submit'or name='submits']")).submit();
		//xpath using and
		driver.findElement(By.xpath("//input[@type='submit'and @name='submit']")).submit();
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:/Sandhiya 130/Testing/chromedriver.exe");
		driver = new ChromeDriver();
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
