# What is the performance testing process?

While testing methodology can vary, there is a generic framework you can use to identify weaknesses and ensure that everything will work properly in various circumstances.

* **Identify the testing environment.** Before you begin the testing process, it’s essential to understand the details of the hardware, software, and network configurations you’ll be using. Comprehensive knowledge of this environment makes it easier to identify problems that testers may encounter.
* **Identify performance acceptance criteria:** Before conducting the tests, you must clearly define the success criteria for the application, as it will not always be the same for each project. When you are unable to determine your success criteria, it’s recommended that you use a similar application as the benchmark.
* **Define planning and performance testing scenarios.** To carry out reliable tests, it’s necessary to determine how different types of users might use your application. Identifying key scenarios and data points is essential for conducting tests as close to real conditions as possible.
* **Set up the testing environment.** Begin by configuring the testing environment to mirror the production setup. This includes setting up servers, databases, and network configurations to closely replicate real-world conditions. Ensure that the application under test (AUT) is deployed in this environment. Integrate monitoring tools to collect performance metrics during testing.
* **Implement test design.** Develop test scripts and scenarios based on predefined objectives and acceptance criteria. These scripts should emulate various user interactions and system behaviors. Ensure that the test design aligns with identified key scenarios and data points for realistic testing. Cover different types of tests such as load testing, stress testing, and scalability testing.
* **Run and monitor tests.** Execute the prepared test scripts in the configured environment. Monitor system performance metrics in real-time to evaluate response times, throughput, and resource utilization. Keep a close eye on the test environment for any anomalies or performance bottlenecks. Continuously observe test progress and note any deviations from expected behavior.
Analyze, adjust and re-do the tests. Analyze and consolidate your test results. Once the necessary changes are completed, tests should be repeated to ensure the elimination of any other errors.

# Performance testing success metrics

Clearly define the critical metrics you will be looking for in your tests. These metrics generally include:

**Memory usage:** Use of a computer’s physical memory for processing.  
**Network bandwidth:** Number of bits per second used by the network interface.  
**Disk I/O busy time:** Time the disk is busy with read/write requests.  
**Private memory:** Number of bytes used by a process that cannot be shared with others.  
**Virtual memory:** Amount of virtual memory used.  
**Page faults:** Number of pages written or read to disk to resolve hardware page defects.  
**Page fault rate:** Overall processing rate of faulty pages by the processor.  
**Hardware interrupts:** Average number of hardware interruptions the processor receives/processes each second.  
**Disk I/O queue length:** Average read/write requests queued for the selected disk during a sampling interval.  
**Packet queue length:** Length of the output packet queue.  
**Network throughput:** Total number of bytes sent/received by the interface per second.  
**Response time:** Time taken to respond to a request.  
**Request rate:** Rate at which a computer/network receives requests per second.  
**Pooled connection reuse:** Number of user requests satisfied by pooled connections.  
**Max concurrent sessions:** Maximum number of sessions that can be simultaneously active.  
**Cached SQL statements:** Number of SQL statements handled by cached data instead of expensive I/O operations.  
**Web server file access:** Number of access requests to a file on a web server every second.  
**Recoverable data:** Amount of data that can be restored at any time.  
**Locking efficiency:** Efficiency of table and database locking mechanisms.  
**Max wait time:** Longest time spent waiting for a resource.  
**Active threads:** Number of threads currently running/active.  
**Garbage collection:** Rate at which unused memory is returned to the system.  

