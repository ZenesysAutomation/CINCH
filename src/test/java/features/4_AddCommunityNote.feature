Feature: Add Community Note Functionality

@Reg4
Scenario: Verify the Add Community Note Functionality
Given User enters Email 
Given User enters Password
And Click on the login
And Select the TestCommunity
And Click on the Continue
And Click on the Manage
When Click on the Add New Community Note
When Enter the Note
When Select Communities
When Choose a Start Date
When Choose an End Date
When Click on the Save Button
Then Community Note was Created Message Should be Shown


@MissingInfo
Scenario: Verify Error Message when creating a Community Note with Missing information
Given User Enter their Email and Password 
Then Click the Login button
And Select the Testcommunity
And Click the Continue button
And Click the Manage button
And Click on the Add New Community Note option
And Attempt to create a community note without entering the required information
And Click the Save button
Then Validation Message The Note field is required is Displayed

