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
Feature: demowebshop options

Background: Given Karthik launched Chrome browser
And launched Demowebshop url

  @login
  Scenario: Login process of demowebshop
    
    Then clicked on login
     And provided credentials "<email>" and "<password>"
    Then he should see home page
    

  @register
  Scenario Outline: registration process of demowebshop
    And user again clicks on register link
    When user now selects a "<gender>"
    When user  now enters "<firstname>" and "<lastname>" and "<email>" and "<password>"
    And clicks now on register
    Then user should now access user page

    Examples: 
      |gender| firstname    | lastname  | email              | password  |
      |female|shamaaa|khaaaaan|shammmmm67@gmail.com|shamkil7698|
