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
    Given we see an input ready to enter a task
    When I write a task called "Prepare myself for the workshop"
    And I press enter
    Then I should see a counter with 1 tasks

  @todos
  Scenario Outline: Adding more tasks
    Given we see an input ready to enter a task
    When I write a task called <task_description>
    And I press enter
    Then I should see a counter with <task_counter> tasks

    Examples:
      | task_description            | task_counter  |
      | "Check the doc of Cucumber" | 2             |
      | "Read about BDD"            | 3             |
      | "Mention Fitnesse"          | 4             |

