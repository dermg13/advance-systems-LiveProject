@homeScenarios
Feature: Homepage related scenarios

  @smoke
  Scenario Outline: This navigation bar should have following buttons
    Then Verify "<Get Support>" buttons is displayed
    Examples:
    | Get Support |
    | Job Career  |
    | Feedbacks   |
  @smoke
  Scenario Outline: verify Language selection is displayed
    When Click on Language selection
    Then Verify Language "<English>" buttons is displayed
    Examples:
      | English |
      | Spanish |
      | French  |
<<<<<<< HEAD

=======
>>>>>>> master

  @ADVSYS-7
  Scenario: Verify "Join Now" button is displayed
    Then Verify "Join Now" button is displayed
  @ADVSYS-7
  Scenario: Verify title of Join Us Page
    When user click on "Join Now" button
    Then Verify title of page is "Advance Systems - Join"

