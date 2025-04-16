package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_001Page {

    private WebDriver driver;

    private By inputArchivo = By.id("upload-file");
    private By botonCargarDocumento = By.id("upload-button");
    private By barraProgreso = By.id("progress-bar");
    private By mensajeExito = By.id("success-message");
    private By listaDocumentos = By.id("documents-list");

    public tc_001Page(WebDriver driver) {
        this.driver = driver;
    }

    public void seleccionarArchivoPDF(String rutaArchivo) {
        WebElement elementoArchivo = driver.findElement(inputArchivo);
        elementoArchivo.sendKeys(rutaArchivo);
    }

    public void clicEnCargarDocumento() {
        driver.findElement(botonCargarDocumento).click();
    }

    public boolean esBarraDeProgresoVisible() {
        return driver.findElement(barraProgreso).isDisplayed();
    }

    public boolean esMensajeExitoVisible() {
        return driver.findElement(mensajeExito).isDisplayed();
    }

    public boolean esDocumentoEnListaVisible() {
        return driver.findElement(listaDocumentos).getText().contains("documento.pdf");
    }
}