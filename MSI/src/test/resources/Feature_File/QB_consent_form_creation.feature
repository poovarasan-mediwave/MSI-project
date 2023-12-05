Feature: QB consent form creation

  Background: 
    Given Launch the external site URL
    When User click on the staff login button and they will be navigate to microsoft login page
    And User enter their email and password for the respective fields and also click on the sign in button
    And User click on the Forms & Questionnaire option and also click on the create new fom button

  Scenario: Create a new TOP consent form
    When USer enter their Questionnaire name and internal questionnaire name for the respective fields
    And User should select the questionnaire type and services fields
    And User click the next button
    And User should add Multliple choice question for TOP consent
    And User should add Date input question for TOP consent
    And User should add Number input question for TOP consent
    And User click on the preview option
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

  Scenario: Create a new VAS consent form
    When USer enter their Questionnaire name and internal questionnaire name for the respective fields
    And User should select the questionnaire type and services fields
    And User click the next button
    And User should add Multliple choice question for VAS consent
    And User should add Date input question for VAS consent
    And User should add Number input question for VAS consent
    And User should add drop down question for VAS consent
    And User click on the preview option
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

  Scenario: Create a new LARC consent form
    When USer enter their Questionnaire name and internal questionnaire name for the respective fields
    And User should select the questionnaire type and services fields
    And User click the next button
    And User should add Multliple choice question for LARC consent
    And User should add Date input question for LARC consent
    And User should add Number input question for LARC consent
    And User should add drop down question for LARC consent
    And User click on the preview option
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
