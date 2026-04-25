# Client Side Performance Testing and Client side Performance Engineering

## Client side Performance Testing vs Server side Performance Testing

|#|Aspect|Client-Side Performance Testing|Server-side Performance Testing|
|---|---|---|---|
|1|**Definition**|Measures how quickly a webpage or application renders(displaying) and responds(e.g. clicking) on the user's device|Measures the performance and scalability of the server and backend systems|
|2|**Focus**|Frontend performance(e.g., HTML, CSS, JavaScript execution, rendering times)|Backend performance (e.g. database queries, server response times, API performance).|
|3|**Tools**|Browser Developer Tools(e.g. Chrome DevTools, Lighthouse, WebPageTest|JMeter, LoadRunner, NeoLoad, Gatling|
|4|**Metrics**|Page Load time, Time to first Byte(TTFB), First Contentful Paint(FCP), JavaScript execution time|Response time, Throughput, Error rates, server resource utilization(CPU, memory, disk I/O)|
|5|**Objective**|Enhance the user experience by reducing load times and ensuring smooth interactions|Ensure the server can handle expected loads, maintain performance under stress, and scale efficiently|
|6|**Scope**|Browser and client-side resource usage and performance|Server, network, and database performance|
|7|**Typical Issues Detected**|Slow page loads, unoptimized images inefficient JavaScript, rendering delays|High server response times, bottleneck(limited resources), memory leaks, server crashes under load|
|8|**Optimization Techniques**|Minifying CSS and JavaScript, optimizing images, leveraging browser caching, reducing HTTP requests|Database indexing, load, load balancing, optimizing server configurations, scaling infrastructure.|

## Client-Side Performance using Google Lighthouse(Introduction) - Part 1
* It's a browser plugin

![alt text](image-385.png)

![alt text](image-386.png)

## Client Side Performance Engineering - Largest Contentful Paint(LCP)

**LCP Definition** -  

* LCP measures the loading performance of the **largest visible element** on the webpage.
* This could be an image, a video, a block-level text element, or any other significatnt element.

![alt text](image-387.png)

* **How LCP is measured?**
  * **Page Load Starts** - The browser begins to load the HTML of the page
  * **Initial Content Load** - The initial text, images, and other elements start to appear
  * **LCP Element Appears** - The largest element, like the main image or headline, finishes rendering and becomes visible to the user
  * **LCP Time recorded** - The time from the start of the page load to the point where this element is fully loaded is recorded as the LCP

* Good LCP Score
  * Good < 2.5 second
  * 2.5 < LCP Needs Improvement < 4 second
  * Greater than 4 Second, LCP is poor

![alt text](image-388.png)

* **How to Improve LCP score**
  * Improving the Largest Contentful Paint (LCP) score involves optimizing various as cts of our webpage to ensure that the largest visible content loads quickly

1. **Solution 1** - Optimize Images and Videos
   1. **Compress Images**
      1. Use modern image formats like WebP or AVIF
      2. Compress images using tools like TinyPNG or ImageOptim
   2. **Lazy Load Images**
      1. Implement lazy loading for images that are not immediately visible on the viewport using the loading = "lazy" attribute
   3. **Optimize Video Delivery**
      1. Use efficient video formats
      2. Implement lazy loading for videos

### Lazy Loading
Lazy loading delays the loading of resources (e.g., images,
videos, iframes) until they are needed, typically when they enter the viewport (i.e., when the user scrolls to them).

![alt text](image-389.png)

2. Solution 2 - Improve Server Response Times

* **Use a Content Delivery Network(CDN)**
  * Distribute your content globally to reduce latency
* **Optimize Server Configuration**
  * Upgrade to faster servers
  * Implement server-side caching
* **Reduce Server Processing Time**
  * Optimize database queries
  * Minimize the use of heavy server-side logic

3. Solution 3 - Minimize Render-Blocking Resources

* **Defer or Asynchronously Load CSS and JavaScript**
  * Use the async or defer attribute for non-critical JavaScript
  * *Inline critical CSS and load non-critical CSS asynchronously
* **Optimize CSS Delivery**
  * Minimize CSS files
  * *Use media queries to load CSS only when needed

4. **Solution 4 - Improve Resource Loading**

* **Preload Important Resources**
  * Use <link rel="preload"> to prioritize important resources like fonts, images, and scripts
* **Use HTTP/2**
  * Ensure your server supports HTTP/2 to enable multiplexing and faster resource loading
* **Reduce Third-Party Scripts**
  * Limit the number of third-party scripts that can slow down loading

5. **Solution 5 - Optimize Web Fonts**

* Preload Web Fonts
  * Use `link rel="preload"` to load important fonts earlier
* Use Font Display
  * Use the font-display:swap; CSS property to ensure text is visible while fonts are loading

6. **Solution 6 - Optimize Critical Rendering Path**

* **Minimize Main Thread Work**
  * Use **web workers** for heavy computations
  * Optimize JavaScript to reduce execution time  
* **Reduce CSS complexity**
  * Simplify your CSS to reduce render time 

![alt text](image-390.png)

## Client-Side Performance Engineering - Interaction to Next Paint(INP)

* **INP**
  * Interaction to Next Paint (INP) is a web performance metric that measures the responsiveness of a web page.
  * Specifically, it captures the time it takes for the page to respond to user interactions, such as clicks or keyboard inputs, and render the next frame.
  * This metric helps identify **how quickly a page can respond to user inputs**, which is critical for user experience.

> It is very important for user experience

![alt text](image-391.png)

* **INP Defintion**
  * INP measures the latency between the time a user interacts with the page (e.g., clicks a button) and the time the page begins to render the next frame.
* **Good INP Score**

![alt text](image-392.png)

### Strategies to Improve INP
* Improving INP involves optimizing the page's responsivess to user interactions

1. **Solution 1 - Optimize JavaScript**

![alt text](image-393.png)

2. **Solution 2 - Optimize Rendering Performance**

![alt text](image-394.png)

3. **Solution 3 - Improve Server Response Time**

![alt text](image-395.png)

4. **Solution 4 - Enhance User Interaction Handling**

![alt text](image-396.png)

## Client-Side Performance Engineering - Cumulative Layout Shift(CLS)

![alt text](image-397.png)

**CLS Defintion** - CLS measures the total of all individual layout shift scores for every unexpected layout shift that occurs during the entire lifespan of the page

* Diagram of Layout Shift

![alt text](image-398.png)

Website - https://www.woorank.com/en/core-web-vitals/improving-cumulative-layout-shift

* Good CLS Score -  

![alt text](image-399.png)

* **Strategies to Improve CLS**
  * Improving CLS involves minimizing unexpected movements of web page elements. Here are some strategies

![alt text](image-400.png)

![alt text](image-401.png)

![alt text](image-402.png)

![alt text](image-403.png)

## Client-Side Performance Engineering - First Contentful Paint(FCP)

* **FCP**
  * FCP is a wep performance metric that **measures the time from when a page starts loading to when any part of the page's content is rendered on the screen**.
  * This content could be text, images, SVGs, or canvas elements.FCP is crucial for user experience as it gives an indication of how quickly users can start consuming content.
* **FCP Definition** - FCP marks the time at which the first text or image is painted on the screen

* Pictorial Representation

![alt text](image-404.png)

* Diagram of FCP

![alt text](image-405.png)

* Good FCP Score

![alt text](image-406.png)

* **Strategies to Improve FCP**
  * Improve FCP involves optimizing various aspects of how your webpage loads and renders its content

![alt text](image-407.png)

![alt text](image-408.png)

![alt text](image-409.png)

![alt text](image-410.png)

Link - https://web.dev/articles/fcp

![alt text](image-411.png)

## Client-Side Performance Engineering - First Input Delay(FID)

* **First Input Delay(FID)**
  * First Input Delay (FID) is a web performance metric that
measures the time from when a user first interacts with a page (such as clicking a link, tapping a button, or using a custom JavaScript-powered control) to the time when the browser is actually able to respond to that interaction.

* **FID Definition:** FID measures the delay between a user's first interaction with a web page and the time when the browser can begin processing event handlers in response to that interaction

![alt text](image-412.png)

![alt text](image-413.png)

* Diagram of FID

![alt text](image-414.png)

* **Strategies to Improve FID**

![alt text](image-415.png)

![alt text](image-416.png)

![alt text](image-417.png)

![alt text](image-418.png)

```txt
But as a performance engineer, whenever you are doing a client side performance engineering, it is

good to know these things.

That is why I am discussing these things in detail here.

And whenever you find a performance issue, you can give a clear feedback to the development team
That way understanding these concepts will help you.
```

## Client-Side Performance Engineering - Time to First Byte(TTFB)

![alt text](image-419.png)

* **Time to First Byte (TTFB)** is a key performance metric that measures the time it takes for a user's browser to receive the first byte of data from the server after making an HTTP request.
* It is an important indicator of server responsiveness and overall website performance.

![alt text](image-420.png)

* Components of TTFB

![alt text](image-421.png)

* **Improving TTFB**
  * To improve TTFB, you need to optimize the various stages
involved in the request-response cycle.

![alt text](image-422.png)

![alt text](image-423.png)

## Client-Side Performance Engineering - Total Blocking Time(TBT)

![alt text](image-424.png)

![alt text](image-425.png)

* **Total Blocking Time(TBT)**
  * It is a performance metric that measures the total amount of time during which a webpage is blocked and unable to respond to user input

* It is a performance metric that measures the total amount of time during whic a webpage is blocked and unable to respond to user input.
* This includes any time between First Contentful Paint (FCP)
and Time to Interactive (TTI) when the main thread is blocked
for long enough to prevent user interactions such as clicks,
taps, or keyboard inputs.

![alt text](image-426.png)

* **Importance of TBT**

![alt text](image-427.png)

* **Improving TBT**

![alt text](image-428.png)

Link - https://web.dev/articles/tbt

![alt text](image-429.png)


## Client-Side Performance Engineering - Speed Index(SI)

![alt text](image-430.png)

* Speed Index(SI)

* **Speed Index (SI)** is a performance metric that measures how quickly the content of a web page is visibly populated.
* It is a key indicator of user experience, as it quantifies the visual completeness of a page load.
* The lower the Speed Index score, the faster the content is
displayed to the user.

![alt text](image-431.png)

![alt text](image-432.png)

Link - https://developer.chrome.com/docs/lighthouse/performance/speed-index

* **Importance of Speed Index**

![alt text](image-433.png)

* **Improving Speed Index**  

![alt text](image-434.png)

> And some of the things will remain common, such as optimizing the JavaScript, optimizing the CSS, compressing the image and media using the content delivery network, reducing the server response time, and using caching strategies.


## Client-Side Metric - Accessibility (User Experience Metric)

* Accessibility in the context of web development refers to
making web pages usable for as many people as possible,
including those with disabilities.
* The Google Lighthouse accessibility report evaluates a
webpage's compliance with accessibility best practices and
standards.

![alt text](image-435.png)

![alt text](image-436.png)

Link - https://developer.mozilla.org/en-US/docs/Web/Accessibility

## Client-Side Best Practices(Front-end best practices)

* Best Practices in the Google Lighthouse report evaluate a
webpage against a set of recommended practices to ensure
that it is secure, reliabiöjäifd-pertormsuett:—
* These practices encompass a range of areas, including
security, performance, and codingstandards. Here are some
key best practices along with explanations and examples:

![alt text](image-437.png)

![alt text](image-438.png)

![alt text](image-439.png)


* XSS

![alt text](image-441.png)

![alt text](image-440.png)

* No Vulnerable Libraries

![alt text](image-442.png)

![alt text](image-443.png)

![alt text](image-444.png)

## Client-Side Metric - Search Engine Optimization (SEO)

* SEO (Search Engine Optimization) in the Google Lighthouse
report assesses a webpage's compliance with best-practices
that can help it rank better in search engine results.
* This part of the report provides insights and actionable
recommendations to improve the discoverability and
performance of your webpage in search engines.

* Page Has a Title Element

The title element is crucial as it appears in search engine results and browser tabs, providing a brief summary of the page's content.

* Meta Description

The meta description provides a summary of the page's content, which can appear in search engine réSüItS31t-ShOuld be concise and relevant.

<head> <meta name="description" content="This is an example page meta description"> </head>

* HTTP Status Code

Ensures the page returns a successful HTTP status code (200)
so that it can be indexed by search engines.

* Description Text for Links

Links should have descriptive text that indicates the link's
destination, improving usabitity and SEO.

* Content-Bearing Images Have Alt Attributes

Alt attributes provide alternative text for images, helping search engines understand the content and improving accessibility.

* Document has a <meta name="viewport"> tag

The viewport meta tag helps control the layout on mobile
browsers, ensuring the page is responsive.

![alt text](image-445.png)

* Font Size Accessibility

Ensures that the text is legible on all devices by checking that the font size is appropriate for readability

* Tap Targets are sized Appropriately

Ensures that interactive elements are large enough for users to tap easily-on-touchscreens.
* Example:
* Check: Ensure that buttons, links, and other interactive
elements have sufficient size and spacing.

![alt text](image-446.png)

![alt text](image-447.png)

```txt
You can share this report to the relevant teams such as business users, front end development team,

back end development team based on the issue and they can work on this to improve the SEO score.

There might be a separate digital marketing team in your organization.

They might also be working on these things to improve the overall ranking of the website.

In search engine, that is to improve the SEO score.

```

## How to Co-relate Session ID or Login Token

![alt text](image-482.png)

![alt text](image-479.png)

![alt text](image-480.png)

![alt text](image-481.png)

## How to Filter JMeter Results using Plugin Tool

![alt text](image-483.png)

![alt text](image-484.png)