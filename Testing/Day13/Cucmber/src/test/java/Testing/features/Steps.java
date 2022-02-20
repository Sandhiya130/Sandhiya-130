package Testing.features;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By; 
//import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.edge.EdgeDriver;

public class Steps {
	 WebDriver driver = null; 
	@Given("user in Demo auth login page")
	public void user_in_demo_auth_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		 driver = new EdgeDriver(); 
	      driver.navigate().to("https://demo.guru99.com/test/newtours/register.php"); 
	    
	}

	@When("user enter correct username")
	public void user_enter_correct_username() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement txt1 = driver.findElement(By.name("userName"));
		txt1.sendKeys("admin");
	}

	@And("user enter correct password")
	public void user_enter_correct_password() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement txt1 = driver.findElement(By.name("userName"));
		txt1.sendKeys("admin");
	}

	@And("user click on login")
	public void user_click_on_login() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement btnclick = driver.findElement(By.name("submit"));
		btnclick.click();
	}

	@Then("user redirect to homepage")
	public void user_redirect_to_homepage() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}



}
