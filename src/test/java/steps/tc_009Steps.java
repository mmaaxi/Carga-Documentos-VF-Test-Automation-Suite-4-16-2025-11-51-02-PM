package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.tc_009Page;

public class tc_009Steps {
    tc_009Page page = new tc_009Page();

    @Given("el usuario ha seleccionado un archivo PDF corrupto")
    public void elUsuarioHaSeleccionadoUnArchivoPDFCorrupto() {
        page.selectCorruptPDF();
    }

    @When("el usuario intenta cargar el archivo")
    public void elUsuarioIntentaCargarElArchivo() {
        page.attemptFileUpload();
    }

    @Then("el sistema debe detectar la corrupción del archivo")
    public void elSistemaDebeDetectarLaCorrupcionDelArchivo() {
        Assert.assertTrue(page.isCorruptionDetected());
    }

    @And("el sistema debe mostrar un error indicando: 'El documento parece estar dañado. Por favor, verifique y reintente.'")
    public void elSistemaDebeMostrarUnMensajeDeError() {
        Assert.assertEquals("El documento parece estar dañado. Por favor, verifique y reintente.", page.getErrorMessage());
    }
}