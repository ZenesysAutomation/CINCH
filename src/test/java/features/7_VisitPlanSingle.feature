Feature: Visits Plans Single day Functionalities

Background: Common Steps for all the Test Cases to login the Application

Given User enter the Email
When User enter the Password
Then User Click on the Login
Then User select the Test Community
Then User click on the Continue Button
Then User click on the Visit Plans
Then Click on the User first Name 

@Reg6
Scenario: Verify the Visit Plans Functionalities For Single Day
Then Click on the Add Visit Configuration
Then Select the Single Day
Then Select the Recurrence
Then Select the Start Time
Then Select a Duration 
Then Select the Start Date 
Then click on the Save Button
Then Save the all Single Visit Details
Then Validation Message Should be Shown Visit Plan was saved1

@Abc
Scenario: Verify The ADLs and IADLS Functionalities
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
And Click on the IADL
And Click on the Other 
And Select No Assistance  
Then Click on the Add To schedule Button and Finalize Visits

@abc2
Scenario: Change A Visit Duration For Single Day 
And click on the single Visit table
And Change the visit duration as 45 Minute Visit
Then click on the update button
And Click on the Save button
Then Validation Message should be Shown Visit Plan was saved2


@abc3
Scenario: Change Task in a Client Visit (ADLS and IADLS)

Given User Click on the ADLs Tab 
Then User Click on the Bathing
Then Verify if Assist With Shower is Already Checked then Unchecked it
And Checked the Assist With Sponge Bath
And User Select the Visits Timing
And Update the Bathing Details
And Save the Bathing details
When User Click on the  ADLs To Enter the Dressing And Grooming details
Then User Click on the dressing And Grooming 
Then Verify if Apply Lotion Tasks is Already Checked then Unchecked it
And User Ticked on Assist with Oral Care
Then Select the Visit Time
Then Update the Assist with Oral Care details
Then save The Dressing And Grooming Details
And User Click on the ADLS To Enter the Mobility Details
Then User Click on the Mobility
Then Verify if Walk With Client Tasks is Already Checked then Unchecked it
And Select the Assist With Transfers
And User Choose the Visits Time 
And Update the Assist With Transfers Details
And User Click on the Save Button to save the Mobility Details
Then User Again click on the IADLS to Enter the Medication Details
Then click on the Medication
Then Verify if Check Blood Pressure Tasks is Already Select then Unselect it
And Select the Check Temperature
And  Users Select the Visits Time
And User Update the Medication Details
And User Save the Medication Details 
Then User Click on the Add to Schedule and Finalize Visits
Then Delete the single visit serise
And Save the Single Visit Series


@abc4
Scenario: Add visits for a Custom Date Range
Then Check the Add Visit Configuration Button
Given user select Single days
Then User Select the weekly recurrence
Then User Select Start Time
Then User select a Duration
Then User select start date 
Then user Click on the Use Custom End Date toggle 
And User enter the End Date
Then Save the visits details
Then Save the all Visits Plan Details
Then Message should be Shown Visit Plan was saved3


@abc5
Scenario: Change the End Date on a Custom Date Range
Then Click on the Single day Table 
And Change The End Date 
And Update the Visits
And Save The Visits
Then Message should be Shown Visit Plan was saved4


@abc6
Scenario: Delete a Single visit Series 
And Click on the delete Icon and Pop is Displayed Confirm that you want to delete this item
Then Click on the Delete Button
And Save the Single delete Visit Series
Then Message should be Shown Visit Plan was saved5




 













