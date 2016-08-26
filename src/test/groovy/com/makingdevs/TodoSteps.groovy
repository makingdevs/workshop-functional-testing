package com.makingdevs

import cucumber.api.*

this.metaClass.mixin(cucumber.api.groovy.Hooks)
this.metaClass.mixin(cucumber.api.groovy.EN)


Given(~/^I've started the app$/) { ->
  todoList = TodoList.instance
  assert todoList
}

When(~/^we count the tasks$/) { ->
  counter = todoList.todos.size()
}

Then(~/^the quantity should be (\d+)$/) { int quantity ->
  assert counter == quantity
}

Given(~/^I've entered a task called "([^"]*)"$/) { String description ->
  todo = new Todo(description:description)
  todoList.todos << todo
}
