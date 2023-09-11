Feature:  Login Functionality 

@Test
Scenario Outline: Verify The Valid Login Functionality
Given Verify that user enter the "<Email>" and "<Password>"
When Click on the Login Button
And Verify the Dropdown and select the Test Community
When Verify the Continue Button
Then Home page should be shown
Given User Click on the Account User Name
And Click on the Logout Button
Then Sign In Page should be shown 

Examples:
|Email|Password|
|anoop.kumar@zenesys.com |Testing@123|
#|ankita.chaudhary@zenesys.com |Testing@123|



@TestInvalid
Scenario Outline: Verify the Invalid Login Functionality
Given User Enter the "<Email>" and "<Password>"
When Click on the login button
Then Error message is Displayed "<Message>"

Examples:
|Email|Password|Message|
|xyz@yopmail.com |xyz@12345|Invalid Login - Invalid username and or password.|
|abc@yopmail.com |12345|Invalid Login - Invalid username and or password.|


@TestBlank
Scenario Outline: User tries to login with blank Credentials
Given The User submits blank "<Email>" and "<Password>"
When The user click on the Login button
Then The User should see an Error Message "<Message>"

Examples:
|Email|Password|Message|
|  | Test125 |The Logon field is required.|









