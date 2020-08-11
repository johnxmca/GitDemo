Feature: Search and then place order for vegetables 


  
   @SelTest
  Scenario: Search for items and validate results 
    Given User is on Greencart landing page 
    When User searched for "Cucumber" vegetable
    Then "Cucumber" results are displayed




  