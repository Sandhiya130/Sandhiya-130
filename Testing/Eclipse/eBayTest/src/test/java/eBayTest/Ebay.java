package eBayTest;

//import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;


public class Ebay{
	 WebDriver driver = null; 
	@Given("user in the chrome page")
	public void user_in_the_chrome_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.setProperty("webdriver.edge.driver","D:\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("https://www.ebay.com/");
		driver.findElement(By.name("btnK")).submit();
	}

	@When("user goes to ebay page")
	public void user_goes_to_ebay_page() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		driver.get("https://www.ebay.com/");
		
	}

	@When("user enters the product in the search box")
	public void user_enters_the_product_in_the_search_box() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		WebElement search= driver.findElement(By.xpath("//input[@id='gh-ac']"));
		search.sendKeys("Apple Watches");
		System.out.println(search.getText());
	//	WebElement searchbtn=driver.findElement(By.id("gh-btn"));
		//searchbtn.click();
	}

	@And("shows the category of the product")
	public void shows_the_category_of_the_product() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		//WebElement category=driver.findElement(By.xpath("//option[contains(text(),'Consumer Electronics')]"));
		WebElement select=driver.findElement(By.xpath("//select[@id='gh-cat']"));
		Select dropdown =new Select(select);
		dropdown.selectByIndex(12);
		
	}

	@And("click on search")
	public void click_on_search() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		WebElement searchbtn=driver.findElement(By.id("gh-btn"));
		searchbtn.click();
	}

	@Then("user redirects to homepage")
	public void user_redirects_to_homepage() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
	}


	
}