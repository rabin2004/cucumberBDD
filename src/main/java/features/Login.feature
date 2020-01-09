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
Feature: FreeCRM login feature


  @tag1
  Scenario Outline: FreeCRM login test senario # Senario - without examples keyword / Senario Outline - with examples keyword
    Given user is already on login page
    When title of login page is FreeCRM
    
    # Then user enters "rabin2004@yahoo.com" and "SunXiang@20110611" => without examples keyword
    
    Then user enters "<username>" and "<password>"
    Then user clicks on login button
    And  user is on homepage
    
    Examples:
    | username | password |
    | rabin2004@yahoo.com | SunXiang@20110611 |
    | tomclancy@gmail.com | Test@123 |
    


