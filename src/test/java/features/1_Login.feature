Feature: login Functionality

@Test
Scenario Outline: Verify The login & Logout Functionality

When Verify that user enter the "<Email>" and "<Password>"
And Click on the Login Button
And Verify the Dropdown and select the Test Community
And Verify the Continue Button
Then Home page should be shown
Given User Click on the Account User Name
And Click on the Logout Button
Then Sign In Page should be shown 

Examples:
|Email|Password|
|anoop.kumar@zenesys.com |Testing@123|
#|ankita.chaudhary@zenesys.com |Testing@123|
#|xyz@yopmail.com |xyz@12345|












