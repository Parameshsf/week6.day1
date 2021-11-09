Feature: Verify Create Lead
#This feature is to execute create lead functionality
Scenario: Create lead in to leaftap application
Given Enter the username as 'DemoSalesManager'
And Enter the password as 'crmsfa'
When Click the login button
Then home page should be displayed
When click CRMSFA link to get in to Home page
And click Leads tab
And click Create Lead link  
