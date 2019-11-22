
Feature: Title of your feature 
  Scenario: user moves to cart without adding any item
    Given Alex has registered  to TestMe app
    When Alex search a particular product like headphone
    And Try to proceed to payment without adding to cart
    Then TestMe app doesnot display the cart icon
   

 
