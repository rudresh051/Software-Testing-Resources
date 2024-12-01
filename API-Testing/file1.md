# What is API

Application Programming interface
APIs defines the methods and protocols used for communication between different
software systems. They enable developers to access and use the functionality and data
of external services or systems

e.g.
Customer goes in a hotel. Waiter gets an order. Waiter goes to the chef and gives
back the order to the customer

Here Waiter act as the API
![API anology](image.png)

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

## Difference between Web application and Web Services

Web application is meant for humans to read
whereas web services are meant for computers to read
e.g. Web application like Whatsapp is meant for the humans.
And Web Services are meant for computers.

## What kind of information??

WSDL(Web Services Description Language)  
Its work is to describe how a web service works, what kind of messages it can send and
understand and how to send and receive those messages.

**Web services only support XML**

## There are three parts of URL

1. **'Base URL'** - The base URL is the root or primary URL from which other URLs derives or appended.
It typically represents the main entry point for a web application or service  
e.g. https://www.google.com

2. **Resource URL** - Each resource URL uniquely identifies a specific a resource or a collection
of related resources.
e.g. https://www.google.com/books/Gullivertravels

3. **Parameterized URL** - It is a URL that includes (also called as query parameters) to provide
information or instructions to the server.
Ex:- <https://www.google.com/books/Gullivertravels?**hhkjehjnjkbenjhhjgjbnmvjbvkjbfn/jhe/898789/huh>**

Rest services support not only xml but also json, html.

REST services are based on HTTP Methods:

1. GET - If we want to see some data then we will use get method.
2. POST - If we want to create some data then we will use post method
3. PUT - Put method is used to update or create a resource.
4. PATCH - Patch method is used for partial modification to a resource
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

Https - hyper text transfer protocol secure
