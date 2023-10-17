Feature: DataBase Cleanup

@dbTest
Scenario: Delete a Table
Given I have a Connection to the MySql Database
And I want to delete a table named "MY_TABLE"
When I Excecute the Delete table SQL Query
Then The Table "MY_TABLE" should be deleted Successfully