Feature: Project login into the page

Scenario Outline: Login with Data

Given Navigate to the webpage

When User enters the "<UserName>" and "<Password>"

And Click the submit button

Then reaches the success message for login

Examples:
|UserName    | Password    |
|Superman01  | super123    |
|Abcdefg     | 23mkasn     |