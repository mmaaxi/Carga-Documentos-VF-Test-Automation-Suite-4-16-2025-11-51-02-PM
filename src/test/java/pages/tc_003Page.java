package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_003Page {

    WebDriver driver;

    By uploadField = By.id("file-upload");
    By submitButton = By.id("submit-upload");
    By errorMessage = By.id("upload-error-message");

    public tc_003Page(WebDriver driver) {
        this.driver = driver;
    }

    public void selectOversizedPDF() {
        driver.findElement(uploadField).sendKeys("/path/to/oversized/file.pdf");
    }

    public void attemptUpload() {
        driver.findElement(submitButton).click();
    }

    public boolean isFileSizeExceeded() {
        // Implement logic to check if file size is exceeded
        return driver.findElements(errorMessage).size() > 0;
    }

    public String getErrorMessage() {
        return driver.findElement(errorMessage).getText();
    }
}