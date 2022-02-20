
package activity.testng;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

class QAtechhub {

	private static WebDriver driver;


	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		  System.setProperty("webdriver.edge.driver","D:\\Sandhiya 130\\Testing\\msedgedriver.exe");
			driver = new EdgeDriver();
			//String expectedtitle="QA Automation Tools Trainings and Tutorials ";
			//String actualtitle=driver.getTitle();
			//Assert.assertNotEquals(actualtitle, expectedtitle);
			
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@Test 
	 void test() {
		//fail("Not yet implemented");
		driver.get("http://google.com");
		driver.navigate().to("http://qatechhub.com");
		//using if else 
		
		String expectedtitle ="QA Automation Tools Trainings and Tutorials | QA Tech Hub";
		
		
		
		String actualtitle = driver.getTitle();
	     System.out.println( "Actual title of the page is :"+actualtitle);
	     System.out.println("Expected title of the page is :"+expectedtitle);
	     
	     
	     if(actualtitle.toLowerCase().contains(expectedtitle.toLowerCase())) {
	    	 System.out.println("TEST PASS"); 
	    	 
	     }else {
	    	 System.out.println("TEST FAIL");
	     }
	}
	@Test
	   void navigate() {
		   driver.manage().window().maximize();
		   driver.navigate().to("http://www.facebook.com");
		   driver.navigate().to("http://qatechhub.com");
		   driver.navigate().refresh();
		   String browser= driver.getTitle();
		     System.out.println( "url of the page:"+browser);
		   driver.close();
		   
	   }
	//@Test
	  // void qa() {
		  // driver.navigate().to("http://qatechhub.com");
		   //String browser= driver.getTitle();
		     //System.out.println( "url of the page:"+browser);
		     //driver.navigate().forward("http://qatechhub.com");
		    // driver.navigate().forward();  
		    // driver.navigate().refresh();
	    	
	    //driver.close();
	    
	}
	
	


