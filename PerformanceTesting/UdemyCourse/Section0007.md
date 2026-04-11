## How to do Remote and Distributed Testing in JMeter

1. **Why Remote(Distributed) testing is required?**
   1. **To simulate load from different geographic locations to get more realistic performance parameters such as response time**
    > All the users will not be accessing the application from the same location.  
   2. JMeter client may not be able to handle heavy user load due to infrastructure or hardware limitations
2. **Architecture of Remote(Distributed) Testing in JMeter**
   1. Works based on Master-Slave Mechanism
   2. Master distributes requests across worker Nodes(Slave machines)
3. **Pre-Requisites**
   1. Master and slave machines must have Java installed(Preferably same version of Java)
   2. Master and Slave machines must have same version JMeter installed
   3. Master and Slave machines must be connected to each other in same subnet
4. **Required Configurations**
   1. Go to JMeter -> bin folder -> Open jmeter.properties file -> Add Remote Hosts IP under Remote Host section(ex: remote_hosts = ip address1, ip address2). Save and close the file
   2. Restart the JMeter -> Go to Run -> Remote Start -> Select the Remote Host to run the test
   3. Go to JMeter -> bin folder -> Run the file : create-rmi-keystore.sh (On windows double click, on MAC open terminal and go to the file path and use command : sh create-rmi-keystore.sh.), provide answers to questions displayed. Then rmi_keystore.jks file will be created.
   4. Copy above rmi_keystore.jks file to JMeter -> bin folder in all remote host machines.
   5. Go to JMeter -> bin folder and start the JMeter server using jmeter-server file.(Double click on windows, on MAC open terminal go to the file path and run command - sh jmeter-server.sh)
5. Execution using Command Line
   1. Windows
   2. `jmeter -n -t "path to jmx file" -l "path to result file.csv" -R "IP_of_Remote_Host"`


Note - Number of threads provided in test plan will be run each remote host


![alt text](image-79.png)


Search for "remote host" in JMeter.properties file located in bin folder of JMeter

![alt text](image-80.png)


change the remote_hosts and give local IPv4 address of your laptop

![alt text](image-82.png)

and then restart JMeter and navigate to run . you will find remote start option available

![alt text](image-81.png)


Now double click the following file and open using bash  

![alt text](image-83.png)

rmi_keystore.jks file would be generated  

![alt text](image-84.png)

>copy these files to Jmeter bin folder in all remote host machine.  
>Now I am using my local machine only as a remote host.  
>That is why I do not need to copy it anywhere.
> And it is already in the jmeter bin folder.  
> If when you are using a multiple machines in real time, you will be using multiple machines.  
> I do not have multiple machines right now.  
> But in reality we will be using multiple machine that time.  
> You need to copy this file to your multiple machines within the Jmeter bin folder.  
> To make this, uh, remote or distributed testing work, uh, since I am using my local system as remote system, I do not need to copy it again.  


now double click on jmeter-server.bat file  

![alt text](image-85.png)

run a simple using remote run for www.blazedemo.com
you will see the server terminal showing starting and ending timings

![alt text](image-87.png)


![alt text](image-86.png)

```
Starting the test on host 192.168.88.6 @ 2026 Apr 5 11:44:09 IST (1775369649805)
Finished the test on host 192.168.88.6 @ 2026 Apr 5 11:44:12 IST (1775369652004)
```

change back to this (but why?)

![alt text](image-88.png)

## How to use HTTP Authorization Manager for Basic Authentication


https://the-internet.herokuapp.com/basic_auth

![alt text](image-90.png)

if you run first without authorization manager you will get 401 - unauthorized

![alt text](image-91.png)

after adding authorization  

![alt text](image-89.png)

you will run successfully  

![alt text](image-92.png)

## How to send Email and do Performance testing of Email(SMTP) server using JMeter

![alt text](image-93.png)

Add the SMTP Sampler

![alt text](image-94.png)

![alt text](image-95.png)

Now generate the app password - 

Click on user profile picture => Click on Manage your Google Account => Search "App Password" using search bar.  
Then generate App Password & Notedown

![alt text](image-97.png)

delete the app password after use.

![alt text](image-96.png)

## How to do Database Performance Testing Using JMeter

## 75. How to use JSON Extractor Post Processor

1. **Introduction**
   * **Purpose** - The JSON Extractor is usedtoextract values from JSON responses in JMeter.
   * **When to use** - When you need to process and use data from JSON responses in subsequent requests or assertions.
2. **Adding JSON Extractor**
   1. * **Steps**
      1. Right click on the sampler(HTTP Request) where you want to add the extractor
      2. Navigate to **Add > Post Processors > JSON Extractor**
3. **Configuration Elements**
   1. **Name** - Give a meaningful name to the JSON Extractor
   2. **JSON Path Expressions** - Define the JSON Path to extract the required value
   3. **Variable Names** - Define the variable names to store the extracted values
   4. **Default Value** - Specify a default value to be used if the JSON path does not find any matchingvalue. 
   5. **Compute Concatenation Var(suffix _ALL)** - When checked, it creates a variable with all matchesconcatenated by a delimiter.


**Different ways of extracting values:**
Extract Random Values  
Extract Sepcific Value  
Extract all values  
Extract all values in single variable  

4. **JSON Path Expressions**
   1. **Syntax** - JSON Path uses a dot notation to navigate through JSON elements
      1. To format JSON - https://jsonformatter.org/
      2. To validate expression -  https://jsonpath.com/
      3. Sample APIs for testing -  https://reqres.in/

* **Common Operators** - 
  * $ : Root element
  * . : Child element
  * [*] : Wildcard to match any element in an array
  * [index] : Specific index in an array

5. **Using Extracted Variables**
   1. Reference in subsequent requests - Use ${variableName} to refer to the extracted value.
   2. > examples - ${id} ${email}

## 76. How to control Thread Count, Ramp-up period and Loop count from command line

**In Test Plan:**

**Use function :**  __P
This is a simplified property function which is intended for use with properties defined on the command line.
**Example:**  

${__P(user,1)}

**Syntax:**  

Windows OS:

jmeter -n -t “path to jmx test script file”
-l “path to csv result file”
-e -o “path to result folder”
-Juser=10 -Jrampup=10 -Jloop=10

windows OS:

jmeter -n -t "/Users/vishwa/Desktop/Test/commandline.jmx" -l "/Users/vishwa/Desktop/Test/result.csv" -e -o "/Users/vishwa/Desktop/Test/untitled folder" -Juser=10 - Jrampup=11 -Jloop=2


![alt text](image-98.png)


## Understand HTTP Cookie Manager in JMeter


Website - the-internet.herokuapp.com/login

1. record a user action from blazemeter
2. download the .jmx file
3. import the file in JMeter
4. run the thread group and check if you are really logged in or not by enabling and disabling the cookie manager.


![alt text](image-99.png)

## Introduction to Controllers in JMeter and If Controller in JMeter

> Controllers help to achieve control on the flow of execution of requests

* In JMeter, controllers are elements that determine the flow of execution for the requests in a test plan.
* They help structure and manage how different parts of the test plan are executed, allowing you to create complex test scenarios.

* If Controller
  * Purpose - Conditionally execute child elements based on a specified condition
  * Example - Run a next sampler only if previous sampler response code is success(200)

![alt text](image-101.png)

![alt text](image-100.png)

![alt text](image-102.png)


if we put 400 as response code, then http request inside if controller will not be executed

`${__groovy(${var_resp_code}.toInteger() == 400)}`

## Transaction Controller in JMeter

* **Purpose** - Group requests to measure overall time for a transaction.
* **Exmaple** - Measure the time for the entire login process, including entering credentials and receiving response.

> The purpose of the transaction controller is to group the requests to measure the overall time for a transaction. It means you can group multiple samplers and calculate the combined time.

> So by using a transaction controller you can measure the time taken for a particular transaction.

> In this case, it is a login transaction that we have taken as an example,

![alt text](image-104.png)


![alt text](image-103.png)

>> So basically it will give time taken for any operation which you want to measure by grouping


## Loop Controller in JMeter

* Purpose - Repeat child elements a specified number of times
* Example - Run a login request 10 times with 10 different credentials



![alt text](image-105.png)

![alt text](image-106.png)

> In this way, you can use the loop controller to run a set of request or a request multiple times.

## While Controller in JMeter

* Purspose - Repeat child elements as long as the specified condition is true
  * Example - Execute the request until count <= 10

![alt text](image-108.png)

![alt text](image-107.png)

![alt text](image-109.png)

> we are executing the request in the while controller.As long as count value is less than or equal to ten.

## Critical Section Controller in JMeter
* The Critical Section Controller in JMeter is used to ensure that certain parts of a test plan are executed **by only one thread at a time**, effectively creating a mutex(Mutually exclusive) or lock around those parts
* This is particularly useful in scenarios where you need to **prevent race conditions** or ensure that shared resources are accessed in a controlled manner.
* Suppose you have a test scenario where multiple users (threads) are performing actions that involve updating a shared resource, like a **database record, file, or session data.**
* If these actions are not synchronized, it could **lead to inconsistent states or data corruption.**
* The Critical Section Controller helps to **serialize access** to that shared resource ensuring that only one thread can execute the critical section at a time.

* Multiple threads are not allowed enter critical section at same time, Next thread enters critical
section after previous thread completes and exits critical section.

![alt text](image-141.png)

now for second thread group where we don't have Critical Section controller, the ordering is different

![alt text](image-142.png)

```txt
When you don't use a critical section controller here, there are multiple threads who are running in

parallel and they might be accessing the resource at the same time.

To avoid that, we are using the critical section controller, that is, to avoid the lock to avoid
```

![alt text](image-143.png)

## ForEach Controller in JMeter

* What is the ForEach Controller?
  * The ForEach Controller allows you to iterate over a set of variables or values and perform a set of actions for each item.
  * It is useful when you want to repeat the same steps for multiple items like processing each value in a list or performing operations on multiple data sets.


![alt text](image-144.png)

Now let's paractically understand  

## Include Controller in JMeter(Using Test Fragment)
* The Include Controller is used to include external test fragments or test plans from a separate JMX file(JMeter script) into your current test plan.
* It allows you to modularize your JMeter test plan by breaking it into smaller reusable pieces.

**Why Use the Include Controller?**  
* **Modular Testing** - You can divide your large test plan into smaller, manageable parts
* **Reusability** - Once a section of your test is written in one JMX file, it can be reused in different test plans without rewriting the same logic
* **Collaboration** - Multiple people can work on different parts of the test plan independently and later combine them using the Include Controller

Example -  

![alt text](image-145.png)

You can use the login script in all other - view product, add product to the cart, checkout. 

Simple Example Scenario -  

* Imagine you have a login test that you need to reuse in multiple test plans.
* Instead of copying and pasting the login logic into each test plan, you can create a separate JMX file for the Io in process and include it in other test p ans using the Include Controller.

No need to record login again and again  


**So instead of copying login script again and again, we can put a include controller**

![alt text](image-146.png)

now include the login script which we have recorded earlier

```txt
Each member of the team can work on different parts.

And finally we can combine the script using include controller.

This is the use of include controller in Jmeter.
```

you can use blaze meter to record several pieces of recording

and then use include controller

![alt text](image-147.png)

## Interleave Controller in JMeter
* The interleave Controller in JMeter is used to execute one of its child samplers or controllers per iteration in a round-robin manner
* It is helpful when you want to alternate between different actions or requests in each iteratiomrather than running all of them at once.

## How the Interleave Controller Works - 
* The controller picks only one child per iteration.
* In the first iteration, it runs the first child.
* In the second iteration, it runs the second child, and so on.
* After all children have beery executed once, it loops back to the first child again in the next iteration.

* Why use the Interleave Controller?
  * Alternating Requests - If you want to test multiple end points but not all at once
  * Simulating User flows - It can be used to mimic different user behaviours in different iterations

**Example Scenario -** 
* Let's sey you are testing an e-commerce website, and you want to alternate between checking the homepage, Sign In page, and Register page in every iteration.
* Intead of hitting all three pages in every loop, you want each iteration to hit a different page.

* Behavior

![alt text](image-148.png)

* Ignore sub-controller blocks

![alt text](image-149.png)

Behavior - 
* In each iteration, only one of the child HTTP requests is executed.
* This allows you to alternate between different actions, ensuring you are testing different parts of the system in each loop.

* **Interleave across threads**
  * "Interleave across threads" in JMeter refers to how the Interleave Controller behaves when there are multiple threads (users) running in parallel in a Thread Group.

![alt text](image-150.png)

![alt text](image-151.png)

## Once Only Controller in JMeter

* The Once Only Controller in JMeter ensures that the samplers or logic controllers under it are executed **only once per thread**, regardless of the number of iterations in the Thread Group.

* **How the Once Only Controller Works**
  * The Once Only Controller executes its child elements only in the first iteration of each thread.
  * After the first iteration, those child elements are skipped, but other elements outside the Once Only Controller continue to execute as per the test plan.

* **Why Use the Once Only controller?**
  * To handle tasks like user login, initialization, or setup that should happen only once per thread.
  * To prevent redundant operations like repeated login attempts or setup actions in load tests.

Example Scenario -  

![alt text](image-152.png)

Login will be executed only once because it is inside once only controller  

![alt text](image-153.png)

![alt text](image-154.png)

Jpetstore example - Login only once and browse

![alt text](image-155.png)

## Random Controller in JMeter
* The Random Controller in JMeter randomly selects and executes one of its child samplers or logic controllers during each iteration.
* It's useful when you want to introduce randomness into your test plan to simulate unpredictable user behavior, such as accessing different pages of a website in no particular order.

* **How the Random Controller Works**
  * The Random ontroller contains a set o child elements (samplers or logic controllers).
  * During each iteration, it randomly chooses and executes only one of its child elements.
  * It does not execute all child elements in sequence, but picks one randomly

* **Why Use the Random Controller?**
  * To simulate random user behavior
  * To test how your application behaves when different paths or requests are randomly accessed
  * To avoid a predictable test flow and make your performance test more realistic

![alt text](image-156.png)

![alt text](image-157.png)

![alt text](image-158.png)

```txt
If there are users accessing this website, each users will be randomly accessing different pages.

Some users will access this product listing page.

Some users will access page.

Some users will access registration page.
```

## Random Order Controller in JMeter
* The Random Order Controller in JMeter allows all its child samplers or logic controllers to be executed in a random order during each iteration.
* Unlike the Random Controller, which selects and executes only one child at random, the Random Order Controller runs all the child elements but in a different random sequence each time.

* **How the Random Order Controller Works** - 
  * The Random Order Controller contains a set of child elements (samplers or controllers).
  * During each iteration, it executes all child elements but shuffles the order in Which they are executed
  * This helps in simulating scenarios where the order of user actions is not fixed but still all actions need to be completed.

* **Why Use the Random Order Controller?**
  * To simulate real-world behavior where the order of actions may vary, but every action gets completed in the end.
  * To ensure that your system handles tasks correctly even when they occur in a random order.

* Example Scenario -  

![alt text](image-159.png)

![alt text](image-160.png)

If the url is common you can also add HTTP Request defaults

![alt text](image-161.png)

## Recording Controller in JMeter

* The Recording Controller in JMeter is designed to capture real user interactions with a web application and store those interactions as HTTP requests.
* It is primarily used in combination with the **HTTP(S) Test Script Recorder** to capture and record user activity, such as browsing, submitting forms, and other actions, directly into a JMeter test
plan.

* **How the Recording controller Works?**
  * The Recording Controller acts as a placeholder where recorded requests will be placed during a recording session.
  * It works alongside the HTTP(S) Test Script Recorder, which intercepts and logs HTTP requests as a user interacts with the application
  * Once recorded, the requests are saved as samplers under the Recording Controller for further testing or modifications

* **Why Use the Recording controller?**
  * To automatically capture and store HTTP requests during live interaction with a website or application.
  * To generate test plans quickly by recording rather than manually creating requests.
  * It helps simulate real-world user scenarios by accurately recording user actions and responses from the server.

* Example Scenario - 

![alt text](image-162.png)

![alt text](image-163.png)

## Run Time Controller in JMeter
* The Run Time Controller allows you to run certain parts of your test plan for a specified period of time(like 1 minute, 30 seconds , etc)
  * Imagine like you are writing an exam for 3 hours. after 3 hours you are no longer allowed once specified time is over.

**How does It work?**  
* It controls how long certain test steps will run.

**Real-Time Use Case -**  
* Use Case -
  * Suppose you're testing the search function of an e-commerce website during a high-traffic event like Black Friday
  * You want to see how many search requests the server can handle in a 1-minute window.

![alt text](image-164.png)

In 60 seconds, it is able to search for 9 times

![alt text](image-165.png)


## Simple Controller in JMeter
* The Simple controller is like **a folder or container**
* It doesn't do much on its own but is used to organize your test steps or requests
* Think of it as a way to group related actions together, just like putting similar items in a folder on your computer

* **How does it work?**
  * It helps you organize your test plan by grouping requests under it.
  * The Simple Controller doesn't control any logic or conditions, it just holds the test steps inside it so that everything looks clean and tidy.
  * For example - you can put all login-related actions inside a Simple Controller to keep things organized

Example - Real time use case  

![alt text](image-166.png)


![alt text](image-167.png)

The above steps you  can record using blazemeter or JMeter

## Throughput Controller in JMeter

* The Throughput Controller lets you control how often certain parts of your test are rum.

```txt
Suppose you want to run this request 70% of the time, and this request 30% of the time.

Then you can do this.

You can achieve this using throughput controller.

```

* You set a percentage or a fixed number to decide how often JMeter should run the requests inside the Throughput Controller.

![alt text](image-168.png)

* **Why Use it?**
  * It's perfect when you want to simulate real-world scenarios where different parts of our website or application are accessed by users at different rates.
  * Helps you control the load on different sections of your test plan

![alt text](image-174.png)

![alt text](image-170.png)

![alt text](image-171.png)

![alt text](image-172.png)

![alt text](image-173.png)

![alt text](image-169.png)

you can also specify number of times it should run based on total executions   

![alt text](image-175.png)

## Module Controller in JMeter
* The Module Controller helps you reuse parts of your test plan in different places
* Instead of writing the same test steps multiple times, you can create them once and **call them using the Module Controller.**

* **How does it work?**
  * First you build a section of your test(like login steps) inside a Simple controller or any other controller
  * Then , you use the Module Controller to "call" that section of the test whereever you need it.

* **Why Use it?**  
  * It makes your test plan modular and reusable, meaning you don't have to repeat steps over and over.
  * It's especially useful for large and complex test plans where certain actions (like login) are needed in multiple places.

* Real Time Use case - Example  

![alt text](image-176.png)

![alt text](image-177.png)

![alt text](image-200.png)

## Switch Controller in JMeter
* The Switch Controller allows you to choose which part of your test will run during each execution.
  * You can think of like a TV remote
* The Switch Controller has multiple test steps or requests under it, but it will only run one of them at a time:
* You tell the Switch Controller which "channel" (test step) to run by giving it an index (like picking a channel number on a remote).
* If you have 5 test steps, you can set the Switch Controller to run step 0, step 1, step 2, at-ld so on, based on what number you pick.


* **Why Use it?**
  * The Switch Controller is useful when you want to test multiple scenarios but only want to execute one of them at a time.
  * It helps you control and customize which part of your test runs without duplicating efforts.

* Real-Time Use Case - Example

* Suppose you are testing an online shopping website with differnt menus like
  * Fish - 0
  * Dogs - 1
  * Reptiles - 2
  * Cats - 3
  * Birds - 4
* But you want to visit only product at a time based on condition


![alt text](image-201.png)

![alt text](image-202.png)

It will switch according to the switch value provided

Now what we can do we will switch based on the previous response. 
let's add a bean shell response  
let's generate a random number. and based on random number generated it will switch

![alt text](image-203.png)

![alt text](image-204.png)

![alt text](image-205.png)

> .jmx File attached in the folder

## Using Step by Step Debugger in JMeter

**Step** - 
1. Install Step-by-step Debugger blazemeter from JMeter plugins manager  
2. Click on start button present in step-by-step-debugger. It will start the execution.

![alt text](image-188.png)

Debugger will help you in debugging  

## Logging Levels in JMeter
Log Levels in JMeter
1. OFF
2. FATAL
3. ERROR
4. WARN
5. INFO
6. DEBUG
7. TRACE
8. ALL



ALL>TRACE>DEBUG>INFO>WARN>ERROR>FATAL>OFF


![alt text](image-189.png)

## Automate Test Data Creation


![alt text](image-192.png)

![alt text](image-191.png)

![alt text](image-190.png)

```
So let us say you want to create thousands of data like this.

You can add those many records in the CSV file and you can run the script.

Data will be created.

Data will be created automatically and very quickly.

In this way you can create a test data using a Jmeter script.
```

## File Upload testing using JMeter

Website - https://the-internet.herokuapp.com/upload

Keep the file in JMeter bin folder  

![alt text](image-206.png)

If you want to upload multiple files from different users
1. create a csv file like this

![alt text](image-207.png)


![alt text](image-208.png)

2. Add the csv data set config under thread group

![alt text](image-209.png)

3. give the variable names of filepath and mimetype in "fileupload" part

![alt text](image-210.png)

make sure to add threads as 5 and run

![alt text](image-211.png)