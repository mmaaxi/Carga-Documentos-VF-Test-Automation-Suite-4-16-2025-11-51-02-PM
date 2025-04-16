package steps;

import pages.tc_003Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;

public class tc_003Steps {

    tc_003Page page = new tc_003Page();

    @Given("que el usuario ha seleccionado un archivo PDF que supera el tamaño máximo permitido")
    public void seleccionarArchivoPDFExcedente() {
        page.selectOversizedPDF();
    }

    @When("intenta cargar el documento")
    public void intentaCargarDocumento() {
        page.attemptUpload();
    }

    @Then("el sistema debería detectar que el archivo excede el límite de tamaño")
    public void sistemaDetectaArchivoExcedente() {
        assertTrue(page.isFileSizeExceeded());
    }

    @Then("el sistema debería mostrar un mensaje de error: {string}")
    public void sistemaMuestraMensajeError(String errorMessage) {
        assertEquals(errorMessage, page.getErrorMessage());
    }
}