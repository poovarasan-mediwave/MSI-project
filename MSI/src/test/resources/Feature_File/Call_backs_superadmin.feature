Feature: Super admin - Call backs 

  Background: 
    Given Launch the external site url
    When User click the Staff login button in page
    And User enter the super admin microsoft email and click next button
    And User enter the super admin microsoft password and click signup button
    And User should click on the Admin functions option and then click Call backs option
    And User should select a date to set the count for the session
    And User should click on the edit option
    And Users edit the count on a session wise basis
    And User click on the save button

  Scenario: Call back - This day only flow
    And User should select the slot[This day only] and then click confirm button

  Scenario: Call back - This week flow
    And User should select the slot[This week] and then click confirm button

  Scenario: Call back - Default for all days flow
    And User should select the slot[Default for all days] and then click confirm button

  Scenario: Call back - All Mondays from this day flow
    And User should select the slot[All Mondays from this day] and then click confirm button

  Scenario: Call back - All Tuesdays from this day flow
    And User should select the slot[All Tuesdays from this day] and then click confirm button

  Scenario: Call back - All Wednesdays from this day flow
    And User should select the slot[All Wednesdays from this day] and then click confirm button

  Scenario: Call back - All Thursdays from this day flow
    And User should select the slot[All Thursdays from this day] and then click confirm button

  Scenario: Call back - All Fridays from this day flow
    And User should select the slot[All Fridays from this day] and then click confirm button

  Scenario: Call back - All Saturdays from this day flow
    And User should select the slot[All Saturdays from this day] and then click confirm button

  Scenario: Call back - All Sundays from this day flow
    And User should select the slot[All Sundays from this day] and then click confirm button

  Scenario: Call back - Only weekdays (Monday to Friday) from this day flow
    And User should select the slot[Only weekdays (Monday to Friday)] and then click confirm button

  Scenario: Call back - Only weekends (Saturday and Sunday) from this day flow
    And User should select the slot[Only weekends (Saturday and Sunday)] and then click confirm button

  Scenario: Call back - All days in this month flow
    And User should select the slot[All days in this month] and then click confirm button
