package com.makingdevs

import cucumber.api.*
import static cucumber.api.groovy.EN.*

this.metaClass.mixin(cucumber.api.groovy.Hooks)
this.metaClass.mixin(cucumber.api.groovy.EN)

When(~/^I go to the Geb home page$/) { ->
  go "http://gebish.org"
}

Then(~/^the first heading has the value "(.*?)"$/) { String header ->
  assert $("h1")*.text().contains(header)
}

When(~/^I click the cross browser link$/) { ->
  def link = $(".menu a.manuals")
  link.click()
  def link2 = $("#manuals-menu a.item", href:"manual/current/")
  link2.click()
}
