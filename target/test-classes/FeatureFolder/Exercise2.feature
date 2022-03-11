Feature: Test Register Functionality

Scenario: Register with valid data/inputs
Given users open chrome browser
And navigate to newtours
When Click on register
When users enter username
And users enter password
And users enter confirm password
And users click on submit button
Then verify register success
And close the browser