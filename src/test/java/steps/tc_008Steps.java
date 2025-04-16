package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.tc_008Page;

public class tc_008Steps {
    
    tc_008Page page = new tc_008Page();

    @Given("The user uploads a PDF document successfully")
    public void theUserUploadsPDFDocumentSuccessfully() {
        page.uploadDocument("path/to/document.pdf");
        Assert.assertTrue(page.isDocumentUploaded("document.pdf"));
    }

    @When("The user selects the document from the list")
    public void theUserSelectsTheDocumentFromTheList() {
        page.selectDocument("document.pdf");
    }

    @Then("The document should be displayed with metadata such as upload date, size, and format")
    public void theDocumentShouldBeDisplayedWithMetadata() {
        Assert.assertTrue(page.isDocumentPreviewDisplayed());
        Assert.assertTrue(page.isMetadataDisplayed("Upload Date"));
        Assert.assertTrue(page.isMetadataDisplayed("Size"));
        Assert.assertTrue(page.isMetadataDisplayed("Format"));
    }
}