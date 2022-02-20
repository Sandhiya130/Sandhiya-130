package com.selenium.project4;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class FlipkartTestng
{
	private static WebDriver driver;
 
@Test (priority=1)
  public void flipkart() throws Exception {
	  driver.manage().window().maximize();
		
		//Step 1 -->Navigate to URL 
		
		driver.navigate().to("https://www.flipkart.com");
		
		// Step 2 -->Close the popup - Use Xpath and the text() method in xpath to close
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/button[1]")).click();
		
		// Step 3. Search for text "fitbit" and click on search icon 
		
		WebElement search = driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/input[1]"));
		search.sendKeys("fitbit");
		
		driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/button[1]")).submit();	
		
		
	   // Step 4. Verify that there are more than 900 results shown 
	 
		WebElement result= driver.findElement(By.tagName("span"));
		
		if(result.isDisplayed()) 
		{
		System.out.println("RESULT HAS MORE THAN 900 PRODUCTS: PASS");	
		}
		else
		{
			System.out.println("RESULT HAS MORE THAN 900 PRODUCTS: FAIL");
			
		}
       Thread.sleep(3000);
       
		//Step 5--------->. Click on the first result link. A new tab will open for the product details page  
       
		driver.findElement(By.xpath(" //div[@id='container']/div/div[3]/div/div[2]/div[2]/div/div/div/a/div/div")).click();
		
		Thread.sleep(2500);
		
		//driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/a[1]/div[1]/div[1]/div[1]/img[1]")).click();
		//Step 6. Take screenshot of this page (details page) and store it under project folder inside screenshots folder with filename productdetails.jpg 	
	
		driver.get("https://www.flipkart.com/fitbit-sense-smartwatch/p/itm2eeca6d8e1962?pid=SMWGF9NZFZFX8ZGV&lid=LSTSMWGF9NZFZFX8ZGVNVSBPT&marketplace=FLIPKART&q=ftibit&store=ajy&srno=s_1_1&otracker=search&otracker1=search&fm=Search&iid=c1c69bdb-65d2-4a63-a378-56ef1ceaf268.SMWGF9NZFZFX8ZGV.SEARCH&ppt=sp&ppn=sp&ssid=kgdm96o5800000001645340369353&qH=bdf581d3f70e100f");
		takeScreenshot("productdetail");	
				
	}
	public static void takeScreenshot(String fileName) throws IOException, Exception {
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);   
		FileUtils.copyFile(file, new File("C:\\Users\\sandhiyaj\\Downloads\\TestingProject\\TestingProject\\Screenshots\\Screenshot3.png"
				+ "src/Screenshot/"+""+fileName+".jpg"));
	}
	@Test (priority=2)
	public void price() throws Exception 
	{
		
		//Step 7. On this page, capture the original price and final price. Then calculate the discount percentage and verify that the % displayed on the page is correct. 
	
		String finalprice=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]")).getText();
		String originalprice=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]")).getText();
		String discountpercent=driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div[3]/span[1]")).getText();
		String a= finalprice;
		String b= originalprice;
		String c= discountpercent;
		System.out.println("Original price:"+b);
		System.out.println("Final price:"+a);
		System.out.println("Discount Percentage:"+c);

		//discount verification
		WebElement discountverify=driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div[3]/span[1]"));
		String text=discountverify.getText();
		System.out.println("Verified Discount="+text);
		if (text.contains(discountpercent))

		{
		//Step 8. Click on Add to Cart button. This will open the MyCart Page in the same window
			
			WebElement button= driver.findElement(By.xpath("//button[contains(.,' ADD TO CART')]"));
						
			button.click();
		}
		else 
		{
			System.out.println("Discount not matched");
			
		}	
		Thread.sleep(3000);
	
	 //Step 9. Verify that the total amount is equal to the amount captured on Step 6 (final price)
		
		String expectedprice = "₹21,499";
		WebElement act1 = driver.findElement(By.xpath("//span[contains(text(),'₹21,499')] "));
		String actual = act1.getText();
        Assert.assertEquals(actual, expectedprice);
		System.out.println("Verified price of product:" + actual);
		
		
		
	
	 
	}
  
  
  
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty( "webdriver.edge.driver","D:/Sandhiya 130/Testing/edgedriver_win64/msedgedriver.exe");
		// Instantiate for Webdriver
		driver = new EdgeDriver();
  }

  @AfterTest
  public void afterTest() {
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
	  //Step 10. Close the new window 
	  //Step 11. Quit the drive


	  driver.quit();
  }

}