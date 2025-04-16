package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.tc_002Page;

public class tc_002Steps {
    WebDriver driver;
    tc_002Page page;

    public tc_002Steps() {
        this.driver = Hooks.driver;
        page = new tc_002Page(driver);
    }

    @Given("el usuario navega a la página de carga de documentos")
    public void elUsuarioNavegaALaPaginaDeCargaDeDocumentos() {
        driver.get("http://example.com/upload");
    }

    @When("el usuario selecciona un archivo de imagen")
    public void elUsuarioSeleccionaUnArchivoDeImagen() {
        page.selectImageFile("path/to/image.jpg");
    }

    @Then("el sistema indica que el formato es inválido")
    public void elSistemaIndicaQueElFormatoEsInvalido() {
        Assert.assertTrue("El formato no es inválido", page.isInvalidFormatWarningDisplayed());
    }

    @When("el usuario hace clic en 'Cargar documento'")
    public void elUsuarioHaceClicEnCargarDocumento() {
        page.clickUploadButton();
    }

    @Then("el sistema muestra el mensaje 'Formato no permitido'")
    public void elSistemaMuestraElMensajeFormatoNoPermitido() {
        Assert.assertTrue("El mensaje de formato no permitido no se muestra", page.isFormatNotAllowedMessageDisplayed());
    }
}