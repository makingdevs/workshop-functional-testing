package com.makingdevs

import io.cucumber.*

this.metaClass.mixin(io.cucumber.groovy.Hooks)
this.metaClass.mixin(io.cucumber.groovy.EN)

Given(/we open a browser and we navigate to {string}/) { String string ->
  // Write code here that turns the phrase above into concrete actions
  // throw new io.cucumber.groovy.PendingException()
}


Then(/we see an input ready to enter a task/) {  ->
  // Write code here that turns the phrase above into concrete actions
  // throw new io.cucumber.groovy.PendingException()
}


Then(/the main title {string}/) { String string ->
  // Write code here that turns the phrase above into concrete actions
  // throw new io.cucumber.groovy.PendingException()
}



When(/I write a task called {string}/) { String string ->
  // Write code here that turns the phrase above into concrete actions
  // throw new io.cucumber.groovy.PendingException()
}


When(/I press enter/) {  ->
  // Write code here that turns the phrase above into concrete actions
  // throw new io.cucumber.groovy.PendingException()
}


Then(/I should see a counter with {int} tasks/) { Integer int1 ->
  // Write code here that turns the phrase above into concrete actions
  // throw new io.cucumber.groovy.PendingException()
}

