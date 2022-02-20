package testing.annotations;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Draganddrop {
	private static WebDriver driver;
  @Test
  public void test() {
	  //broser
	  driver.get("http://demo.automationtesting.in/Static.html");
	 //dragging from
	  WebElement from=driver.findElement(By.cssSelector("#mongo"));
	  
	  //dropping destination
	  WebElement to=driver.findElement(By.cssSelector("#droparea"));
	  //action
	  
	  Actions builder=new Actions(driver);
	  builder.dragAndDrop(from,to).build().perform();
	  //act.build().perform();
	 // dragAndDrop.perform();
	  
  }
  
  

  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","D:/Sandhiya 130/Testing/chromedriver.exe");
		driver = new ChromeDriver();
  }

  @AfterTest
  public void afterTest() {
	  
  }

}
