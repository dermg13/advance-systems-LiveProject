@smoke @navigationScenarios
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




  @NotForTesting
  Scenario Outline: HOME should have following buttons
    Given Click on HOME button
    Then Verify "<Top Bar>" buttons is displayed
    Then Verify "<Language>" buttons is displayed
    Examples:
      | Top Bar     | Language |
      | Get Support | English |
      | Job Career  | Spanish |
      | Feedback    | French  |

  @NotForTesting
  Scenario Outline: ABOUT US should have following buttons
    Given Click on ABOUT US button
    Then Verify "<Top Bar>" buttons is displayed
    Then Verify "<Language>" buttons is displayed
    Examples:
      | Top Bar     | Language |
      | Get Support | English |
      | Job Career  | Spanish |
      | Feedback    | French  |

  @NotForTesting
  Scenario Outline: SERVICES should have following buttons
    Given Click on SERVICES button
    Then Verify "<Top Bar>" buttons is displayed
    Then Verify "<Language>" buttons is displayed
    Examples:
      | Top Bar     | Language |
      | Get Support | English |
      | Job Career  | Spanish |
      | Feedback    | French  |

  @NotForTesting
  Scenario Outline: CLIENTS should have following buttons
    Given Click on CLIENTS button
    Then Verify "<Top Bar>" buttons is displayed
    Then Verify "<Language>" buttons is displayed
    Examples:
      | Top Bar     | Language |
      | Get Support | English |
      | Job Career  | Spanish |
      | Feedback    | French  |

  @NotForTesting
  Scenario Outline: SOLUTIONS should have following buttons
    Given Click on SOLUTIONS button
    Then Verify "<Top Bar>" buttons is displayed
    Then Verify "<Language>" buttons is displayed
    Examples:
      | Top Bar     | Language |
      | Get Support | English |
      | Job Career  | Spanish |
      | Feedback    | French  |

  @NotForTesting
  Scenario Outline: JOIN US should have following buttons
    Given Click on JOIN US button
    Then Verify "<Top Bar>" buttons is displayed
    Then Verify "<Language>" buttons is displayed
    Examples:
      | Top Bar     | Language |
      | Get Support | English |
      | Job Career  | Spanish |
      | Feedback    | French  |
  @NotForTesting
  Scenario Outline: CONTACT US should have following buttons
    Given Click on CONTACT US button
    Then Verify "<Top Bar>" buttons is displayed
    Then Verify "<Language>" buttons is displayed
    Examples:
      | Top Bar     | Language |
      | Get Support | English |
      | Job Career  | Spanish |
      | Feedback    | French  |
