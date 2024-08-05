package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    public WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public By userNameInput = By.xpath("//input[@placeholder='Enter Your Email ID']");
    public By passwordInput = By.xpath("//input[@placeholder='Enter Your Password']");
    public By loginButton = By.xpath("//button[text()='Login']");
    public By dashboardLogo = By.xpath("//div[contains(@class,'_personalized-logo-container_')]");
}
