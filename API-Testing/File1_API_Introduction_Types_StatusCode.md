# Topics
>
1. What is API
2. What is Client & Server?
3. Terms - End points, Request and Responses, Status Codes, Payloads
4. Types of Services in API - Web Services, REST Services
5. Types of API - REST, Web API, SOAP API
6. Difference between Web application and Web Servies and What is WSDL
7. Parts of URL - Base URL, Resource URL, Parameterized URL
8. HTTP Status Codes
9. Difference Between HTTPS and HTTP
10. What is WebHook.
11. What is API Life cycle
12. Common Bugs Found in API Testing
13. Payload
14. Relation Between URI, URL, and URN
15. REST API Examples

## What is API

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

## There are two types of services in API

1. **Web Services** - A web service is a **method of communication** between the two electronic
devices over a **network.**
It only supports XML
e.g Wifi, Bluetooth, Airdrop

2. **REST Services** - Rest stands for REPRESENTATIONAL STATE TRANSFER.  
It is an ARCHITECTURAL STYLE FOR DESIGNING NETWORKED APPLICATIONS.
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

- **Definition**: REST is an architectural style for designing networked applications.
It uses standard HTTP methods (GET, POST, PUT, DELETE) to interact with resources.
- **Protocol**: Primarily uses HTTP/HTTPS.
- **Format**: Typically uses JSON or XML for data exchange, though JSON is more common.
- **Design Principles**:
  - Stateless: Each request from the client to the server must contain all the
  information the server needs to fulfill the request.
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

### 2. **Web API**

- **Definition**: A broader term that encompasses any API that can be accessed over  
the web using HTTP. REST APIs and SOAP APIs are types of Web APIs.
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

- **Definition**: A protocol for exchanging structured information in the implementation
of web services. SOAP is highly standardized and uses XML for message format.
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

### Key Differences

| Feature                 | REST API                     | Web API                      | SOAP API                       |
|-------------------------|------------------------------|------------------------------|-------------------------------|
| **Protocol**            | HTTP/HTTPS                  | HTTP/HTTPS                   | HTTP/HTTPS, SMTP, etc.        |
| **Data Format**         | JSON, XML                   | JSON, XML, custom            | XML only                      |
| **Standards**           | Flexible, no strict rules   | Varies, not strict           | Strict (WSDL, WS-Security)    |
| **Performance**         | Lightweight, fast           | Depends on implementation    | Heavy, slower                 |
| **Security**            | OAuth, SSL/TLS              | Depends on implementation    | Built-in WS-Security          |
| **Use Cases**           | Web/mobile apps, IoT        | General-purpose              | High-security, enterprise apps|
| **Complexity**          | Low                         | Varies                       | High                          |

### Summary

- Use **REST API** for lightweight and scalable applications with modern needs.
- Use **Web API** when flexibility and diverse designs are required.
- Use **SOAP API** for enterprise-level applications where security, reliability, and strict  
standards are essential.

## Difference between Web application and Web Services

Web applications and web services are distinct entities in the web ecosystem, serving different purposes. Here's a comparison to clarify the differences:

### **Web Application**

- **Definition:**  
  A web application is an interactive, user-facing software accessible through a web browser. It is designed to provide functionality directly to users, such as e-commerce platforms, social media, or email services.

- **Purpose:**  
  To enable users to interact with the system using a graphical interface.

- **Key Characteristics:**  
  - Provides a user interface (UI) for interaction (e.g., forms, buttons, navigation).
  - Runs on a web browser (e.g., Chrome, Firefox).
  - Typically uses HTML, CSS, and JavaScript for frontend development.
  - Examples: Amazon, Gmail, Facebook.

- **Usage:**  
  - E-commerce, content management systems, productivity tools.
  - User-driven processes like login, purchases, or social networking.

---

### **Web Service**

- **Definition:**  
  A web service is a software component that allows applications to communicate over a network. It provides data or functionality without a user interface, often in a machine-to-machine context.

- **Purpose:**  
  To enable interoperability and data exchange between systems or applications.

- **Key Characteristics:**  
  - Operates through APIs, typically using protocols like HTTP, SOAP, or REST.
  - Returns data in standardized formats such as XML or JSON.
  - Examples: A payment gateway API, weather data service, or Google Maps API.

- **Usage:**  
  - Backend integration between systems.
  - Enables functionalities like authentication, data processing, or accessing external resources.

---

### **Key Differences**

| Aspect                     | Web Application                   | Web Service                        |
|----------------------------|------------------------------------|------------------------------------|
| **Audience**               | End-users interacting via browser | Other applications or systems      |
| **Interface**              | User interface (UI) is present    | No UI; accessible via API          |
| **Communication**          | User interacts directly           | Applications communicate over APIs |
| **Purpose**                | Perform tasks and provide a service to users | Exchange data or provide functionality to systems |
| **Examples**               | Online shopping, email, social media | Payment gateways, weather APIs     |
| **Technologies Used**      | HTML, CSS, JavaScript, frameworks like React | SOAP, REST, JSON, XML             |

---

### In Summary

- **Web applications** are for users. They have a UI and are accessed via a browser.
- **Web services** are for systems. They have no UI and provide data or functionality through APIs.

Technically both are same.

- At the time of development and testing we just call as API
- And once it is developed and tested and ready to be used , then we call it as web service.

## **WSDL (Web Services Description Language)**

WSDL is an **XML-based language** used to describe the functionality offered by a web service. It acts as a contract between the service provider and the consumer, specifying the operations a web service provides, how to call those operations, and what data structures are involved.

### **Key Features of WSDL**

1. **Defines the Web Service**:  
   - Specifies the available operations (methods) and their input/output parameters.
   - Describes how to communicate with the service.

2. **XML-based**:  
   - Written in XML, making it platform-independent.

3. **Protocol and Data Binding**:  
   - Specifies the communication protocol (e.g., SOAP, HTTP) and the format of the messages.

4. **Used in SOAP Web Services**:  
   - Primarily associated with SOAP-based web services to enable communication.

---

### **Structure of a WSDL Document**

A WSDL document has several main elements:

1. definitions  
   - The root element that defines the name and target namespace of the WSDL.

2. types
   - Defines the data types used by the web service, often based on XML Schema (XSD).

3. message
   - Describes the data exchanged in the web service (input, output, or fault messages).

4. portType
   - Specifies the operations provided by the service and their corresponding messages.

5. binding
   - Defines how the operations and messages are bound to a specific protocol (e.g., SOAP).

6. service
   - Specifies the service endpoint (where the service can be accessed).

---

### **WSDL Example**

```xml
<definitions xmlns="http://schemas.xmlsoap.org/wsdl/"
             xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/"
             xmlns:xsd="http://www.w3.org/2001/XMLSchema"
             name="SampleService"
             targetNamespace="http://example.com/SampleService">

    <!-- Data Types -->
    <types>
        <xsd:schema targetNamespace="http://example.com/SampleService">
            <xsd:element name="Request" type="xsd:string"/>
            <xsd:element name="Response" type="xsd:string"/>
        </xsd:schema>
    </types>

    <!-- Messages -->
    <message name="SampleRequest">
        <part name="parameters" element="Request"/>
    </message>
    <message name="SampleResponse">
        <part name="parameters" element="Response"/>
    </message>

    <!-- Operations -->
    <portType name="SamplePortType">
        <operation name="SampleOperation">
            <input message="SampleRequest"/>
            <output message="SampleResponse"/>
        </operation>
    </portType>

    <!-- Binding -->
    <binding name="SampleBinding" type="SamplePortType">
        <soap:binding style="document" transport="http://schemas.xmlsoap.org/soap/http"/>
        <operation name="SampleOperation">
            <soap:operation soapAction="http://example.com/SampleService/SampleOperation"/>
            <input>
                <soap:body use="literal"/>
            </input>
            <output>
                <soap:body use="literal"/>
            </output>
        </operation>
    </binding>

    <!-- Service -->
    <service name="SampleService">
        <port name="SamplePort" binding="SampleBinding">
            <soap:address location="http://example.com/SampleService"/>
        </port>
    </service>
</definitions>
```

---

### **How WSDL Works**

1. **Service Provider**: Creates the WSDL file to describe the web service.
2. **Service Consumer**: Uses the WSDL to understand:
   - The operations provided by the service.
   - The message format.
   - The communication protocol and endpoint.
3. **Tools**: Many development tools (e.g., Apache Axis, .NET WCF) can read a WSDL file and generate client code for interacting with the service.

---

### **Benefits of WSDL**

- **Interoperability**: Allows different systems to communicate regardless of platform or language.
- **Automation**: Tools can auto-generate client stubs and server skeletons from WSDL.
- **Clarity**: Provides a clear contract between service providers and consumers.

---

### **Key Use Case**

WSDL is used with **SOAP-based web services** to describe the operations a service offers, facilitating seamless integration and communication between systems.

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

REST services support not only xml but also json, html.

![alt text](image-7.png)

REST services are based on HTTP Methods:

1. GET - If we want to see some data then we will use get method.
2. POST - If we want to create some data then we will use post method
3. PUT - Put method is used to update or create a resource.
4. PATCH - Patch method is used for **partial modification** to a resource
5. DELETE - If we want to delete something or some data that is already present or
you have created

## HTTP Status Codes

These are 3 digit numbers returned by a server in response to client's request.

- 100-199 Series => Informational message
- 200-299 Series => Successful
- 300-399 Series => Redirection
- 400-499 Series => Client error
- 500-599 Series => Server error

> Examples

- 404 - File not found
- 400 - Bad request
- 402 - Payment Gateway
- 201 - Successfully created
- 505 - http version not supported

## Difference between HTTPS and HTTP

![alt text](image-6.png)

The primary difference between **HTTP** (HyperText Transfer Protocol) and **HTTPS**
(HyperText Transfer Protocol Secure) is **security**. Here's a detailed breakdown:  

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

The API lifecycle is the series of steps that teams must take in order to successfully design, develop, deploy, and consume APIs. Teams that follow a clearly defined API lifecycle are more productive and better equipped to deliver a high-quality API.

Link - `https://www.postman.com/api-platform/api-lifecycle/`

## Common Bugs Found in API Testing

The API testing process can surface a wide range of bugs and issues. Some of the most common ones include:

> Incorrect Data Formatting

API tests can help uncover responses that return data in the wrong format, such as JSON instead of XML, or vice versa. This can cause parsing errors in the client application.

> Missing Data or Parameters

API testing can reveal problems with API authentication or authorization, such as:

- Incorrect handling of API keys.
- Issues with tokens or permissions.
- Resulting in unauthorized access or denial of service.

> Performance and Scalability Problems

API load testing can determine whether an API:

- Performs well under load.
- Scales appropriately.
  
Common issues include:

- Slow response times.
- Timeouts.
- Service disruptions.

> Concurrency Issues

API testing can surface:

- Race conditions.
- Threading issues in the API implementation.

These problems can lead to:

- Unpredictable behavior.
- Data corruption.

> Security Vulnerabilities

API security tests can reveal flaws such as:

- Lack of encryption.
- Exposed sensitive information.
- Insufficient rate limiting.
- Improper validation of input data (e.g., SQL injection, cross-site scripting (XSS)).

> Compatibility Issues

API testing can detect:

- Compatibility issues when new API versions cause problems with existing client applications.
- Broken functionality in client systems.

> Integration Problems

API integration tests help uncover:

- Failures in API integration with other systems or services.
- Data inconsistencies.
- Interoperability issues.

> Cross-Origin Resource Sharing (CORS) Misconfigurations

API tests help surface improper CORS configurations, which can:

- Cause cross-origin requests to fail.
- Result in client-side issues.

## Payload

![alt text](image-8.png)

## Relation Between URI, URL, and URN

- A URI is the superset. Both URLs and URNs are types of URIs.
- All URLs and URNs are URIs, but not all URIs are URLs or URNs.

## REST API Examples

> Payment Gateways

```text
Stripe: https://stripe.com/docs/api
PayPal: https://developer.paypal.com/docs/api/
Square: https://developer.squareup.com/
Braintree: https://developers.braintreepayments.com/
Authorize.Net: https://developer.authorize.net/api/reference/
```

> Google Maps -
<https://developers.google.com/maps/documentation>

> Twitter -
<https://developer.twitter.com/en/docs/twitter-api>

> Facebook -
<https://developers.facebook.com/docs/graph-api>

> GitHub -
<https://docs.github.com/en/rest>
