Feature: validate iowa login functionality

@Login
Scenario: Validate user successfull login
Given Enter the Url to navigate webpage
When User enter the valid Email
And User enter the valid password
And user enter the valid captcha
And User click the Login button
Then validate user enter into the Home page of Iowa
