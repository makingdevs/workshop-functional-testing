// See http://www.gebish.org/manual/current/#configuration

import org.openqa.selenium.htmlunit.HtmlUnitDriver
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.phantomjs.PhantomJSDriver
import org.openqa.selenium.remote.RemoteWebDriver
import org.openqa.selenium.remote.DesiredCapabilities
import geb.driver.SauceLabsDriverFactory

driver = { new HtmlUnitDriver() }

environments {

  // run as “gradle -Dgeb.env=chrome cucumber”
  firefox {
    driver = { new FirefoxDriver() }
  }

  // run as “gradle -Dgeb.env=chrome cucumber”
  chrome {
    driver = { new ChromeDriver() }
  }

  // run as “gradle -Dgeb.env=phantomjs cucumber”
  phantomjs {
    driver = { new PhantomJSDriver() }
  }

  // when system property 'geb.env' is set to 'remote' use a remote Firefox driver
  remote {
    driver = {
      def remoteWebDriverServerUrl = new URL("http://example.com/webdriverserver")
      new RemoteWebDriver(remoteWebDriverServerUrl, DesiredCapabilities.firefox())
    }
  }

  // Use SauceLabs cloud and enjoy testing !!!
  saucelabs {
    driver = {
      def sauceLabsBrowser = System.getProperty("geb.saucelabs.browser")
      assert sauceLabsBrowser
      def username = System.getenv("GEB_SAUCE_LABS_USER")
      assert username
      def accessKey = System.getenv("GEB_SAUCE_LABS_ACCESS_PASSWORD")
      assert accessKey
      new SauceLabsDriverFactory().create(sauceLabsBrowser, username, accessKey)
    }
  }

}

baseUrl = "http://gebish.org"

baseNavigatorWaiting = true
