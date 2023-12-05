Feature: TOP eligibility form completion flows

  Background: 
    Given Launch the service user URL
    When User enters their email and password into the respective fields. If the user has a memorable word, they must enter the word
    And User click the recaptcha option and also click on the login button
    And User click on the start now button in the eligibility form
    And User click on the positive pregnancy test option and If the user doesn't have a positive test, display an error message
    And User click on the next button

  Scenario: TOP eligibility - know scan date, know registered UK GP postcode, gestation under 3 weeks and MSI contract available flow
    And User click the scan Yes option they will be enter scan date and gestation. If user click No option they will be navigated to know LMP flow
    And User click on the continue button
    And User select on the Date of Birth above 18years
    And User click risk Yes option they will be answers following questions. If user click No option, they will be navigated to GP registration page
    And User click on the next button
    And User click on the Yes option in the registered UK GP address question, they will be search and select the address. If user click No option they will be move to the next question
    And User click MSI service provider Yes option and also click on the next button
    And User click Yes option in counselling now question and also click continue button

  Scenario: TOP eligibility - know only LMP date, gestation between 3 to 9+6 weeks, registered UK address using signup address, Not contract provider[offer phone call module]
    When User click on the No option in scan field
    And User click the LMP Yes option, they will select the LMP date between 3 to 9+6 weeks. If user click No option they will be navigated to approximate LMP flow
    And User click on the continue button
    And User select on the Date of Birth under 18years and answers the following questions under the pregnancy support page
    And User click risk Yes option they will be answers following questions. If user click No option, they will be navigated to GP registration page
    And User click on the next button
    And User unknown the registered UK GP address and then they click on the yes option in registered UK address field and also click on next button
    And User click on the Yes option in local provider field and click on the submit button
    And User click on the choose a call back slot button
    And User select any one of the available slot and click on the book call back button

  Scenario: TOP eligibility - know only approximate LMP date, gestation between 10 to 23+6 weeks and UBRN flow
    When User click on the No option for both scan and LMP fields
    And User click on the Yes option in approximate LMP date field, they will select the approximate date between 10 to 23+6 weeks. If user click No option they will be navigated to conceived flow
    And User click on the continue button
    And User select on the Date of Birth
    And User click risk Yes option they will be answers following questions. If user click No option, they will be navigated to GP registration page
    And User click on the next button
    And User enter unknown the registered UK GP address, registered UK address using signup address and then they click on the yes option in enter your registered UK address field, they will enter the address and also click on next button
    And User enter their UBRN and passcode in respective fields
    And User click on the next button
    And User click MSI service provider Yes or No option and also click on the next button
    And User click Yes option in counselling now question and also click continue button

  Scenario: TOP eligibility - know only conceived date and MSI Not approved flow
    When User click on the No option for scan, LMP date and approximate LMP date fields
    And User click on the Yes option in conceived date field, they will select the conceived date. If user click No option they will be navigated to face to face flow
    And User click on the continue button
    And User select on the Date of Birth
    And User click risk Yes option they will be answers following questions. If user click No option, they will be navigated to GP registration page
    And User click on the next button
    And User didn't have any registered UK address and also click next button they will be navigated to private option flow
    And User click on the private options in private treatement page
    And User click on the choose a call back slot button and then select the any one of the available slot and also click on the book call back button

  Scenario: TOP eligibility - unknown scan date, LMP date, approximate LMP date and conceived date, gestation above 24 weeks and Hope house flow
    When User click on the No option for scan, LMP date, approximate LMP date and conceived date questions
    And User click on the continue button
    And User select on the date of birth
    And User click risk Yes option they will be answers following questions. If user click No option, they will be navigated to GP registration page
    And User click on the next button
    And User click on the Yes option in registered UK GP postcode question and then search and select the Hope house related address and also click next button
    And User enter code and also click on the next button
    And User click MSI service provider Yes option and also click on the next button
    And User click Yes option in counselling now question and also click continue button

  Scenario: TOP eligibility - LMP date, gestation under 9 weeks and Bluebells flow
    When User click on the No option in scan question
    And User click the LMP Yes option, they will select the LMP date under 9 weeks. If user click No option they will be navigated to approximate LMP flow
    And User click on the continue button
    And User select on the Date of Birth
    And User click risk Yes option they will be answers following questions. If user click No option, they will be navigated to GP registration page
    And User click on the next button
    And User click on the Yes option in the registered UK GP address question and they will be search and select the bluebell related address and also click on next button
    And User click 'Yes' option in the 'Can you confirm that your GP has told you to contact MSI UK?' question on the Bluebell page. If the user clicks on the 'No' option, they will be navigated to the 'Do you have a code?' question. If they have a code, they can enter it; otherwise, the flow ends
    And User click on the next button
    And User click MSI service provider Yes option and also click on the next button
    And User click Yes option in counselling now question and also click continue button

  Scenario: TOP eligibility - LMP date, gestation above 9 weeks and Bluebells flow
    When User click on the No option in scan field
    And User click the LMP Yes option, they will select the LMP date above 9 weeks. If user click No option they will be navigated to approximate LMP flow
    And User click on the continue button
    And User select on the Date of Birth
    And User click risk Yes option they will be answers following questions. If user click No option, they will be navigated to GP registration page
    And User click on the next button
    And User click on the Yes option in the registered UK GP address question and they will be search and select the bluebell related address and also click on next button
    And User clicks on the 'Yes' option in the 'Have you spoken to either your GP or the Bluebell Suite and been told to contact MSI UK?' question on the Bluebell page, the process continues. If they click on the 'No' option, the flow ends
    And User click on the next button
    And User click MSI service provider Yes option and also click on the next button
    And User click Yes option in counselling now question and also click continue button

  Scenario: TOP eligibility - LMP date,CBS flow[Optional CBS, MSI contract or Optional CBS, Non-MSI contract]
    When User click on the No option in scan field
    And User click the LMP Yes option, they will select the LMP date. If user click No option they will be navigated to approximate LMP flow
    And User click on the continue button
    And User select on the Date of Birth
    And User click risk Yes option they will be answers following questions. If user click No option, they will be navigated to GP registration page
    And User click on the next button
    And User click on the Yes option in the registered UK GP address question and they will be search and select the CBS related address and also click on next button
    And User click MSI service provider Yes option and also click on the next button
    And User click Yes option in counselling now question and also click continue button

  Scenario: TOP eligibility - LMP date,CBS flow[Mandatory CBS, MSI contract or Mandatory CBS, Non-MSI contract]
    When User click on the No option in scan field
    And User click the LMP Yes option, they will select the LMP date. If user click No option they will be navigated to approximate LMP flow
    And User click on the continue button
    And User select on the Date of Birth
    And User click risk Yes option they will be answers following questions. If user click No option, they will be navigated to GP registration page
    And User click on the next button
    And User click on the Yes option in the registered UK GP address question and they will be search and select the CBS related address and also click on next button
    And User click on the back to dashboard button they will be navigate to dashboard
