package DataDriven.TestNG;

import org.testng.annotations.Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class DataDriven {
	private static WebDriver driver;
  @Test(dataProvider = "login")
  //private static WebDriver driver;
  public void test(String user, String pwd) {
	  
	  driver.get(" https://demo.guru99.com/test/newtours/");
	  driver.findElement(By.name("userName")).sendKeys(user);
	  driver.findElement(By.name("password")).sendKeys(pwd);
	  
  }

  @DataProvider
  public Object[][] login() {
    return new Object[][] {
      new Object[] { "sandhiya", "sandhi" },
      new Object[] { "diksheeka", "dikshi" },
      new Object[] { "hema", "hemat" },
    };
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:/Sandhiya 130/Testing/chromedriver.exe");
		driver = new ChromeDriver();
	  }
  

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
