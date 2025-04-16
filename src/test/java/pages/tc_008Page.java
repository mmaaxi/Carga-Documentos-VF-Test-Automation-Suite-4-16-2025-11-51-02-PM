package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class tc_008Page {

    WebDriver driver;

    @FindBy(id = "uploadButton")
    private WebElement uploadButton;

    @FindBy(css = "div.uploaded-files")
    private WebElement fileList;

    @FindBy(id = "previewSection")
    private WebElement previewSection;

    public tc_008Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void uploadDocument(String filePath) {
        uploadButton.sendKeys(filePath);
    }

    public boolean isDocumentUploaded(String fileName) {
        return fileList.findElement(By.xpath("//span[text()='" + fileName + "']")).isDisplayed();
    }

    public void selectDocument(String fileName) {
        fileList.findElement(By.xpath("//span[text()='" + fileName + "']")).click();
    }

    public boolean isDocumentPreviewDisplayed() {
        return previewSection.isDisplayed();
    }

    public boolean isMetadataDisplayed(String metadataType) {
        return previewSection.findElement(By.xpath("//span[contains(text(),'" + metadataType + "')]")).isDisplayed();
    }
}