package StepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.Searchpage;
import PageObject.wishlistpage;

public class wishliststep {
	WebDriver driver;
	wishlistpage wish;
	
	@And ("navigate homepage")
	public void navigate_homepage() {
		WebDriverManager.chromedriver().setup();
	       driver = new ChromeDriver();
	      wish = new wishlistpage(driver);
	       wish.homepage();

	}
	
	
	
	@When("search for mobile")
	public void search_for_mobile() {
	
		wish.searchterm();
		wish.searchbtn();
		
	   
	}

	@And("select the first product from the search results")
	public void select_the_first_product_from_the_search_results() {
		System.out.println("laptop selected");
	    
	}

	@And("add the product to my wishlist")
	public void add_the_product_to_my_wishlist() {
		wish.wishlist();
	    
	}

	@Then("The product should appear in my wishlist")
	public void the_product_should_appear_in_my_wishlist() {
	    wish.wishpage();
	    driver.quit();
	}

}
