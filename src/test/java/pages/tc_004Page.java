package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_004Page {
    WebDriver driver;

    By barraDeProgreso = By.id("progressBar");
    By mensajeFalloDeRed = By.id("networkError");
    By botonReintentar = By.id("retryButton");
    By botonCancelar = By.id("cancelButton");

    public tc_004Page(WebDriver driver) {
        this.driver = driver;
    }

    public void iniciarCargaPDF() {
        // Lógica para iniciar la carga del PDF
    }

    public boolean verificarInicioDeCarga() {
        // Lógica para verificar si la barra de progreso ha iniciado
        return driver.findElement(barraDeProgreso).isDisplayed();
    }

    public void interrumpirRed() {
        // Lógica para simular la interrupción de la conexión de red
    }

    public boolean verificarMensajeDeFalloDeRed() {
        // Lógica para verificar si el mensaje de fallo de red es visible
        return driver.findElement(mensajeFalloDeRed).isDisplayed();
    }

    public void restablecerRed() {
        // Lógica para restablecer la conexión de red
    }

    public void reintentarCarga() {
        // Lógica para reintentar la carga del documento PDF
        driver.findElement(botonReintentar).click();
    }

    public boolean verificarOpcionesReintentarOCancelar() {
        // Lógica para verificar si las opciones de reintentar o cancelar están disponibles
        return driver.findElement(botonReintentar).isDisplayed() && driver.findElement(botonCancelar).isDisplayed();
    }
}