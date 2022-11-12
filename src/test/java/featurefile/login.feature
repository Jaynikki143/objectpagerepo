Feature: Testing the login functionality

  Scenario Outline: testing login page
    Given User is on the login "https://demo.nopcommerce.com/" page
    When Enter username "<Username>" and password "<Password>"
    Then Should login succesfully
    Examples:
    |Username|Password|
      | test1100@gmail.com |jaynikki143|

