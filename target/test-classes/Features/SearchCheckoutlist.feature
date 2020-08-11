Feature: Search and then place order for vegetables 



@SelTest 
Scenario Outline: Search for items and validate results 
	Given User is on Greencart landing page
	When User searched for <name> vegetables
	And Added items to cart 
	And user proceeded to checkout page 
	Then verify selected <name> item is been displayed in checkout page
	
	Examples: 
		| name       | 
		| Brinjal    |    
	
		
  