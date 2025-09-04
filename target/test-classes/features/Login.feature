# @Author: digvijay@cloudeagle.ai


Feature: Login Module
 
Scenario: Valid Login  
Given user is Login page of Cloudeagle
When user enter right credentials
Then Dashboard page should be displayed

Scenario: Invalid Login  
Given user is Login page of Cloudeagle
When user enter wrong credentials
Then Dashboard page should not be displayed