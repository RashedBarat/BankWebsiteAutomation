Feature: AddCustomer

  @test1
  Scenario Outline: Add new customer into the system
    Given user in add customer page
    When user enter '<firstname>' and '<lastname>' and '<postcode>'
    And click addcustomer button
    Then click ok

    Examples:
      | firstname | lastname | postcode |
      | rashed    | barat    | 1212     |

