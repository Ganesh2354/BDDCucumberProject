Feature: Facebook login

  Scenario Outline: Testing login of facebook with multiple data
    Given user is on login page
    And user enter "<email>" and "<pass>"
    Then user clicklogin button

    Examples: 
      | email       | pass  |
      | bug@123     | 12345 |
      | test@456    | 67891 |
      | bugtest@123 | 11123 |
