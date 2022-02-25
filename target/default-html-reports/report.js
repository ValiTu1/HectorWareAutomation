$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/contacts.feature");
formatter.feature({
  "name": "contacts functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.hectorware.step_definitions.LoginStepsDefs.user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters valid username \"Employee1\" and password \"Employee123\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.hectorware.step_definitions.LoginStepsDefs.user_enters_valid_username_and_password(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to \"Contacts\" page",
  "keyword": "And "
});
formatter.match({
  "location": "com.hectorware.step_definitions.ContactsStepDefs.user_navigates_to_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "users cannot create new groups having existing names",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "user is on the \"Contacts\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.hectorware.step_definitions.ContactsStepDefs.user_is_on_the_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on new group button",
  "keyword": "When "
});
formatter.match({
  "location": "com.hectorware.step_definitions.ContactsStepDefs.userClicksOnNewGroupButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters group name \"cydeo\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.hectorware.step_definitions.ContactsStepDefs.userEntersValidGroupName(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks to create the new group",
  "keyword": "And "
});
formatter.match({
  "location": "com.hectorware.step_definitions.ContactsStepDefs.userClicksToCreateTheNewGroup()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"This group already exists\" should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hectorware.step_definitions.ContactsStepDefs.shouldBeDisplayed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});