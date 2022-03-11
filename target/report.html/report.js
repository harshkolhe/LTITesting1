$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/FeatureFolder/Exercise1.feature");
formatter.feature({
  "name": "Test Login Functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login with valid data/inputs",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user open chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "TestScript.user_open_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "navigates to newtours",
  "keyword": "And "
});
formatter.match({
  "location": "TestScript.navigates_to_newtours()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters valid username",
  "keyword": "When "
});
formatter.match({
  "location": "TestScript.user_enters_valid_username()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters valid password",
  "keyword": "And "
});
formatter.match({
  "location": "TestScript.user_enters_valid_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on submit",
  "keyword": "And "
});
formatter.match({
  "location": "TestScript.user_click_on_submit()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify login success",
  "keyword": "Then "
});
formatter.match({
  "location": "TestScript.verify_login_success()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "TestScript.close_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("src/test/resources/FeatureFolder/Exercise2.feature");
formatter.feature({
  "name": "Test Register Functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Register with valid data/inputs",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "users open chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "TestScript.users_open_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "navigate to newtours",
  "keyword": "And "
});
formatter.match({
  "location": "TestScript.navigate_to_newtours()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on register",
  "keyword": "When "
});
formatter.match({
  "location": "TestScript.click_on_register()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "users enter username",
  "keyword": "When "
});
formatter.match({
  "location": "TestScript.users_enter_username()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "users enter password",
  "keyword": "And "
});
formatter.match({
  "location": "TestScript.users_enter_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "users enter confirm password",
  "keyword": "And "
});
formatter.match({
  "location": "TestScript.users_enter_confirm_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "users click on submit button",
  "keyword": "And "
});
formatter.match({
  "location": "TestScript.users_click_on_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify register success",
  "keyword": "Then "
});
formatter.match({
  "location": "TestScript.verify_register_success()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "TestScript.close_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("src/test/resources/FeatureFolder/Exercise4.feature");
formatter.feature({
  "name": "Test Login with different set of inputs",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Test Login with valid data/inputs",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user open chrome browser",
  "keyword": "* "
});
formatter.match({
  "location": "TestScript.user_open_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "navigates to newtours",
  "keyword": "* "
});
formatter.match({
  "location": "TestScript.navigates_to_newtours()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter username as \"mercury\"",
  "keyword": "* "
});
formatter.match({
  "location": "TestScript.enter_username_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter password as \"mercury\"",
  "keyword": "* "
});
formatter.match({
  "location": "TestScript.enter_password_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on submit",
  "keyword": "* "
});
formatter.match({
  "location": "TestScript.user_clicks_on_submit()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify login is success",
  "keyword": "* "
});
formatter.match({
  "location": "TestScript.verify_login_is_success()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close the browser",
  "keyword": "* "
});
formatter.match({
  "location": "TestScript.close_the_browser()"
});
formatter.result({
  "status": "passed"
});
});