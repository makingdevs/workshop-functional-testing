Feature: Geb web site navigation with prebuilt steps

  @gebish
  Scenario: Find what I'm looking for with prebuilt steps
    When I go to the Geb home page
    Then the first heading has the value "What is it?"
    When I click the cross browser link
    Then the first heading has the value "The Book Of Geb"
