Feature: Login

  @smoke
  Scenario Outline: Check login with valid credentials
    Given user in login page
    When user enter '<password>'and '<username>'
    And click button
    Then user will navigate to dashboard button

    Examples:
      | password | username |
      | rashed   | rashed   |