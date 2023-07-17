Feature: Verify the Visits Plans Functionalities

Background: Common Steps for all the Test Cases to login the Application

Given User enter the Email
When User enter the Password
Then User Click on the Login
Then User select the Test Community
Then User click on the Continue Button
Then User click on the Visit Plans
Then Click on the User first Name 


Scenario: Verify the Visit Plans Functionalities For Single Day

Then Click on the Add Visit Configuration
Then Select the Single Day
Then Select the Recurrence
Then Select the Start Time
Then Select a Duration 
#Then Select the Recurrence 
Then Select the Start Date 
Then click on the Save Button
Then Save the all Single Visit Details


Scenario: Verify the Visit Plans Functionality For All days

Then User Go to the Add Visit Configuration
Given user select all Days
Then select start time
Then select Duration
Then select Weekly recurrence
Then select start Date
Then User Click on the save Button


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
Then Click on the Add to Schedule and Finalize Visits
And Click on the Add to Schedule and Finalize Visits again



Scenario: Change Task in a Client Visit (ADLS and IADLS)
Given User Click on the ADLs Tab 
Then User Click on the Bathing
Then User Select the Bathing Assistance Level as a Supervision
Then Verify if Assist With Shower is Already Checked then Unchecked it
And Checked the Assist With Sponge Bath 
And User Select the Visits Timing
Then User Enter the Caregiver Instructions
And Update the Bathing Details
And Save the Bathing details
Then User Again click on the ADLs 
When User Click on the Continence And Toileting
And  Click on the Assistance Level No Assistance
Then User Save the Continence And Toileting Details
When User Click on the  ADLs To Enter the Dressing And Grooming details
Then User Click on the dressing And Grooming 
Then User select the Assistance Level as a Supervision
Then  Verify if Apply Lotion Tasks is Already Checked then Unchecked it
And User Ticked on Assist with Oral Care
Then Select the Visit Time
Then user Enter the caregiver Instructions
Then Update the Assist with Oral Care details
Then save The Dressing And Grooming Details
Then User Click on the ADLS To Enter the Eating Details
Then User Click on the Eating 
Then User Select the Assistance Level as a No Assistance
Then User Click on the save Button to save the details
And User Click on the ADLS To Enter the Mobility Details
Then User Click on the Mobility
Then User Select the Assistance Level As Limited Assistance
Then Verify if Walk With Client Tasks is Already Checked then Unchecked it
And Select the Assist With Transfers
And User Choose the Visits Time 
And User Enter Caregiver Instructions for Mobility
And Update the Assist With Transfers Details
And User Click on the Save Button to save the Mobility Details
When User Click on the IADLS to Enter the Household Details
And User Click on the Household Tasks
And User Select the Assistance Level as a Assistance
Then Verify if Make Bed Tasks is Already Checked then Unchecked it
And User Ticked the Change Lines Tasks
Then User Select the Change Lines Visits Time
And User enter the caregiver instructions for Household Tasks
And Update the Change Lines details
And User Save the Household Tasks Details
Then User Again click on the IADLs to Enter the Laundry Details
And User Click on the Laundry
Then User Select the Laundry Assistance Level As Assistance
Then User Click on the Tasks Wash Dry Fold And Return Clothes
And  User Select the Visit Time
And User Enter Caregiver Instruction For Laundry
And User Update the Laundry Details
And User Save the Laundry Details
Then User Click on the IADLs to Enter the Meals Details
Then User Click on the Meals
Then User Select the Meals Assistance Level No Assistance
And User Save the Meals Details
Then User Again click on the IADLS to Enter the Medication Details
Then click on the Medication
And Select the Medication Assistance Level as Assistance
Then Verify if Check Blood Pressure Tasks is Already Select then Unselect it
And Select the Check Temperature
And  Users Select the Visits Time
And User Enter Caregiver Instructions For Medication
And User Update the Medication Details
And User Save the Medication Details 
Then User Click on the Add to Schedule and Finalize Visits




@smoke
Scenario: Add visits for a Custom Date Range
Then  Check the Add Visit Configuration Button
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
Scenario: Change the End Date on a Custom Date Range
Then Click on the Everyday Table 
And Change The End Date 
And Update the Visits
And Save The Visits
 


Scenario: Change A visit Duration For Everyday
Then User click on the Add Visit Configuration
When User select the all days
Then user select the start time
Then user select the duration 65 Minute Visit
And user select the weekly recurrence
And user select the start date
And save the Everday visit plans Details
And Save the All visit plans Details
Then Click on the Days Table
And Change The Visit Duration as 30 Minute Visit 
And Update the Edit Visit Duration
And Save the Details


Scenario: Change A Visit Duration For Single Day 
Given Check the Add visit configurtion button
Then select a single day
And select a single recurrence
And select a start time
And select a duration 30 minute visit
#And select a single recurrence
And select a start date
Then click on save button
Then save the single visits details
And click on the single day table
And Change the visit duration as 45 Minute Visit
Then click on the update button
And Click on the Save button


Scenario: Change the visit Duration for series and Delete the All Days visit Series
Then click on the add visit configuration button
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


Scenario: Delete a Single visit Series 
Then Check Add Visit Configuration
Given Select A Single Day
Then select a single Recurrence
Then choose Start Time
Then Select Duration
#Then select a single Recurrence
And Enter the Start Date
And Save the single visit details
And Click on the delete Icon and Pop is Displayed Confirm that you want to delete this item
Then Click on the Delete Button




 













