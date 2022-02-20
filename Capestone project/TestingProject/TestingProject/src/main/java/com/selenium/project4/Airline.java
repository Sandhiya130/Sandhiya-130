package com.selenium.project4;

import org.testng.annotations.Test;
import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.TakesScreenshot;

import org.testng.annotations.BeforeTest;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

import static org.testng.Assert.assertEquals;

import java.io.File;

public class Airline {
	private static WebDriver driver;

	@Test(priority = 1)
	public void airline() throws Exception {

		driver.manage().window().maximize();
		
		//Step 1 -->Navigate to URL 
		
		driver.navigate().to("https://www.cleartrip.com/flights");
		
		//Step 2--> Select Round Trip
		
		WebElement radio = driver.findElement(
				By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/label[2]/div[1]"));
		radio.click();
		
		// Step 4:Select From: New Delhi To: Mumbai 

		Thread.sleep(3000);

		//Delhi
		
		WebElement from = driver.findElement(By.xpath(
				"//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
		from.click();
		driver.findElement(By.xpath("//p[contains(text(),'New Delhi, IN - Indira Gandhi Airport (DEL)')]")).click();
		
		//Mumbai
		
		WebElement to = driver.findElement(By.xpath(
				"//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[5]/div[1]/div[1]/div[1]/input[1]"));
		to.click();
		driver.findElement(By.xpath("//p[contains(text(),'Mumbai, IN - Chatrapati Shivaji Airport (BOM)')]")).click();
		
		//Step 5:. Select Depart on 1st July and Return on 8th July 
		// departing date
		// Apply Implicit wait
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//p[normalize-space()='Round trip']")).click();
		driver.findElement(By.xpath("//div[@class='flex flex-middle p-relative homeCalender']/button[1]")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//*[@d='M5 12.875h10.675l-4.9 4.9L12 19l7-7-7-7-1.225 1.225 4.9 4.9H5z'])[1]"))
				.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//*[@d='M5 12.875h10.675l-4.9 4.9L12 19l7-7-7-7-1.225 1.225 4.9 4.9H5z'])[1]"))
				.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//*[@d='M5 12.875h10.675l-4.9 4.9L12 19l7-7-7-7-1.225 1.225 4.9 4.9H5z'])[1]"))
				.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//*[@d='M5 12.875h10.675l-4.9 4.9L12 19l7-7-7-7-1.225 1.225 4.9 4.9H5z'])[1]"))
				.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(
				"//div[@aria-label='Fri Jul 01 2022']//div[@class='p-1 day-gridContent flex flex-middle flex-column flex-center Round-trip monthStart'][normalize-space()='1']"))
				.click();
		
		// selecting the return date
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath(
				"//div[@aria-label='Fri Jul 08 2022']//div[@class='p-1 day-gridContent flex flex-middle flex-column flex-center Round-trip'][normalize-space()='8']"))
				.click();
		Thread.sleep(3000);
		
		// Step 6:. Click on the More options URL
		
		driver.findElement(By.xpath("//strong[contains(text(),'More options:')]")).click();
		
		// Step 7:Select Class of Travel as “Business” 
		
		WebElement business = driver.findElement(By.xpath(
				"//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[6]/div[1]/div[1]/select[1]"));
		business.click();
		Select options = new Select(business);
		options.selectByIndex(1);
		business.click();
		
		// Step 8:. Click on Search Flights 
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(.,'Search flights')]")).click();
		
		//  All flights number
		
		String all = driver	.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/aside[1]/div[4]/div[1]")).getText();
		System.out.println("Number of Flights available(onward and return) : " + all);

		Thread.sleep(4000);
		
		//Step 9: Take a screenshot of the results page
        //path
		
		this.takeSnapShot(driver, "C:\\Users\\sandhiyaj\\Downloads\\TestingProject\\TestingProject\\Screenshots\\flights.png");
	}

	public static void takeSnapShot(WebDriver webdriver, String fileWithPath) throws Exception {

		// web driver object to TakeScreenshot

		TakesScreenshot scrShot = ((TakesScreenshot) webdriver);

		// Call getScreenshotAs method to create image file

		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);

		// Move image file to new destination

		File DestFile = new File(fileWithPath);

		// Copy file at destination

		FileUtils.copyFile(SrcFile, DestFile);

	}

	@Test(priority = 2)
	public void nonstop() throws Exception {

		// Step 10:Show only non-stop flights

		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//body/div[@id='root']/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/aside[1]/div[4]/div[2]/div[2]/div[1]/label[1]/div[1]"))
				.click();
		// Step 11:Take a screenshot of this page with only non-stop flights.

		this.takeSnap(driver, "C:\\Users\\sandhiyaj\\Downloads\\TestingProject\\TestingProject\\Screenshots\\non stop.png");
	}
	public static void takeSnap(WebDriver webdriver, String fileWithPath) throws Exception {
		TakesScreenshot scrShot = ((TakesScreenshot) webdriver);
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile = new File(fileWithPath);
		FileUtils.copyFile(SrcFile, DestFile);
	}

	@Test(priority = 3)
	public void price() throws Exception {
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		
		// Step 11: Find the number of Flights available in each leg (onward and return) 
		
		String fli = driver	.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/aside[1]/div[4]/div[1]")).getText();
		System.out.println("Number of Non-Stop Flights available(onward and return) : " + fli);
		
		//Step 12:Capture the total price of the return ticket
		
    	String returntickets = driver.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[12]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/p[1]")).getText();
		System.out.println("Price of return ticket:" + returntickets);
	}

	@Test(priority = 4)
	public void amount() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Step 13:. In the new Window, verify that the price is same as in step j 
		
		String expectedprice = "₹44,292";
		WebElement act1 = driver.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[7]/div[1]/div[2]/div[1]/div[1]/span[1] "));
		String actual = act1.getText();
        Assert.assertEquals(actual, expectedprice);
		System.out.println("Verified price of the ticket:" + actual);

	}

	@Test(priority = 5)
	public void capture() throws Exception {

		// capturing the price of the ticket

		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Details')]")).click();
		this.takeSnaps(driver, "C:\\Users\\sandhiyaj\\Downloads\\TestingProject\\TestingProject\\Screenshots\\capture.png");
	}

	public static void takeSnaps(WebDriver webdriver, String fileWithPath) throws Exception {

		TakesScreenshot scrShot = ((TakesScreenshot) webdriver);

		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);

		File DestFile = new File(fileWithPath);

		FileUtils.copyFile(SrcFile, DestFile);

	}
	// Thread.sleep(3000);

	@Test(priority = 6)
	public void book() throws Exception {

		//Step 13: Click on book

		WebElement link = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='₹44,292'])[4]/following::button[1]"));

       //Thread.sleep(2000);
		Actions newwin = new Actions(driver);
		newwin.keyDown(Keys.SHIFT).click(link).keyUp(Keys.SHIFT).build().perform();
       
		Thread.sleep(1000);

	}

	@Test(priority = 7)
	public void clickOnContinue() throws Exception {
		Thread.sleep(3000);

		// Step 15: Verify that the total price is still the same as in step n & j.

		String expectedtotal = "₹44,292";
		WebElement total = driver.findElement(By.xpath("//p[contains(text(),'₹44,292')]"));
		String actualtotal = total.getText();
		Assert.assertEquals(actualtotal, expectedtotal);
		System.out.println("Verifying the total price" + expectedtotal);
	//	driver.navigate().to("https://www.cleartrip.com/flights/itinerary/NI6855270a9f-ec0b-4b78-808a-220216141551/info?ancillaryEnabled=false");
	}

	@BeforeTest
	public void beforeTest() {
		// Configure Browser

		System.setProperty( "webdriver.edge.driver","D:/Sandhiya 130/Testing/edgedriver_win64/msedgedriver.exe");
		
		// Instantiate for Webdriver
		driver = new EdgeDriver();

	
		    }

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}