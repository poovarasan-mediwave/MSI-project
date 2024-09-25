Feature: QB setting, deplicate and delete flows

  Scenario: Checking the setting[update form details] flow
    Given Launch the external site URL
    When User should click on the staff login button and they will be navigate to microsoft login page
    And User enter their email and password for the respective fields and also click on the sign in button
    And User should click on the Forms & Questionnaire option
    And User should click on the setting option in any one of the form
    And User update the questionnaire name, inside questionnaire name, Questionnaire category and service
    And User should click on the update button
    Then User to verify the success toaster message

  Scenario: Checking duplicate the exiting  flow
    When User should click on the duplicate option
    And User should update the main details like Questionnaire name, Inside questionnaire name, Category and service here after click on the create button
    And User should add an new question type and add conditional question also add an triggers
    And User should click on the preview questionnaire option here view the correct order
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

  Scenario: Checking delete option flow
    Given Launch the external site URL
    When User should click on the staff login button and they will be navigate to microsoft login page
    And User enter their email and password for the respective fields and also click on the sign in button
    And User should click on the Forms & Questionnaire option
    And User should click on the delete option and also click on the delete questionnaire button
    Then User to verify the toaster message
