package testing.annotations;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {

	WebDriver driver;

	@Test
	public void DragnDrop() {
		  System.setProperty("webdriver.chrome.driver", "D:/Sandhiya 130/Testing/chromedriver.exe");;
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");

		
		WebElement From = driver.findElement(By.xpath("//*[@id='credit2']/a"));
		WebElement To = driver.findElement(By.xpath("//*[@id='bank']/li"));

		Actions act = new Actions(driver);
        act.dragAndDrop(From, To).build().perform();
	}
}