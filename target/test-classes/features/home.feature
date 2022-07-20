@homeScenarios
Feature: Home page related scenarios
  Background: Sign in
    Given  User signs in:
      | Enter Username | test@yahoo.com |
      | Enter Password | test123        |
    When User clicks on "Login" button

  Scenario: Verify title of page
    Then Verify title of page is "Interview App"

  Scenario: Verify "Sign out" button
    Then Verify "Sign out" button is displayed

  Scenario: Verify "Manage Access" button is not displayed
    Then Verify "Manage Access" button is not displayed

  @dashboardTest
  Scenario Outline: Verify all dashboards are displayed
    Then Verify the following "<dashboards>" are displayed:
    Examples:
      | dashboards  |
      | All Topics  |
      | Coding      |
      | Soft skills |
