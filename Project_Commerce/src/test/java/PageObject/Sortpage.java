package PageObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Sortpage {
	WebDriver driver;
	
	
	    private By loginLink = By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a");
	    private By emailField = By.id("Email");
	    private By passwordField = By.id("Password");
	    private By signInButton = By.xpath("//*[@id='main']/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button");
	    private By electronics = By.xpath("//*[@id=\"main\"]/div/div/div/div/div[3]/div/div[1]/div/div/a/img");
	    private By cameraphoto = By.xpath("//*[@id=\"main\"]/div/div[3]/div/div[2]/div[1]/div/div[1]/div/div/a/img");
	    

	    private By namesort1 = By.xpath("//*[@id=\"products-orderby\"]/option[2]");
	    private By namesort2 = By.xpath("//*[@id=\"products-orderby\"]/option[3]");
	    private By pricesort1 = By.xpath("//*[@id=\"products-orderby\"]/option[4]");
	    private By pricesort2 = By.xpath("//*[@id=\"products-orderby\"]/option[5]");
	    private By display6 = By.xpath("//*[@id=\"products-pagesize\"]/option[2]");
	    private By display9 = By.xpath("//*[@id=\"products-pagesize\"]/option[3]");
	    
	    private By list = By.xpath("//*[@id=\"main\"]/div/div[3]/div/div[2]/div[1]/div[1]/a[2]");
	    private By homepage = By.xpath("/html/body/div[6]/div[1]/div[2]/div[1]/a/img");
	    
	    
	    

		   // constructor 
		    
		    public Sortpage(WebDriver driver) {
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

		    public void enterEmail(String usern) {
		        driver.findElement(emailField).click();
		        driver.findElement(emailField).sendKeys(usern);
		    }

		    public void enterPassword(String passw) {
		        driver.findElement(passwordField).click();
		        driver.findElement(passwordField).sendKeys(passw);
		    }

		    public void clickSignIn() {
		        driver.findElement(signInButton).click();
		    }
		    

		    
		    
		    public void electronics() {
		    	
		    	    driver.findElement(electronics).click();;
		    }
		    
		    
		    public void cameraandphoto() {
		    	   
		    	     driver.findElement(cameraphoto).click();;
		    	
		    	   
		    }
		    
		    public void AtoZ() {
		    	
		    	
		    	driver.findElement(namesort1).click();;
		    	
		    	   
		    }
		    
		    
		    public void ZtoA() {
		    	driver.findElement(namesort2).click();;
		    	   
		    }
		    
		    
		    public void lowtohigh() {
		    	
		    	   driver.findElement(pricesort1).click();;
		    }
		    
		    
		    public void hightolow() {
		    	
		    	 driver.findElement(pricesort2).click();;
		    }
		    
		    
		    public void dis6() {
		    	
		    	 driver.findElement(display6).click();;
		    }
		    
		    
		    public void dis9() {
		    	
		    	 driver.findElement(display9).click();;
		    }
		    
		    
		    public void grid() {
		    	
		    	   driver.findElement(list).click();;
		    }
		    public void home() {
		    	
		    	    driver.findElement(homepage).click();;
		    	
		    }
		    
		    
		    
	

}
