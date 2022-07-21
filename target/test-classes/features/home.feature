@homeScenarios
Feature: Homepage related scenarios

   @smoke @ADVSYS-5
  Scenario Outline: This navigation bar should have following buttons
    Then Verify "<Get Support>" buttons is displayed
    Examples:
    | Get Support |
    | Job Career  |
    | Feedbacks   |
   @smoke @ADVSYS-5
  Scenario Outline: verify Language selection is displayed
    When Click on Language selection
    Then Verify Language "<English>" buttons is displayed
    Examples:
      | English |
      | Spanish |
      | French  |

  @ADVSYS-7
  Scenario: Verify "Join Now" button is displayed
    Then Verify "Join Now" button is displayed
  @ADVSYS-7
  Scenario: Verify title of Join Us Page
    When user click on "Join Now" button
    Then Verify title of page is "Advance Systems - Join"

<<<<<<< HEAD
  @smoke @ADVSYS-10
  Scenario: There should be description and Read More button
    Then There should be description
    And Read More button
=======
  @ADVSYS-1
  Scenario: Verify title of Home Page
    Then Verify title of Home page is "Advance Systems - Home"
>>>>>>> master
