package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.tc_001Page;
import utils.DriverFactory;

public class tc_001Steps {

    private WebDriver driver = DriverFactory.getDriver();
    private tc_001Page page = new tc_001Page(driver);

    @Given("El usuario está en la página de subida de documentos")
    public void el_usuario_esta_en_la_pagina_de_subida_de_documentos() {
        driver.get("http://example.com/subir-documento");
    }

    @When("El usuario selecciona un archivo PDF válido")
    public void el_usuario_selecciona_un_archivo_pdf_valido() {
        page.seleccionarArchivoPDF("ruta/del/archivo/documento.pdf");
    }

    @When("Hace clic en el botón 'Cargar documento'")
    public void hace_clic_en_el_boton_cargar_documento() {
        page.clicEnCargarDocumento();
    }

    @Then("Se muestra una barra de progreso")
    public void se_muestra_una_barra_de_progreso() {
        Assert.assertTrue(page.esBarraDeProgresoVisible());
    }

    @Then("El sistema confirma mediante mensaje que la carga fue exitosa")
    public void el_sistema_confirma_que_la_carga_fue_exitosa() {
        Assert.assertTrue(page.esMensajeExitoVisible());
    }

    @Then("El documento aparece en la lista de documentos cargados")
    public void el_documento_aparece_en_la_lista_de_documentos_cargados() {
        Assert.assertTrue(page.esDocumentoEnListaVisible());
    }
}