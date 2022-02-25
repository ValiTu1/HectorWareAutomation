
Feature: contacts functionality

  Background:
    Given user is on the login page
    And user enters valid username "Employee1" and password "Employee123"
    And user navigates to "Contacts" page

  Scenario: users can create new groups
    Given user is on the "Contacts" page
    When user clicks on new group button
    And user enters group name "cydeo3"
    And user clicks to create the new group
    Then "cydeo3" group should be displayed
  @wip
    Scenario: users cannot create new groups having existing names
      Given user is on the "Contacts" page
      When user clicks on new group button
      And user enters group name "cydeo"
      And user clicks to create the new group
      Then "This group already exists" should be displayed

    Scenario: Users can create new contacts and add them to groups
      Given user is on the "Contacts" page
      When user click on create new contact button
      And user enters contact details
      And user assign the user to a group
      Then new contact will be displayed as part of the selected group


