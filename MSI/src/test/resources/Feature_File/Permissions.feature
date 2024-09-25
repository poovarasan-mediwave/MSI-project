Feature: Permisssions - Switch to admin

  Background: 
    Given Launch the external site url
    When User click the Staff login button
    And User enter the super admin microsoft email and click next button
    And User enter the super admin microsoft password and click signup button
    And User should click on the Admin functions option and also click Permissions option

  Scenario: Permissions - switch from Super admin to Admin flow
    When User should click on the switch to admin option and then click confirm button
    Then User to verify the toaster message
    And User logout the current super admin credentials
    And Launch the external site URL
    And User click the Staff login button
    And User enter the admin microsoft email and click next button
    And User enter the admin microsoft password and click signup button
    Then User to verify the admin details
    And User logout the admin credentials

  Scenario: Permissions - Switch from Admin to Super admin flow
    When User should click on the add super admin button
    And User search and select the credentials and then click confirm button
    And User logout the current admin credentials
    And Launch the external site URL
    And User click the Staff login button
    And User enter the super admin microsoft email and click next button
    And User enter the super admin microsoft password and click signup button
    Then User to verify the super admin details
    And User logout the super admin credentials

  Scenario: Permissions - Verify the error message when user trying to switch the login credentials
    When User should click on the either Switch to admin or Disable option
    Then User to verify the error message
