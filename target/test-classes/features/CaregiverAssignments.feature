Feature: Verify the Caregiver Assignments Functionalities

Background: Common Steps For All Test Cases to Login The Application
 
Given User Enter The Email 
When User Enter The Password 
Then User Click on the Login Button
Then Select the Test Community
And User Click on the Continue Button
Given Click on the Caregiver Assignments
Then Check if Color is Blue and Active Visit then Click on it


Scenario: Verify the Change Time for a Client Visit (Move only this occurrence)
Then Change the Time for visit 
And Select option Move only this occurrence
Then Save the Visit



Scenario:  Verify the Change Time for a Client Visit (Move day series)
Then Change the Time 
And Select the Option Move day series
Then save the visit


Scenario: Verify the Change Time for a Client Visit (Move week series)
Then change the time 
And Select the Option Move week series
Then Save The Visit


@smoke
Scenario: Change Client Visit to Another Track
#Given Click on the Visit
Then Change the Track from East1 to East2
And Select Move only this occurrence
Then Save the Visits

