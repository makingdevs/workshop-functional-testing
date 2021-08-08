package com.makingdevs

import org.junit.runner.RunWith
import org.junit.jupiter.api.Disabled;

import io.cucumber.junit.CucumberOptions
import io.cucumber.junit.Cucumber

@RunWith(Cucumber)
@CucumberOptions(
  features = ["src/cucumberTest/resources/features/simple_navigation.feature" ],
  strict = true,
  plugin = [ "html:build/test-report" ])
@Disabled
class SimpleNavigationFeature {

}

