Feature: DeleteCustomer

  @test3
  Scenario: Delete a customer
    Given user go to page
    When user search names
    And user click delete button
    Then click home
