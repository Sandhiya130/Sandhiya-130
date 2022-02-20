package selenium.activity3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity3 {
private static WebDriver driver;
	
public static void main(String[] args) throws InterruptedException {
	// TODO Auto-generated method stub
	//set path of the web driver
	System.setProperty("webdriver.chrome.driver","D:/Sandhiya 130/Testing/chromedriver.exe");
	driver=new ChromeDriver();

	JavascriptExecutor js =(JavascriptExecutor)driver;
	driver.get("http://webapps.tekstac.com/Shopify/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	WebElement fname = driver.findElement(By.id("firstname"));
	fname.sendKeys("Mithali");
	WebElement lname = driver.findElement(By.id("lastname"));
	lname.sendKeys("Raj");
	WebElement uname = driver.findElement(By.id("username"));
	uname.sendKeys("Mithali Raj");
	
	//WebElement name= driver.findElement(By.id("Rahul"));
	//driver.findElement(By.id("firstname")).sendKeys("Rahul");
	//driver.findElement(By.name("lname")).sendKeys("Dravid");
	//driver.findElement(By.name("usrnm")).sendKeys("Rahul Dravid");
	WebElement citydropdown = driver.findElement(By.id("selectcity"));
	
	//for selecting the dropdown value
	Select dropdown = new Select(citydropdown);
dropdown.selectByValue("mas");
	//radio
	
	
	WebElement radiobutton = driver.findElement(By.xpath("//body/form[1]/div[6]/input[2]"));
	radiobutton.click();
	WebElement password = driver.findElement(By.id("pass"));
	password.sendKeys("MR@123");
//driver.findElement(By.id("pass")).sendKeys("Rahul");
	WebElement button = driver.findElement(By.id("reg"));
	js.executeScript("arguments[0].click();", button);
	
}
}
