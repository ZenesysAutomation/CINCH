Feature: Edit Community Note Functionality

Background: Common Step for All Test Cases
Given Enter the Email
Given Enter the Password
And click on the login Button
And Select TestCommunity Dropdown
And click on the Continue
And click on the Manage window
When Click on the Table

@Reg5
Scenario: Verify the Edit Community Note Functionality
When Edit the Note
When Edit the communities
When Edit the Start Date
When Edit the End Date
Then Click on the save Button

@BlankEditNote
Scenario: Verify that if any field is Empty then Validation Message Should be Shown.
Given When attempting to edit a community note with an empty note field
And Save the Community Note 
Then Error Message Is displyed The Note field is required