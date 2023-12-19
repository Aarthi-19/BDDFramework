Feature: Login Page Automation of Saucedemo Application
Scenario: Check login is successful with valid credentials
Given User is on login page
When User provides username and password
And User clicks Continue button
Then User navigates to Homepage
And User closes the browser