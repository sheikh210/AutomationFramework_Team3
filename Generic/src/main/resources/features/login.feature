Feature: Login

  In order to perform a successful login
  As a user
  I want to enter correct credentials

  Scenario Outline: Verify successful login to facebook
    Given user navigates to http://facebook.com
    When user validates homepage title
    Then user enters "<username>" username
    And user enters "<password>" password
    Then user "<validation>" successfully logged in

#FOR SIMILAR SCENARIOS, INSTEAD OF REPEATEDLY TYPING OUT SCENARIOS, WE CAN USE EXAMPLES: (See below)
#  SCENARIO: --> SCENARIO OUTLINE:
#Scenario: Verify unsuccessful login to facebook
#    Given user navigates to http://facebook.com
#    When user validates homepage title
#    Then user enters invalid username
#    And user enters invalid password
#    Then user shouldnotbe successfully logged in

    Examples:
    |username | password | validation |
    |valid    | valid    | shouldbe   |
    |invalid  | invalid  | shouldnotbe|