Feature: Verify the Caregiver Assignments Functionalities

Background: Common Steps For All Test Cases to Login The Application
 
Given User Enter The Email 
When User Enter The Password 
Then User Click on the Login Button
Then Select the Test Community
And User Click on the Continue Button
Given Click on the Caregiver Assignments


Scenario: Verify the Change Time for a Client Visit (Move only this occurrence)
Then Check if Color is Blue and Active Visit then Click on it
Then Change the Time for visit 
And Select option Move only this occurrence
Then Save the Visit



Scenario: Verify the Change Time for a Client Visit (Move day series)
When Check if Color is Blue and Active Visit then Click on it2
Then Change the Time 
And Select the Option Move day series
Then save the visit



Scenario: Verify the Change Time for a Client Visit (Move week series)
When Check if Color is Blue and Active Visit then Click on it3
Then change the time 
And Select the Option Move week series
Then Save The Visit


Scenario: Change Client Visit to Another Track
Given Click on the Visit
Then Change the Track from East1 to East2
And Select Move only this occurrence
Then Save the Visits


Scenario: Delete one visit in a Series
Given User Click on the Visit
Then User Click on the Delete Button
Then Pop Up will be visible Are You Sure want to Delete this Item and click on Delete Button










