@navigation
Feature: Navigation Bar related scenarios

  @smoke @ADVSYS-5 @navigationBar
  Scenario Outline: HOME should have following buttons
    When click on HOME Button
    Then Verify "<Get Support>" buttons is displayed in Home page
    Examples:
      | Get Support |
      | Job Career  |
      | Feedback    |
   Scenario: Drop down menu for language in Home page
     When user click on English button for language
     Then Verify Language English buttons is displayed
     Then Verify Language Spanish buttons is displayed
     Then Verify Language French buttons is displayed

  @smoke @ADVSYS-5 @navigationBar
  Scenario Outline: ABOUT US should have following buttons
    When Click on ABOUT US button
    Then Verify "<Get Support>" buttons is displayed in About us page
    Examples:
      | Get Support |
      | Job Career  |
      | Feedback    |
  Scenario: Drop down menu for language in About us page
    When user click on English button for language
    Then Verify Language English buttons is displayed
    Then Verify Language Spanish buttons is displayed
    Then Verify Language French buttons is displayed


  @smoke @ADVSYS-5 @navigationBar
  Scenario Outline: SERVICES should have following buttons
    When Click on SERVICES button
    Then Verify "<Get Support>" buttons is displayed in Services page
    Examples:
      | Get Support |
      | Job Career  |
      | Feedback    |
  Scenario: Drop down menu for language in Service page
    When user click on English button for language
    Then Verify Language English buttons is displayed
    Then Verify Language Spanish buttons is displayed
    Then Verify Language French buttons is displayed


  @smoke @ADVSYS-5 @navigationBar
  Scenario Outline: CLIENTS should have following buttons
    When Click on CLIENTS button
    Then Verify "<Get Support>" buttons is displayed in Clients page
    Examples:
      | Get Support |
      | Job Career  |
      | Feedback    |
  Scenario: Drop down menu for language in Clients page
    When user click on English button for language
    Then Verify Language English buttons is displayed
    Then Verify Language Spanish buttons is displayed
    Then Verify Language French buttons is displayed


  @smoke @ADVSYS-5 @navigationBar
  Scenario Outline: SOLUTIONS should have following buttons
    When Click on SOLUTIONS button
    Then Verify "<Get Support>" buttons is displayed in Solutions page
    Examples:
      | Get Support |
      | Job Career  |
      | Feedback    |
  Scenario: Drop down menu for language in Solutions page
    When user click on English button for language
    Then Verify Language English buttons is displayed
    Then Verify Language Spanish buttons is displayed
    Then Verify Language French buttons is displayed


  @smoke @ADVSYS-5 @navigationBar
  Scenario Outline: JOIN US should have following buttons
    When Click on JOIN US button
    Then Verify "<Get Support>" buttons is displayed in Join us page
    Examples:
      | Get Support |
      | Job Career  |
      | Feedback    |
  Scenario: Drop down menu for language in Join us page
    When user click on English button for language
    Then Verify Language English buttons is displayed
    Then Verify Language Spanish buttons is displayed
    Then Verify Language French buttons is displayed


  @smoke @ADVSYS-5 @navigationBar
  Scenario Outline: CONTACT US should have following buttons
    When Click on CONTACT US button
    Then Verify "<Get Support>" buttons is displayed in Contact us page
    Examples:
      | Get Support |
      | Job Career  |
      | Feedback    |
  Scenario: Drop down menu for language in Contact us page
    When user click on English button for language
    Then Verify Language English buttons is displayed
    Then Verify Language Spanish buttons is displayed
    Then Verify Language French buttons is displayed







