# Performance Engineering - Thread Dump Analysis and Insights

![alt text](image-193.png)

![alt text](image-194.png)

| Aspect              | Performance Testing                                                                 | Performance Engineering                                                                                  |
|--------------------|--------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------|
| Definition         | The process of evaluating a system's speed, scalability, and stability under different conditions. | A proactive approach to designing, optimizing, and maintaining a system to perform efficiently under all conditions. |
| Focus              | Identifies performance issues like slowness or failures.                            | Fixes root causes of performance issues and ensures long-term efficiency.                                |
| Goal               | Measure system performance (e.g., response time, throughput).                       | Enhance and maintain optimal performance for real-world usage.                                            |
| Timeframe          | Done in the testing phase, before deployment.                                        | Continuous, spanning the entire lifecycle of the system.                                                  |
| Key Tools          | Tools like JMeter, LoadRunner, and Gatling to simulate and measure load.             | Includes performance testing tools plus profilers, debuggers, thread/heap analyzers, and monitoring tools. |
| Real-world Example | Testing a new shopping website by simulating 1,000 users and measuring response time. | Redesigning database queries and optimizing server configuration to ensure performance for 10,000+ users. |
| Analogy            | Taking a car for a speed test to check how fast it can go under load.                | Regularly tuning the car engine, ensuring efficient fuel usage, and preventing future breakdowns.        |

## What is Thread?
A thread is the smallest unit of execution within a process  

![alt text](image-195.png)

![alt text](image-196.png)

![alt text](image-197.png)

## What is Thread Dump?
* A thread dump is like taking a "snapshot" of all the threads running inside your application at a specific moment.
  * e.g. Imagine workers working in a industry
* Thread dump shows thread status - 
  * Working
  * Waiting
  * Stuck
  * Trouble
* Thread dumps helps to identify
  * Bottlenecks
  * Deadlocks
  * High CPU Usage

## When to take Thread Dump?
* **Application is Slow or Freezing**
  * e.g. application may become slow during flash sale
* **High CPU Utilization**
  * A banking application may show 90% during non-peak hours
* **Deadlocks**
  * Two or more resource waiting for each other
* **Long-Running Threads**
  * To analyze the threads taking longer than the expected time to complete the task.
  * It will identify thread which are slow.
    * e.g. you expect something to complete in an hour
* **Thread Count Keeps Increasing**
  * If new threads are getting created and existing thread are not getting terminated, then **Thread Count** will keep increasing
  * A hotel booking app creates a new thread for every new search and those threads keep running
* **Application Fails to start**
  * To check which threads are blocking the application startup process
    * An app might hang during the initilization process
* **Scheduled Jobs Delayed**
  * To identify the threads that are stuck or blocked causing the delay in the job execution
    * e.g. there might be a job which will send the salary slip after the salary is paid and that job might get delayed due to certain threads
* **Application Crash(Just before crash)**
  * There are certain tools which can take a thread dump based on the condition, such as whenever CPU utilization reaches 90 percentage.
* **Issues During Load/Endurance Testing**
  * It will help to examine the thread behavior during a user load, and when the test is running for longer duration, it will help to detect the bottlenecks or resource contention issues caused by high load.
    * For example, there might be a streaming platform which might struggle with 1000 concurrent users

![alt text](image-198.png)

## How to Take Thread Dump? - Part 1
* Method of taking thread dump varies depending on the
  * Operating system/hosting environment
  * tools
  * application framework
* Take Multiple Dumps
  * Collect at 5-10 second intervals to observe trends

![alt text](image-199.png)

We need to take thread dump where the application server is running  
but sometimes we might not have server access in that case we can use JVM monitoring tools  
or you can you application performance tools like Dynatrace, App dynamics  

If you have server access, login and take thread dump directly. You need to execute some commands on the server. we will talk about commands later

Dynatrace and app dynamics are paid tools

You can install the monitoring on the server but it will increase the load on the application server. so ideally we should have a separate monitoring server.so that load on the application server will be less.

* Part 2 -  

![alt text](image-257.png)

![alt text](image-256.png)

## Thread Dump Analysis - Introduction
* Thread Dump
  * **Snapshot** -  It contains
    * Thread name
    * Thread state
    * Stack trace
  * **Key Parameters to check**
    * **Thread State** - 
      * RUNNABLE
      * BLOCKED
      * WAITING OR TIMED_WAITING
    * **Thread Name** - 
      * Identifies thread
    * **Stack Trace**
      * Code being executed by thread
    * **Locked Resources**
      * Check for - `locked <object> or waiting to lock <object>`

* **Identify Common Issues**
  * High CPU Usage
  * Deadlocks
  * Thread Contention
  * Too many waiting Threads
  * Stuck Threads

## Thread Dump Analysis - High CPU Scenario