package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.tc_004Page;

public class tc_004Steps {
    WebDriver driver;
    tc_004Page page;

    @Given("el usuario inicia el proceso de carga de un documento PDF")
    public void iniciarProcesoDeCarga() {
        page = new tc_004Page(driver);
        page.iniciarCargaPDF();
        Assert.assertTrue(page.verificarInicioDeCarga());
    }

    @When("la conexión de red es interrumpida")
    public void interrumpirConexionDeRed() {
        page.interrumpirRed();
    }

    @Then("el sistema debería mostrar un mensaje de fallo de red")
    public void verificarMensajeDeFalloDeRed() {
        Assert.assertTrue(page.verificarMensajeDeFalloDeRed());
    }

    @When("la conexión de red es restablecida y el usuario reintenta la carga")
    public void reconectarYReintentarCarga() {
        page.restablecerRed();
        page.reintentarCarga();
    }

    @Then("el sistema debería permitir reintentar la carga o cancelar el proceso")
    public void verificarOpcionesDeReintentoOCancelar() {
        Assert.assertTrue(page.verificarOpcionesReintentarOCancelar());
    }
}