Feature: Facebook application testing

  Scenario: Test facebook app login functionality
    Given user comesto loginpage

    Then user will enter email and pass
      | bugspottertest@gmil.com | 123456 |
    Then user will click on login button
