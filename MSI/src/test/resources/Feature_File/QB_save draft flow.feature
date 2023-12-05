Feature: QB save draft flows

  Scenario: Checking Save draft option
    Given Launch the external site URL
    When User click on the staff login button and they will be navigate to microsoft login page
    And User enter their email and password for the respective fields and also click on the sign in button
    And User click on the Forms & Questionnaire option and also click on the create new fom button
    When USer enter their Questionnaire name and internal questionnaire name for the respective fields
    And User should select the questionnaire type and services fields
    And User click the next button
    And User should add Multliple choice question
    And User click on the save draft button and also click continue editing button
    And User should add Opening and closing statement questions and also click on the back to questionnaire button
    And User click on the edit option in Forms & Questionnaire page
    And User should add different types of conditional question in Multiple choice question and also select triggers
    And User Date input, Number input, Yes/No questions and also add conditional questions
    And User click on the preview questionnaire option
    And User delete any of the question
    And User click on the preview questionnaire option
    And User click on the save draft button and also click on the back to questionnaire button
    And User again click on the edit option in Forms & Questionnaire page

  Scenario: Checking empty field with save draft and conditional option
    When User should add Drop down question but should not filled with question name or option
    And User click on the save draft button and also click on the continue editing button in error pop-up
    And User click on the conditional option and also click on the add conditional questions option
    Then User to verify the toaster message
    And User should filled with empty fields and then click save draft button
    And User click on the continue editing button in success pop-up

  Scenario: Checking trigger with save draft
    When User should add Date input question and add conditional question also add triggers
    And User should add contional segment[BMI] question and add conditional question also add triggers
    And User click on the preview questionnaire option
    And User should change the triggers and click save draft button also click continue editing button

  Scenario: Checking drog and drop with save draft option
    When User drog and drop the already added question
    And User click save draft button and also click on the continue editing button
    And User click on the preview option here user view the updated order is there or not

  Scenario: Checking drog and drop with save draft and also added in form approval flow
    When User click on the submit for approval button and select any one of the admin and also click on the confirm & submit button
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
