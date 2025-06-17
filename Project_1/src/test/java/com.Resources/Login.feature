
Feature: Karan_17JUN2025_Login
  I want to login to Shopofiles

  @Login
  Scenario Outline: Login functionality with various credentials
    Given I want to go to OrangeHRM "https://shopofiles.applifiles.com/login"
    When The user enters username "<username>" and password "<password>"
    And Clicks on the Login button
    Then Assert them for <loginResult>

    Examples:
      | username            | password       | loginResult     |
      | 2k21it50@kiot.ac.in | Kiot1234       | valid login     |
      | invalidUser         | invalidPass    | invalid login   |
      |                     | invalidPass    | empty login     |
