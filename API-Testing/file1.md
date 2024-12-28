# What is API
API Testing basically comes under Backend Testing

Application Programming interface
APIs defines the methods and protocols used for communication between different
software systems. They enable developers to access and use the functionality and data
of external services or systems

e.g.
Customer goes in a hotel. Waiter gets an order. Waiter goes to the chef and gives
back the order to the customer

Here Waiter act as the API
![API anology](image.png)

e.g. makemytrip example

![alt text](image-5.png)

## What is Client & Server?
**A client** is a computer hardware device or software that accesses a service
made available by a server. The server is often (but not always) located on a
separate physical computer.

**A server** is a physical computer dedicated to run services to serve the needs of
other computers. Depending on the service that is running, it could be a file
server, database server, home media server, print server, or web server.

![alt text](image-2.png)


![alt text](image-3.png)

Application Program Interface (API): Is the way of communication between two
applications where applications may differ in their platforms or in terms of
technology.
![alt text](image-4.png)
## Few Basic Terms

1. **End points** - APIs give specific URLs that relate to different functionalities or
resources in the server.

2. **Request and Responses** - APIs uses HTTP requests sent by client and return responses
from the server.

3. **Status Codes** - Status codes provides the information about the outcome of an API request.

4. **Payloads** - Payloads contain data sent in the body of an API request and response,
usually in formats like JSON or XML.

There are two types of services in API

1. **Web Services** - A web service is a **method of communication** between the two electronic
devices over a **network.**
It only supports XML
e.g Wifi, Bluetooth, Airdrop

2. **Rest Services** - Rest stands for REPRESENTATIONAL STATE TRANSFER. It is an ARCHITECTURAL STYLE FOR DESIGNING NETWORKED APPLICATIONS.
Style for designing network application.
Mainly based on URI - Uniform resource Identifier
URL is a part of URI
URL specifies where a resource is located and the protocol used to retrieve it.


## Types of API

1. SOAP - Simple Object Access Protocol
2. REST - Representational State Transfer

Both are Web Services

Here's a clear breakdown of the differences between **REST API**, **Web API**, and **SOAP API**:

### 1. **REST API (Representational State Transfer API):**

- **Definition**: REST is an architectural style for designing networked applications. It uses standard HTTP methods (GET, POST, PUT, DELETE) to interact with resources.
- **Protocol**: Primarily uses HTTP/HTTPS.
- **Format**: Typically uses JSON or XML for data exchange, though JSON is more common.
- **Design Principles**:
  - Stateless: Each request from the client to the server must contain all the information the server needs to fulfill the request.
  - Cacheable: Responses must define whether they can be cached or not.
  - Resource-based: Resources are identified using URIs.
  - Layered System: Allows for intermediaries between client and server.
- **Use Cases**: Web services, mobile apps, IoT applications.
- **Advantages**:
  - Lightweight and fast.
  - Easier to integrate with modern web technologies.
  - Language and platform-independent.
- **Disadvantages**:
  - Limited formal standards, which may lead to inconsistencies.

---

### 2. **Web API**:

- **Definition**: A broader term that encompasses any API that can be accessed over the web using HTTP. REST APIs and SOAP APIs are types of Web APIs.
- **Protocol**: Usually uses HTTP/HTTPS.
- **Format**: Can use JSON, XML, or other formats.
- **Design**: Not confined to REST or SOAP. Can include custom APIs with specific designs.
- **Use Cases**: Interacting with web services, exposing server functionality to web or mobile clients.
- **Advantages**:
  - Flexible and can implement multiple protocols.
  - Supports a variety of data formats.
- **Disadvantages**:
  - Can vary widely in implementation, leading to lack of standardization compared to REST or SOAP.

---

### 3. **SOAP API (Simple Object Access Protocol API):**

- **Definition**: A protocol for exchanging structured information in the implementation of web services. SOAP is highly standardized and uses XML for message format.
- **Protocol**: Can use HTTP, HTTPS, SMTP, or other transport protocols.
- **Format**: Exclusively XML.
- **Design Principles**:
  - Enforces strict standards for security and reliability.
  - Uses WSDL (Web Services Description Language) for describing the API.
  - Stateless or stateful, depending on the implementation.
- **Use Cases**: Applications requiring high security (banking, financial services) or legacy systems.
- **Advantages**:
  - Built-in error handling.
  - High security (supports WS-Security, encryption).
  - Language and platform-independent.
- **Disadvantages**:
  - Heavyweight due to XML and strict standards.
  - More complex and slower compared to REST.

---

### Key Differences:
| Feature                 | REST API                     | Web API                      | SOAP API                       |
|-------------------------|------------------------------|------------------------------|-------------------------------|
| **Protocol**            | HTTP/HTTPS                  | HTTP/HTTPS                   | HTTP/HTTPS, SMTP, etc.        |
| **Data Format**         | JSON, XML                   | JSON, XML, custom            | XML only                      |
| **Standards**           | Flexible, no strict rules   | Varies, not strict           | Strict (WSDL, WS-Security)    |
| **Performance**         | Lightweight, fast           | Depends on implementation    | Heavy, slower                 |
| **Security**            | OAuth, SSL/TLS              | Depends on implementation    | Built-in WS-Security          |
| **Use Cases**           | Web/mobile apps, IoT        | General-purpose              | High-security, enterprise apps|
| **Complexity**          | Low                         | Varies                       | High                          |

### Summary:

- Use **REST API** for lightweight and scalable applications with modern needs.
- Use **Web API** when flexibility and diverse designs are required.
- Use **SOAP API** for enterprise-level applications where security, reliability, and strict standards are essential.

## Difference between Web application and Web Services

Web application is meant for humans to read
whereas web services are meant for computers to read
e.g. Web application like Whatsapp is meant for the humans.
And Web Services are meant for computers.

Technically both are same.
* At the time of development and testing we just call as API
* And once it is developed and tested then we call it as web service.

## What kind of information??

WSDL(Web Services Description Language)  
Its work is to describe how a web service works, what kind of messages it can send and
understand and how to send and receive those messages.

**Web services only support XML**

## There are three parts of URL

1. **'Base URL'** - The base URL is the **root or primary URL** from which other URLs derives or appended.
It typically represents the main entry point for a web application or service  
e.g. <https://www.google.com>

2. **Resource URL** - Each resource URL **uniquely identifies a specific a resource** or a collection
of related resources.
e.g. <https://www.google.com/books/Gullivertravels>

3. **Parameterized URL** - It is a URL that includes (also called as query parameters) to provide
information or instructions to the server.
Ex:- <https://www.google.com/books/Gullivertravels?**hhkjehjnjkbenjhhjgjbnmvjbvkjbfn/jhe/898789/huh>**

Rest services support not only xml but also json, html.

REST services are based on HTTP Methods:

1. GET - If we want to see some data then we will use get method.
2. POST - If we want to create some data then we will use post method
3. PUT - Put method is used to update or create a resource.
4. PATCH - Patch method is used for **partial modification** to a resource
5. DELETE - If we want to delete something or some data that is already present or
you have created

## HTTP Status Codes

These are 3 digit numbers returned by a server in response to client's request.

100-199 => Informational message
200-299 => Successful
300-399 => Redirection
400-499 => Client error
500 and above => Server error

404 - File not found
400 - Bad request
402 - Payment Gateway
201 - Successfully created
505 - http version not supported

## Difference between HTTPS and HTTP

The primary difference between **HTTP** (HyperText Transfer Protocol) and **HTTPS** (HyperText Transfer Protocol Secure) is **security**. Here's a detailed breakdown:  

### 1. **Encryption**  

- **HTTP**: Data is transmitted in plain text, making it vulnerable to interception by attackers.  
- **HTTPS**: Data is encrypted using **TLS (Transport Layer Security)** or the older **SSL (Secure Sockets Layer)**. This ensures secure transmission between the client (browser) and the server.  

### 2. **Authentication**  

- **HTTP**: Does not verify the identity of the server, so users cannot be sure they are communicating with the intended website.  
- **HTTPS**: Uses a **digital certificate** issued by a trusted Certificate Authority (CA) to authenticate the server and establish trust.  

### 3. **Data Integrity**  

- **HTTP**: Data can be intercepted or altered by attackers during transmission.  
- **HTTPS**: Ensures data integrity; encrypted data cannot be tampered with during transmission without detection.  

### 4. **SEO and Trust**  

- **HTTP**: May be flagged as "Not Secure" by modern browsers, discouraging users.  
- **HTTPS**: Is prioritized by search engines for SEO and inspires user trust, as browsers display a padlock icon.  

### 5. **Port Number**  

- **HTTP**: Uses **port 80** by default.  
- **HTTPS**: Uses **port 443** by default.  

### Use Case Recommendations  

- **HTTP**: Suitable for non-sensitive, public websites (e.g., informational blogs).  
- **HTTPS**: Essential for sites handling sensitive information like login credentials, payment details, or personal data.  

**In summary**, HTTPS provides a secure, encrypted, and authenticated communication channel, which is essential for most modern web applications.

- Working of Maven Project

![alt text](image-1.png)

## What is WebHook

A **webhook** is a method for one application to send real-time data or notifications to another application as soon as an event occurs. It's essentially a "reverse" API — instead of an application requesting information from another (like in a traditional API call), a webhook allows the source application to **push** data to a destination URL automatically when certain events happen.

For example:

- A payment gateway can use a webhook to notify your application when a payment is successful.
- A GitHub repository can use a webhook to notify your system whenever there is a push or pull request.
  
### How it works

1. **Event Trigger**: The source system (e.g., GitHub, payment provider) is set up to monitor certain events (e.g., new payment, commit, or issue update).
2. **HTTP Request**: Once that event happens, the source system sends an HTTP request (usually a POST request) to a pre-configured **URL** (your webhook endpoint).
3. **Data Handling**: The destination system (your application) receives the data in the form of a payload (usually in JSON format), processes it, and can take action (e.g., update a database, send a notification).

### Benefits

- **Real-time communication**: Since webhooks push data when an event occurs, there's no need to poll or check constantly for updates.
- **Efficiency**: Webhooks only send data when necessary, reducing unnecessary API calls and processing.

### Example

Suppose you're using a payment system. When a user completes a transaction, the payment system sends a webhook to your server with transaction details. Your server processes this data and updates the order status in your system.

In short, webhooks help enable real-time, event-driven integrations between different systems.

## What is API Lifecycle
https://www.postman.com/api-platform/api-testing/

Here’s the information formatted in Markdown (`.md`):


# Common Bugs Found in API Testing

The API testing process can surface a wide range of bugs and issues. Some of the most common ones include:

## 1. Incorrect Data Formatting
API tests can help uncover responses that return data in the wrong format, such as JSON instead of XML, or vice versa. This can cause parsing errors in the client application.

## 2. Missing Data or Parameters
API testing can reveal problems with API authentication or authorization, such as:
- Incorrect handling of API keys.
- Issues with tokens or permissions.
- Resulting in unauthorized access or denial of service.

## 3. Performance and Scalability Problems
API load testing can determine whether an API:
- Performs well under load.
- Scales appropriately.
  
Common issues include:
- Slow response times.
- Timeouts.
- Service disruptions.

## 4. Concurrency Issues
API testing can surface:
- Race conditions.
- Threading issues in the API implementation.

These problems can lead to:
- Unpredictable behavior.
- Data corruption.

## 5. Security Vulnerabilities
API security tests can reveal flaws such as:
- Lack of encryption.
- Exposed sensitive information.
- Insufficient rate limiting.
- Improper validation of input data (e.g., SQL injection, cross-site scripting (XSS)).

## 6. Compatibility Issues
API testing can detect:
- Compatibility issues when new API versions cause problems with existing client applications.
- Broken functionality in client systems.

## 7. Integration Problems
API integration tests help uncover:
- Failures in API integration with other systems or services.
- Data inconsistencies.
- Interoperability issues.

## 8. Cross-Origin Resource Sharing (CORS) Misconfigurations
API tests help surface improper CORS configurations, which can:
- Cause cross-origin requests to fail.
- Result in client-side issues.


