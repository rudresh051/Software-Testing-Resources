# Authentication Types

## Basic Authentication
<!-- https://www.postman.com/postman/published-postman-templates/documentation/ae2ja6x/postman-echo?ctx=documentation
 -->

 ```text
GET Basic Auth
https://postman-echo.com/basic-auth
This endpoint simulates a basic-auth protected endpoint.
The endpoint accepts a default username and password and returns a status code of 200 ok only if the same is provided.
Otherwise it will return a status code 401 unauthorized.

Username: postman 
To use this endpoint, send a request with the header Authorization: Basic cG9zdG1hbjpwYXNzd29yZA==.
The cryptic latter half of the header value is a base64 encoded concatenation of the default username and password.
Using Postman, to send this request, you can simply fill in the username and password in the "Authorization" tab and Postman will do the rest for you.

To know more about basic authentication, refer to the Basic Access Authentication wikipedia article.
The article on authentication helpers elaborates how to use the same within the Postman app.
 ```

![alt text](image-18.png)

## Basic and Digest Auth

![alt text](image-19.png)

## API Key authentication

![alt text](image-20.png)

## OAuth 1.0 and OAuth 2.0

![alt text](image-21.png)

## Swagger

* Swagger is only used for only exploring the APIs  
Swagger is an open-source framework used for designing, building, documenting, and consuming RESTful APIs. It simplifies the API development process by providing tools and specifications that make it easier for developers to create APIs and for consumers to understand and use them. Here's a breakdown of Swagger:

---

### **Key Components of Swagger:**

1. **Swagger Specification (OpenAPI Specification):**
   - The **OpenAPI Specification (OAS)** is the standard format used by Swagger to describe APIs.
   - It is a JSON or YAML document that defines the endpoints, methods, request/response schemas, parameters, authentication methods, and other metadata about the API.
   - Example of a basic Swagger definition:

    ```yaml
    openapi: 3.0.0
    info:
    title: Example API
    version: 1.0.0
    paths:
    /users:
        get:
        summary: Get a list of users
        responses:
            200:
            description: A list of users
            content:
                application/json:
                schema:
                    type: array
                    items:
                    type: string
    ```

2. **Swagger UI:**
   - A web-based tool that automatically generates interactive API documentation from the OpenAPI specification.
   - Developers and stakeholders can visualize the API structure, test endpoints, and understand the API without needing external tools.

3. **Swagger Editor:**
   - A browser-based editor that allows developers to create or edit OpenAPI specifications in real time.
   - It provides syntax highlighting, auto-completion, and error detection for the API documentation.

4. **Swagger Codegen:**
   - A tool that can generate server stubs, client SDKs, and API documentation based on the OpenAPI Specification.
   - It helps speed up development by providing ready-to-use code in various programming languages.

5. **SwaggerHub:**
   - A collaborative platform for teams to work on API design and documentation.
   - It integrates with tools like GitHub, Jenkins, and others for seamless development workflows.

---

### **Benefits of Using Swagger:**

1. **Standardization:**
   - Ensures that APIs are documented in a consistent format, making them easier to understand and use.

2. **Interactive Documentation:**
   - Swagger UI allows developers to test API endpoints directly from the documentation.

3. **Automation:**
   - Tools like Swagger Codegen automate repetitive tasks, such as generating client SDKs or server stubs.

4. **Improved Collaboration:**
   - Teams can collaborate more effectively by sharing and discussing API specifications on platforms like SwaggerHub.

5. **Ease of Integration:**
   - Swagger integrates seamlessly with various tools, CI/CD pipelines, and API gateways.

---

### **How Swagger Works:**

1. A developer writes the OpenAPI Specification using Swagger Editor or any text editor.
2. Swagger tools like Swagger UI render the specification into an interactive API documentation interface.
3. Consumers of the API can use the documentation to understand the API structure and test endpoints.
4. Developers can use Swagger Codegen to generate boilerplate code for APIs or clients.

---

Swagger is widely adopted and is now part of the **OpenAPI Initiative**, which is a community-driven project to maintain the OpenAPI Specification.

Example

```text
https://fakerestapi.azurewebsites.net/index.html
https://petstore.swagger.io/
https://httpbin.org/#/
```

## cURL

* Client URL
e.g. `curl -X GET "https://fakerestapi.azurewebsites.net/api/v1/Activities" -H  "accept: text/plain; v=1.0"`

* It contains all the information in a single command.
* Go to import >> paste the cURL in the collection
