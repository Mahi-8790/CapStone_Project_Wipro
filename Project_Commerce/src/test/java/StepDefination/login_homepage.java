package StepDefination;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import PageObject.LoginPage;

public class login_homepage {
    WebDriver driver;
    LoginPage loginPage;

    @Given("page should open in browser")
    public void page_should_open_in_browser() {
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        loginPage = new LoginPage(driver);
    }

    @And("enter {string} and {string}")
    public void enter_username_and_password(String username, String password ) throws InterruptedException {
        loginPage.clickLoginLink();
        loginPage.enterEmail(username);
        loginPage.enterPassword(password);
        Thread.sleep(3000);
    }

    @And("click on sign in")
    public void click_on_sign_in() throws InterruptedException {
        loginPage.clickSignIn();
    }

    @And("to return home click on page")
    public void to_return_home_click_on_page() {
        loginPage.clickHomeLogo();
        driver.quit();
    }
}
