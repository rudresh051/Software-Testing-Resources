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

* How LCP is measured?
  * Page Load Starts - The browser begins to load the HTML of the page
  * Initial Content Load - The initial text, images, and other elements start to appear
  * LCP Element Appears - The largest element, like the main image or headline, finishes rendering and becomes visible to the user
  * LCP Time recorded - The time from the start of the page load to the point where this element is fully loaded is recorded as the LCP

