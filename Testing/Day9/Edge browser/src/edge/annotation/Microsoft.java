
package edge.annotation;



import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Microsoft {
	
private static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.edge.driver","D:\\Sandhiya 130\\Testing\\msedgedriver.exe");
		driver = new EdgeDriver();
		
//driver = new ChromeDriver();
		
		// create javascript executor interface
		JavascriptExecutor js =(JavascriptExecutor)driver;
		
		// launch the site
		driver.get("https://demo.guru99.com/test/newtours/");
		
		
		// save the submit button as a web element
		WebElement button = driver.findElement(By.name("submit"));
		
		driver.findElement(By.name("userName")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		
		// click on submit button using java script executor
		js.executeScript("arguments[0].click();", button);
		
		
		// display alert message using java script executor
		js.executeScript("alert('Login Successful');");
         Thread.sleep(3000);
          System.out.println("code works perfectly");
            driver.switchTo().alert().accept();
                   Thread.sleep(3000);
                        driver.close();
	
}
}
