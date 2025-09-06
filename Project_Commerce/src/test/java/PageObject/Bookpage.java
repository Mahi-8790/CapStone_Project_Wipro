package PageObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Bookpage {
	
	WebDriver driver;
	
	// Locators
	    private By loginLink = By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a");
	    private By emailField = By.id("Email");
	    private By passwordField = By.id("Password");
	    private By signInButton = By.xpath("//*[@id='main']/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button"); 
	    private By searchBox = By.id("small-searchterms");
	    private By addToCartButton = By.xpath("//*[@id=\"main\"]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div/div/div[2]/div[3]/div[2]/button[1]");
	    private By shoppingCartLink = By.xpath("//*[@id=\"topcartlink\"]/a/span[1]");
	    private By procedterms = By.id("termsofservice"); 
	    private By checkout = By.id("checkout"); 
	    private By nextstep1 = By.xpath("//*[@id=\"billing-buttons-container\"]/button[2]");
	    private By nextstep2 = By.xpath("//*[@id=\"shipping-method-buttons-container\"]/button");
	    private By nextstep3 = By.xpath("//*[@id=\"payment-method-buttons-container\"]/button");
	    private By nextstep4 = By.xpath("//*[@id=\"payment-info-buttons-container\"]/button");
	    private By conform = By.xpath("//*[@id=\"confirm-order-buttons-container\"]/button");
	    private By finalconform = By.xpath("//*[@id=\"main\"]/div/div/div/div[2]/div/div[3]/button");
	
        
	   // constructor 
	    
	    public Bookpage(WebDriver driver) {
	        this.driver = driver;
	        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    }
	    
	    
	    // Actions
	    
	    public void homepage() {
	    	 driver.get("https://demo.nopcommerce.com/");
	         driver.manage().window().maximize();
	    	
	    }
	    
	    public void clickLoginLink() {
	        driver.findElement(loginLink).click();
	    }

	    public void enterEmail(String email) {
	        driver.findElement(emailField).click();
	        driver.findElement(emailField).sendKeys(email);
	    }

	    public void enterPassword(String password) {
	        driver.findElement(passwordField).click();
	        driver.findElement(passwordField).sendKeys(password);
	    }

	    public void clickSignIn() {
	        driver.findElement(signInButton).click();
	    }
	    
           
	    public void search(String productname) {
	      	driver.findElement(searchBox).click();
	        driver.findElement(searchBox).sendKeys(productname);
	        driver.findElement(searchBox).sendKeys(Keys.ENTER);
	    	
	    }
	    
         public void addtocart() {
        	 driver.findElement(addToCartButton).click();
	    	
	    }
         
         public void shopingcart() {
        	 driver.findElement(shoppingCartLink).click();
 	    	
 	    }
         
         public void proceedterms() {
        	 driver.findElement(procedterms).click();
        	 
         }
         
         public void checkout() {
        	 driver.findElement(checkout).click();
        	 
 	    }
         public void continues() {
        	 driver.findElement(nextstep1).click();
        	 driver.findElement(nextstep2).click();
        	 driver.findElement(nextstep3).click();
        	 driver.findElement(nextstep4).click();
 	    	
 	    }
         public void conformandcontinue() {
        	 driver.findElement(conform).click();
        	 driver.findElement(finalconform).click();
 	    	
 	    }
        
 	    
	    
	    
 
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
}
