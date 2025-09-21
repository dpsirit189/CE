# @Author: digvijay@cloudeagle.ai

Feature: External Data

#@smoke
#Scenario Outline: External Data Vender Detected confirm
#Given user is Login page prior to confirming vendor
#When user navigate to External Data Vender Detected and New Vendor
#Then user confirm new vendor <vendor name>

#Examples:
#|vendor name  	|
#|"Nudge Experience LLC" |

#Scenario: External Data Vender Detected Confirm under All vendor and Revert
#Given user is Login page prior to confirming vendor
#When user navigate to External Data Vender Detected and New Vendor
#Then user confirm all vendors and revert

#Scenario: External Data Vender Detected Reject under All vendor and Revert
#Given user is Login page prior to confirming vendor
#When user navigate to External Data Vender Detected and New Vendor
#Then user reject all vendors and revert

Scenario: External Data Vender Detected Confirm multiple vendor and Revert
Given user is Login page prior to confirming vendor
When user navigate to External Data Vender Detected and New Vendor
Then user confirm multiple vendors and revert

#Scenario Outline: External Data Vender Detected Reject and Revert
#Given user is Login page prior to confirming vendor
#When user navigate to External Data Vender Detected and New Vendor
#Then user reject new vendor <vendor name>
#Then user revert the rejected vendor <vendor name>
#Examples:
#|vendor name  	|
#|"Nudge Experience LLC" |

Scenario: External Data Vender Detected Reject multiple vendor and Revert
Given user is Login page prior to confirming vendor
When user navigate to External Data Vender Detected and New Vendor
Then user reject multiple vendors and revert


#@smoke
#Scenario Outline: External Data Application Detected
#Given user is Login page prior to confirming Application
#When user navigate to External Data Application Detected and New Application
#Then user confirm new Application <App name>

#Examples:
#|App name  	  |
#|"Connectors" |

Scenario: External Data Vender Detected Confirm multiple App and Revert
Given user is Login page prior to confirming Application
When user navigate to External Data Application Detected and New Application
Then user confirm multiple apps and revert

Scenario: External Data Vender Detected Reject multiple App and Revert
Given user is Login page prior to confirming Application
When user navigate to External Data Application Detected and New Application
Then user Reject multiple apps and revert

Scenario: External Data Vender Detected Confirm under All apps and Revert
Given user is Login page prior to confirming vendor
When user navigate to External Data Application Detected and New Application
Then user confirm all apps and revert