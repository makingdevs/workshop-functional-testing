package com.makingdevs

import cucumber.api.*
import static cucumber.api.groovy.EN.*

this.metaClass.mixin(cucumber.api.groovy.Hooks)
this.metaClass.mixin(cucumber.api.groovy.EN)

When(~/^I go to the Geb home page$/) { ->
  go "http://gebish.org"
}

Then(~/^the first heading has the value 'What is it\?'$/) { ->
  // Write code here that turns the phrase above into concrete actions
  throw new PendingException()
}

When(~/^I click the cross browser link$/) { ->
  // Write code here that turns the phrase above into concrete actions
  throw new PendingException()
}

Then(~/^the first heading has the value 'Cross Browser Automation'$/) { ->
  // Write code here that turns the phrase above into concrete actions
  throw new PendingException()
}
