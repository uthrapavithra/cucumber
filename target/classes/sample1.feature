Feature: Login Test
Description: Registered user can login into the applicayion using valid username and password


Scenario Outline: Login with valid combination
Given user opens login page in newtours application
When user enters valid username as "<username>" and password as "<password>"
And Click submit button
Then verify login success
   
Examples:
|username|password|
|mercury|mercury|
|lalitha|password123|

Scenario: search products
When user search for products
|iphone|
|travel kit|
And verify
Then close
