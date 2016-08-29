@Grapes([
@Grab("org.gebish:geb-core:0.13.1"),
//@Grab("org.seleniumhq.selenium:selenium-firefox-driver:2.53.1"),
@Grab("org.seleniumhq.selenium:selenium-chrome-driver:2.53.1"),
@Grab("org.seleniumhq.selenium:selenium-support:2.53.1")
])

import geb.Browser

System.setProperty("webdriver.chrome.driver","/Users/neodevelop/Downloads/chromedriver")

Browser.drive {
  go "http://gebish.org"

  assert title == "Geb - Very Groovy Browser Automation"

  $("#sidebar .sidemenu a", text: "jQuery-like API").click()

  assert $("#main h1")*.text() == ["Navigating Content", "Form Control Shortcuts"]
  assert $("#sidebar .sidemenu a", text: "jQuery-like API").parent().hasClass("selected")
}
