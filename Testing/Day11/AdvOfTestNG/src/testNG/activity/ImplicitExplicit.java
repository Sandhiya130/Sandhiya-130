package testNG.activity;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class ImplicitExplicit {
	private static WebDriver driver;
	  @Test (priority=1)
	  public void test() {
		  System.setProperty("webdriver.chrome.driver", "D:/Sandhiya 130/Testing/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://www.google.com");
			driver.findElement(By.name("q")).sendKeys("https://dev.to/");
			driver.navigate().to("https://www.nykaa.com/");
	  }
	  @Test (priority=2)
	  public void dev() throws Exception {
		  System.setProperty("webdriver.chrome.driver", "D:/Sandhiya 130/Testing/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://dev.to/");
			//adding sleep
			Thread.sleep(3000);
			//adding implicit statement
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.findElement(By.name("q")).sendKeys("selenium");
			//adding explicit statement
			//WebDriverWait wait=new WebDriverWait(driver,20);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//header/div[1]/div[1]/form[1]/div[1]/div[1]/button[1]\"")));
			driver.findElement(By.xpath("//header/div[1]/div[1]/form[1]/div[1]/div[1]/button[1]")).submit();
			//driver.findElement(By.xpath("//header/div[1]/div[2]/a[2]")).submit();
	  }
	  @Test(priority=3)
	  public void java()throws Exception{
		  System.setProperty("webdriver.chrome.driver", "D:/Sandhiya 130/Testing/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://dev.to/");
			WebDriverWait wait=new WebDriverWait(driver,20);
			wait.until( ExpectedConditions.visibilityOfElementLocated(By.name("q")));
		  
	  }
	  
	  @BeforeTest
	  public void beforeTest() {
	  }

	  @AfterTest
	  public void afterTest() {
	  }

}
