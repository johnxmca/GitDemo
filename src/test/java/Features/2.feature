Feature: Reset functionality on login page of Application



  @SmokTest
  Scenario: Verification of Reset button
    Given Open the Firefox and launch the application
    When Enter the Username "john" and Password "123"
    Then Reset the credential

  @RegTest
  Scenario: Verification of Reset button
    Given Open the Firefox and launch the application
    When User signup
      | john  | xavier | tojohnx@gmail.com | 682028 |
      | teena | john   | teena@gmail.com   | 682028 |
    Then Reset the credential

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
