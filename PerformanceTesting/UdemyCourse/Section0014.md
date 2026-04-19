# Client-Side Performance Testing Using WebDriver Plugin for JMeter

> It means we will be installing a web driver plugin to the Jmeter, and we will do the client side performance testing using that plugin.

* **What is the WebDriver Plugin in JMeter?**
  * It allows to Perform client-side performance testing by automating browsers
  * It is built on Selenium Webdriver

* **Why Do We Need WebDriver Plugin in JMeter?**

```txt
What exactly is the problem it is solving?

Jmeter by default is a protocol based tool.

It means it sends the HTTP request and it does not execute the JavaScript, CSS or images, but modern

web applications are heavily dependent on the JavaScript.

The problem here is traditional jmeter samplers.

That is, HTTP request sampler do not measure the client side performance.

For that solution is to use WebDriver plugin, which helps us to test the real world user experience

by loading the pages in the actual browser.

Measuring how long it takes to respond.
```

* Traditional HTTP Request Samplers does not execute JavaScript, CSS, or images & do not measure client-side rendering performance

## When to use and When NOT to use WebDriver plugin for JMeter

* **Scenarios**
  * Measure Page Load time
  * Testing single page applications
  * Validating user experience

* **Example** - E-commerce Website
  * How long the homepage renders?
  * How long it takes to load images?
  * How JavaScript-based popups behave under load?

* **When Not to use WebDriver Plugin for JMeter?**

![alt text](image-313.png)

It's not possible to open 10000 browsers

## How to setup WebDriver Plugin to JMeter and Run Sample Script

Navigate to JMeter >> Options >> Plugin Manager

![alt text](image-314.png)

you can also install it from here -   

![alt text](image-315.png)

In the test plan add the following sampler and config element and later download the browser(chorome/firefox/edge) plugin

![alt text](image-316.png)

give the chrome driver pathe name here -  

![alt text](image-317.png)

Run the Sample test and you can see the execution of the browser  

![alt text](image-318.png)

## Measure Page Load Time using WebDriver Sampler(Real world scenario)

```java
import org.openqa.selenium.By
import org.openqa.selenium.support.ui.WebDriverWait
import org.openqa.selenium.support.ui.ExpectedConditions
import java.time.Duration

//Start measuring the page load time
WDS.SampleResult.sampleStart();

//open website
def driver = WDS.browser
driver.get("https://petstore.octoperf.com/actions/Catalog.action")

// wait until page loads
WebDriverWait wait = new WebDriverWait(driver, DurationOfSeconds(10))
wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("Body")))

//stop measuring page load time
WDS.sampleResult.sampleEnd();

long loadTime = WDS.sampleResult.getTime();
WDS.log.info("Page load time" + loadTime + "ms")

```

![alt text](image-319.png)

you can also generate the HTML report  

![alt text](image-320.png)

## Use Case - Test Page load time of multiple pages(Real World Scenario)


