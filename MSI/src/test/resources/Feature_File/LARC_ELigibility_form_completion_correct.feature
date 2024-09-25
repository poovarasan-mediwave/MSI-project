Feature: LARC eligibility form completion flows

  Background: 
    Given Launch the service user URL
    When User enters their email and password into the respective fields. If the user has a memorable word, they must enter the word
    And User click the recaptcha option and also click on the login button
    And User click on the start now button in the eligibility form
@12345
  Scenario: LARC Eligibility - Last 6 month no abortion, know registered UK GP postcode and MSI service available flow
    When User click on the No option in the last 6 month abortion question. If user click on the Yes option they will be navigate to phone call module
    And User select a treatment type[Insertion] and click on the next button
    And User select on the Date of Birth below 55 years
    And User click risk Yes option they will be answers following questions. If user click No option, they will be navigated to GP registration page
    And User click on the Yes option in the registered UK GP address question, they will be search and select the address. If user click No option they will be move to the next question
    And User click on the next button they will be navigated medical history page
    And User click on the next button in medical history page

  Scenario: LARC Eligibility - Last 6 month no abortion, know registered UK address using signup address and private pathway flow
    When User click on the No option in the last 6 month abortion question. If user click on the Yes option they will be navigate to phone call module
    And User select a treatment type[Removal] and click on the next button
    And User select on the Date of Birth below 55 years
    And User click risk Yes option they will be answers following questions. If user click No option, they will be navigated to GP registration page
    And User click on the No option in registered UK GP address and navigate to next question
    And User click on the Yes option in the registered UK address using signup address question. If user click No option, they will be naviagted to next question
    And User click on the either Yes or No option in UK resident for the last 12 month or more question
    And User click on the next button and navigate to phone call module
    And User click on the choose a call back slot button and then select the any one of the available slot and also click on the book call back button

  Scenario: LARC Eligibility - Last 6 month no abortion, manually enter UK address and MSI service available flow
    When User click on the No option in the last 6 month abortion question. If user click on the Yes option they will be navigate to phone call module
    And User select a treatment type[Change] and click on the next button
    And User select on the Date of Birth below 55 years
    And User click risk Yes option they will be answers following questions. If user click No option, they will be navigated to GP registration page
    And User click on the No option for both registered UK GP address and registered UK address questions and navigate to next question
    And User click on the Yes option in UK resident for the last 12 month or more question. If user click o option they will be navigated to 'Do you have a UK address' question
    And User search and select the address or manually enter the address and also click on the next button
    And Entered postcode is correct that flow moving to MSI service available flow or is incorrect that flow moving to private pathway flow
    And User click on the next button and navigate to medical history page
    And User click on the next button in medical history page and navigate to dashboard page

  Scenario: LARC Eligibility - Last 6 month no abortion, don't have an UK address and pivate pathway flow
    When User click on the No option in the last 6 month abortion question. If user click on the Yes option they will be navigate to phone call module
    And User select a treatment type and click on the next button
    And User select on the Date of Birth below 55 years
    And User click risk Yes option they will be answers following questions. If user click No option, they will be navigated to GP registration page
    And User click on the No option for registered UK GP address, registered UK address, UK resident for the last 12 month or more and do you have a UK address questions and then they will be navigated to phone call module
    And User click on the choose a call back slot button and then select the any one of the available slot and also click on the book call back button

  Scenario: LARC Eligibility - Last 6 month have abortion and pivate pathway flow
    When User click on the Yes option in the last 6 month abortion question
    And User click on the choose a call back slot button and then select the any one of the available slot and also click on the book call back button

  Scenario: LARC Eligibility - Last 6 month no abortion, above 55 years and flow end
    When User click on the No option in the last 6 month abortion question. If user click on the Yes option they will be navigate to phone call module
    And User select a treatment type[either Insertion or change] and click on the next button
    And User select on the Date of Birth above 55 years
    Then User to verify the error message
