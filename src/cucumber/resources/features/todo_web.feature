Feature: Create a list of ToDo's
  As a complex user
  I want to create tasks
  so that I can have a list of ToDo's

  @todos
  Scenario: Welcome to my list
    Given we open a browser and we navigate to "examples/backbone"
    Then we see an input ready to enter a task
    And the main title "todos"

  @todos
  Scenario: Adding a task
    Given we open a browser and we navigate to "examples/backbone"
    When we see an input ready to enter a task
    And I write a task called "Prepare myself for the workshop"
    And I press enter
    Then I should see a counter with 1 tasks

