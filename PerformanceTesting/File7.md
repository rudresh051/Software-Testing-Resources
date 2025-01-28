# Throughput in JMeter

In JMeter, **throughput** is a performance metric that indicates the number of requests processed by the server per unit of time during a test. It is measured in requests per second, requests per minute, or requests per hour, depending on the test settings.

### Key Points About Throughput in JMeter:
1. **Definition**:  
   Throughput represents the number of successful requests that the server processes within a specific time frame. It shows how well the server can handle the load.

2. **Measurement**:  
   Throughput is typically expressed as:
   - Requests per second (`req/sec`)
   - Transactions per second (`txn/sec`)
   - Data volume per second (e.g., kilobytes per second)

3. **Formula**:  
   Throughput is calculated as:  
   \[
   \text{Throughput} = \frac{\text{Total Requests or Transactions}}{\text{Elapsed Time}}
   \]

4. **Interpretation**:  
   - Higher throughput means the server can handle more requests simultaneously.
   - If throughput decreases under heavy load, it indicates potential bottlenecks.

5. **Where to Find It**:
   - **Aggregate Report**: Displays throughput for all requests in the test.
   - **Summary Report**: Provides a throughput summary along with other metrics.
   - **Graph Results**: A visual representation of throughput over time.
   - **Dashboard Report**: Includes detailed throughput information in the performance graphs.

6. **Factors Affecting Throughput**:
   - Server hardware and software configuration.
   - Network latency and bandwidth.
   - Request size and complexity.
   - Server-side processing time.

7. **Difference Between Throughput and Hits Per Second**:
   - **Throughput** measures the number of requests the server successfully handles.
   - **Hits Per Second** measures the number of requests sent to the server, which might include failed or unprocessed requests.

Throughput is a crucial metric for understanding the capacity and performance of your application under load, helping identify bottlenecks and optimize system performance.

# Latency

**Latency** in performance testing, including in tools like JMeter, refers to the time taken for a request to travel from the client to the server and for the server to start processing the request and send back the first response. Essentially, it is the **delay between making a request and receiving the first byte of the response**.

---

### **Key Points About Latency:**

1. **Definition**:  
   Latency is the time elapsed between the moment a client sends a request and the time the server begins sending the response.

2. **Units**:  
   Latency is typically measured in **milliseconds (ms)**.

3. **Components of Latency**:  
   Latency includes:
   - **Network delay**: Time taken for the request to travel across the network to the server.
   - **Server processing delay**: Time the server takes to process the request before sending the first response byte.

4. **Where It Is Measured in JMeter**:  
   JMeter measures latency and reports it in metrics like:
   - **View Results in Table**
   - **Summary Report**
   - **Aggregate Report**
   - **Listeners** like Graph Results and Dashboard Reports.

5. **Difference Between Latency and Response Time**:  
   - **Latency**: Time taken to get the first byte of the response.  
   - **Response Time**: Total time taken for the request to be completed, including the time to receive the entire response.

6. **Importance of Latency**:  
   - **Low latency** indicates a faster and more responsive system.
   - **High latency** can lead to poor user experience, especially in real-time or interactive applications like video streaming or online gaming.

7. **Factors Affecting Latency**:
   - **Network issues**: Bandwidth, packet loss, and routing inefficiencies.
   - **Server performance**: CPU, memory, and processing speed.
   - **Distance**: Physical distance between the client and server.
   - **Concurrency**: Increased load or too many simultaneous users.

---

### **Example:**
- If a user makes an HTTP request to a website:
  - **Latency**: Time taken for the browser to receive the first byte from the server (First Byte Time).
  - **Response Time**: Time taken for the browser to receive the entire response from the server.

By monitoring latency, you can identify delays caused by network or server performance issues, helping to optimize the application's responsiveness.