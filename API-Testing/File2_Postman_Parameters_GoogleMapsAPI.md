# Postman

Postman is a popular API development tool that simplifies the process of designing, testing,
documenting and debugging API's.
It provides user friendly interface for making http requests to test API, monitor our responses.

1. User Friendly interface
2. API request - With postman we can create and send various types of http request such as
GET, PUT, POST etc. to
test end points.
3. Collections -Postman allows us to organize our request into collections.
4. Environment Variable - Postman supports the use of environment
values across multiple request.
Postman includes a testing framework that allows you to
5. Test - Postman includes a testing framework that allows you to write and run tests and
you can use Java Script to write
the test to verify the correctness of the response.
6. Documentation - We can generate our API documentation directly from our requests and collections

Collection of classes is called package
Collection of package is called project
here -
Collection of request here is called collection


In API testing, the terms **parameters** and **query parameters** refer to distinct ways of
passing data to an API endpoint.
Here's the difference between them:

## Mock Server

The place where I put my response in the server and treat that as test Environment.
It is a server which will have the response like real time. 

## **Parameters**

- **General Concept**: Parameters are a broader category that refers to any input data passed
to an API to customize its behavior.
- **Types**: Parameters can be classified into multiple types, including:
  1. **Path Parameters**: Part of the endpoint URL, used to specify resources.
     - Example: `/users/{userId}` where `{userId}` is replaced by a specific ID like `/users/123`.
  2. **Query Parameters**: Appended to the URL after a `?` and used to pass additional information.
     - Example: `/users?age=25&city=NY`.
  3. **Header Parameters**: Sent in the HTTP header, often used for authentication or content type.
     - Example: `Authorization: Bearer <token>`.
  4. **Body Parameters**: Sent in the body of the request, commonly used with `POST`, `PUT`, or `PATCH` requests.
     - Example (JSON body): `{"name": "John", "age": 25}`.

---

### **Query Parameters**

- **Specific Concept**: A subset of parameters specifically appended to the URL in a key-value
format, following a `?`.
- **Purpose**: Typically used for filtering, sorting, or pagination in GET requests.
- **Syntax**: `?key1=value1&key2=value2`.
  - `?`: Starts the query parameter section.
  - `&`: Separates multiple key-value pairs.
- **Example**:
  - URL: `/products?category=books&sort=price_asc&page=2`.
  - Query Parameters:
    - `category=books`
    - `sort=price_asc`
    - `page=2`

---

### Key Differences

| Aspect                | Parameters                               | Query Parameters                          |
|-----------------------|------------------------------------------|-------------------------------------------|
| **Definition**         | General term for any input data to APIs.| Subset of parameters passed in the URL.   |
| **Usage**              | Includes path, query, header, and body. | Specifically used for GET request data.   |
| **Location**           | Depends on the parameter type.          | Part of the URL, after a `?`.             |
| **HTTP Method**        | Any method (`GET`, `POST`, etc.).        | Mostly used with `GET`.                   |
| **Format Example**     | `/users/{userId}` (path) or JSON body.   | `/users?name=John&age=30`.                |

By understanding the difference, testers can effectively validate APIs for their behavior with various
parameter types,
ensuring they meet the expected requirements.

- Google Maps ADD API

```XML
Google maps API

1. Maps JSON format

{
  "location":{
  "lat":-38.383494,
  "lng" : 33.427362
},

"accuracy":50,
"name":"Frontline house",
"phone_number": "(+91)983 893 3937",
"address" : "29, side layout, cohen 09",
"types": ["shoe park", "shop"],
"website" : "http://google.com",
"language" : "French-IN"

}

2. Maps XML Format
<?xml version="1.0" encoding="UTF-8" ?>
 <root>
     <location>
         <lat>-38.383494</lat>
         <lng>33.427362</lng>
     </location>
     <accuracy>50</accuracy>
     <name>Frontline house</name>
     <phone_number>(+91)983 893 3937</phone_number>
     <address>29, side layout, cohen 09</address>
     <types>shoe park</types>
     <types>shop</types>
     <website>http://google.com</website>
     <language>French-IN</language>
 </root>

3. Maps DELETE JSON
{
"place_id" : "{{pid1}}"
}

4. Maps DELETE XML
<?xml version="1.0" encoding="UTF-8" ?>
 <root>
     <place_id>39c4d646af77f72f587abf2074637823</place_id>
 </root>

```

### Test script in Postman

A test script in Postman is a piece of JavaScript code that is executed before or after sending a
request to an API endpoint. Test scripts enable users to automate the validation of API responses,
perform data manipulation, set environment variables, and execute other custom actions.

Here's a breakdown of API testing and test scripts in Postman:

API Testing:

Functional Testing: Verifying that the API functions as expected by sending requests with various  
inputs and validating the corresponding outputs.

Regression Testing: Ensuring that recent changes or updates to the API haven't introduced new bugs  
or issues by re-running existing test cases.

Performance Testing: Assessing the responsiveness and scalability of the API by sending a large  
number of requests and measuring response times and throughput.

Security Testing: Checking for vulnerabilities such as injection attacks, authentication flaws, and  
data exposure by sending crafted requests and analysing the responses.

Load Testing: Evaluating the API's behaviour under heavy load conditions by simulating multiple  
concurrent users or clients.

**Test Scripts:**

Pre-request Scripts: Executed before sending a request, allowing users to modify the request parameters, headers, body, or environment variables dynamically.

Test Scripts: Executed after receiving a response, enabling users to validate the response data, headers, and status code against expected values using JavaScript assertions.

Scripting for Data Manipulation: Manipulating data extracted from responses or environment variables, such as parsing JSON/XML, extracting values, and formatting data for subsequent requests.

Environment Setup: Setting up environment-specific configurations, such as authentication tokens, base URLs, and other parameters required for testing.

**Authorization in Postman**
In the Postman interface, there is a tab named "Authorization." Click on it to access authorization settings.
Postman supports various types of authorization, such as "No Auth," "Basic Auth," "Bearer Token," etc. Choose the type that corresponds to the authentication mechanism used by the API you are testing.

## Data-driven testing

Data-driven testing is a software testing methodology where test cases are designed based on input data sets, and the same test logic is applied across multiple data variations.

 In the context of Postman, data-driven testing involves using external data sources, such as CSV files, JSON files, databases, or spreadsheets, to drive the execution of API tests.

Each row of data in the external source represents a unique test scenario, and the test logic defined in Postman is executed iteratively for each set of input data.

Data-driven testing using Postman:

1. Data Preparation
2. Integration with Postman
3. Test Script Logic
4. Iterative Test Execution
5. Reporting and Analysis

**XML Handling, Utilities for Parsing the Json/XML response**
Rest Assured provides utilities for handling both JSON and XML responses, making it versatile for testing APIs that return data in either format. Below, I'll provide an overview of XML handling in Rest Assured, followed by a discussion on live projects where Rest Assured is commonly used for API testing.
**XML Handling with Rest Assured:**
Rest Assured offers support for parsing and validating XML responses through its XmlPath class. This class provides methods for extracting data from XML responses and performing assertions on XML elements.

**Live Projects Rest API Testing with Rest Assured:**
Integration Testing
Regression Testing:
Load Testing
End-to-End Testing
**Handling OAuth authorization** in Rest API testing using Rest Assured involves obtaining and managing access tokens required to authenticate requests with OAuth-enabled APIs. OAuth is commonly used to secure APIs by allowing clients to access protected resources on behalf of users after obtaining permission.

## Data-Driven Testing with Rest-Assured

Data-driven testing is an approach where test scenarios are executed multiple times with  
different sets of input data. In the context of Rest-Assured, which is a popular Java library  
for testing RESTful APIs, data-driven testing involves executing HTTP requests with varying  
parameters and validating the responses against expected outcomes.

Data-driven testing with Rest-Assured provides a flexible and efficient approach to testing
 RESTful APIs by enabling the execution of multiple test scenarios with varying input data.
