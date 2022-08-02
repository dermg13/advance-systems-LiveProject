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

  @ADVSYS-43
  Scenario Outline: Verify division links are enabled on mini nav bar
    When User clicks on division "<Division Names>" link
    Then Verify Finance button is enabled
    Then Verify Information Technology button is enabled
    Then Verify Healthcare button is enabled
    Then Verify Government Projects button is enabled
    Then Verify Others button is enabled
    Examples:
      | Division Names         |
      | Finance                |
      | Information Technology |
      | Healthcare             |
      | Government Projects    |
      | Others                 |
   