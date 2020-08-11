Feature: Reset functionality on login page of Application

  @RegTest
  Scenario Outline: Verification of Reset button
    Given Open the Firefox and launch the application
    When Please enter the Username <username> and Password <password>
    Then Reset the credential

    Examples: 
      | username | password |
      | john     |      123 |
      | teena    |      123 |
      | angel    |      123 |
