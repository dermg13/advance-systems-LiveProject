@AboutUs
  Feature: About Us related scenarios
    @ADVSYS-37
    Scenario: About Us page: Main content
      Given When click on About Us page
      Then There should be a main header Welcome to Advance Systems LLC.
      Then This section should contain name and title of the person.

    @ADVSYS-39
    Scenario: About Us page: Employees
      Given When click on About Us page
#      Given This section should have a header   Meet Our Experts.
#      Then Total of four employees should be displayed Picture
#      Then Total of four employees should be displayed Title
#      Then Total of four employees should be displayed Quote
#      Then Total of four employees should be displayed Social
      Then All employees FaceBook buttons should take to FaceBook pages
#      Then All Twitter buttons should take to Twitter pages
#      Then All Skype buttons should take to Skype pages
#      Then All LinkedIn buttons should take to LinkedIn pages



#      Then "<Social media>" buttons should take to corresponding pages
#        | Social media |
#        | Facebook     |
#        | twitter      |
#        | Skype        |
#        | Linkedin     |
