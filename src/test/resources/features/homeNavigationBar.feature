@smoke @navigationScenarios
Feature: Navigation Bar related scenarios

  @smoke @ADVSYS-5 @navigation
  Scenario Outline: All of Navigation bar Link should have following buttons When click
    When Click on "<Navigation Bar>" Link
    Then Verify Get Support buttons is displayed
    Then Verify Job Career buttons is displayed
    Then Verify Feedback buttons is displayed
    Then Verify Language English buttons is displayed
    Then Verify Language Spanish buttons is displayed
    Then Verify Language French buttons is displayed
    Examples:
      | Navigation Bar |
      | Home           |
      | About Us       |
      | Services       |
      | Clients        |
      | Solutions      |
      | Join Us        |
      | Contact Us     |

