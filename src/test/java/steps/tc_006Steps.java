package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc_006Page;

public class tc_006Steps {
    WebDriver driver;
    tc_006Page uploadPage;

    public tc_006Steps() {
        this.driver = Hooks.getDriver();
        uploadPage = PageFactory.initElements(driver, tc_006Page.class);
    }

    @Given("The user initiates the upload of a PDF document")
    public void the_user_initiates_the_upload_of_a_PDF_document() {
        uploadPage.startUpload("path/to/document.pdf");
    }

    @When("The user presses the 'Cancel' button before the upload is complete")
    public void the_user_presses_the_cancel_button_before_the_upload_is_complete() {
        uploadPage.cancelUpload();
    }

    @Then("The system stops the upload process")
    public void the_system_stops_the_upload_process() {
        uploadPage.verifyUploadIsCancelled();
    }

    @Then("The system deletes the temporary data associated with the document")
    public void the_system_deletes_the_temporary_data_associated_with_the_document() {
        uploadPage.verifyTemporaryDataIsDeleted();
    }
}