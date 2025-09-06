package PageObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class wishlistpage {
	WebDriver driver;
	
	
	        private By searchterm= By.id("small-searchterms");
          	private By searchbtn = By.xpath("//*[@id=\"small-search-box-form\"]/button");
	        private By wishlist = By.xpath("//*[@id=\"main\"]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div/div/div[2]/div[3]/div[2]/button[3]");
			private By wishpage = By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[3]/a/span[1]");
		
			// //*[@id="add-to-wishlist-button-5"] //*[@id="add-to-wishlist-button-5"]



   //constructor 

    public wishlistpage(WebDriver driver) {
    this.driver = driver;
    this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));   
    
}
    // actions 
    
    public void homepage() {
      	 driver.get("https://demo.nopcommerce.com/");
           driver.manage().window().maximize();
      	
      }
    
    public void searchterm() {
    	driver.findElement(searchterm).click();
    	driver.findElement(searchterm).sendKeys("Samsung Galaxy S24 256GB");
    }
    
    
      public void searchbtn() {
    	  driver.findElement(searchbtn).click();
      }
      
      
      public void wishlist() {
    	  driver.findElement(wishlist).click();;
      }
        public void wishpage() {
        	driver.findElement(wishpage).click();;
        }
    
    
}