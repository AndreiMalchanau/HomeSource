#Author: amalchanau@homesourcesystems.com

Feature: Create Order
 

  @smoke
  Scenario: Create new order
    Given I open Burt's and login I click on menu button
    When I navigate to Point of Sale and click on Orders
    Then I Select Location
    Then I click on New Order button and and hit Apply
    And I choose Bill To
    Then I click Add Items and provide Brand
    And I click Skip button and hit Done
    Then I click Save Order
    
    
    
    
    
  


