package com.selenium.project4;

import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class Testcase2{
  private  static WebDriver driver;



  
  @BeforeTest
  public void beforeTest() {
	  System.out.println("open the browser");
		// Configure Browser

		System.setProperty( "webdriver.edge.driver","D:/Sandhiya 130/Testing/edgedriver_win64/msedgedriver.exe");
		// Instantiate for Webdriver
		driver = new EdgeDriver();

	
//	    System.setProperty("webdriver.edge.driver","D:/Testing/msedgedriver.exe");
//		driver = new EdgeDriver();
   
  }
  
  public void TestCase() throws Exception {
	  
	  System.out.println("=>Testcase2");
//	  step1
	Thread.sleep(1000);
	System.out.println("=>opening bigbasket website");
			driver.get("https://www.bigbasket.com/");
			Thread.sleep(2000);
//			step2
			driver.findElement(By.xpath("//div[@id='headerControllerId']/header/div/div/div/div/ul/li[2]/div/a/span/span[3]")).click();
			Thread.sleep(2000);
		    driver.findElement(By.xpath("//div[@id='headerControllerId']/header/div/div/div/div/ul/li[2]/div/div/div[2]/form/div/div/div/span/i")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//input[@type='search']")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//input[@type='search']")).clear();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Bangalore");
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//div[@id='ui-select-choices-row-1-0']/a/span")).click();
		    Thread.sleep(2000);
//		    step 3
		    Thread.sleep(2000);
			driver.findElement(By.name("skipandexplore")).click();
			Thread.sleep(1000);		    
		    
		    
//		step 4    
//		  p1
		    
//			adding sleep method
					Thread.sleep(5000);
					System.out.println("--------------------------------------------");
					System.out.println("P1 added");
//		    searching p1
		    driver.findElement(By.id("input")).click();
		    driver.findElement(By.id("input")).clear();
		    driver.findElement(By.id("input")).sendKeys("White Sandwich bread");
		    driver.findElement(By.xpath("//div[@id='navbar-main']/div/div[3]/div/div/button/i")).click();
		    driver.findElement(By.xpath("//div[@id='dynamicDirective']/product-deck/section/div[2]/div[4]/div/div/div/div[2]/div/div/product-template/div/div[4]/div[3]/div/div[3]/div[2]/div[2]/button")).click();

//		 p2 
		 // Apply Implicit wait
		 			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		    System.out.println("------------");
			System.out.println("P2 added");
//			adding sleep method
					Thread.sleep(5000);
			    driver.findElement(By.id("input")).click();
		    driver.findElement(By.id("input")).clear();
		    driver.findElement(By.id("input")).sendKeys("oninons");
		    driver.findElement(By.xpath("//div[@id='navbar-main']/div/div[3]/div/div/button/i")).click();
			Thread.sleep(5000);
			// Apply Implicit wait
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		    driver.findElement(By.xpath("//div[@id='dynamicDirective']/product-deck/section/div[2]/div[4]/div/div/div/div[2]/div/div/product-template/div/div[4]/div[3]/div/div[3]/div[2]/div[2]/button")).click();
			Thread.sleep(5000);
		    driver.findElement(By.xpath("//body/div[1]/div[3]/product-deck[1]/section[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/product-template[1]/div[1]/div[4]/div[3]/div[1]/div[3]/div[3]/button[2]")).click();
//  p3  
			// Apply Implicit wait
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		    System.out.println("------------");
			System.out.println("P3 added");
//			adding sleep method
		    Thread.sleep(5000);
			driver.findElement(By.id("input")).click();
			driver.findElement(By.id("input")).clear();
			driver.findElement(By.id("input")).sendKeys("Amul Butter");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//div[@id='navbar-main']/div/div[3]/div/div/button/i")).click();
driver.findElement(By.xpath("//div[@id='dynamicDirective']/product-deck/section/div[2]/div[4]/div/div/div/div[2]/div/div/product-template/div/div[4]/div[3]/div/div[3]/div[2]/div[2]/button")).click();
//			P4
			System.out.println("------------");
			System.out.println("P4 added");
//			adding sleep method
					Thread.sleep(5000);
			driver.findElement(By.id("input")).click();
					driver.findElement(By.id("input")).clear();
					driver.findElement(By.id("input")).sendKeys("Coffee");
					Thread.sleep(5000);
					driver.findElement(By.xpath("//div[@id='navbar-main']/div/div[3]/div/div/button/i")).click();
					Thread.sleep(5000);
driver.findElement(By.xpath("//div[@id='dynamicDirective']/product-deck/section/div[2]/div[4]/div/div/div/div[2]/div/div/product-template/div/div[4]/div[3]/div/div[3]/div[2]/div[2]/button")).click();
					
					Thread.sleep(5000);
driver.findElement(By.xpath("//body/div[1]/div[3]/product-deck[1]/section[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/product-template[1]/div[1]/div[4]/div[3]/div[1]/div[3]/div[3]/button[2]/i[1]")).click();
					
					Thread.sleep(5000);
driver.findElement(By.xpath("//body/div[1]/div[3]/product-deck[1]/section[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/product-template[1]/div[1]/div[4]/div[3]/div[1]/div[3]/div[3]/button[2]/i[1]")).click();

					Thread.sleep(5000);
//p5
					// Apply Implicit wait
					driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
					System.out.println("------------");
					System.out.println("P5 added");
					driver.findElement(By.id("input")).click();
					driver.findElement(By.id("input")).clear();
					driver.findElement(By.id("input")).sendKeys("Marie Gold Biscuits");
					driver.findElement(By.xpath("//div[@id='navbar-main']/div/div[3]/div/div/button/i")).click();
driver.findElement(By.xpath("//div[@id='dynamicDirective']/product-deck/section/div[2]/div[4]/div/div/div/div[2]/div/div/product-template/div/div[4]/div[3]/div/div[3]/div[2]/div[2]/button")).click();
					Thread.sleep(5000);
driver.findElement(By.xpath("//body/div[1]/div[3]/product-deck[1]/section[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/product-template[1]/div[1]/div[4]/div[3]/div[1]/div[3]/div[3]/button[2]")).click();

					Thread.sleep(5000);
//p6
					// Apply Implicit wait
					driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
					System.out.println("------------");
					System.out.println("P6 added");
					driver.findElement(By.id("input")).click();
					driver.findElement(By.id("input")).clear();
					driver.findElement(By.id("input")).sendKeys("cadbury chocolate");
					driver.findElement(By.xpath("//div[@id='navbar-main']/div/div[3]/div/div/button/i")).click();
					Thread.sleep(6000);
driver.findElement(By.xpath("//div[@id='dynamicDirective']/product-deck/section/div[2]/div[4]/div/div/div/div[2]/div/div/product-template/div/div[4]/div[3]/div/div[3]/div[2]/div[2]/button")).click();
					Thread.sleep(6000);
driver.findElement(By.xpath("//body/div[1]/div[3]/product-deck[1]/section[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/product-template[1]/div[1]/div[4]/div[3]/div[1]/div[3]/div[3]/button[2]")).click();
					Thread.sleep(6000);
driver.findElement(By.xpath("//body/div[1]/div[3]/product-deck[1]/section[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/product-template[1]/div[1]/div[4]/div[3]/div[1]/div[3]/div[3]/button[2]")).click();
Thread.sleep(6000);
					
driver.findElement(By.xpath("//body/div[1]/div[3]/product-deck[1]/section[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/product-template[1]/div[1]/div[4]/div[3]/div[1]/div[3]/div[3]/button[2]")).click();
Thread.sleep(6000);
					
					
System.out.println("-----------------------------------------------------");					
					
 System.out.println(" 6 items added");
//Assertion  	    
	  		String exp = "6 items";
	  		WebElement actl = driver.findElement(By.id("totalNumberOfCartItems"));
	  		//
	  		String amsg = actl.getText();
	  		System.out.println("---Assertion => Printoutput");					
	System.out.println("6 items added to basket");
	  		Assert.assertEquals(amsg, exp);	
	  		Thread.sleep(2000);

  }
  public void TestCase1() throws Exception {

		System.out.println("----------------------------------------");
	  System.out.println("Excel Sheet->");    

				//path of the file
				File src=new File("C:\\Users\\sandhiyaj\\Downloads\\TestingProject\\TestingProject\\Excel\\Products.xlsx");
				
				//load the file
				
				FileInputStream fis=new FileInputStream(src);
				
			//load the work book
				
				XSSFWorkbook wb=new XSSFWorkbook(fis);
				
				//load the sheet
				
			    XSSFSheet sh1=wb.getSheetAt(0);
			//spectify the row and cell count which we want to read
			    Row row = sh1.getRow(0);
			    Cell cell = row.getCell(0);
			    
			 	
				System.out.println("Products");    
				System.out.println("---------------------------------------------------");        
			    
			System.out.println(sh1.getRow(0).getCell(0));
			System.out.println(sh1.getRow(1).getCell(0));
			System.out.println(sh1.getRow(2).getCell(0));
			System.out.println(sh1.getRow(3).getCell(0));
			System.out.println(sh1.getRow(4).getCell(0));
			System.out.println(sh1.getRow(5).getCell(0));
			System.out.println(sh1.getRow(6).getCell(0));
			
			
			System.out.println("------------------------------------------------------------------------------------"); 	
			
			System.out.println("Quantity");  
			System.out.println("---------------------------------------------------"); 
		    
				System.out.println(sh1.getRow(0).getCell(1));
				System.out.println(sh1.getRow(1).getCell(1));
				System.out.println(sh1.getRow(2).getCell(1));
				System.out.println(sh1.getRow(3).getCell(1));
				System.out.println(sh1.getRow(4).getCell(1));
				System.out.println(sh1.getRow(5).getCell(1));
				System.out.println(sh1.getRow(6).getCell(1));
			
			} 
		
  
   @AfterTest
  public void afterTest() throws Exception {
	   Thread.sleep(2000);
	   driver.close();
	  System.out.println("close the browser");
  }
}
