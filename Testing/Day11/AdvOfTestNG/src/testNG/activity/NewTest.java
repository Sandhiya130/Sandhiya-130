package testNG.activity;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	private static WebDriver driver;
  @Test (priority=1)
  public void test() {
	  System.setProperty("webdriver.chrome.driver", "D:/Sandhiya 130/Testing/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("https://dev.to/");
		driver.navigate().to("https://dev.to/");
  }
  @Test (priority=2)
  public void nykaa() throws Exception {
	  System.setProperty("webdriver.chrome.driver", "D:/Sandhiya 130/Testing/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://dev.to/");
		Thread.sleep(3000);
		//
		driver.findElement(By.name("q")).sendKeys("selenium");
		driver.findElement(By.xpath("//header/div[1]/div[1]/form[1]/div[1]/div[1]/button[1]")).submit();
  }
  
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
