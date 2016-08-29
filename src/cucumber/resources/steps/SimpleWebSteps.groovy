package com.makingdevs

import cucumber.api.*
import static cucumber.api.groovy.EN.*

this.metaClass.mixin(cucumber.api.groovy.Hooks)
this.metaClass.mixin(cucumber.api.groovy.EN)

Given(~/^we open a browser and we navigate to "(.*?)"$/) { String arg1 ->
  // Write code here that turns the phrase above into concrete actions
  throw new PendingException()
}

Then(~/^we see an input ready to enter a task$/) { ->
  // Write code here that turns the phrase above into concrete actions
  throw new PendingException()
}

Then(~/^the main title "(.*?)"$/) { String arg1 ->
  // Write code here that turns the phrase above into concrete actions
  throw new PendingException()
}

When(~/^I press enter$/) { ->
  // Write code here that turns the phrase above into concrete actions
  throw new PendingException()
}

Then(~/^I should see a counter with (\d+) tasks$/) { int arg1 ->
  // Write code here that turns the phrase above into concrete actions
  throw new PendingException()
}
