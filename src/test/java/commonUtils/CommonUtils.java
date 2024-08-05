package commonUtils;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class CommonUtils {

    private WebDriver driver;
    private WebDriverWait wait;

    public CommonUtils(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    //Method to enter text in an element
    public void enterText(By locator, String textToEnter) {
        driver.findElement(locator).sendKeys(textToEnter);
    }

    //Method to click an element
    public void click(By locator) {
        driver.findElement(locator).click();
    }


    // Method to wait for the visibility of an element
    public void waitForVisibility(By locator, int waitTime) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(waitTime));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    //
    public Boolean isElementDisplayed(By locator) {
        return driver.findElement(locator).isDisplayed();
    }

    public void selectOption(By locator, String option) {
        Select selectOption = new Select(driver.findElement(locator));
        selectOption.selectByValue(option);
    }

    public void isElementEnabled(By locator) {
        driver.findElement(locator).isEnabled();
    }

    public void waitForElementToBeClickable(By locator, int waitTime) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(waitTime));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public void hoverOnTheElement(By locator) {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(locator)).build().perform();
    }
}

