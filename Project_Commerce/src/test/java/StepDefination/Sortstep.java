package StepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;
import PageObject.Sortpage;

public class Sortstep {
	WebDriver driver;
	Sortpage sort;
	@Given("it should open in webbbrowser")
	public void it_should_open_in_webbbrowser() {
		
			 WebDriverManager.chromedriver().setup();
		        driver = new ChromeDriver();
		       sort = new Sortpage(driver);
		        sort.homepage();
	    
	}

	@And("enter login {string} and {string}")
	public void enter_usern_and_passw(String usern, String passw) throws InterruptedException {
		sort.clickLoginLink();
       sort.enterEmail(usern);
        sort.enterPassword(passw);
        Thread.sleep(3000);
	    
	}

	@And("click on signn")
	public void click_on_signn() {
		sort.clickSignIn();
	   
	}
	
	
	

	@And("click on electronics")
	public void click_on_electronics() {
		sort.electronics();
	 
	}

	@And("click on camera and photo")
	public void click_on_camera_and_photo() {
	   sort.cameraandphoto();
	}

	@And("sort by a to z")
	public void sort_by_a_to_z() {
		sort.AtoZ();
	   
	}

	@And("sort by z to a")
	public void sort_by_z_to_a() {
	    sort.ZtoA();
	}

	@And("sort by low to high")
	public void sort_by_low_to_high() {
	   sort.lowtohigh();
	}

	@And("sort by high to low")
	public void sort_by_high_to_low() {
	   sort.hightolow();
	}

	

	@And("slect display a six")
	public void slect_display_a_six() {
	    sort.dis6();
	}

	@And("slect display a nine")
	public void slect_display_a_nine() {
	    sort.dis9();
	}

	@And("select list type of grid")
	public void select_list_type_of_grid() {
	   sort.grid();
	}

	@And("click on home")
	public void click_on_home() {
	    sort.home();
	    driver.quit();
	}


	
	

}
