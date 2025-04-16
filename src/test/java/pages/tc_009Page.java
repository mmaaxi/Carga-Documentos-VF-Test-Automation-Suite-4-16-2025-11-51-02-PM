package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_009Page {
    WebDriver driver;

    private By fileInput = By.id("pdfInput");
    private By uploadButton = By.id("uploadButton");
    private By errorMessage = By.id("errorMessage");

    public tc_009Page(WebDriver driver) {
        this.driver = driver;
    }

    public void selectCorruptPDF() {
        WebElement fileInputElement = driver.findElement(fileInput);
        fileInputElement.sendKeys("/path/to/corrupt/file.pdf"); // Replace with actual path
    }

    public void attemptFileUpload() {
        WebElement uploadButtonElement = driver.findElement(uploadButton);
        uploadButtonElement.click();
    }

    public boolean isCorruptionDetected() {
        // Logic to detect if the file corruption is detected
        // This can be implemented as per specific application logic
        return driver.findElement(errorMessage).isDisplayed();
    }

    public String getErrorMessage() {
        WebElement errorElement = driver.findElement(errorMessage);
        return errorElement.getText();
    }
}