package testing.annotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Alert1 {

	
private static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
		//System.setProperty("webdriver.chrome.driver","D:/Sandhiya 130/Testing/chromedriver.exe");
		//driver = new ChromeDriver();
		System.setProperty("webdriver.edge.driver","D:\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		String txt = driver.switchTo().alert().getText();
		System.out.println("The Alert text is" + txt);
}
}