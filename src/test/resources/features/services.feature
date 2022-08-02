@Services
Feature: Services related scenarios

  Background:
    Given User opens "Services" page

  @ADVSYS-42
  Scenario: Verify the title of Finance page
    When User clicks on division "Finance" link
    Then Verify the page title is "Advance Systems - Finance Division"

  @ADVSYS-42
  Scenario: Verify the title of IT page
    When User clicks on division "Information Technology" link
    Then Verify the page title is "Advance Systems - IT Division"

  @ADVSYS-42
  Scenario: Verify the title of Healthcare page
    When User clicks on division "Healthcare" link
    Then Verify the page title is "Advance Systems - Healthcare Division"

  @ADVSYS-42
  Scenario: Verify the title of Government Projects page
    When User clicks on division "Government Projects" link
    Then Verify the page title is "Advance Systems - Government Projects Division"

  @ADVSYS-42
  Scenario: Verify the title of Others page
    When User clicks on division "Others" link
    Then Verify the page title is "Advance Systems - Others Division"
   