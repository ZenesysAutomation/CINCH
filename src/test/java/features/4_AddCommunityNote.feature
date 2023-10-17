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
When Choose a End Date
When Click on the Save Button
Then Community Note was Created Message Should be Shown 