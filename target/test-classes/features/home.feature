@homeScenarios
Feature: Homepage related scenarios

<<<<<<< HEAD
   @ADVSYS-5
=======
   @smoke @ADVSYS-5
>>>>>>> c766a40881b05dc65caa4677f0ba577d1e00656e
  Scenario Outline: This navigation bar should have following buttons
    Then Verify "<Get Support>" buttons is displayed
    Examples:
    | Get Support |
    | Job Career  |
    | Feedbacks   |
<<<<<<< HEAD
   @ADVSYS-5
=======
   @smoke @ADVSYS-5
>>>>>>> c766a40881b05dc65caa4677f0ba577d1e00656e
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

