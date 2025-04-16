package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_007Page {
    WebDriver driver;
    By uploadButton = By.id("uploadButton");
    By errorMessage = By.id("errorMessage");
    By retryButton = By.id("retryButton");
    By successMessage = By.id("successMessage");

    public tc_007Page(WebDriver driver) {
        this.driver = driver;
    }

    public void initiateUpload() {
        driver.findElement(uploadButton).click();
    }

    public void disconnectNetwork() {
        // Simulate network disconnection
        // Example: Use a script or tool to disconnect network
    }

    public boolean isErrorMessageDisplayed() {
        return driver.findElement(errorMessage).isDisplayed();
    }

    public void clickRetry() {
        driver.findElement(retryButton).click();
    }

    public boolean isUploadSuccessful() {
        return driver.findElement(successMessage).isDisplayed();
    }
}