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

    @ADVSYS-41
    Scenario: Verify About Us page has 4 headers with description texts
      Given user clicks on About Us page
      Then Verify first header says "Evaluate Resume"
      Then Verify first header's description text says "Which toil and pain can sed procure him some great pleasure."
      Then Verify second header says "Interview"
      Then Verify second header's description text says "Praising pain was born and will give complete account system."
      Then Verify third header says "Screening"
      Then Verify third header's description text says "Actual teachings the great explorer of the every one truth."
      Then Verify fourth header says "Process Done"
      Then Verify fourth header's description text says "Occur in which toil pain can procure him some great pleasure."


      @ADVSYS-40
      Scenario: Verify header We are Recruitment Experts displayed and OUR SERVICES BUTTON takes to service page
        Given Click on About Us page
        Then User see "We are Recruitment Experts" header
        Then User see "OUR SERVICES" button
        Then Verify "OUR SERVICES" button is enable

      @ADVSYS-38
      Scenario: Verify section header is display
        Given Click on About Us page
        Then Verify section with header "Why Choose Us" is display

      @ADVSYS-38
      Scenario Outline: Verify sub-section headers is display
        Given Click on About Us page
        Then Verify "<sub-sections>" with following headers is display
        Examples:
          | sub-sections |
          | On Time Services |
          | Experienced Team |
          | Good Track Records |

      @ADVSYS-38
      Scenario: Verify section header is display
        Given Click on About Us page
        Then Verify sub-section description text is display