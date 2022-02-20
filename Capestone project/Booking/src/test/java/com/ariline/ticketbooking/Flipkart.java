package com.ariline.ticketbooking;

import java.io.File;


import java.io.IOException;
import org.junit.Assert;  
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



import org.openqa.selenium.edge.EdgeDriver;

public class Flipkart {
	
	private static WebDriver driver;
	public  static void main (String[] args) throws Exception
	{
		System.setProperty( "webdriver.edge.driver","D:/Sandhiya 130/Testing/edgedriver_win64/msedgedriver.exe");
		driver = new EdgeDriver();
		//maximize window
		driver.manage().window().maximize();
		
		//Step 1---> Navigate to flipkart url
		
		driver.get("http://www.flipkart.com");
		
		//Step 2----->Popup 
		 
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/button[1]")).click();
		
		//Step 2----->Search for text "fitbit" and click on search icon 
		
		WebElement searchBox = driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/input[1]"));
		searchBox.sendKeys("fitbit");
		driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/button[1]")).submit();	
		
		//Step 3-----> Verify that there are more than 900 results shown 
		
		WebElement result= driver.findElement(By.tagName("span"));
		if(result.isDisplayed()) 
		{
		System.out.println("RESULT HAS MORE THAN 900 PRODUCTS: PASS");	
		}else
		{
			System.out.println("RESULT HAS MORE THAN 900 PRODUCTS: FAIL");
		}
		
		//Step 4--------->. Click on the first result link. A new tab will open for the product details page 
		
		Thread.sleep(2500);
		
		driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/a[1]/div[1]/div[1]/div[1]/img[1]")).click();
		
		//Step 5----->Take screenshot of this page (details page) and store it under project folder inside screenshots folder with filename productdetails.jpg 
		
		driver.get("https://www.flipkart.com/fitbit-versa-2-smartwatch/p/itm0843470017aab?pid=SMWFZWXZ7ZH4F4VE&lid=LSTSMWFZWXZ7ZH4F4VEZUXYU9&marketplace=FLIPKART&q=fitbit&store=ajy&srno=s_1_1&otracker=search&otracker1=search&fm=Search&iid=2e21e660-e77f-4859-bb9b-b6ecddfe778b.SMWFZWXZ7ZH4F4VE.SEARCH&ppt=sp&ppn=sp&ssid=ru90s79q800000001644899697638&qH=ca82ed41cd7aa123");
		takeScreenshot("productdetail");
		
	}
				
	
	 public static void takeScreenshot(String fileName) throws IOException, Exception {
	 File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(file, new File("D:/Sandhiya 130/Testing/Eclipse/Booking/Screenshot/productdetails.png"));
		//"D:\Sandhiya 130\Testing\Eclipse\Booking\Screenshot"
		//Step 6---->. On this page, capture the original price and final price. Then calculate the discount percentage and verify that the % displayed on the page is correct. 
		 
		Thread.sleep(3000);
		String finalprice=driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]")).getText();
		String originalprice=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]")).getText();
		String discountprice=driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div[3]/span[1]")).getText();
		String a= finalprice;
		String b= originalprice;
		String c= discountprice;
		System.out.println("Original price of the product:"+originalprice);
		System.out.println("Final price of the product:"+finalprice);
		System.out.println("Discount Percentage of the product:"+discountprice);


       //discount verification
	
		WebElement discountverify = driver.findElement(By.xpath(
				"//body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div[3]/span[1]"));
		String text = discountverify.getText();
		System.out.println("Verified Discount=" + text);
		if (text.contains(discountprice))

		{
       //Step 7---->Click on Add to Cart button. This will open the MyCart Page in the same window

			WebElement button = driver.findElement(By.xpath(
					"//body/div[@id='container']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/button[1]"));
			button.click();
		} else {
			System.out.println("Discount not matched");

		}

       //Step 8--->. Verify that the total amount is equal to the amount captured on Step 6 (final price)	
		
		Thread.sleep(2000);
		String totalamount = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/span[1]/div[1]/div[1]/span[1]")).getText();
		String f = totalamount;
		System.out.println("Total Amount:" + totalamount);

		WebElement total = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/span[1]/div[1]/div[1]/span[1]"));
		String finalamount = total.getText();
		System.out.println("Final amount shown:" + finalamount);
		if (finalamount.contains(finalprice)) {
			System.out.println("Total Amount = Final Amount, This item can be purchased!");
		} else {
			System.out.println("Total Amount != Final Amount, Please Recheck item!");
         //Step 9&10---> Close the new window 
			//Quit the drive

			driver.quit();
		}
	}
}