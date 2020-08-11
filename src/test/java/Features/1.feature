Feature: Reset functionality on login page of Application

 Background:
   Given Validate browser
   When Browser Trigerred
   Then Browser executed
  
  
   @RegTest
  Scenario: Verification of Reset button
    Given Open the Firefox and launch the application
    When Enter the Username "john" and Password "123"
    Then Reset the credential

  @SmokTest
  Scenario: Verification of Reset button
    Given Open the Firefox and launch the application
    When Enter the Username "teena" and Password "123"
    Then Reset the credential
  