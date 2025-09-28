# @Author: digvijay@cloudeagle.ai

Feature: Procurement 

@smoke
Scenario Outline: Create Procurement
Given user is Login page prior to creating procurement
When user enter cloudeagle credentials prior to creating procurement
Then user navigate to procurement module
Then raise a new request <request for>

Examples:
|request for  	|
|"Hardware"			|
#|"Hardware-Table"|
#|"Software"			|

Scenario: Procurement Manual filter Apply,Reset,Save,Share
Given user is Login page prior to creating procurement
When user enter cloudeagle credentials prior to creating procurement
Then user navigate to procurement module
Then procurement reset criteria
Then procurement apply filter and save
Then procurement share view and copy link

Scenario: Procurement auto trigger move to next
Given user is Login page prior to creating procurement
When user enter cloudeagle credentials prior to creating procurement
Then user navigate to procurement module
Then user mark Approve and auto trigger move to next