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

## How to Record Test Script using BlazeMeter Plugin to Chrome Browser

![alt text](image-20.png)

you can first save(JMX file) then open in Jmeter app


## Edge browser

Change this in windows

![alt text](image-60.png)

## Variables in Jmeter

* Variable is a container that can store a value, which can be referenced by any other element
* Syntax - `${variableName}`

![alt text](image-22.png)

![alt text](image-23.png)

## Functions in JMeter

* JMeter Functions - 
  * JMeter functions are special values that can populate fields of any Sampler or other element in a test tree.
* Syntax - 
  * with parameter - ${__functionName(par1,par2,par3)} where "__functionName" matches the name of a function
  * without parameter - ${__functionName}


* Use function helper to experiment

![alt text](image-24.png)

* Function demonstrated - 
  * ${__log("log function message")}
  * ${__threadNum} ${__threadGroupName}
  * ${__time(dd m yyyy hh mm ss)}
  * ${__intSum(5,6,sum1)}
    * sum2=${sum1} => This can be used in another HTTP sampler
  * ${__BeanShell(10*19,result)}
    * above is used for evaluation for a expression
  * ${__machineIP}
  * ${__machineName}


* Function names are case sensitive
* Function are written using camelCase Letters

To explore more on functions
* Go to Tools >> Function Helper Dialog


## Parameterisation in JMeter
* We do not want to hard code the test data in test script as it is not a good practce.
* Using parameterization we can sepearate test data from test
script.
* Seperation of test script and test data will make it easy to
maintain tests.

We can parameterize using :
* User defined variables
* CSV Data set config

![alt text](image-25.png)

* Also make sure to place the variable name i.e. the header names which you have used in csv file

e.g. 

![alt text](image-61.png)

## Correlation in JMeter
* In JMeter **correlation is the process of capturing and storing the dynamic response from the server** and passing it on to subsequent requests.
* It is also called dynamic referencing

> The value which comes from server is dynamic
>> So each time you will get a different value
>> Once the response is received from the server, we extract a value from that response using certain pattern using regular expression extractor and use that extracted value in the subsequent request.

![alt text](image-26.png)

![alt text](image-29.png)

![alt text](image-30.png)

Template $1$ specifies first capturing group, that is expression within first set of parenthesis()

![alt text](image-31.png)


## Timers in Jmeter
* Real user will take some time (Think Time) before performing actions.
* Timers are used to simulate realistic performance test.
* The purpose of the 'Timer' element is to pause a JMeter  
Thread for a certain amount of time. Timers allow JMeter to delay each request that a thread makes.

* Constant Timer

![alt text](image-27.png)

* Uniform Random timer

Formula for Uniform Random timers  
= 0.X*Random Delay max + Constant Delay  

where X varies between 0 to 9  

![alt text](image-28.png)

## Pre-processors and Post-processors
* **Preprocessor** is something that get processed before the sample request is sent to the server and
* **Post processor** is something that gets processed after request is sent to the server
* Analogy - classes in TestNG like @beforeClass and @afterClass etc

And something similar is used in JMeter

e.g. adding userParameters as Pre-processor

![alt text](image-37.png)

so in threadgroup1 before http request 1 and 2 , preprocessor userparameters will get executed

user1 will get assigned value userName1  
user2 will get assigned value userName2  

![alt text](image-38.png)

Preprocessor - HTML link parser  
It will find all the HTML links on the web page and it will take take on of the HTML link and it will execute the HTTP request  

`/.*` => It means any matching link from the website(jmeter.apache.org)

* After adding while controller the http4 request will get executed for the links

![alt text](image-39.png)

* Post processor
*  e.g. add Result Status Action Handler

![alt text](image-40.png)

after giving loop count as 4 for thred group 3

it executed 4 times http 5 and http 6

![alt text](image-41.png)


remaining pre-processor and post-processor we will do as and when necessary.


## Plugins Management in JMeter
* Plugins are those elements which will add additional functionality to the base Jmeter applications.
* Plugins can also be called as application
* Two ways - 
  * Add Jar file
    * https://jmeter-plugins.org/
  * use the JMeter Plugin Manager

![alt text](image-32.png)


Below method is easy to install

* Download plugin manager

And paste the jar file inside   
`..\apache-jmeter-5.6.3\apache-jmeter-5.6.3\lib\ext`

![alt text](image-34.png)

![alt text](image-33.png)

![alt text](image-35.png)

## How to run JMeter test from command Line?
* Command line is important because the GUI mode will consume lot of resources such as CPU and memory
  * Hence GUI mode is not recommended while running GUI load testing

![alt text](image-36.png)

-n → Run in non-GUI mode (important for performance testing)  
-t → Path to your .jmx test file  

## Generate HTML test report in JMeter

![alt text](image-42.png)


## Convert a HAR file to a JMeter script
Steps -  
* Install plugin to JMeter(one time activity)
  * **plugin name** - HAR Converter-JMeter-Plugin from https://jmeter-plugins.org
  * Create HAR(HTTP Archive) file
  * Launch the tool and convert the file
* Motivation
  * In some organizations **we are not allowed to change the proxy settings**
  * Also you need to import the certificates

how to generate the .har file?  

![alt text](image-43.png)

![alt text](image-44.png)

Download the latest version

extract the zip file

whatever is present in bin folder paste in JMeter bin folder  

![alt text](image-45.png)


And whatever is present in ext folder, paste that in JMeter external folder  

![alt text](image-46.png)

after that restart your JMeter

so now it's available  

![alt text](image-47.png)

In your chrome browser

navigate to tools >> developer tools

check the boxes, preserver log and disable cache.
Then perform action on the petstore website and then download the HAR file . refer screenshot below

![alt text](image-48.png)


now open the .har file in jmeter. just browser from the har tool and select the file

![alt text](image-49.png)

and after importing click on convert and load generated script  

![alt text](image-50.png)

use the following regular expression to exclude the unnecessary file while importing  

![alt text](image-51.png)

This time we have not unnecessary files  

![alt text](image-52.png)

`(?i).*.(bmp|css|js|gif|ico|jpe?g|png|swf|eot|otf|ttf|mp4|woff|woff2|svg)`


Note - remove the : whereever present in http header manager as JMeter by default work on http1 and our recorded script is in http 2. http 2 can also be done in JMeter but for that we need to install a plugin which we will see later


add listener and run the test plan

![alt text](image-53.png)

so our all request is successded


![alt text](image-54.png)

Logic - 

![alt text](image-55.png)
