Feature: To get solution of heathissues through healthcare
Background:

Given User should launch the browser and load the browser
@Smoke
Scenario: To get correct solution by searching HealthTopics
When User should click the Health Topics
And User should click blood,heart and Circulation
And User should click  Aortic Aneurysm
Then User should navigate to the given issue

@Sanity
Scenario:To get solution of heathissues through healthcare

When User should search incorrect problem in the seach box
And User should click the GO button
And User should print title
Then User should navigate to the credential page
@Smoke
Scenario Outline:To get solution of heathissues through the healthcare

When User should search the correct drug in the seach box "<Azythromycin>" 
And User should click the GO button
Then User should navigate to the credential page

Examples:
   |Azythromycin|
   |Vitamins|
  
  
   