Feature: Search Engine

  Scenario: Searches and purchase the product successfully
    Given user logins with valid credentials
    When user enters the product to be searched and selects it
    And user clicks on find details and  adds the product to cart  
    And user goes to cart and clicks on checkout
    And user clicks on  proceeds to pay
    And user selects Andhra Bank and clicks on continue
    And user login using his bank credentials  
    And user enters his transaction password 
    Then user should b directed to order details  page

