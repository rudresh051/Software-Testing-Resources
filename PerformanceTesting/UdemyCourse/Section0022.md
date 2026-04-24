# API Testing using JMeter

## What is an API

![alt text](image-448.png)

* An API, or Application Programming Interface, is like a waiter in restaurant.
* It's a way for different software programs to talk to each other and share information or services.

![alt text](image-449.png)

![alt text](image-450.png)

## Importance of API Performance Testing or Why API Performance Testing is needed
* **Importance of API Performance testing**
  * API performance testing is like a stress test for your application's backbone.
  * It helps ensure that your application remains responsive,
reliable, and efficient even under high load conditions.
  * API performance testing is crucial because it ensures that the APIs are fast, reliable, and can handle the expected load. 
  * By regularly testing and optimizing your APIs, you can provide a better user experience, maintain system reliability, and manage costs effectively.

* **API Testing can help to identify issues & improve** 

![alt text](image-451.png)

![alt text](image-452.png)

![alt text](image-453.png)

![alt text](image-454.png)

![alt text](image-455.png)

![alt text](image-456.png)

* **API Testing - Practical Scenario - 1**
* **E-Commerce Application**
  * **Scenario**: During Black Friday, an e-commerce site expects a 1Ox increase in traffic. Performance testing ensures that the APIs handling product searches, checkout, and payment processing can handléffe load withöÜt crashing.
  * Outcome: Smooth user experience, higher sales, and customer satisfaction.

* **API Testing - Practical Scenario - 2**
* Banking System
* **Scenario**: An online banking system must process thousands
of transactions per second. Performance testing ensures that
money transfers, account updates, and transaction histories
are fast and reliable.
* **Outcome**: Trustworthy and efficient banking services, reduced risk of transaction failures.

![alt text](image-457.png)

## Difference between API Performance Testing and Web Performance Testing

|Aspect|API Performance Testing|Web Performance Testing|
|---|---|---|
|Focus|Testing the performance of backend services and endpoints e.g. Checking the response time of a login API|Testing the performance of the entire web application, including frontend and backend. e.g. Checking the loading time of the login page|
|Components tested|Indidual API endpoints, data processing, response times, throughput, and error rates. e.g. Ensuring a payment processing API can handle 1000 transactions per second|Web pages, UI elements, load times, rendering speed, and overall user experience. E.g. Ensuring the checkout page loads within 2 seconds|
|Data format|Typically JSON, XML, or other structured data formats. Ex: Validating the JSON response of a user profile API|HTML, CSS, JavaScript, images and other web assets. Ex: Validating the layout and content of the user profile page,|
|Load Generation|Simulates multiple requests to the API to test scalability and performance. Ex: Generating 5000 API calls per minute to a search API.|Simulates multiple users interacting with the web application, Ex: Simulating 1000 concurrent users navigating through the website.|
|Metrics|Response time, throughput, error rate, latency, server resource usage. Ex: Measuring the average response time of an order APE|Page load time, time to first byte (TTFB), render time, page Size, number of requests, Ex: Measuring the total load time of the homepage.|
|Dependencies|Focuses on backend systems and network performance. e.g. API's dependency on database performance|Involves both backend and frontend performance, including server response and clientside rendering. Ex: Web page dependency on both server speed and browser rendering.|
|Testing Environment|Can be tested in isolation from the user interface. Ex: Testing an API in a staging environment.|Requires a full web environment, including frontend and backend components, Ex: Testing the web application in a staging environment with real-like conditions|

## Understand GET HTTP Method and Test GET API Request

## Understand POST HTTP Method and Test POST API Request


