@homeScenarios
Feature: Homepage related scenarios

  @smoke @ADVSYS-7
  Scenario: Verify "Join Now" button is displayed
    Then Verify "Join Now" button is displayed
  @smoke @ADVSYS-7
  Scenario: Verify title of Join Us Page
    When user click on "Join Now" button
    Then Verify title of page is "Advance Systems - Join"

  @ADVSYS-1
  Scenario: Verify title of Home Page
    Then Verify title of Home page is "Advance Systems - Home"