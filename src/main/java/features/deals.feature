#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Deals feature


  @tag1
   Scenario: Create new Deal page
    Given user is already on login page
    When title of login page is FreeCRM
    Then user enters username and password
    | rabin2004@yahoo.com | SunXiang@20110611 |	
    # test data table => only for specific line above the table
    Then user clicks on login button
    And  user is on homepage
    Then user moves to new deal page
    Then user enters deal details
    |Test deal|Mat|1000|50000|	
    Then user clicks save
    Then close the browser
    


