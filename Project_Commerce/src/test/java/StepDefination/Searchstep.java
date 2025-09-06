package StepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import PageObject.Searchpage;

public class Searchstep {
	WebDriver driver;
	Searchpage ser;

@Given("navigate to nopCommerce home page")
public void navigate_to_nop_commerce_home_page() {

	 WebDriverManager.chromedriver().setup();
       driver = new ChromeDriver();
      ser = new Searchpage(driver);
       ser.homepage();

    
}

@When("enter {string} in search box")
public void enter_in_search_box(String searchTerm) {
	ser.serch(searchTerm);
    
}

@And("click on search button")
public void click_on_search_button() {
	ser.serchbtn();
    
}

@Then("The search results page should display results for {string}")
public void the_search_results_page_should_display_results_for(String string) {
	System.out.println("products displayed");
	driver.quit();
   
}



	
	

}
