package com.selenium.project4;

import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCase1 {
	private static WebDriver driver;

	@Test(priority = 1)
	public void TestCase1() throws Exception {
	
		// Step1 (Launch the Browser using Navigate method
		WebDriverWait w = new WebDriverWait(driver, 20);
		driver.navigate().to("https://www.bigbasket.com/");
		System.out.println("Browser Launched Successfully");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		System.out.println("Window Maximized");

		// Step2 (Select the Banglore using DropDown Method)
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("//div[@id='headerControllerId']/header/div/div/div/div/ul/li[2]/div/a/span/span[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"//div[@id='headerControllerId']/header/div/div/div/div/ul/li[2]/div/div/div[2]/form/div/div/div/span/i"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='search']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='search']")).clear();
		Thread.sleep(3000);
		WebElement location = driver.findElement(By.xpath("//input[@type='search']"));
		location.sendKeys("Bangalore");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='ui-select-choices-row-1-0']/a/span")).click();
		
		// Using name click the Continue button
		driver.findElement(By.name("skipandexplore")).click();
		System.out.println("Clicked the Continue Button");

		
		// Step3(In Best Seller area click the first product and Add the basket)
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body/div[1]/div[8]/carousel-product-widget[1]/section[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/product-template-in-container[1]/div[1]/div[4]/div[3]/div[1]/div[5]/div[2]/button[1]"))
				.click();
		System.out.println("1st Product is successfully added the Basket");

		// Step4(Click the Add button check is there Add button is view or Not Using
		// Assert)
		Thread.sleep(3000);
		WebElement Display = driver.findElement(By.xpath(
				"//body/div[1]/div[8]/carousel-product-widget[1]/section[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/product-template-in-container[1]/div[1]/div[4]/div[3]/div[1]/div[5]/div[2]/button[1]"));
		Assert.assertEquals(false, Display.isDisplayed());
		System.out.println("Add Button is Not Displayed");

		// Step5(In basket Items added or not check using Assert)
		Thread.sleep(3000);
		String expected = "1 items";
		WebElement actual = driver.findElement(By.id("totalNumberOfCartItems"));
		String Text = actual.getText();
		System.out.println(Text);
		Assert.assertNotEquals(actual, expected);
		System.out.println("Expected and Actual is Same Item added");

		// Step 6(Assert Check the Mybasket is Displayed or not using isDisplayed
		// Method)
		WebElement displayed = driver.findElement(By.xpath(
				"//body/div[1]/div[1]/div[8]/div[1]/bigbasket-cart-template[1]/div[1]/div[2]/a[1]/span[1]/i[1]"));
		Assert.assertEquals(true, displayed.isDisplayed());
		System.out.println("Mybasket is Displayed");

		// Step 7 Click the same product check whether is added or not
		driver.findElement(By.xpath(
				"//body/div[1]/div[8]/carousel-product-widget[1]/section[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/product-template-in-container[1]/div[1]/div[4]/div[3]/div[1]/div[6]/button[2]/i[1]"))
				.click();
		WebElement Selected = driver.findElement(By.xpath(
				"//body/div[1]/div[8]/carousel-product-widget[1]/section[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/product-template-in-container[1]/div[1]/div[4]/div[3]/div[1]/div[6]/button[2]/i[1]"));
		Assert.assertEquals(false, Selected.isSelected());
		System.out.println("Increament Button is Not Selected");

		// Step8(Click the View and Basket Button)
		Thread.sleep(1000);
		// For Mouse over action we can use Action class using find the basket Templete
		Actions actions = new Actions(driver);
		WebElement menu = driver
				.findElement(By.xpath("//body/div[1]/div[1]/div[8]/div[1]/bigbasket-cart-template[1]/div[1]/div[2]"));
		actions.moveToElement(menu).perform();
		System.out.println("Action is working");

		// Using JavaScript Exector Click the View Basket and CheckOut
		Thread.sleep(3000);
		WebElement clk = driver.findElement(By.xpath("//button[contains(text(),'View Basket & Checkout')]"));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click();", clk);
		System.out.println("Clicked the View Basket and CheckOut");
		Thread.sleep(3000);

		// Step 9(Check whether Login Popup is displayed is not using Assert)
		Thread.sleep(3000);
		WebElement display = driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]"));
		Assert.assertEquals(true, display.isDisplayed());
		System.out.println("Login Popup is Displayed");

		// Step10(Take The ScreenShot in the Page)
		this.takeSnapshot(driver,"C:\\Users\\sandhiyaj\\Downloads\\TestingProject\\TestingProject\\Screenshots\\Screenshot1.png");
	}

	public static void takeSnapshot(WebDriver webdriver, String fileWithPath) throws Exception {
		TakesScreenshot scrshot = ((TakesScreenshot) webdriver);
		File SrcFile = scrshot.getScreenshotAs(OutputType.FILE);
		File DestFile = new File(fileWithPath);
		FileHandler.copy(SrcFile, DestFile);
		System.out.println("ScreenShot is Stored in this Location C:\\Users\\PRIYANKA\\eclipse-workspace\\BigBasket\\Screenshots\\Screenshot1.png");

		// Step11(Close the PopUp)
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/button[1]")).click();
		System.out.println("Popup Closed");

	}

	@Test(priority = 2)
	public void Case2() throws Exception {
		// File Location and To read the file File Input Stream Class
		FileInputStream fs = new FileInputStream(
				"C:\\Users\\sandhiyaj\\Downloads\\TestingProject\\TestingProject\\Excel\\Products.xlsx");
		// WorkBook Instanciation
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		XSSFSheet sheet = workbook.getSheetAt(0);
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);

		System.out.println("C:\\Users\\PRIYANKA\\eclipse-workspace\\BigBasket\\Excel\\Products.xlsx");
		// Read the Cell and Print the Data
		System.out.println(sheet.getRow(0).getCell(0));
		System.out.println(sheet.getRow(1).getCell(0));
		System.out.println(sheet.getRow(2).getCell(0));
		System.out.println(sheet.getRow(3).getCell(0));
		System.out.println(sheet.getRow(4).getCell(0));
		System.out.println(sheet.getRow(5).getCell(0));
		System.out.println(sheet.getRow(6).getCell(0));
		System.out.println("-----------------------------");
		System.out.println(sheet.getRow(0).getCell(1));
		System.out.println(sheet.getRow(1).getCell(1));
		System.out.println(sheet.getRow(2).getCell(1));
		System.out.println(sheet.getRow(3).getCell(1));
		System.out.println(sheet.getRow(4).getCell(1));
		System.out.println(sheet.getRow(5).getCell(1));
		System.out.println(sheet.getRow(6).getCell(1));

	}

	@Test(dataProvider = "login")

	public void TestCaseDataProvider(String mail) throws Exception {
		// Thread.sleep(2000);
		driver.get("https://www.bigbasket.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/ul[1]/li[2]/span[2]/a[1]"))
				.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'Login using Email Address')]")).click();
		driver.findElement(By.xpath("//input[@id='otpEmail']")).sendKeys(mail);
		driver.findElement(By.xpath(
				"//body/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/login[1]/div[1]/form[1]/div[2]/button[3]"))
				.click();
		System.out.println("DataProvider is Executed");
	}

	@DataProvider
	public Object[][] login() {
		return new Object[][] { new Object[] { "priyakumar11@gmail.com" }, };
	}

	@BeforeTest
	public void beforeTest() {
		// Configure Browser

		System.setProperty( "webdriver.edge.driver","D:/Sandhiya 130/Testing/edgedriver_win64/msedgedriver.exe");
		// Instantiate for Webdriver
		driver = new EdgeDriver();

	}

	@AfterTest
	public void afterTest() throws Exception {
		Thread.sleep(5000);
		// Close the Browser
		driver.close();
		System.out.println("Browser Closed");
	}
}