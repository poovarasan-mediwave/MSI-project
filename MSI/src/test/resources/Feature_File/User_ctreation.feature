@user_creation
Feature: User creations

  Scenario: Test the SighUp flow
    Given Launch the external site URL
    When User click on the Book an Appointment option
    #And User select on service option
    And User select on TOP after that user answer the pregnancy test and enter the postcode to check eligibility; otherwise,user should skip those steps and navigate to create an account page
    And User click on signUp button
    And User enter their Firstname, Lastname and Email into the respective fields
    And User click on recaptcha button
    And User click on terms and condition option and click accept button and also click on next button
    And User enter our UK address in the designated field and click on next button
    And User enter our Mobile number and click on next button
    And User should set their password for both password and confirm password fields and also click on confirm button
    And User selects the safe option under the security options, they will be navigated to the contact preference page here you select the preference option. If the user selects neither or the safe option, they will be navigated to the set a memorable word page here you can set the PIN.
    And User click on verify by email button
    And User login to the recently created credentials
    #Then User should be log in to the recently created credentials
