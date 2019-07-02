Feature: Test Login
Description: Registered user can login into the applicayion using given username and password

Background: display welcome
Given Application displays welcome

@first @sec
Scenario: Login with valid combinations
Given open newtours application
When user enters username as "mercury" and password as "mercury"
And Click login button
Then verify pass

@first  
Scenario: Login with invalid combinations
Given open newtours application
When user enters username as "uthra" and password as "uthra"
And Click login button
Then verify failure


@third  
Scenario: Login with invalid combinations
Given open newtours application
When user enters username as "asdf" and password as "asdf"
And Click login button
Then verify failure

