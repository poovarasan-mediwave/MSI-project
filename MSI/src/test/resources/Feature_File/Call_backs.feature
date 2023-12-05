Feature: Call backs

  Background: 
    Given Launch the external site url
    When User click the Staff login button in page
    And User enter the super admin microsoft email and click next button
    And User enter the super admin microsoft password and click signup button
    And User should click on the dashboard option and also click call backs option

  Scenario: Call backs - Assign to me flow
    And Search and select the specific user
    And User click action field and then select the Assign to me option and also check with status field

  Scenario: Call backs - Attempt 1 flow
    When Search and select the specific user
    And User click action field and then select the Attempt 1 option and also check with status field

  Scenario: Call backs - Attempt 2 flow
    When Search and select the specific user
    And User click action field and then select the Attempt 2 option and also check with status field

  Scenario: Call backs - Mark as completed flow
    When Search and select the specific user
    And User click action field and then select the Mark as completed option and also check with status field
    And User click on the completed option here to view the recently call back completed account

  Scenario: Call backs - Overflow
    When Search and select the specific user
    And User wait a few minutes under the pending option
    And User click on the overflow option and search the same user, here to view the same user under the overflow option
