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


  @ADVSYS-9 @smoke
  Scenario Outline: Buttons displayed for social media options
    Then User should be able to see "<social media options>"
    When Click on "<social media buttons>"
    Then Title for each corresponding page should contain "<page title>"
    Examples:
      | social media options | social media buttons | page title |
      | facebook             | Facebook             | Facebook |
      | twitter              | Twitter              | Twitter |
      | instagram            | Instagram            | Instagram |
      | linkedin             | LinkedIn             | LinkedIn |