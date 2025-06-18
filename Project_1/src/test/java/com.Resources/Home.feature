
Feature: Karan_18JUN2025_Home
  I want to use this template for my feature file

  @AboutUs
  Scenario Outline: Login to the site and check the Home Page works 
    Given I want to go to OrangeHRM "https://shopofiles.applifiles.com/login"
    When The user enters username "<username>" and password "<password>" and Click Login
    When The user should land on the Home Page
  	And The user click on the AboutUs link
  	Then Check the user is on AboutUs Page
  	
  Examples:
      | username            | password       | 
      | 2k21it50@kiot.ac.in | Kiot1234       | 
    
@Men's_Shortcut
  Scenario Outline: From the Home Page go to Mens Section with shortcut
    Given I want to go to OrangeHRM "https://shopofiles.applifiles.com/login"
    When The user enters username "<username>" and password "<password>" and Click Login
    When The user should land on the Home Page
  	And The user click on the Mens section shourtcut in the Home Page
  	Then Check the user is on Mens Section Page
 
 Examples:
      | username            | password       | 
      | 2k21it50@kiot.ac.in | Kiot1234       | 