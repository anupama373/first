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
Feature: add to cart

  @tag1
  Scenario: invalid add to cart
    Given alex is on demowebshop home page
    When Alex searches for a product
    And Alex clicks on search
    And clicks on shopping cart
    Then he sees Your Shopping Cart is empty!
    
 @tag2
 Scenario: valid add to cart
 Given alex  now is on demowebshop home page
 When Alex now searches for a product
 And Alex againclicks on search
 And clicks again on add to cart
 And clicks againon shopping cart
 Then Alex finds the product in the cart  
    
