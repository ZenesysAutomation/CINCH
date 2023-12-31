Feature: Add New Client Functionality

@Reg
Scenario: Verify the Add New Client Functionality
When User Enter the Valid Email
When User Enter the Valid Password
Then User click on the Login
Then User Select the Test Community
When User click on the Continue
Then User Click on the Clients Button
Then User Click on the Add New Client 
Then User Enter the First Name 
Then User Enter the Last Name
Then User Enter the Address Line1 
Then User Enter the Address Line2
Then User Enter the Resident ID
Then User Enter the City
When User Select the State 
When User Enter the ZIP code
Then User Enter the Primary Phone 
Then User Enter the Secondary Phone 
Then User Enter the Email
Then Click the Gender
Then User Select the BirthDate 
Then User Enter the Marital Status
Then Then User Enter the Spouse Name
Then User Enter the Referral Source
Then User Enter the Essential Information 
Then User Select the Client Type
Then User Select the Schedule Group
Then User Select the Status
Then User select the Track
And select the Service Type
Then Verify that Add new Contact Button
Then Verify the First Name
Then Verify the Last Name
Then Verify the Address line1
Then Verify the Address line2
Then Verify the City
Then verify the State Dropdown
Then Verify the Zip Code
Then Verify the Primary Phone Number 
Then Verify the Email 
Then select the Relationship
Then Save the New Contact Details
Then Save the New client Details
Then Validation Message Should be Shown Client was Created

 
@Negative
Scenario: Verify Error Message When Creating Add Client with Missing information(Negative Testing)
Given User Enter the Email and Password 
When User Login the Application
Then Choose the Test Community
And User click on Continue Button
And Click on the Client Button
And Click on the Add New Client
And Leave the First Name Fields Empty
And Enter the Last Name
And Leave the Address Line2 Fields Empty
And Select the Gender
And Select the BirthDate
And Select the Client Type
And Select the Schedule Group 
And Select Service Type
And Save the data
Then Error Message Displayed First Name is required
Then Error Message Displayed Address2 is required






