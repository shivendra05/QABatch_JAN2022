Feature: User Login

	Scenario Outline: Login With invalid user1
	 Given enter url
	 And Enter <UserName> and <Password>
	 Then click on submit button
	 Then print title
	 And close browser
	 
	Examples:
	 	| UserName | Password |
	 	| shivendra | shivendra |
	 	| Pandey | Pandey |