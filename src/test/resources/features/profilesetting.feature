Feature: Profile Settings Functionality

  Background:
    Given user is on the login page
    When user enters valid username "Employee1" and password "Employee123"

    Scenario: Verify chosen picture is displayed
      And user navigates to "Menu"
      Then user select "Settings" option
      And the "Profile Settings" page should be displayed
      Then user click on "upload new"
      When user click on "open"
      Then user click on "Choose as a profile picture"
      And Verify the picture is selected
