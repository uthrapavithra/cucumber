$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/sample1.feature");
formatter.feature({
  "name": "Login Test",
  "description": "Description: Registered user can login into the applicayion using valid username and password",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Login with valid combination",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user opens login page in newtours application",
  "keyword": "Given "
});
formatter.step({
  "name": "user enters valid username as \"\u003cusername\u003e\" and password as \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "Click submit button",
  "keyword": "And "
});
formatter.step({
  "name": "verify login success",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "mercury",
        "mercury"
      ]
    },
    {
      "cells": [
        "lalitha",
        "password123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login with valid combination",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user opens login page in newtours application",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.user_opens_login_page_in_newtours_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters valid username as \"mercury\" and password as \"mercury\"",
  "keyword": "When "
});
formatter.match({
  "location": "Login.user_enters_valid_username_as_and_password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click submit button",
  "keyword": "And "
});
formatter.match({
  "location": "Login.click_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify login success",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.verify_login_success()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: expected [true] but found [false]\r\n\tat org.testng.Assert.fail(Assert.java:94)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:513)\r\n\tat org.testng.Assert.assertTrue(Assert.java:42)\r\n\tat org.testng.Assert.assertTrue(Assert.java:52)\r\n\tat StepDef.Login.verify_login_success(Login.java:109)\r\n\tat ✽.verify login success(src/main/resources/sample1.feature:9)\r\n",
  "status": "failed"
});
formatter.scenario({
  "name": "Login with valid combination",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user opens login page in newtours application",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.user_opens_login_page_in_newtours_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters valid username as \"lalitha\" and password as \"password123\"",
  "keyword": "When "
});
formatter.match({
  "location": "Login.user_enters_valid_username_as_and_password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click submit button",
  "keyword": "And "
});
formatter.match({
  "location": "Login.click_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify login success",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.verify_login_success()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "search products",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user search for products",
  "rows": [
    {
      "cells": [
        "iphone"
      ]
    },
    {
      "cells": [
        "travel kit"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "Login.user_search_for_product(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify",
  "keyword": "And "
});
formatter.match({
  "location": "Login.verify()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.close()"
});
formatter.result({
  "status": "passed"
});
});