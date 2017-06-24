@Grapes([
@Grab("org.gebish:geb-core:0.13.1"),
//@Grab("org.seleniumhq.selenium:selenium-firefox-driver:2.53.1"),
@Grab("org.seleniumhq.selenium:selenium-chrome-driver:3.4.0"),
@Grab("org.seleniumhq.selenium:selenium-support:3.4.0")
])

import geb.Browser

System.setProperty("webdriver.chrome.driver","/Users/neodevelop/Desktop/workshop-functional-testing/build/webdriver/chromedriver/chromedriver")

Browser.drive {
  go "http://gebish.org"

  assert title == "Geb - Very Groovy Browser Automation"

  $("body > div.ui.inverted.vertical.masthead.center.aligned.segment > div.ui.large.inverted.secondary.horizontal.pointing.menu > div > a.manuals.item", text: "Manual").click()
  $("#manuals-menu > div > a:nth-child(1)").first().click()
  assert $("div#header h1").text() == "The Book Of Geb"
}
