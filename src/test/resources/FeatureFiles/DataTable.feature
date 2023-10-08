@Sanity
Feature: To get solution of heathissues through healthcare
Background:

Given User should launch the browser and load the browser

Scenario: To get correct solution by searching HealthTopics
When User should Search the correct drug in the seach box
#2D List
  |Herbal Medicine|Cough Medicine |
  |Blood Thinners |Cold Medicine  |
  
And User should click the GO button
Then User should navigate to the credential page



  Scenario: To get correct solution by searching HealthTopics
When User should searcH the correct drug in the seach box
#2D Map
  |Medicine       |Scans          |
  |Pain Killer    |Ascorbic       |
  |Fracture       |MRI Scans      |
  
And User should click the GO button
Then User should navigate to the credential page
  