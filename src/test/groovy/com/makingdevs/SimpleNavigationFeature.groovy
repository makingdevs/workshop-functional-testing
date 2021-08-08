package com.makingdevs

import org.junit.runner.RunWith

import io.cucumber.junit.CucumberOptions
import io.cucumber.junit.Cucumber

@RunWith(Cucumber)
@CucumberOptions(
  features = [ "classpath:cucumber/resources/features/simple_web.feature" ],
  strict = true,
  plugin = [ "html:build/test-report" ])
class SimpleNavigationFeature {

}

