Feature: Add a task in ToDo List
  In order to add a task in a list
  Should be able to store and count the tasks

  Scenario: An empty list
    Given I've started the app
    When we count the tasks
    Then the quantity should be 0

  Scenario: Adding a task
    Given I've entered a task called "Prepare myself for the workshop"
    When we count the tasks
    Then the quantity should be 1

