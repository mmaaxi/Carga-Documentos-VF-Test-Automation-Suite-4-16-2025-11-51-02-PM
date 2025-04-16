Feature: Validate the verification of the uploaded document's content

  Scenario: Verify uploaded document and its metadata
    Given The user uploads a PDF document successfully
    When The user selects the document from the list
    Then The document should be displayed with metadata such as upload date, size, and format