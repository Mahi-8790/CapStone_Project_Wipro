package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    // Locators
    private By loginLink = By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a");
    private By emailField = By.id("Email");
    private By passwordField = By.id("Password");
    private By signInButton = By.xpath("//*[@id='main']/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button");
    private By homeLogo = By.xpath("/html/body/div[6]/div[1]/div[2]/div[1]/a/img");

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Actions
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

    public void clickHomeLogo() {
        driver.findElement(homeLogo).click();
    }
}
