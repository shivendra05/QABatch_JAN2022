$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("E:/GitHub/TL WorkSpace/01_UserLoginBDD/src/test/java/Featurefile/otherFeatures.Feature");
formatter.feature({
  "line": 1,
  "name": "User Login",
  "description": "",
  "id": "user-login",
  "keyword": "Feature"
});
formatter.before({
  "duration": 927700,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Login1 With invalid user",
  "description": "",
  "id": "user-login;login1-with-invalid-user",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "enter url",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Enter UserName and Password",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "click on submit button",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "print title",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "MyLogin.enter_url()"
});
formatter.result({
  "duration": 241886600,
  "status": "passed"
});
formatter.match({
  "location": "MyLogin.enter_UserName_and_Password()"
});
formatter.result({
  "duration": 90200,
  "status": "passed"
});
formatter.match({
  "location": "MyLogin.click_on_submit_button()"
});
formatter.result({
  "duration": 115100,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "MyLogin.close_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 115200,
  "status": "passed"
});
formatter.before({
  "duration": 110100,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Login2 With invalid user",
  "description": "",
  "id": "user-login;login2-with-invalid-user",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "enter url",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "Enter UserName and Password",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "click on submit button",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "print title",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "MyLogin.enter_url()"
});
formatter.result({
  "duration": 216600,
  "status": "passed"
});
formatter.match({
  "location": "MyLogin.enter_UserName_and_Password()"
});
formatter.result({
  "duration": 113400,
  "status": "passed"
});
formatter.match({
  "location": "MyLogin.click_on_submit_button()"
});
formatter.result({
  "duration": 67300,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "MyLogin.close_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 227800,
  "status": "passed"
});
});