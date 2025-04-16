package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_002Page {
    WebDriver driver;
    By fileInput = By.id("fileUpload");
    By uploadButton = By.id("uploadButton");
    By invalidFormatWarning = By.id("invalidFormatWarning");
    By formatNotAllowedMessage = By.id("formatNotAllowedMessage");

    public tc_002Page(WebDriver driver) {
        this.driver = driver;
    }

    public void selectImageFile(String filePath) {
        WebElement fileInputElement = driver.findElement(fileInput);
        fileInputElement.sendKeys(filePath);
    }

    public boolean isInvalidFormatWarningDisplayed() {
        return driver.findElement(invalidFormatWarning).isDisplayed();
    }

    public void clickUploadButton() {
        driver.findElement(uploadButton).click();
    }

    public boolean isFormatNotAllowedMessageDisplayed() {
        return driver.findElement(formatNotAllowedMessage).isDisplayed();
    }
}