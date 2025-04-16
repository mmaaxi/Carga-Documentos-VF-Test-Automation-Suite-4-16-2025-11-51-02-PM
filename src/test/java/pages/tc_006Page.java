package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_006Page {
    WebDriver driver;

    By uploadButton = By.id("upload-button");
    By cancelButton = By.id("cancel-upload");
    By progressElement = By.id("upload-progress");

    public tc_006Page(WebDriver driver) {
        this.driver = driver;
    }

    public void startUpload(String filePath) {
        WebElement uploadElement = driver.findElement(uploadButton);
        uploadElement.sendKeys(filePath);
    }

    public void cancelUpload() {
        WebElement cancelElement = driver.findElement(cancelButton);
        cancelElement.click();
    }

    public void verifyUploadIsCancelled() {
        WebElement progress = driver.findElement(progressElement);
        assert !progress.isDisplayed() : "Upload progress is still displayed";
    }

    public void verifyTemporaryDataIsDeleted() {
        // Method to verify that temporary data is deleted
        // This will depend on the specific implementation details of the system
        // and might require additional selectors or actions to confirm deletion
    }
}