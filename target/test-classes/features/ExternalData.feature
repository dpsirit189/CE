# @Author: digvijay@cloudeagle.ai

Feature: External Data

@smoke
Scenario Outline: External Data Vender Detected
Given user is Login page prior to confirming vendor
When user navigate to External Data Vender Detected and New Vendor
Then user confirm new vendor <vendor name>

Examples:
|vendor name  	|
|"Nudge Experience LLC" |


@smoke
Scenario Outline: External Data Application Detected
Given user is Login page prior to confirming Application
When user navigate to External Data Application Detected and New Application
Then user confirm new Application <App name>

Examples:
|App name  	  |
|"Connectors" |