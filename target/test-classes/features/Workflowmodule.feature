# @Author: digvijay@cloudeagle.ai


Feature: WorkFlow Module

#Scenario: ADD A NEW WORKFLOW  
#Given user is cloudeagle Login page 
#When user enter cloudeagle credentials
#Then user navigate to workflow module
#Then user fill workflow form and submit

#Scenario Outline: Workflow change due date and mark complete
#When user navigate to workflows
#Then change due date and mark complete

Scenario: Top cards to filter workflows & Manual filter Apply,Reset,Save,Share
When user navigate to workflows
Then Click on top cards to filter workflows
#When user is in workflows
#Then Workflow list should be filtered as per selected criteria
#Then reset criteria
#Then Workflow list should be filtered as per selected criteria
#Then save filter view
#Then share view and copy link