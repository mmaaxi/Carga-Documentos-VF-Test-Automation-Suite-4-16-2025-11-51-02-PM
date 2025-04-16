package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.tc_010Page;
import utils.DriverFactory;

public class tc_010Steps {

    WebDriver driver = DriverFactory.getDriver();
    tc_010Page page = new tc_010Page(driver);

    @Given("el usuario está en la página de carga de documentos")
    public void elUsuarioEstaEnLaPaginaDeCargaDeDocumentos() {
        page.navigateToCargaDocumentosPage();
    }

    @When("el usuario selecciona múltiples archivos PDF válidos")
    public void elUsuarioSeleccionaMultiplesArchivosPDFValidos() {
        page.uploadMultiplePDFs();
    }

    @Then("el sistema debe iniciar el proceso de carga en paralelo")
    public void elSistemaDebeIniciarElProcesoDeCargaEnParalelo() {
        boolean isParallelUploadStarted = page.isParallelUploadStarted();
        Assert.assertTrue("El proceso de carga no ha iniciado en paralelo", isParallelUploadStarted);
    }

    @Then("se debe monitorizar el tiempo de carga")
    public void seDebeMonitorizarElTiempoDeCarga() {
        boolean isLoadTimeMonitored = page.isLoadTimeMonitored();
        Assert.assertTrue("El tiempo de carga no se está monitorizando", isLoadTimeMonitored);
    }

    @Then("el sistema debe cargar todos los documentos dentro de un tiempo razonable y sin afectar la estabilidad del servicio")
    public void elSistemaDebeCargarTodosLosDocumentosDentroDeUnTiempoRazonableYSinAfectarLaEstabilidadDelServicio() {
        boolean isLoadEfficient = page.isLoadEfficient();
        Assert.assertTrue("La carga no es eficiente o afecta la estabilidad del servicio", isLoadEfficient);
    }
}