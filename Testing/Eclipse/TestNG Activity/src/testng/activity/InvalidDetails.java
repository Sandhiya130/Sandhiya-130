package testng.activity;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.edge.EdgeeDriver;

class InvalidDetails {
	private static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		

			 System.setProperty("webdriver.edge.driver","D:\\Sandhiya 130\\Testing\\msedgedriver.exe");
			driver = new EdgeDriver();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	
	}
@Test
	void test() {
		//fail("Not yet implemented");
		driver.get("http://practice.automationtesting.in");
		driver.navigate().to("http://practice.automationtesting.in/my-account/");
		//driver.findElement(By.name("password")).sendKeys("sandhiya@26A");
		WebElement email=driver.findElement(By.name("email")); email.sendKeys("sandhiya@");
		WebElement pass= driver.findElement(By.id("reg_password"));pass.sendKeys("123");
		 WebElement button = driver.findElement(By.name("register"));
		String expected_email= "sandhiyasandi4@gmail.com";
		String actual_email="sandhiya@";
		Assert.assertEquals(expected_email, actual_email);
	
	
	
	//WebElement pass= driver.findElement(By.name("password"));pass.sendKeys("123");
	String expected_pass= "sandhiya@26A";
	String actual_pass="123";
	Assert.assertEquals(expected_pass, actual_pass);
	String actualpass= pass.getText();
	System.out.println("invalid password:"+ actual_pass);
}
}
	//void password() {
		
	//}


