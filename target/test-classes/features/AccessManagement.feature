# @Author: digvijay@cloudeagle.ai


Feature: Access Management
 
Scenario Outline: Access Management- active user app provision  
Given user is Login page of CE prior to Access Mgmt active user
When navigate to Access Mgmt active user and search user
Then provision <user><app> and start provisioning process
Examples:
|user   	|app  	|
|"sanjeev"|"Zoom Webinars"|