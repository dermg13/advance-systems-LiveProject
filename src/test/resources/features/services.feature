@Services
  Feature: Services related scenarios
    Background:
      Given User opens "Services" page

    Scenario: Verify the following division pages are displayed
      When User click on "Finance" link
      Then Verify title of page is "Finance"