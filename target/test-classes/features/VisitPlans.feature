Feature: Visit Plans

Background:
Given User enter the Email
When User enter the Password
Then User Click on the Login
Then User select the Test Community
Then User click on the Continue Button
Then User click on the Visit Plans
Then Click on the User first Name 
Then Click on the Add Visit Configuration


Scenario: Verify the Visit PlansFunctionalities

Then Select the Single Day
Then Select the Recurrence
Then Select the Start Time
Then Select a Duration 
#Then Select the Recurrence 
Then Select the Start Date 
Then click on the Save Button
Then Save the all Single Visit Details


Scenario: Visit plans Functionality

Given user select all Days
Then select start time
Then select Duration
Then select Weekly recurrence
Then select start Date
Then User Click on the save Button


Scenario: Add visits for a custom Date Range

Given user select all the days
Then User Select Start Time
Then User select a Duration
Then User Select the Weekly recurrence
Then User select start date 
Then user Click on the Use Custom End Date toggle 
And User enter the End Date
Then Save the visits details
Then Save the all Visits Plan Details

@smoke
Scenario: Change the visit duration for series and Delete a visit series

Given Select all days
When select Start Time
Then select visit Duration as 30 minute visit
Then select the Weekly recurrence
Then select start date 
Then Click on save button
Then Save the all Visits plans Details
Given User click on the Delete Icon 
Then Delete visit Configurations Pop Up is opened  and click on the Delete button
And Save the delete Visit Series

@smoke
Scenario: Delete a Single visit
Given Select A Single Day
Then select a single Recurrence
Then choose Start Time
Then Select Duration
#Then select a single Recurrence
And Enter the Start Date
And Save the single visit details
And Click on the delete Icon and Pop is Displayed Confirm that you want to delete this item
Then  Click on the Delete Button



Scenario: Verify The ADLs and IADLS Functionalities

Then Verify that if status is Shows Missing Assigned Tasks
When Click on the ADLs Tab
Then Click on the Bathing
Then Select the Bathing Assistance Level as a Supervision
Then Select the Tasks as a Assist With Shower
Then Select the Visits Timing
Then Enter the Caregiver Instructions
Then Click on the Update Button
Then Save the Bathing Details
When click on the ADLs 
When Click on the Continence And Toileting
Then Click on the Assistance Level
Then save the Continence And Toileting Details
When Click on the Again ADLs 
Then Click on the dressing And Grooming 
Then select the Assistance Level as a Supervision
Then Click on the Apply Lotion Tasks
Then choose the visits time
Then Enter the caregiver Instructions
Then Update the Apply Lotion
Then Save The Dressing And Grooming Details
When click on the ADLs Tab
Then Click on the Eating 
Then Select the Assistance Level as a No Assistance
Then save the Eating Details
When Click on the ADLs
Then Click on the Mobility
Then Select the Assistance Level as  a Limited Assistance
Then Select the Walk With Client
And Select the Visits Time
And Enter Caregiver Instructions
And Update the Walk with client Details
And Save the Mobility Details
When User Click on the IADLS Tab
And Click on the Household Tasks
And Select the Assistance Level as a Assistance
And Click on the Make Bed
And Select the Make bed Visits Time
Then Enter the CareGIVER Instructions
Then Update the Make bed Details
And Save the Household Tasks Details
Then User Again click on the IADLs
And Click on the Laundry
Then Select Laundry Assistance Level as a Assistance
Then Then Click on the Tasks 
Then User Select the Visits Time
And Enter Caregiver Instruction
And Update the Laundry Details
And Save the Laundry Details
Then Again Click on the IADLs
Then Click on the Meals
Then Select the Meals Assistance Level No Assistance
And Save the Meals Details
Then User Again click on the IADLS
Then User click on the Medication
And User select the Medication Assistance Level as Assistance
Then Select the tasks with Check Blood Pressure
And I Select the Visits Time
And Enter the CareGiver Instructions
And Update the Medication Details
And Save the Medication Details 
Then Click on the Add to Schedule
Then Click on the Finalize Visits
 













