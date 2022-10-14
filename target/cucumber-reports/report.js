$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login Test Cases",
  "description": "",
  "id": "login-test-cases",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "User should not allowed to login with invalid credentials",
  "description": "",
  "id": "login-test-cases;user-should-not-allowed-to-login-with-invalid-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@invalidlogin"
    },
    {
      "line": 3,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 6,
      "value": "#Given User is in login page"
    }
  ],
  "line": 7,
  "name": "User enters email address \"\u003cEmailAddress\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User enters password \"\u003cPassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User clicks sign in button",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User should see error message on the screen",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "login-test-cases;user-should-not-allowed-to-login-with-invalid-credentials;",
  "rows": [
    {
      "cells": [
        "EmailAddress",
        "Password"
      ],
      "line": 13,
      "id": "login-test-cases;user-should-not-allowed-to-login-with-invalid-credentials;;1"
    },
    {
      "cells": [
        "test1234567@gmail.com",
        "test123"
      ],
      "line": 14,
      "id": "login-test-cases;user-should-not-allowed-to-login-with-invalid-credentials;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 11435999600,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "User should not allowed to login with invalid credentials",
  "description": "",
  "id": "login-test-cases;user-should-not-allowed-to-login-with-invalid-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@invalidlogin"
    },
    {
      "line": 3,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 6,
      "value": "#Given User is in login page"
    }
  ],
  "line": 7,
  "name": "User enters email address \"test1234567@gmail.com\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User enters password \"test123\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User clicks sign in button",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User should see error message on the screen",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "test1234567@gmail.com",
      "offset": 27
    }
  ],
  "location": "LoginStepDefinitions.user_enters_email_address(String)"
});
formatter.result({
  "duration": 401706900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test123",
      "offset": 22
    }
  ],
  "location": "LoginStepDefinitions.user_enters_password(String)"
});
formatter.result({
  "duration": 150679000,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinitions.user_clicks_sign_in_button()"
});
formatter.result({
  "duration": 1008557500,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinitions.user_should_see_error_message_on_the_screen()"
});
formatter.result({
  "duration": 1547538200,
  "error_message": "java.lang.AssertionError: The following asserts failed:\n\tValues are not matching expected [false] but found [true]\r\n\tat org.testng.asserts.SoftAssert.assertAll(SoftAssert.java:43)\r\n\tat mindq.seleniumtrainingaugframework.stepdefinitions.LoginStepDefinitions.user_should_see_error_message_on_the_screen(LoginStepDefinitions.java:63)\r\n\tat ✽.Then User should see error message on the screen(Login.feature:10)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 424573900,
  "status": "passed"
});
});