@AboutUs
  Feature: About Us related scenarios
    @ADVSYS-37
    Scenario: About Us page: Main content
      Given Click on About Us page
      Then There should be a main header Welcome to Advance Systems LLC.
      Then This section should contain name and title of the person.

    @ADVSYS-39
    Scenario: About Us page: Employees
      Given Click on About Us page
      Then This section should have a header   Meet Our Experts.
      Then Total of four employees should be displayed Picture
      Then Total of four employees should be displayed Title
      Then Total of four employees should be displayed Quote
      Then Total of four employees should be displayed Social media link


    @ADVSYS-39
    Scenario:  About Us page: Employees Social
      Given Click on About Us page
      Then Employees Social media buttons should take to corresponding pages


