# @Author: digvijay@cloudeagle.ai


Feature: Admin Integrations
 
#Scenario: Redirect to Integration Tab & Verify All Tab Loads  
#Given user is Login page of CE prior to Admin Integrations
#Then navigate to Admin Integrations and Verify All Tab Loads

Scenario: Integrations_Zoom_Connection view instructions
Given user is Login page of CE prior to Admin Integrations
Then user navigate to zoom app view and download instructions

Scenario: Redirect to Integrations_Zoom_Connection
Given user is Login page of CE prior to Admin Integrations
Then navigate to the Direct Integrations tab search for Zoom and connect providing credentials and verifying success

Scenario Outline: Redirect to Integrations uservoice connect
Given user is Login page of CE prior to Admin Integrations
Then uservoice connect<accesstoken><uservoicesubdomain> and verifying success
Examples:
|accesstoken   	 		 |uservoicesubdomain  	|
|"P30b1i2uBcKvkNCpR56UCA"|"ce-test-trial"|