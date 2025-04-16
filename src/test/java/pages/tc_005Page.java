package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class tc_005Page {

    WebDriver driver;
    WebDriverWait wait;

    public tc_005Page(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 20);
    }

    // By locators
    private By uploadButton = By.id("uploadButton");
    private By successMessage = By.id("successMessage");
    private By duplicateMessage = By.id("duplicateMessage");

    // Page actions
    public void navigateToUploadPage() {
        driver.get("http://example.com/upload");
    }

    public void uploadValidPDF() {
        WebElement uploadElement = driver.findElement(uploadButton);
        uploadElement.sendKeys("/path/to/valid_document.pdf");
        uploadElement.submit();
    }

    public boolean isDocumentUploaded() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(successMessage)).isDisplayed();
    }

    public void uploadSamePDFAgain() {
        WebElement uploadElement = driver.findElement(uploadButton);
        uploadElement.sendKeys("/path/to/valid_document.pdf");
        uploadElement.submit();
    }

    public boolean isDuplicateFileMessageDisplayed() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(duplicateMessage)).isDisplayed();
    }
}