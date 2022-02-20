package testing.annotations;



import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Annotations {
	private static WebDriver driver;
  @Test (priority=2)
  public void Test1() {
	  System.out.println("Welcome to TestNG");
	  driver.get("http://www.amazon.in");
  }
 // @Test
  //public void Test4() {
	//String expectedtitle ="opera";
	//String actualtitle = driver.getTitle();
	
//	assert equals
//Assert.assertEquals(expectedtitle, actualtitle);
	
  @Test (priority=3)
  public void Test3() {
	  System.setProperty("webdriver.chrome.driver", "D:/Sandhiya 130/Testing/chromedriver.exe");
		driver = new ChromeDriver();
	 	  driver.get("http://www.flipkart.com");
  }
  @Test (priority=1)
  public void Test2() {
	  System.setProperty("webdriver.chrome.driver", "D:/Sandhiya 130/Testing/chromedriver.exe");
		driver = new ChromeDriver();
	 	  driver.get("http://www.google.com");
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "D:/Sandhiya 130/Testing/chromedriver.exe");
		driver = new ChromeDriver();
	  System.out.println("connect DB");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Disconnect DB");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("open the browser");
	  System.setProperty("webdriver.chrome.driver", "D:/Sandhiya 130/Testing/chromedriver.exe");
		driver = new ChromeDriver();

  }

  @AfterTest
  public void afterTest() {
	  System.out.println("close the browser");
  }

}