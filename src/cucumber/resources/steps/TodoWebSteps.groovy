package com.makingdevs

import cucumber.api.*
import org.openqa.selenium.Keys
import static cucumber.api.groovy.EN.*

this.metaClass.mixin(cucumber.api.groovy.Hooks)
this.metaClass.mixin(cucumber.api.groovy.EN)

Given(~/^we open a browser and we navigate to "(.*?)"$/) { String url ->
  go url
}

Then(~/^we see an input ready to enter a task$/) { ->
  taskInput = $("input", 0, class: "new-todo")
  assert taskInput
}

Then(~/^the main title "(.*?)"$/) { String title ->
  header = $("h1").first()
  assert title == header.text()
  Thread.sleep 1000
}

When(~/^I write a task called "(.*?)"$/) { String description ->
  taskInput << description
  Thread.sleep 1000
}

When(~/^I press enter$/) { ->
  taskInput << Keys.chord(Keys.ENTER)
  Thread.sleep 1000
}

Then(~/^I should see a counter with (\d+) tasks$/) { int counter ->
  assert $("span.todo-count > strong").text() == "$counter"
  assert $("ul.todo-list li").size() == counter
  Thread.sleep 1000
}

