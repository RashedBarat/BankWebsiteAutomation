Feature: OpenCustomer

  @test2
  Scenario: New customer open account
    Given user in open account page
    When user select customer name from dropdown
    And user select currency from dropdown
    Then click process
