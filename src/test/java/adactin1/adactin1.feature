Feature: User want to book a Hotel 

Scenario: As an Existing user i want to login 
	
	Given User launch the Application 
	When User enters userName  
	And User enters password  
	Then User enters the submit button 
	
Scenario: User searches the Hotel 
	
	Given User selecting the location "New York" 
	When Select your hotel type 
	And Select your Roomtype 
	And Select no of rooms 
	And Select Check in date 
	And Select check out date 
	And Select person per room 
	And Select child per room 
	Then User click search button 
	
Scenario: User confirms Hotel 
	
	Given User confirm the Hotel name 
	When User sumbits the hotel name confirmation 
	
Scenario: User Booking page 
	
	Given Enter the name 
	When Enter last name 
	And Enters Billing Address 
	And Enters card Number 
	And Enters card type 
	And Enters expiry Month 
	And Enters expiry year 
	And Enters CVV No 
	Then Submits for booking 
	

Scenario: User exit the application 
	
	Given User scrolldown the page for checking 
	When User scrollup the page for checking 
	And User Logout 
	
	
	
