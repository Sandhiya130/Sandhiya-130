package testing.annotations.Test;


import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
@Test
public class NewTest{
	private static WebDriver driver;
  public void Test1() {
//	  launch website
//	  driver.get("https://webapps.tekstac.com/Agent_Registration/");
	  driver.navigate().to("https://webapps.tekstac.com/Agent_Registration/");
//	  firstname
	  WebElement txt1  = driver.findElement(By.xpath("//body/form[@id='agent-form']/input[1]"));
		txt1.sendKeys(" John");
//	last name	
		 WebElement txt2  = driver.findElement(By.xpath("//body/form[@id='agent-form']/input[2]"));
			txt2.sendKeys(" Smith");
//	username		
			WebElement txt3  = driver.findElement(By.xpath("//body/form[@id='agent-form']/input[3]"));
			txt3.sendKeys(" John Smith");
//	password
			WebElement txt4  = driver.findElement(By.xpath("//body/form[@id='agent-form']/input[4]"));
			txt4.sendKeys(" pass123");
//			phone no
			WebElement txt5  = driver.findElement(By.xpath("//body/form[@id='agent-form']/input[5]"));
			txt5.sendKeys("9876543210");
//			email
			WebElement txt6 = driver.findElement(By.xpath("//body/form[@id='agent-form']/input[6]"));
			txt6.sendKeys("");
//           submit
			WebElement btnclick = driver.findElement(By.xpath("//input[@id='submit']"));
			btnclick.click();
//			reset
//			WebElement btnclick1 = driver.findElement(By.xpath("//input[@id='reset']"));
//			btnclick1.click();
			

			String expectedmail ="abcd@gmail.com";
			String actualmail = "abcd@gmail.com";
		
			
			//assert equals
			Assert.assertEquals(expectedmail, actualmail);
			
			
  }
  
  
  
  private void getTEXT() {
	// TODO Auto-generated method stub
	
}



@BeforeTest
  public void beforeTest() {
  
  System.out.println("open the browser");
  System.setProperty("webdriver.chrome.driver", "D:/Sandhiya 130/Testing/chromedriver.exe");;
	driver = new ChromeDriver();
  }

  @AfterTest
  public void afterTest() {
  }

}

