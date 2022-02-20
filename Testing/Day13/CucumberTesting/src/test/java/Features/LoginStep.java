package Features;
//import org.openqa.selenium.By;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.edge.EdgeDriver;

public class LoginStep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=null;
		@Given("user in Demo auth login page")
		public void login_page() {
		    // Write code here that turns the phrase above into concrete actions
			driver = new EdgeDriver(); 
		      driver.navigate().to("https://www.facebook.com/"); 
		}

		@When("iser enter correct username")
		public void user_enter_correct_username() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@When("user enter correct password")
		public void user_enter_correct_password() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@When("user click on login")
		public void user_click_on_login() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@Then("user redirect to homepage")
		public void user_redirect_to_homepage() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}


	}

}
