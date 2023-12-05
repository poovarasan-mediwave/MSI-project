Feature: Super admin All clients

  Background: 
    Given Launch the external site url
    When User click the Staff login button
    And User enter the super admin microsoft email and click next button
    And User enter the super admin microsoft password and click signup button
    And User should click on the Admin functions option and also click All clients option
    And Search and select the particulat user and then check service and last log in content and also click on the account settings option

  Scenario: View and edit the client information via super admin and view the updated details in service user profile and also check the Account history
    And User click on the edit option in client information field
    And User should update the Client name, Address, Phone number and Email address fields and then click on the save button
    Then User to verify the toaster message and also verify the updated fields after click the save button
    And User should click Audit trail option and then here to see the change details
    And User should click on the logout option
    And User should enter their Email address and password for the respective fields and they will enter the memorable word
    And User should click on the Recaptcha option and then click login button and they will naviagte to dashboard page
    And User should click profile option and then check the updated details present or not
    And User should click Account history button and then here to view the history
    Then User to verify the updated details

  Scenario: Security - Set a temporary memorable word and Set a temporary password[Neither are safe]
    When User should click security option
    And User should enter the temporary memorable word and then click save button
    Then User to verify the toaster message in temporary memorable word field
    And User should enter the temporary password and then click save button
    Then User to verify the toaster message in temporary password field
    And User should click Audit trail option and then here to view the change details
    And User click logout option
    And User should enter their Email address and temporary password for the respective fields and they will enter the temporary memorable word
    And User should click recaptcha option and then click login button and they will navigate to Reset passord page
    And User should enter their New password and Reenter new password for the respective fields
    And User click the confirm button
    And User should enter their new momorable word and confirm memorable word for the respective fields
    And User click cofirm button
    And User click login button and they will navigate to login page
    And User should enter their Email and new password for the respective fields and then they will enter the new memorable word
    And User click Recaptcha button and then click login button they will be navigated to dashboard page

  Scenario: Security - Set a temporary password[Both email and phone safe ]
    When User should click security option
    And User should enter the temporary password and then click save button
    Then User to verify the toaster message in temporary password field
    And User should click Audit trail option and then here to view the change details
    And User click logout option
    And User should enter their Email address and temporary password for the respective fields
    And User should click recaptcha option and then click login button and they will navigate to Reset passord page
    And User should enter their New password and Reenter new password for the respective fields
    And User click the confirm button
    Then User to verify success message
    And User click login button and they will navigate to login page
    And User should enter their Email and new password for the respective fields
    And User click Recaptcha button and then click login button they will be navigated to dashboard page
    Then User to verify the dashboard page

  Scenario: Safeguarding, Completed forms edit and view edit history flow
    When User should click on the safeguarding option
    And User should view the safeguarding related questions and answers and they coming from deomgraphic and consultation foms
    And User should click on the completed forms option
    And User should click edit option in specific form and then edit the details
    And User should click view edit history option here to view the history details and then close the pop-up
    And User click submit button
    And User should click preview option here to view the questions and answers and then close the pop-up
    And User should click on the safeguarding option and view the safeguarding related questions and answers
    And User should click copy option and then paste it in notepad 
    And User click logout option
    And User should enter their Email and password for the respective fields and sometimes they have memorable word and enter the respective field
    And User should click Recaptcha button and also click on the login button, they will navigate to dashboard page
    And User click preview option for the respective form here to view the updated questions
    And User should click logout option

  Scenario: Rightcare, Completed forms edit and view edit history flow
    When User should click on the Rightcare option
    And User should view the rightcare related questions and answers and they coming from deomgraphic and consultation foms
    And User should click on the completed forms option
    And User should click edit option in specific form and then edit the details
    And User should click view edit history option here to view the history details and then close pop-up
    And User click submit button
    And User should click preview option here to view the questions and answers and then close the pop-up
    And User should click on the Rightcare option and view the Rightcare related questions and answers
    And User should click copy option and then paste it in notepad 
    And User click logout option
    And User should enter their Email and password for the respective fields and sometimes they have memorable word and enter the respective field
    And User should click Recaptcha button and also click on the login button, they will navigate to dashboard page
    And User click preview option for the respective form here to view the updated questions
    And User should click logout option
    
    
