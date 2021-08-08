package com.makingdevs

import io.cucumber.*

this.metaClass.mixin(io.cucumber.groovy.Hooks)
this.metaClass.mixin(io.cucumber.groovy.EN)

Given(/I've started the app/) {  ->
  // Write code here that turns the phrase above into concrete actions
  // throw new io.cucumber.groovy.PendingException()
}

When(/we count the tasks/) {  ->
  // Write code here that turns the phrase above into concrete actions
  // throw new io.cucumber.groovy.PendingException()
}

Then(/the quantity should be {int}/) { Integer int1 ->
  // Write code here that turns the phrase above into concrete actions
  // throw new io.cucumber.groovy.PendingException()
}

Given(/I've entered a task called {string}/) { String string ->
  // Write code here that turns the phrase above into concrete actions
  // throw new io.cucumber.groovy.PendingException()
}


