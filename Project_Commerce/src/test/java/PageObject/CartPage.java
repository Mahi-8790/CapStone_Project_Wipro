package PageObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class CartPage {
    WebDriver driver;

    // Locators
    private By searchBox = By.id("small-searchterms");
    private By addToCartButton = By.xpath("//*[@id=\"main\"]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div/div/div[2]/div[3]/div[2]/button[1]");
    private By shoppingCartLink = By.xpath("//*[@id=\"topcartlink\"]/a/span[1]");
    private By removeButton = By.xpath("//*[@id=\"shopping-cart-form\"]/div[1]/table/tbody/tr/td[7]/button");

    // Constructor
    public CartPage(WebDriver driver) {
        this.driver = driver;
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    // Actions
    public void openHomePage() {
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
    }

    public void searchProduct(String productName)  {
    	    
        driver.findElement(searchBox).click();
        driver.findElement(searchBox).sendKeys(productName);
        driver.findElement(searchBox).sendKeys(Keys.ENTER);
    }

    public void addToCart() {
        driver.findElement(addToCartButton).click();
    }

    public void goToShoppingCart() {
        driver.findElement(shoppingCartLink).click();
    }

    public void removeFromCart() {
        driver.findElement(removeButton).click();
    }
}
