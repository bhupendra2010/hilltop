$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("hilltop.feature");
formatter.feature({
  "line": 1,
  "name": "User want to find out homework for year 5",
  "description": "",
  "id": "user-want-to-find-out-homework-for-year-5",
  "keyword": "Feature"
});
formatter.before({
  "duration": 10144904600,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "",
  "description": "",
  "id": "user-want-to-find-out-homework-for-year-5;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is on school website",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User select year 5 in year learning group",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User should able to find out homework for year 5",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.user_is_on_school_website()"
});
formatter.result({
  "duration": 211575100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 17
    }
  ],
  "location": "StepDef.user_select_year_in_year_learning_group(int)"
});
formatter.result({
  "duration": 821852800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 47
    }
  ],
  "location": "StepDef.user_should_able_to_find_out_homework_for_year(int)"
});
formatter.result({
  "duration": 165241000,
  "status": "passed"
});
});