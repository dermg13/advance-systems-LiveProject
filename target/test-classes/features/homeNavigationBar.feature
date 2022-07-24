@navigationScenarios
Feature: Navigation Bar related scenarios

  @smoke @ADVSYS-5 @navigation
  Scenario: HOME should have following buttons
    Given click on HOME Button
    Then Verify Get Support buttons is displayed
    Then Verify Job Career buttons is displayed
    Then Verify Feedback buttons is displayed
    Then Click on English button
    Then Verify Language English buttons is displayed
    Then Verify Language Spanish buttons is displayed
    Then Verify Language French buttons is displayed

  @smoke @ADVSYS-5 @navigation
  Scenario: ABOUT US should have following buttons
    When Click on ABOUT US button
    Then Verify Get Support buttons is displayed
    Then Verify Job Career buttons is displayed
    Then Verify Feedback buttons is displayed
    Then Click on English button
    Then Verify Language English buttons is displayed
    Then Verify Language Spanish buttons is displayed
    Then Verify Language French buttons is displayed

  @smoke @ADVSYS-5 @navigation
  Scenario: SERVICES should have following buttons
    When Click on SERVICES button
    Then Verify Get Support buttons is displayed
    Then Verify Job Career buttons is displayed
    Then Verify Feedback buttons is displayed
    Then Click on English button
    Then Verify Language English buttons is displayed
    Then Verify Language Spanish buttons is displayed
    Then Verify Language French buttons is displayed

  @smoke @ADVSYS-5 @navigation
  Scenario: CLIENTS should have following buttons
    When Click on CLIENTS button
    Then Verify Get Support buttons is displayed
    Then Verify Job Career buttons is displayed
    Then Verify Feedback buttons is displayed
    Then Click on English button
    Then Verify Language English buttons is displayed
    Then Verify Language Spanish buttons is displayed
    Then Verify Language French buttons is displayed

  @smoke @ADVSYS-5 @navigation
  Scenario: SOLUTIONS should have following buttons
    When Click on SOLUTIONS button
    Then Verify Get Support buttons is displayed
    Then Verify Job Career buttons is displayed
    Then Verify Feedback buttons is displayed
    Then Click on English button
    Then Verify Language English buttons is displayed
    Then Verify Language Spanish buttons is displayed
    Then Verify Language French buttons is displayed

  @smoke @ADVSYS-5 @navigation
  Scenario: JOIN US should have following buttons
    When Click on JOIN US button
    Then Verify Get Support buttons is displayed
    Then Verify Job Career buttons is displayed
    Then Verify Feedback buttons is displayed
    Then Click on English button
    Then Verify Language English buttons is displayed
    Then Verify Language Spanish buttons is displayed
    Then Verify Language French buttons is displayed

  @smoke @ADVSYS-5 @navigation
  Scenario: CONTACT US should have following buttons
    When Click on CONTACT US button
    Then Verify Get Support buttons is displayed
    Then Verify Job Career buttons is displayed
    Then Verify Feedback buttons is displayed
    Then Click on English button
    Then Verify Language English buttons is displayed
    Then Verify Language Spanish buttons is displayed
    Then Verify Language French buttons is displayed

  @ADVSYS-5test
  Scenario Outline: Navigation Bar
    When User is click 0n "<Home>" navigation bar
    Then Verify "<Get Support>" is displayed
    When Click on English button for language Selection
    Then Verify "<English>" Selection is displayed
    Examples:
     | Home    | Get Support |  English  |
     | About Us| Job Career  |  Spanish  |
     | Services | Feedback    |  French   |
   @ADVSYS-5test
  Scenario Outline: Navigation Bar
    When User is click 0n "<Clients>" navigation bar
    Then Verify "<Get Support>" is displayed
    When Click on English button for language Selection
    Then Verify "<English>" Selection is displayed
    Examples:
      | Clients    | Get Support |  English  |
      | Solutions  | Job Career  |  Spanish  |
      | Join Us    | Feedback    |  French   |
      | Contact Us | Feedback    |  French   |