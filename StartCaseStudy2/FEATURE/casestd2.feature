Feature: Login to app
 
  Scenario Outline: Successsful Login with Valid Credentials
    Given User opens the application
    When user click on signin link
    And user enters "<username>" and "<password>"
    Then message displayed login successfully

    Examples: 
      | username    | password       |
      | Admin       | password456    |
      | lalitha     | password123    |
