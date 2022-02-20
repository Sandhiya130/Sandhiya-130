package activity.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//import org.testng.Assert.assertEquals;

public class Facebook {
	private static WebDriver driver;
	 
  @Test (priority=1)
  public void test() {
	  driver.get("http://google.com");
	  WebElement face = driver.findElement(By.name("q"));
		face.sendKeys("http://www.fb.com");
	 
		driver.findElement(By.name("btnK")).submit();
		driver.navigate().to("http://www.facebook.com");
		
	
		String expectedurl="https://www.facebook.com";
		String actualurl=driver.getCurrentUrl();
		Assert.assertNotEquals(expectedurl,actualurl);
	  //driver.navigate().to("");
  }
  @Test (priority=2)
  public void login() throws Exception {
	  driver.manage().window().maximize();
	 
	  driver.navigate().to("http://www.facebook.com/#");
		
	 // WebElement login = 
	//driver.findElement(By.xpath("//body/div[3]/div[1]")).submit();
	driver.navigate().to("https://www.facebook.com/signup");
	Thread.sleep(4000);
	WebElement fname=driver.findElement(By.name("firstname")); fname.sendKeys("Sandhiya ");
	//String msg= fname.getText();
	//String text=driver.findElement(By.name("firstname")).getText();
	//System.out.println("    "+msg);

	WebElement lname=driver.findElement(By.name("lastname")); lname.sendKeys("Jagadeesan");
	WebElement mail=driver.findElement(By.name("reg_email__")); mail.sendKeys("sandhiyasandi4@gmail.com");
	WebElement email=driver.findElement(By.name("reg_email_confirmation__")); email.sendKeys("sandhiyasandi4@gmail.com");
	WebElement password=driver.findElement(By.name("reg_passwd__")); password.sendKeys("sandy@20");
	WebElement day = driver.findElement(By.name("birthday_day"));

	// for selecting the dropdown value
	Select dropdown = new Select(day);
	dropdown.selectByValue("20");
	WebElement month = driver.findElement(By.xpath("//select[@id='month']"));

	// for selecting the dropdown value
	Select dropdown1 = new Select(month);
	dropdown1.selectByIndex(4);
	WebElement year = driver.findElement(By.name("birthday_year"));

	// for selecting the dropdown value
	Select dropdown2 = new Select(year);
	dropdown2.selectByValue("1998");
		//login.click();
	WebElement gender=driver.findElement(By.xpath("//label[contains(text(),'Female')]")); gender.click();
	WebElement register=driver.findElement(By.name("websubmit")); register.click();
		//login.click();
	 
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.edge.driver","D:\\Sandhiya 130\\Testing\\msedgedriver.exe");
		driver = new EdgeDriver();
  }

  @AfterTest
  public void afterTest() {
  }

}
