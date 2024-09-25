Feature: VAS eligibility form completion flows

  Background: 
    Given Launch the service user URL
    When User enters their email and password into the respective fields. If the user has a memorable word, they must enter the word
    And User click the recaptcha option and also click on the login button
    And User click on the start now button in the eligibility form

  Scenario: VAS Eligibility - know NHS number, age between 18 to 25years and self referal contract available flow
    When User enter their NHS number in respective field and click on the next button
    And User select the date of birth between 18 to 25 years
    And User click on the Yes option in risk related question they will be answers the following questions. If user click No option, they will be navigated to pregnancy counselling page
    And User click on the next button they will be navigated to GP details page
    And User search and select the self referal related GP postcode and also click on the next button they will be navigate to medical history page
    And User click on the next button in medical history page

  Scenario: VAS Eligibility - know NHS number, age above 25years and GP referal[UBRN] flow
    When User enter their NHS number in respective field and click on the next button
    And User select the date of birth above 25 years
    And User click on the Yes option in risk related question they will be answers the following questions. If user click No option, they will be navigated to GP details page
    And User click on the next button they will be navigated to GP details page
    And User search and select the UBRN related GP postcode and also click on the next button they will be navigate to UBRN page
    And User enter their UBRN and passcode in the respective fields and click on the next button
    And User click on the next button in medical history page

  Scenario: VAS Eligibility - know NHS number, age above 25years and Not registered with GP[Offer phone call module] flow
    When User enter their NHS number in respective field and click on the next button
    And User select the date of birth above 25 years
    And User click on the Yes option in risk related question they will be answers the following questions. If user click No option, they will be navigated to GP details page
    And User click on the next button they will be navigated to GP details page
    And User click on the I am not registered with a UK GP option
    And User click on the choose a call back slot button and then select the any one of the available slot and also click on the book call back button

  Scenario: VAS Eligibility - know NHS number and No contract available[Offer phone call module] flow
    When User enter their NHS number in respective field and click on the next button
    And User select the date of birth above 25 years
    And User click on the Yes option in risk related question they will be answers the following questions. If user click No option, they will be navigated to GP details page
    And User click on the next button they will be navigated to GP details page
    And User search and select the No contract related GP postcode and also click on the next button they will be navigate to local provider page
    And User click on the either Yes or No option in an local provider question and then answer the following question
    And User click on the next button
    And User click on the choose a call back slot button and then select the any one of the avialable slot and also click on the book call back button

  Scenario: VAS Eligibility - Don't have an NHS number[Offer phone call module] flow
    When User click on the I don't have an NHS number option
    And USer click on the choose a call back slot button and then select the any one of the available slot and also click on the book call back button

  Scenario: VAS Eligibility - know NHS number and age under 18years flow
    When User enter their NHS number in respective field and click on the next button
    And User select the date of birth under 18 years
    Then User to verify the under 18years error message
