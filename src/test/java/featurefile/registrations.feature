Feature:New Account

  Scenario:Creating a new account with valid detail
    Given User is on the registrations page
    When Enter all the valid detail in all the field
    Then Account should created Sucessfully

    Scenario: Creating a new account is already exist
      Given User is on the registrations page
      When User enter all details which is already registered
      Then Account should not be created and should take me to login page.


