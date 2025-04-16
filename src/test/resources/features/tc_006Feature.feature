Feature: Cancel document upload process

  Scenario: Validate cancellation during document upload
    Given The user initiates the upload of a PDF document
    When The user presses the 'Cancel' button before the upload is complete
    Then The system stops the upload process
    And The system deletes the temporary data associated with the document