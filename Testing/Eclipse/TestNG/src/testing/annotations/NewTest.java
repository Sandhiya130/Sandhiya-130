package testing.annotations;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
  @Test
  public void test() {
	  System.out.println("welcome to testNG");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("connect to DB");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("disconnect to DB");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Open the browser");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("close the browser");
  }

}
