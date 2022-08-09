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
#     | Solutions      |
      | Join Us        |
      | Contact Us     |

    @smoke @ADVSYS-8 @navigation
      Scenario Outline: There should be secondary Navigation bar to navigate through pages.
      Given When user scrolls down the page.
      Then It should have "<Navigation Bar>" buttons
      Then Click on "<Navigation Link>" buttons should go to following pages
      Examples:
        | Navigation Bar | Navigation Link |
        | Home           | Home           |
        | About Us       | About Us       |
        | Services       | Services       |
        | Clients        | Clients        |
#       | Solutions      | Solutions      |
        | Join Us        | Join Us        |
        | Contact Us     | Contact Us     |
