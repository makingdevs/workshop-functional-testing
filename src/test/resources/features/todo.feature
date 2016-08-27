Feature: Create a list of ToDo's
  As a complex user
  I want create tasks
  so that I can have a list of ToDo's

  Scenario: An empty list
    Given I've started the app
    When we count the tasks
    Then the quantity should be 0

  Scenario: Adding a task
    Given I've entered a task called "Prepare myself for the workshop"
    When we count the tasks
    Then the quantity should be 1

  Scenario Outline: Adding more tasks
    Given I've entered a task called <task_description>
    When we count the tasks
    Then the quantity should be <task_counter>

    Examples:
      | task_description            | task_counter  |
      | "Check the doc of Cucumber" | 2             |
      | "Read about BDD"            | 3             |
      | "Mention Fitnesse"          | 4             |

