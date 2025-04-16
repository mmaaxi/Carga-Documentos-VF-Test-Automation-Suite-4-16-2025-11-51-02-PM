package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.tc_007Page;

public class tc_007Steps {

    tc_007Page page = new tc_007Page();

    @Given("I start an upload and disconnect the network")
    public void startUploadAndDisconnectNetwork() {
        page.initiateUpload();
        page.disconnectNetwork();
    }

    @Then("I should see an error message indicating upload failure")
    public void verifyErrorMessage() {
        Assert.assertTrue("Error message not displayed", page.isErrorMessageDisplayed());
    }

    @When("I select the 'Retry' option")
    public void selectRetryOption() {
        page.clickRetry();
    }

    @Then("the upload process should resume and complete successfully")
    public void verifySuccessfulUpload() {
        Assert.assertTrue("Upload was not successful", page.isUploadSuccessful());
    }
}