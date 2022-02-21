@wip
Feature: contacts functionality

  Background:
    Given user is on the login page
    And user enters valid username "Employee1" and password "Employee123"
    And user navigates to "Contacts" page

  Scenario: users can create new groups
    Given user is on the "Contacts" page
