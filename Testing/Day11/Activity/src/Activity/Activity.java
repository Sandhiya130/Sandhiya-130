package Activity;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Activity {
	private static WebDriver driver;
	 JavascriptExecutor js =(JavascriptExecutor)driver;

  @Test
  public void test() {
	  System.out.println("Welcome to Registration page");
	  driver.get("https://webapps.tekstac.com/Agent_Registration/");
	 // JavascriptExecutor js =(JavascriptExecutor)driver;
		
  }
  @Test
  public void name() throws Exception {
	  System.out.println("executing the test");
	  	driver.navigate().to("https://webapps.tekstac.com/Agent_Registration/");
	  	Thread.sleep(3000);
	  driver.findElement(By.name("firstname")).sendKeys("John");
	  driver.findElement(By.name("lastname")).sendKeys("Smith");
	  driver.findElement(By.name("username")).sendKeys("Johnsmith");
	  driver.findElement(By.name("password")).sendKeys("pass123");
	  driver.findElement(By.name("phonenumber")).sendKeys("9876543210");
	  driver.findElement(By.name("email")).sendKeys("sandhiya#gmail.com");
	 

	  driver.findElement(By.id("submit")).click();
		
	//WebElement button= driver.findElement(By.id("submit"));
		//js.executeScript("arguments[0].click();", button);
		
		
		// display alert message using java script executor
		//js.executeScript("alert('Registered Successfully');");

		String expectedmail ="san@gmail.com";
		String actualmail = "abcd@gmail.com";
		//assert
				Assert.assertEquals(expectedmail, actualmail); 
	//driver.findElement(By.id("submit")).click();
	//driver.findElement(By.id("reset")).click();
	
	

	
	
	// Switching to Alert        
//    Alert alert = driver.switchTo().alert();		
    		
    // Capturing alert message.    
  //  String alertMessage= driver.switchTo().alert().getText();		
    		
    // Displaying alert message		
   // System.out.println(alertMessage);	
    //Thread.sleep(5000);
    		
    // Accepting alert		
    //alert.accept();	
	


  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("open the browser");
	  System.setProperty("webdriver.chrome.driver", "D:/Sandhiya 130/Testing/chromedriver.exe");
		driver = new ChromeDriver();

  }

  @AfterTest
  public void afterTest() {
	  //System.out.println("close the browser");
	 // String s= driver.switchTo().alert().getText();
	   // System.out.println("Error " + s);
  }

 
}
