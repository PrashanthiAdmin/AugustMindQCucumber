Feature: Login Test Cases

@invalidlogin @smoke
Scenario Outline: User should not allowed to login with invalid credentials

#Given User is in login page
When User enters email address "<EmailAddress>"
And  User enters password "<Password>"
When User clicks sign in button
Then User should see error message on the screen

Examples:
|EmailAddress|Password|
|test1234567@gmail.com|test123|




@validlogin @smoke
Scenario: User should be able to login successfully with valid credentials

Given User is in login page
When User enters email address "test123@gmail.com"
And  User enters password "test1234"
When User clicks sign in button
Then User should be successfully login
