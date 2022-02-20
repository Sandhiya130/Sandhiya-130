package testng.activity;



import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

class Fields{

private static WebDriver driver;
	
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {

		 System.setProperty("webdriver.edge.driver","D:\\Sandhiya 130\\Testing\\msedgedriver.exe");
		driver = new EdgeDriver();

//		driver.get("http://demo.automationtesting.in/Register.html");
		
	}
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}
	
	
	
	@Test
	void test() throws InterruptedException {
//		fail("Not yet implemented");
		driver.get("http://practice.automationtesting.in");
		JavascriptExecutor js =(JavascriptExecutor)driver;
		  
		  driver.navigate().to("http://practice.automationtesting.in/my-account/");
		  driver.findElement(By.name("email")).sendKeys("sandhiya@gmail.com");
		  driver.findElement(By.id("reg_password")).sendKeys("");
		  WebElement button = driver.findElement(By.name("register"));
			js.executeScript("arguments[0].click();", button);
		//Thread.sleep(3000);
			js.executeScript("alert('Enter all details');");
			
		 
		
		WebElement btnclick = driver.findElement(By.xpath("//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-36']/div[1]/div[1]/div[1]/div[2]/form[1]/p[3]/input[3]"));
			btnclick.click();
			System.out.println("Enter mandatory fields");  
			
	
	
		
		
		
		
	}
}