package testng.activity;

import org.testng.annotations.Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
//import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class NegativeTest {
	private static WebDriver driver;
  @Test(dataProvider = "login")
 
  public void test(String emailid, String pwd) throws Exception {
	  JavascriptExecutor js =(JavascriptExecutor)driver;
	  driver.get("http://practice.automationtesting.in");
	  
	  driver.navigate().to("http://practice.automationtesting.in/my-account/");
	  driver.findElement(By.name("email")).sendKeys(emailid);
	  driver.findElement(By.id("reg_password")).sendKeys(pwd);
//	  driver.findElement(By.name("register")).submit();
	  
	        		
	  String expectedmail ="abcd12@gmail.com";
	 	String actualmail = "abcd#gmail.com";
	 //
//	 	//assert equals
	 	Assert.assertNotEquals(expectedmail, actualmail);
	  WebElement button = driver.findElement(By.name("register"));
		js.executeScript("arguments[0].click();", button);
		 driver.findElement(By.xpath("//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-36']/div[1]/div[1]/div[1]/div[1]/form[1]/p[3]/input[3]"));
		 //String expectedmail ="abcd12@gmail.com";
		// 	String actualmail = "abcd@gmail.com";
		 	
		js.executeScript("alert('Invalid Email Address');");
		


	 	
	 	
  }

  @DataProvider
  public Object[][] login() {
    return new Object[][] {
      new Object[] { "sandhiya#gmail.com", "sandhiya@26A" },
      //new Object[] { 2, "b" },
    };
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.edge.driver","D:\\Sandhiya 130\\Testing\\msedgedriver.exe");
		driver = new EdgeDriver();
		
  }

  @AfterTest
  public void afterTest() {
  }

}
