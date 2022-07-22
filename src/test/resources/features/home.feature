@homeScenarios
Feature: Homepage related scenarios

  @ADVSYS-7
  Scenario: Verify "Join Now" button is displayed
    Then Verify "Join Now" button is displayed
  @ADVSYS-7
  Scenario: Verify title of Join Us Page
    When user click on "Join Now" button
    Then Verify title of page is "Advance Systems - Join"



  @ADVSYS-9 @smoke
  Scenario Outline: Buttons displayed for social media options
    Then User should be able to see "<social media options>"
    When Click on "<social media buttons>"
    Then Title for each corresponding page should contain "<page title>"
    Examples:
      | social media options | social media buttons | page title |
      | facebook             | Facebook             | Facebook |
      | twitter              | Twitter              | Twitter |
      | instagram            | Instagram            | Instagram |
      | linkedin             | LinkedIn             | LinkedIn |

  @ADVSYS-4
  Scenario: Verify title of Home Page
    Then Verify title of Home page is "Advance Systems - Home"

  @ADVSYS-6
  Scenario: Verify address and phone number are displayed
    Then Verify address is "10090 Main Street"
    And Verify city, state and country is "Fairfax, VA, USA"
    And Verify phone number is "+1 234 567 1234 "

  @ADVSYS-13
  Scenario: Verify header and testimonials by peoples
    Given Verify the header text
    Then Verify the testimonials
    Then Verify the name of testimonials
    And Verify the state
    #Add ScreenShot in jenkins to prove the location on header, testimonials, name and state.
