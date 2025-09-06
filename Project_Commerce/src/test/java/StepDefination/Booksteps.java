package StepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.Bookpage;


public class Booksteps {
	
	 WebDriver driver;
	    Bookpage book;
	
	@Given("it should open in webbrowser")
	public void it_should_open_in_webbrowser() {
		 WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	       book = new Bookpage(driver);
	        book.homepage();
	  
	}
	
	
	@And("enter user and pass")
    public void enter_username_and_password() throws InterruptedException {
        book.clickLoginLink();
        book.enterEmail("mahi879082@gmail.com");
        book.enterPassword("8919215039@Mk");
        Thread.sleep(3000);
    }

    @And("click on sign")
    public void click_on_sign()  {
    book.clickSignIn();
    }

	@When("Search as {string}")
	public void search_as(String productname) {
		book.search(productname);
		
		
	    
	}

	@And("click on add to cart")
	public void click_on_add_to_cart() {
	   book.addtocart();
	}

	@And("go to shopping cart")
	public void go_to_shopping_cart() {
		book.shopingcart();
	    
	}

	@And("click on proceed with terms")
	public void click_on_proceed_with_terms() {
		book.proceedterms();
	  
	}

	@And("check out")
	public void check_out() {
		book.checkout();
	    
	}

	@And("go on with continue")
	public void go_on_with_continue() {
		book.continues();
	  
	}

	@Then("confirm order and continue")
	public void confirm_order_and_continue() {
		book.conformandcontinue();
		driver.quit();
	    
	}



	
	

}
