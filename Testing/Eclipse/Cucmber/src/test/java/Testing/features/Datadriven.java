package Testing.features;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Datadriven{
	WebDriver driver=null;
	@Given("useer in login page")
	public void useer_in_login_page() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sandhiyaj\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://demo.guru99.com/test/newtours/");


	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	@When("user enter username as sandhiya and password as sandhiya")
	public void user_enter_username_as_sandhiya_and_password_as_sandhiya() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
	}

	@When("user enter username as admin and password as admin")
	public void user_enter_username_as_admin_and_password_as_admin() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	@When("user enter username as dikshee and password as diskhii")
	public void user_enter_username_as_dikshee_and_password_as_diskhii() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
	}

}