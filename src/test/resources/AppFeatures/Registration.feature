Feature: User Registration 

Scenario: user registration with different data 
	Given User is on registration page 
	When User enters following user details 
		|Name1|automation|Name@gmail.com|99999|Bangalore|
		|Name2|automation|name@gmail.com|11111|Chennai|
		|abcdef|ghijkl|abc@gmail.com|22222|Bangalore|
	Then User registratin should be successful 
	
	
Scenario: user registration with different data with columns 
	Given User is on registration page 
	When User enters following user details with columns
		|firstname|lastname|email|phone|city|
		|Name1|automation|Name@gmail.com|99999|Bangalore|
		|Name2|automation|name@gmail.com|11111|Chennai|
		|abcdef|ghijkl|abc@gmail.com|22222|Bangalore|
	Then User registratin should be successful