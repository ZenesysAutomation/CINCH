Feature: login Functionality

@smoke
Scenario Outline: Verify The login Functionality

#Given Launch the URL
When Verify that user enter the "<Email>" and "<Password>"
And Click on the Login Button
And Verify the Dropdown and select the Test Community
And Verify the Continue Button

Examples:
|Email|Password|
|ankita.chaudhary@zenesys.com |Testing@123|
|test@yopmail.com|test@123|




