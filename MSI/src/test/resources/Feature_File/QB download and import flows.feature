Feature: QB download and import existing form flows

  Scenario: Checking the download flow
    Given Launch the external site URL
    When User should click on the staff login button and they will be navigate to microsoft login page
    And User enter their email and password for the respective fields and also click on the sign in button
    And User should click on the Forms & Questionnaire option
    And User should click on the download icon
    And User should click on the import existing form button and also user select on the recently downloadad form
    And User update the Questionnaire name and also enter the inside questionnaire name for the respective fields
    And User should click on the create button and then they will be navigate to form creation page
    And User should add an new questions
    And User click on the submit for approval button and select any one of the admin and also click on the confirm & submit button
    And User click on the check form status button and then logout the current user
    And Launch the external site URL for the purpose of form approval
    When User click on the staff login button and they will be navigate to microsoft login page
    And User enter their email and password for the respective fields and also click on the sign in button
    And User click on the Forms & Questionnaire option and also click Form approvals option
    And User click on the received forms and search the newly requested form
    And User click on the Approve button and also click on the logout option
    And Launch the external site URL
    When User click on the staff login button and they will be navigate to microsoft login page
    And User enter their email and password for the respective fields and also click on the sign in button
    And User click on the Forms & Questionnaire option and search the recently approved form
    And User should click on the preview option in Forms & QUestionnaire page 
    
