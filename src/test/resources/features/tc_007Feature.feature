Feature: Validate retry option after a failed upload

  Scenario: Retry an upload after a fail and complete successfully
    Given I start an upload and disconnect the network
    Then I should see an error message indicating upload failure
    When I select the 'Retry' option
    Then the upload process should resume and complete successfully