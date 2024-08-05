package StepDefinitions;

import commonUtils.CommonUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.LoginPage;

public class QatalystLoginPageStepDefinition {
    public WebDriver driver;
    public CommonUtils action;
    public LoginPage loginPage;
    @Given("the user is on the login page")
    public void theUserIsOnTheLoginPage() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://collaborator.qa.getqatalyst.io/login");
        action = new CommonUtils(driver);
        loginPage = new LoginPage(driver);
    }

    @When("the user enters the valid credentials")
    public void theUserEntersTheValidCredentials() {
        driver.get("https://collaborator.qa.getqatalyst.io/login");
        action.enterText(loginPage.userNameInput,"newuser1@mailinator.com");
        action.enterText(loginPage.userNameInput,"Qatalyst@123");
        throw new io.cucumber.java.PendingException();
    }

    @And("the user click on the login button")
    public void theUserClickOnTheLoginButton() {
        
    }

    @Then("the user should be displayed with the dashboard Page")
    public void theUserShouldBeDisplayedWithTheDashboardPage() {
    }
}
