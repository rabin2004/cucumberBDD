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
Feature: Contact feature


  @tag1
  Scenario Outline: Create new contact
    Given user is already in homepage
    And user clicks on contact tab
    
    #When user enters firstname, last name, company name & email address => without examples keyword
    
    When user enters contact data "<firstName>", "<lastName>", "<companyName>" and  "<emailAddress>"
    And user clicks on save button
    Then new contact should be created
    
    Examples:
    | firstName | lastName | companyName | emailAddress |
    | Tom | Clancy | Transfotech | tomclancy@gmail.com |
 

 
