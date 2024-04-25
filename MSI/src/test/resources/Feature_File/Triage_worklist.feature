Feature: Triage worklist

  Scenario: Triage worklist flow
    Given Launch the external site url
    When User click the Staff login button in page
    And User enter the super admin microsoft email and click next button
    And User enter the super admin microsoft password and click signup button
    And User should click on the dashboard option and also click Triage worklist option
    And Search and select the specific user and
    Then User to verify the gestation duration, Safeguarding flags, rightcare flag and other IRs
    Then User to verify the category based on the safeguarding, rightcare and age
    And User 
