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