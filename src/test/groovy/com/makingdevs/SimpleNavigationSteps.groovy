package com.makingdevs

import io.cucumber.*

this.metaClass.mixin(io.cucumber.groovy.Hooks)
this.metaClass.mixin(io.cucumber.groovy.EN)

When(/I go to the Geb home page/) {  ->
  // Write code here that turns the phrase above into concrete actions
  throw new io.cucumber.groovy.PendingException()
}


Then(/the first heading has the value {string}/) { String string ->
  // Write code here that turns the phrase above into concrete actions
  throw new io.cucumber.groovy.PendingException()
}


When(/I click the cross browser link/) {  ->
  // Write code here that turns the phrase above into concrete actions
  throw new io.cucumber.groovy.PendingException()
}

