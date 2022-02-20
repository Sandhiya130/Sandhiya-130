package selenium.activity1;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity1 {
private static WebDriver driver;
	
public static void main(String[] args) throws InterruptedException {
	// TODO Auto-generated method stub
	//set path of the web driver
	System.setProperty("webdriver.chrome.driver","D:/Sandhiya 130/Testing/chromedriver.exe");
	driver=new ChromeDriver();
	System.out.println("Register successful");
	//javascript executor
	
	JavascriptExecutor js =(JavascriptExecutor)driver;
	
	//link
	
	
	driver.get("http://webapps.tekstac.com/InvoiceUpdates/");
	driver.manage().window().maximize();
//implicit wait method
	//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	//sleep method
	//Thread.sleep(3000);
	//Adding explicit statement
	
	
	driver.findElement(By.id("name1")).sendKeys("Rakesh");
	driver.findElement(By.id("number")).sendKeys("123");
	driver.findElement(By.id("oldUser")).sendKeys("123");
	
	//checkbox
	
	
	WebElement checkbox = driver.findElement(By.xpath("//input[@id='oldUser']"));
	checkbox.click();
	
	//radio button
	
	//adding explicit method
	WebDriverWait wait=new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tbody/tr[4]/td[2]/input[2]")));
	WebElement radiobutton = driver.findElement(By.xpath("//tbody/tr[4]/td[2]/input[2]"));
	radiobutton.click();
	
	//drop down
	
	
	WebElement invoicedropdown = driver.findElement(By.xpath("//tbody//tr//td//select"));
	
	//for selecting the dropdown value
	Select dropdown = new Select(invoicedropdown);
	dropdown.selectByValue("utility invoice");
	//amount
	driver.findElement(By.name("amount")).sendKeys("3000");
	
	//mobile number
	
	
	driver.findElement(By.name("num")).sendKeys("987654321");
	driver.findElement(By.name("comments")).sendKeys("New user invoice");
	//JavascriptExecutor js =(JavascriptExecutor)driver;
	WebElement button = driver.findElement(By.id("submit"));
	js.executeScript("arguments[0].click();", button);
	
	
	// display alert message using java script executor
	js.executeScript("alert('Registered Successfully');");


}
}
//New User
//* Category as 'Utility Invoice' 
//* Amount as 1000
//* Mobile Number as 9876543210
//* Comments as 'New User Invoice'
