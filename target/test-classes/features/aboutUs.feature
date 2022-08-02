@AboutUs
  Feature: About Us related scenarios
    @ADVSYS-37
    Scenario: About Us page: Main content
      Given When click on About Us page
      Then There should be a main header Welcome to Advance Systems LLC.
      Then This section should contain name and title of the person.
