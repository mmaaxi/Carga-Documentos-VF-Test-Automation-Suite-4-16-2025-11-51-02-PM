package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.tc_005Page;

public class tc_005Steps {

    tc_005Page page = new tc_005Page();

    @Given("el usuario está en la página de carga de documentos")
    public void elUsuarioEstaEnLaPaginaDeCargaDeDocumentos() {
        page.navigateToUploadPage();
    }

    @When("el usuario carga un documento PDF válido")
    public void elUsuarioCargaUnDocumentoPDFValido() {
        page.uploadValidPDF();
    }

    @Then("el sistema carga el documento correctamente")
    public void elSistemaCargaElDocumentoCorrectamente() {
        Assert.assertTrue(page.isDocumentUploaded());
    }

    @When("el usuario intenta cargar el mismo documento nuevamente")
    public void elUsuarioIntentaCargarElMismoDocumentoNuevamente() {
        page.uploadSamePDFAgain();
    }

    @Then("el sistema detecta el archivo duplicado y muestra un mensaje: 'El documento ya fue cargado anteriormente'")
    public void elSistemaDetectaElArchivoDuplicadoYMensaje() {
        Assert.assertTrue(page.isDuplicateFileMessageDisplayed());
    }
}