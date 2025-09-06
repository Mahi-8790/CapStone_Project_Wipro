
package StepDefination;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import PageObject.CartPage;

public class CartSteps {
    WebDriver driver;
    CartPage cartPage;

    @Given("it should open in browser")
    public void it_should_open_in_browser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        cartPage = new CartPage(driver);
        cartPage.openHomePage();
        
        
    }

    @When("Search {string}")
    public void search_product(String productName) {
        cartPage.searchProduct(productName);
    }

        
    

    @And("click on add to cart button")
    public void click_on_add_to_cart_button() {
        cartPage.addToCart();
    }

    @And("go to shopping cart page")
    public void go_to_shopping_cart_page() {
        cartPage.goToShoppingCart();
    }

    @And("click on remove\\(X) button")
    public void click_on_remove_x_button() {
        cartPage.removeFromCart();
        driver.quit();
    }
}

 // @When("click on remove\\(X) button")
 //   public void click_on_remove_x_button()
























