package PageObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searchpage {
	WebDriver driver;
	
	
	private By searchterm= By.id("small-searchterms");
	private By searchbtn = By.xpath("//*[@id=\"small-search-box-form\"]/button");
	
	// constructor 
    
    public Searchpage(WebDriver driver) {
        this.driver = driver;
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
	
    
    // Actions
    
    public void homepage() {
   	 driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
   	
   }
    
    public void serch(String searchTerm) {
      driver.findElements( searchterm);
      driver.findElement( searchterm).sendKeys(searchTerm);
    }
    
    public void serchbtn() {
    	driver.findElement(searchbtn).click();
    }

}
