@homeScenarios
Feature: Homepage related scenarios

  @ADVSYS-7
  Scenario: Verify "Join Now" button is displayed
    Then Verify "Join Now" button is displayed

  @ADVSYS-7
  Scenario: Verify title of Join Us Page
    When user click on "Join Now" button
    Then Verify title of page is "Advance Systems - Join"
#########################################################################

  @ADVSYS-9 @smoke
  Scenario Outline: Buttons displayed for social media options
    Then User is able to see "<social media options>" icon
    When Click on "<social media buttons>"
    Then URL is "<url>"
    Examples:
      | social media options | social media buttons | url                       |
      | facebook             | facebook             | https://www.facebook.com/ |
      | twitter              | twitter              | https://twitter.com/      |
      | google-plus          | google-plus          | https://www.google.com/   |
      | linkedin             | linkedin             | https://www.linkedin.com/ |
##########################################################################
  @ADVSYS-4
  Scenario: Verify title of Home Page
    Then Verify title of Home page is "Advance Systems - Home"
##########################################################################
  @ADVSYS-6
  Scenario: Verify address and phone number are displayed
    Then Verify address is "10090 Main Street"
    And Verify city, state and country is "Fairfax, VA, USA"
    And Verify phone number is "+1 234 567 1234 "
#########################################################################
  @ADVSYS-13
  Scenario: Verify header and testimonials by peoples
    Given Verify the header texts
    Then Verify the testimonials
    Then Verify the name of clients
    And Verify the states
    #Add ScreenShot in jenkins to prove the location on header, testimonials, name and state.
##########################################################################
  @ADVSYS-10
  Scenario: Parallax section content information and update
    When Information is displayed in the parallax section
    Then Header and description update automatically

  @ADVSYS-10
  Scenario: Parallax section button
    When User clicks on "Read More" button in parallax section
    Then User should see the "Services" page displayed

#############################################################################
  @ADVSYS-14
  Scenario: Verify user can see company names above footer
    Then Verify user sees company image

#############################################################################

  @ADVSYS-11
  Scenario: Verify home page has a header,secondary header, and description text
    Then Verify header is "Welcome to Advance Systems LLC."
    And Verify secondary header is "Our Mission is simple, deliver very honest recruitment services to every customer."
    And Verify description text is "Day in and day out for the last years we’ve been more than just a staffing company. Throughout this time we’ve built relationships, we’ve grown together internally and externally, and have created a system that allows us to personally cater to the needs of our clients and candidates. We’ve been a mentor for some, a team builder for others, but most importantly we’ve been there. We know there is no substitute for experience, so let us help you navigate through the ever changing web of talent. "


#############################################################################
  @ADVSYS-12
  Scenario Outline: Verify expect sections are displayed as a header
    Then Verity "<expect sections>" is displayed as a header
    Examples:
      | expect sections               |
      | Leadership Development        |
      | Capability Building           |
      | Rewards & Benefits            |
      | Employee & Employer Relations |
      | Excellent Customer Service    |

      ################################################################################
  @ADVSYS-20
  Scenario: Verify Copyright text is updated
    Then Verify copyright text is "Copyright © 2022 Advance Systems LLC. All Rights Reserved."
      ##########################################################################################
  @ADVSYS19
  Scenario: There should be a button in the bottom right corner of the page that would scroll the window to top content once clicked.
    Given scroll down to bottom of the page
    Then click on button go back button when scroll down to bottom of the page
    And check if it back to top content
    ############################################################################

  @ADVSYS-12
  Scenario: Verify descriptions under expect sections is displayed
    Then Verify descriptions under expect sections is displayed

################################################################################
  @ADVSYS-20
  Scenario: Verify Copyright text is updated
    Then Verify copyright text is "Copyright © 2022 Advance Systems LLC. All Rights Reserved."

################################################################################

