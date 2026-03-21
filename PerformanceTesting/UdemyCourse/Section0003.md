# Jmeter Essentials

* Open source and free
* Cross platform support(JMeter is built on Java)
* Strong Community support
* Programming is not essential to learn Jmeter

## Download Jmeter

* Make sure to have java installed in system first

* Jmeter - https://jmeter.apache.org/download_jmeter.cgi

![alt text](image-5.png)


Steps - 

![alt text](image-6.png)

for windows click on jmeter.bat file

## Understanding Thread group in Jmeter
* How many users?
* How quickly they start?
* How long they run?

![alt text](image-7.png)

## Listeners in Jmeter
* Listeners are elements in Jmeter which capture the information about the performance test executed
* We can view the result/performance metrics using the listener.

Latency refers to the number of milliseconds between the time JMeter sent the
request and when an initial response was received.

![alt text](image-8.png)

* **Remember the difference between latency and the response time**
  * Time taken to receive the complete response is called **response time**
  * **Latency means** when the first byte of the response is received from the time when the request was sent. In other words, time taken to receive the first byte

* **View Results tree** - It will give the complete details of the request and response
  * It can be useful for debugging and troubleshooting purpose

* **Aggregate Report**

![alt text](image-9.png)

from above screenshot  

* **Average** - Add all the time taken by all the samples divided by number of threads. so it is average response
* **Median is 702 millisecond**
  * It means there are 50 percentage of the requests have a less than Then 702 millisecond response time and remaining 50% of the responses have more than 702 millisecond as a response time.
* **90% of the line**
  * It means that 90% of the requests have a response time less than 7.31 milliseconds
* **95% of the line** - 
  * It means 95% of the requests have a response time less than 3659 milliseconds
* **99% of the line** - 
  * It means that 99% of the requests have a response time of less than 3659
* **Minimum** - It means minimum response time recorded by any of the thread or a user(451)
* **Maximum** - It means maximum response time for any of the thread or a user (3659)

* Graph Results -
  * You can use it when you have less data and load is load not heavy
    * so it is not recommended to use this type of listener for heavy load
  * Add thread - 100
  * Ramp-up time - 10
  * Loop count - Infinite

![alt text](image-10.png)

## Templates in Jmeter
* Saves time
* Reduces possibility of error
* Simplifies testing

## Understanding Average, Median, Througput and standard Deviation

* Average(Response Time)
  * Shows the average time taken to complete requests, helping you gauge the typical user experience
  * High values indicate potential performance issues.

![alt text](image-11.png)

**Average** = Add the response time of each request/number of request  

* **Median**
  * 50th Percentile
  * The middle value of response times, indicating that half the requests were completed below this time
  * Median is less influenced by outliers than the average, making it valuable for identifying common user experience
* **Throughput**
  * Measures the number of requests processed per second(or per minute), reflecting server capacity
  * Higher throughput means the application can handle more requests, which is essential for scalability
* **Standard Deviation**

![alt text](image-12.png)

Formula - 

![alt text](image-13.png)


## Understanding HTTP(s) Test Script Recorder and its components
* Click on Test plan >> Add the Non-test elements 

![alt text](image-14.png)

* In firefox browser set it to manual proxy configuration at port 8888
  * And then only 

![alt text](image-15.png)

* **HTTPS Domains** - e.g. abc.com, xyz.com
  * write by comma if using multiple websites
* **Target Controller** - where you want to save the recordings
* **Grouping** - It is about how you want to organize your recordings
* **Capture HTTP Headers** - HTTP headers will be captured during request so that you can later simulate
* **Assertions** - Assertions are used for verifying the response
* **Regex matching** - It is generally used for recording certain pattern matching while recording.
* **Transaction Name** - Used for grouping multiple HTTP/HTTPS requests under single name. 
  * example - Login Transaction can have multple HTTP requests, all can be grouped under single name called - Login
* **Naming Scheme** - It defines basically how your recorded script will be named
  * attach some prefix, suffix or same as transaction name
* **Counter start value** - You can use the initial counter value while naming the request
* **Create new transaction after request(ms)** - basically specify milliseconds. If idle time is more than specified millisecond then a new tranaction will be created
* **Recording's default encoding** - Specify the proper encoding format. e.g. utf-8
  * Retrieve all embedded resources- all html, css files
  * **Use keepAlive** - It will keep the connection to the server open.
  * no need to establish the connection again
* **Type** - HttpClient4 , Java
  * If you use java, it will use java http url connection class to handle the http requests.
  * The type java may not be compatible in certain scenarios.
* **GraphQL HTTP Sampler settings**
  * Some modern web application may be using GraphQL request

![alt text](image-16.png)

* Request Filtering
  * You can include or exclude URL patterns
  * Some static content may not be useful in performance testing
    * Add suggested excludes. These are non-critical resources. you can add it.

## Certificate Generation and Installation
Steps - 
1. In a Test plan add thread group
2. Add HTTP(s) test script recorder
3. Under target controller - choose - Test plan > HTTP(S) Test Script Recorder
4. Click on Start
5. Go to Jmeter bin folder
   1. e.g. ApacheJMeterTemporaryRootCA.crt will be generated.
   2. Install that in the the browser. e.g. firefox
6. Go to browser settings and search > "certificates"
7. click view certificates. A certificate is valid for only 7 days.
8. click import. Select the file. Select "ok" in the trust checkboxes

![alt text](image-17.png)

And voila your certificate is installed. And now you can use the firefox browser for recording the script for https based websites as well. i.e. websites with secure connection.

9. After 7 days, you need to delete the old certificate and import the new one again which Jmeter will generate automatially after clicking on start.


## Record test script using HTTP(s) Test Script Recorder in Jmeter

![alt text](image-18.png)

Keep the following connection settings in the browser

Also make sure to import certificate which we have done earlier.

![alt text](image-19.png)