$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ProjectFeature/Listing.feature");
formatter.feature({
  "line": 1,
  "name": "listing values",
  "description": "",
  "id": "listing-values",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3703979800,
  "status": "passed"
});
formatter.before({
  "duration": 3217818400,
  "status": "passed"
});
formatter.before({
  "duration": 3438134400,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Values in console",
  "description": "",
  "id": "listing-values;values-in-console",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Goto the webpage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Print the values",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Exit to the page",
  "keyword": "Then "
});
formatter.match({
  "location": "PgValues.goto_the_webpage()"
});
formatter.result({
  "duration": 687313600,
  "status": "passed"
});
formatter.match({
  "location": "PgValues.print_the_values()"
});
formatter.result({
  "duration": 3764060700,
  "error_message": "java.lang.ClassCastException: class java.util.ArrayList cannot be cast to class org.openqa.selenium.WebElement (java.util.ArrayList is in module java.base of loader \u0027bootstrap\u0027; org.openqa.selenium.WebElement is in unnamed module of loader \u0027app\u0027)\r\n\tat projectClass.PgValues.print_the_values(PgValues.java:43)\r\n\tat ✽.When Print the values(ProjectFeature/Listing.feature:7)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "PgValues.exit_to_the_page()"
});
formatter.result({
  "status": "skipped"
});
});