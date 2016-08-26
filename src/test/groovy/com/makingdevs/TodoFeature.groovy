package com.makingdevs

import org.junit.runner.RunWith

import cucumber.api.CucumberOptions
import cucumber.api.junit.Cucumber

@RunWith(Cucumber)
@CucumberOptions(features = [ "classpath:features/todo.feature" ], strict = true, plugin = [ "html:build/test-report" ])
class TodoFeature {

}

