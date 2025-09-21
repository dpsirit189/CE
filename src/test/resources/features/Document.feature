# @Author: digvijay@cloudeagle.ai


Feature: Document Module
 
#Scenario: Upload contract document save and verify line totals
#Given user is on cloudeagle Login page and want to upload document
#Then user navigate to document module
#Then user upload document save and verify line totals
#
#Scenario: document edit line
#Given user is on cloudeagle Login page and want to upload document
#Then user navigate to document module
#Then user edit line and verify line totals

Scenario: Upload invoice document publish,verify line  and edit 
Given user is on cloudeagle Login page and want to upload document
Then user navigate to document module
Then user upload invoice document save and verify line totals
Then publish document and search

Scenario: extract data and verify
Given user is on cloudeagle Login page and want to upload document
Then user navigate to document module
Then extract document data and verify