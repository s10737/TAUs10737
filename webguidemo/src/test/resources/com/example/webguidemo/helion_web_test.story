Scenario: User searches for a single step
 
Given user is on Home page
When user opens Sign up link
Then Sign up page is shown

Scenario: User signs up

Given user is on Sign up page
When user signs up
Then activation page is shown