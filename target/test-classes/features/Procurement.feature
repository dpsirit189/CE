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
|"Hardware-Table"|
#|"Software"			|